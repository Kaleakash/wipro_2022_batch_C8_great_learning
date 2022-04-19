// let num1:number[]=[];   // literal style array declaration 
// let num2:Array<number>=[];  // generic style array declaration
// let num3:number[]=[10,20,30,40,50];
// let names:Array<string>=["Ravi","Ramesh","Rajesh","Ajay"];
// console.log(num3);
// names.forEach(v=>console.log(v));
// let info:Array<any>=[100,true,"Ravi",10.10];
// let stdNames:Array<string>=["Balaji","Vijay","Ramesh","Raju","Ajay","Mahesh"];
// console.log(stdNames)
// //stdNames.sort();
// //stdNames.sort((s1,s2)=>s2.localeCompare(s1))
// stdNames.sort((s1,s2)=>s1.localeCompare(s2))
// console.log(stdNames)
var num1 = [10, 20, 30, 40];
var num2 = num1.slice();
var num3 = num1;
console.log(num1);
console.log(num2);
console.log(num3);
num1.push(100);
console.log(num1);
console.log(num2);
console.log(num3);
