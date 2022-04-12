// object in literal style 

let emp = {id:100,name:"Raj",age:21};
document.write("<br/> Object Literal style <br/>")
document.write("<br/> Id is "+emp.id);
document.write("<br/> Name is "+emp.name);
document.write("<br/> Age is "+emp.age);

// we have to convert literal or json object  to string 
let empString = JSON.stringify(emp);
document.write("<br/>String format <br/>")
document.write("<br/> Id is "+empString.id);
document.write("<br/> Name is "+empString.name);
document.write("<br/> Age is "+empString.age);
// we have to convert string to json 
let empJson = JSON.parse(empString);
document.write("<br/> Object Json style <br/>")

document.write("<br/> Id is "+empJson.id);
document.write("<br/> Name is "+empJson.name);
document.write("<br/> Age is "+empJson.age);
