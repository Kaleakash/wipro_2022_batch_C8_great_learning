// literal style object creation 
// var emp1 = {id:100,name:"Ravi",salary:25000,skillSet:["C","C++","Java","Python"],
// address:{city:"Bangalore",state:"Kar"},projects:[{pid:1122,pname:"Web",tech:"Angular"},
// {pid:1133,pname:"destkop",tech:"Core Java"},{pid:1144,pname:"mobile",tech:"React Native"}]};

// document.write("<br> Object creation in literal style")
// document.write("<br/> Id is "+emp1.id);
// document.write("<br/> Name is "+emp1.name);
// document.write("<br/> Salary is "+emp1.salary);
// document.write("<br/> Skill Set "+emp1.skillSet[0]);
// emp1.skillSet.forEach(v=>document.write("<br/> Skill Set "+v));
// document.write("<br/> City is "+emp1.address.city);
// document.write("<br/> State is "+emp1.address.state);
// document.write("<br/> Technology name of first project "+emp1.projects[0].tech)
// emp1.projects.forEach(p=>document.write("<br/>Pid "+p.pid+" Pname "+p.pname+" Tech "+p.tech));

// function style object creation 
// function Employee() {
//         this.id = 100;              // instance variable 
//         this.name = "Ravi";
//         this.age = 21;
//         this.disInfo = function() {                 // instance function or methods 
//             document.write("<br/> Employee object");
//             document.write("<br/> Id is "+this.id);
//             document.write("<br/> Name is "+this.name);
//             document.write("<br/> Age is "+this.age);
//         }
// }
// //Employee();     // normal function consider 
// var emp1 = new Employee();      // memory created for Employee object.. 
// emp1.disInfo();
// alert("id is "+emp1.id+" Name is "+emp1.name+" Age is "+emp1.age);
// var emp2 = new Employee();      // memory created for Employee object.. 
// emp2.disInfo();
// alert("id is "+emp1.id+" Name is "+emp1.name+" Age is "+emp1.age);
// function style object creation with dynamic value 
// function Employee(id,name,age) {
//     this.id = id;              // instance variable 
//     this.name = name;
//     this.age = age;
//     this.disInfo = function() {                 // instance function or methods 
//         document.write("<br/> Employee object");
//         document.write("<br/> Id is "+this.id);
//         document.write("<br/> Name is "+this.name);
//         document.write("<br/> Age is "+this.age);
//     }
// }
// var emp1 = new Employee(100,"Ravi",21);     // different memory with different values. 
// var emp2 = new Employee(101,"Ramesh",25);
// emp1.disInfo();
// emp2.disInfo();
// Adding dynamic property and behaviour for Employee object 
function Employee(id,name,age) {
    this.id = id;              // instance variable 
    this.name = name;
    this.age = age;
    this.disInfo = function() {                 // instance function or methods 
        document.write("<br/> Employee object");
        document.write("<br/> Id is "+this.id);
        document.write("<br/> Name is "+this.name);
        document.write("<br/> Age is "+this.age);
    }
}
var emp1 = new Employee(100,"Ravi",21);     // different memory with different values. 
var emp2 = new Employee(101,"Ramesh",25);
emp1.disInfo();
emp2.disInfo();
alert("Emp Id "+emp1.id);
alert("Emp Id "+emp2.id);
alert("Mgr Id "+emp1.mgrId);
alert("Mgr Id "+emp2.mgrId);
Employee.prototype.mgrId = 123;         // adding dynamic property for both object. 
alert("Mgr Id "+emp1.mgrId);
alert("Mgr Id "+emp2.mgrId);
emp1.mgrId=1234
emp2.mgrId=12
Employee.prototype.info = function(){
    alert("Id is "+this.id+" Name "+this.name+" Age is"+this.age+" Mangager is "+this.mgrId);
}
emp1.info();
emp2.info();



