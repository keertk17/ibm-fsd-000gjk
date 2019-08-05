const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const templateAPis = require('./apis/template.api').server;

server.use(parser.json());
server.use(cors());
server.use('/template',templateAPis);

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : 'Server is Running'
    });
});

const PORT = 4777;
server.listen(PORT,()=>{
    console.log(`Server is Started at ${PORT}`);
});