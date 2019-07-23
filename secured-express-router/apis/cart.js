const server = require('express').Router();
const CService = require('../services/cartservice').cartservice;
const cartservice = new CService();
const setContentHeader = require('../services/utils').setContentHeader;

// get all projects
server.get('/',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        cartservice : cartservice._all()
    }));
});

// add a new project
server.post('/add',(req,res)=>{
    setContentHeader(res);
    res.end(JSON.stringify({
        cartservice: cartservice._add(req.body)
    }));
});

module.exports.cartRoutes = server;