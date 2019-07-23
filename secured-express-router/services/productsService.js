const products = require('../db/products').products;
class ProductsService{
    
    constructor(){
        this.products = products;
    }
    _all(){
        return this.products;
    }
    _add(products){
        this.products.push(products);
        return this.products;
    }
}

module.exports.ProductsService = ProductsService;