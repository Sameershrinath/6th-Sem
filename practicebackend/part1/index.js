const http = require("http");
const express=require("express");

const app=express();


app.get("/",(req,res)=>{
    return res.send("hello from home page");
});

app.get("/about",(req,res)=>{
    return res.send("hello from about page");
});

const myserver=http.createServer(app);


myserver.listen(5000,()=>{console.log("server started....")})