package marketplace

import grails.gorm.transactions.Transactional
import org.grails.web.json.JSONObject

@Transactional
class ProductsService {

    def getAll() {
        return Products.findAll()
    }

    def getAllWithAvailableInventory() {
        return Products.findAllByInventoryCountGreaterThan(0)
    }

    def getById(params) {
        def result = Products.findById(params.id)
        if (!result) {
            return new JSONObject()
        }
        return result
    }

    def getAllByTitle(params) {
        return Products.findAllByTitleIlike(params.title) //Case insensitive search by title
    }

    def purchaseById(params) {
        def product = Products.findById(params.id)

        if (product == null) {
            return 404
        } else if (product.inventoryCount == 0) {
            return 400
        }

        product.inventoryCount--

        try {
            if (!product.save(flush:true)) {
                println(product.errors)
                return product.errors
            } else {
                return product
            }
        } catch (Exception e) {
            throw new RuntimeException(e)
        }
    }
}
