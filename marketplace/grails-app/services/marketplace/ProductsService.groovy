package marketplace

import grails.gorm.transactions.Transactional

@Transactional
class ProductsService {

    def getAll() {
        return Products.findAll()
    }

    def getAllByAvailableInventory() {
        return Products.findAllByInventoryCountGreaterThan(0)
    }

    def getAllByTitle(params) {
        return Products.findAllByTitleIlike(params.title)
    }
}
