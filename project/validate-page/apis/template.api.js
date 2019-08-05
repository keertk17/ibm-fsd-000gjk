const server = require('express').Router();
const TemplateService = require('../services/template.service').TemplateService;
const templateService = new TemplateService();

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : 'Template Service is Running'
    });
});
server.post('/add',(rq,rs)=>{
    templateService.addTemplate(rq.body,(err,res)=>{
        if(err){
        rs.status(402).json({
        message : 'Unable to proceess the request',
        trace : err
    });
        }else{
            rs.status(200).json({
            message : 'Template added successfully',
            template : res 
        });
    }
});
});
server.get('/add',(rq,rs)=>{
    templateService.fetchTemplate((err,res)=>{
        if(err){
        rs.status(402).json({
        message : 'Unable to proceess the request',
        trace : err
    });
        }else{
            rs.status(200).json({
            message : 'Template fetched',
            template : res 
        });
    }
});
});
module.exports = {
    server
}