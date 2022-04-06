// // normal syntax 
// display1();     // we can call before declaration 
// function display1() {
//     document.write("<br/>Normal function syntax");
// }
// display1();
// //display2();
// // expression style function with function name 
// let display2 = function display() {
//     document.write("<br/> Expression style function with name");   
// }
// display2();
// //display2=100;
// // expression style function without name anonymous name
// let display3 = function() {
//     document.write("<br/> Expression style function");
// }
// display3();
// // arrow style function 
// let display4 = ()=>document.write("Arror style function ");
// display4();

//Expresion style function with parameter return 
// let addNumber1 = function(a,b){
//     var sum = a+b;
//     return sum;
// }
// document.write("<br/> Sum of two number using expression style "+addNumber1(100,200));
// // Arrow style funtion with parameter and return 
// // arrow function return the value without return keyword with it contains only 
// //one statement. 
// let addNumber2 = (a,b)=>a+b;
// //let addNumber2 =(a,b)=>{return a+b}
// document.write("<br/> sum of two number is using arrow style"+addNumber2(100,200));

// // find largest using expression style 
// let findLargest1 = function(a,b){
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// document.write("<br/> Largest using expressioin style "+findLargest1(100,50));
// // find largest using arrow style  
// let findLargest2 = (a,b)=>{
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// document.write("<br/> Largest using expressioin style "+findLargest2(100,50));

function greeting(fname,callback){
    return "Welcome "+callback(fname);
}
let maleInfo= function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=>"Miss "+fname;

document.write("<br/> "+greeting("Raj ",maleInfo));
document.write("<br/> "+greeting("Seeta",femaleInfo));
document.write("<br/> "+greeting("Ramesh",function(fname){
    return "Mr "+fname;
}));
document.write("<br/> "+greeting("Meeta",(fname)=>"Miss "+fname));



