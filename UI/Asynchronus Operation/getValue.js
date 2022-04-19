function getValue(){
    alert("get value called...")
    let name1 = localStorage.getItem("obj1");
    let name2 = sessionStorage.getItem("obj2");
    let emp1 = JSON.parse(sessionStorage.getItem("empInfo"))
    document.getElementById("a").innerHTML="local storage value "+name1;
    document.getElementById("b").innerHTML="session storage value "+name2;
    console.log("Id is "+emp1.id);
    console.log("Name is "+emp1.name);
    console.log("Age is "+emp1.age);
}