package marketplace

class ProductsController {
    static responseFormats = ['json']

    def productsService

    def getAll() {
        def availableInventory = params.boolean('availableInventory')
        if (availableInventory) {
            respond productsService.getAllWithAvailableInventory()
        } else {
            respond productsService.getAll()
        }
    }

    def getById() {
        respond productsService.getById(params)
    }

    def getAllByTitle() {
        respond productsService.getAllByTitle(params)
    }

    def purchaseById() {
        def result = productsService.purchaseById(params)

        if (result instanceof Integer) {
            if (result == 400) {
                response.sendError(result, "Product without inventory cannot be purchased")
            } else {
                response.sendError(result)
            }
        } else {
            respond result
        }
    }
}
