# Shopify Summer 2019 Developer Intern Challenge

## Marketplace API

### About

The marketplace API allows the user to interact with products in a marketplace. The user can view all products, products by id or available inventory, or one specific product, and purchase a specific product.

[**See API documentation on Swagger**](https://app.swaggerhub.com/apis-docs/tiffcj.org/marketplace/1.0.0)

### Run Instruction

The API is currently not deployed anywhere and can only be accessed locally. To test this API locally:

1. [Download and install Grails](https://docs.grails.org/latest/guide/gettingStarted.html#downloadingAndInstalling)
2. Clone this repo
4. The database location in [this line](https://github.com/tiffcj/shopify-summer-2019/blob/d5cb3472d71b3ae1ce06654d3aec6bd5fdcf9b50/marketplace/grails-app/conf/application.yml#L102) needs to be changed to the correct location of the database on your machine. There is a test database located in [this folder in the repo](https://github.com/tiffcj/shopify-summer-2019/tree/master/marketplace/test-db). Change the line to point either to `[/path/to/the/folder]/marketplace` or to a live database connection.
3. In the marketplace directory, run `grails run-app` in the command line. The app should now be hosted on http://localhost:8080/. Feel free to use Postman, the browser etc. to interact with the API endpoints and the sample database.

### Tech Stack

The API is created using the Groovy on Grails framework. The sample database uses the H2 database management system. The back-end uses the MVC framework, with the models located [here](https://github.com/tiffcj/shopify-summer-2019/tree/master/marketplace/grails-app/domain/marketplace) and controllers located [here](https://github.com/tiffcj/shopify-summer-2019/tree/master/marketplace/grails-app/controllers/marketplace), which makes use of service layer located [here](https://github.com/tiffcj/shopify-summer-2019/tree/master/marketplace/grails-app/services/marketplace).
