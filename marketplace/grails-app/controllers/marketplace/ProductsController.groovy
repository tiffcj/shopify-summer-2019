package marketplace

class ProductsController {
    static responseFormats = ['json']

    def productsService

    def getAll() {
//        println params
        def availableInventory = params.boolean('availableInventory')
//        println (params.availableInventory == 1)
//        println (params.availableInventory == true)

        if (availableInventory) {
            respond productsService.getAllByAvailableInventory()
        } else {
            respond productsService.getAll()
        }
    }

    def getAllByTitle() {
        respond productsService.getAllByTitle(params)
    }
}
