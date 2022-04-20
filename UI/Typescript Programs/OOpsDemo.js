// // ES5 function style 
// function Customer() {
//     this.cid = 100;
//     this.cname = "Ravi";
//     this.disCustInfo = function() {
//         console.log("Customer function")
//         console.log("Id is "+this.cid);
//         console.log("name is "+this.cname);
//     }
// }
// var cust1  = new Customer();
// cust1.disCustInfo();
// //ES6 class style 
// class Employee {
//     eid:number = 100;
//     ename:string ="Ravi";
//     disEmpInfo() : void {
//         console.log("Employee function")
//         console.log("id is "+this.eid);
//         console.log("name is "+this.ename);
//     }
// }
// let emp1 = new Employee();
// emp1.disEmpInfo();
// // constructor concept 
// class Employee {
//     eid:number = 100;
//     ename:string ="Ravi";
//     constructor() {
//         console.log("object created....")
//     }
//     disEmpInfo() : void {
//         console.log("Employee function")
//         console.log("id is "+this.eid);
//         console.log("name is "+this.ename);
//     }
// }
// let emp1 = new Employee();
// emp1.disEmpInfo();
// // parameterized constructor  
// class Employee {
//     private eid:number;
//     private ename:string;
//     constructor(eid:number=0,ename:string="Unknown") {
//         this.eid = eid;
//         this.ename=ename;
//     }
//     disEmpInfo() : void {
//         console.log("Employee function")
//         console.log("id is "+this.eid);
//         console.log("name is "+this.ename);
//     }
// }
// let emp1 = new Employee(1,"ravi");
// emp1.disEmpInfo();
// let emp2 = new Employee(2,"Ramesh");
// emp2.disEmpInfo();
// let emp3 = new Employee(3)
// emp3.disEmpInfo();
// let emp4 = new Employee();
// emp4.disEmpInfo();
// //console.log(emp1.eid+" "+emp1.ename);
// // contructor short cut initialization   
// class Employee {
//     //private eid:number;
//     //private ename:string;
//     constructor(private eid:number=0,public ename:string="Unknown") {
//         //this.eid = eid;
//     //this.ename=ename;
//     }
//     disEmpInfo() : void {
//         console.log("Employee function")
//         console.log("id is "+this.eid);
//         console.log("name is "+this.ename);
//     }
// }
// let emp1 = new Employee(1,"ravi");
// emp1.disEmpInfo();
// let emp2 = new Employee(2,"Ramesh");
// emp2.disEmpInfo();
// let emp3 = new Employee(3)
// emp3.disEmpInfo();
// let emp4 = new Employee();
// emp4.disEmpInfo();
// //console.log(emp1.eid+" "+emp1.ename);
// contructor short cut initialization   
var Employee = /** @class */ (function () {
    function Employee(eid, ename) {
        if (eid === void 0) { eid = 0; }
        if (ename === void 0) { ename = "Unknown"; }
        this.eid = eid;
        this.ename = ename;
    }
    Employee.prototype.disEmpInfo = function () {
        console.log("Employee function");
        console.log("id is " + this.eid);
        console.log("name is " + this.ename);
    };
    return Employee;
}());
var emp1 = new Employee(1, "ravi");
emp1.disEmpInfo();
var emp2 = new Employee(2, "Ramesh");
emp2.disEmpInfo();
var emp3 = new Employee(3);
emp3.disEmpInfo();
var emp4 = new Employee();
emp4.disEmpInfo();
//console.log(emp1.eid+" "+emp1.ename);
