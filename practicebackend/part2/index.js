const express=require("express");
const fs=require("fs");
const mongoose=require("mongoose")


const app=express();


//connecting the mongoose
mongoose
.connect("mongodb://localhost:27017/practicewebdev")
.then(()=>console.log("database connected..."))
.catch((error)=>console.log(error));


//creating the schema
const userschema= new mongoose.Schema({
    first_name:{
        type:String,
        required:true
    },
    last_name:{
        type:String
    },
    email:{
        type:String,
        required:true,
        unique:true
    
    },
    gender:{
        type:String,
    }
})
//schema end

//creating the model
const users=mongoose.model("users",userschema);
//


//middle-wares
app.use(express.urlencoded({extended:false}));
//

app.post("/api/users", async (req,res)=>{
    const body=req.body;
    if(!body || !body.first_name || !body.last_name || !body.email || !body.gender){
        return res.status(400).json({msg:"All fields are required"});
    }

    await users.create({
        first_name:body.first_name,
        last_name:body.last_name,
        email:body.email,
        gender:body.gender
    });
    res.status(201).json({msg:"user created"});

})

app.listen(5000,()=>{console.log("server is running at port 5000....");})

