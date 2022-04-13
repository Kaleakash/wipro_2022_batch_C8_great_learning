// ES5 style promise object creation 
var obj1 = new Promise(function(resolved, rejected){
   
    rejected("Error generated"),
    resolved("successfully done the task")
})

obj1.then(function(data){
    console.log("Then called..."+data)
}).catch(function(error){
    console.log("Catch called "+error);
})
//ES6 style promise object creation 


var obj2 = new Promise((resolved, rejected)=>{
    rejected("Error geneated....")
})

obj2.then((data)=>console.log("Then called "+data)).catch(error=>console.log("catch called "+error));
