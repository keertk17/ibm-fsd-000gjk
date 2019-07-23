const server = require('express').Router();
const PService = require('../services/productsService').ProductsService;
const productsService = new PService();
const setContentHeader = require('../services/utils').setContentHeader;

// get all projects
server.get('/',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        products : productsService._all()
    }));
});

// add a new project
server.post('/add',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        products : productsService._add(req.body)
    }));
});

module.exports.productsRoutes = server;
