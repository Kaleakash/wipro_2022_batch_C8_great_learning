function setValue(){
    alert("set value called...")
    let name = "Ravi Kumar";
    let emp={id:100,name:"Ravi",age:21};
    localStorage.setItem("obj1",name);
    sessionStorage.setItem("obj2",name);
    sessionStorage.setItem("empInfo",JSON.stringify(emp));
}