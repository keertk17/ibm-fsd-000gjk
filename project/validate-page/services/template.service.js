const client = require('mongodb').MongoClient;
const TemplateConstants = require('./util.service').TemplateConstants;
class Service{
addTemplate(_template,callback){
    const _url = TemplateConstants.mongo.url + TemplateConstants.mongo.port;
    client.connect(_url,(err,connection)=>{
        connection.db(TemplateConstants.mongo.db).collection(TemplateConstants.mongo.collections.template).insert(_template,(err,response)=>{
            callback(err,response);
        });
    });
}
fetchTemplate(callback){
    const _url = TemplateConstants.mongo.url + TemplateConstants.mongo.port;
    client.connect(_url,(err,connection)=>{
        connection.db(TemplateConstants.mongo.db)
        .collection(TemplateConstants.mongo.collections.template)
        .find()
        .toArray((err,res)=>{
            callback(err,res);
        });
    });
}
}
module.exports={
    TemplateService : Service
}