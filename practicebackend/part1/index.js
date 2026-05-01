const express=require("express");
const fs=require("fs");
const app=express();
const usersdata=require("./MOCK_DATA.json");

app.get("/",(req,res)=>{
    return res.send("hello from home page");
});


app.use(express.urlencoded({extended:false}));

app.use((req,res,next)=>{
    fs.appendFile("./log.txt",`${Date.now()}: ${req.method} ${req.url}`,(err,data)=>{
        next();
    });
})

app.get("/users",(req,res)=>{
    const html=`
    <ul>
    ${usersdata.map((user)=>`<li>${user.first_name} <br></li>`)}
    </ul>
    `;

    res.send(html);
});



//Dynamic path parameters
app.route("/api/users/:id")
.get((req,res)=>{
    const id=Number(req.params.id);
    const user=usersdata.find((user)=>user.id===id);
    return res.json(user);

})
.patch(
    (req,res)=>{
    return res.json({"status":"pending"});
}
)
.delete(
    (req,res)=>{
    const id =Number(req.params.id);
    const index=usersdata.findIndex(user=>user.id===id);
    console.log(index);
    if (index != -1 ){
        usersdata.splice(index,1);
    fs.writeFile("./MOCK_DATA.json",JSON.stringify(usersdata),(err,data)=>
        {
        return res.json({status:"successfully deleted",id_deleted:id});
        }
    );
    }
    else{
        return res.json({status:"failed deleted"});
    }
    
}
);


app.post("/api/users",(req,res)=>
    {
    const body=req.body;
    usersdata.push({...body,id:usersdata.length+1});
    fs.writeFile("./MOCK_DATA.json",JSON.stringify(usersdata),(err,data)=>
        {
        return res.json({status:"successfully add",id:usersdata.length});
        }
    );
    }
);

app.get("/about",(req,res)=>{
    return res.send("hello from about page");
});

app.listen(5000,()=>{console.log("server is running at port 5000....");})

