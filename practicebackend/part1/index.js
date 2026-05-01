const express=require("express");

const app=express();
const usersdata=require("./MOCK_DATA.json");

app.get("/",(req,res)=>{
    return res.send("hello from home page");
});



app.get("/users",(req,res)=>{
    const html=`
    <ul>
    ${usersdata.map((user)=>`<li>${user.first_name} <br></li>`)}
    </ul>
    `;

    res.send(html);
});


// app.get("/api/users",(req,res)=>{
//     return res.json(usersdata);
// })

//Dynamic path parameters
app.get("/api/users/:id",(req,res)=>{
    const id=Number(req.params.id);
    const userd=usersdata.find((user)=>user.id===id);
    return res.json(userd);

});

app.get("/about",(req,res)=>{
    return res.send("hello from about page");
});

app.listen(5000,()=>{console.log("server is running at port 5000....");})

