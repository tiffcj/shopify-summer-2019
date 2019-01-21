package marketplace

class Products {
    String title
    Double price
    Integer inventoryCount

    static constraints = {
    }

    static mapping = {
        id generator: 'sequence', params: [sequence: 'PRODUCTS_SEQUENCE']
        version false
    }
}
