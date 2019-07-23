const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');

const productsRoutes = require('./apis/products').productsRoutes;
const cartRoutes = require('./apis/cart').cartRoutes;
const setContentHeader = require('./services/utils').setContentHeader;
// apply json parser
server.use(parser.json());
// apply cors
server.use(cors());

server.get('/status',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        message: "Server is RUNNING"
    }));
});
server.use('/products',productsRoutes);
server.use('/cart',cartRoutes);

// PORT Binding
server.listen(2777,()=>{
    console.log('Server started at 2777');
});
