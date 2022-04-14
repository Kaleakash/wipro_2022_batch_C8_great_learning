async function loadEmployee() {
    //ES6 style 
    // fetch("http://localhost:3000/employees").
    // then(res=>res.json()).then(result=>console.log(result)).
    // catch(error=>console.log(error));
    //     fetch("http://localhost:3000/employees",{method:"GET"}).then(res=>res.json()).then(result=>{    
    //     let empRow = result.map(e=>e.id+" "+e.name+" "+e.age+"<br/>")
    //        document.getElementById("data").innerHTML=empRow;
    //   }).catch(error=>console.log(error));

        // ES7 style 
        try{
        let response = await fetch("http://localhost:3000/employees",{method:"GET"});
        let result = await response.json();
        let empRow = result.map(e=>e.id+" "+e.name+" "+e.age+"<br/>")
        document.getElementById("data").innerHTML=empRow;
        
        }catch(ex){
            console.log(ex)
        }
}
function addEmployee() {
    let idValue = document.getElementById("id").value;
    let nameValue = document.getElementById("name").value;
    let ageValue = document.getElementById("age").value;
   
    fetch("http://localhost:3000/employees",{
        method:"POST",
        body:JSON.stringify({
            id:idValue,
            name:nameValue,
            age:ageValue
        }),
        headers:{
            "content-type":"application/json"           
        }
    }).then(result=>console.log(result)).catch(error=>console.log(error));

    document.getElementById("id").value="";
    document.getElementById("name").value="";
    document.getElementById("age").value="";

}