const cart = require('../db/cart').cart;
class cartservice{
    // users=[];
    constructor(){
        this.cart = cart;
    }
    _all(){
        return this.cart;
    }
    _add(cart){
        this.associate.push(cart);
        return this.cart;
    }
}

module.exports.cartservice = cartservice;