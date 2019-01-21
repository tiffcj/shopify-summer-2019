package marketplace

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        group("/products") {
            "/" (controller: "Products", action: "getAll", method: "GET")
            "/$availableInventory" (controller: "Products", action: "getAll", method: "GET")

            "/id/$id" (controller: "Products", action: "getById", method: "GET")
            "/title/$title" (controller: "Products", action: "getAllByTitle", method: "GET")

            "/purchase/$id" (controller: "Products", action: "purchaseById", method: "POST")
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
