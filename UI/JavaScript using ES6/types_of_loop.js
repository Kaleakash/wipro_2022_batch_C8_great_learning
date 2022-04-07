// let num = [1,2,3,4,5,6];
// document.write("<br/> Type of loop");
// document.write("<br/> Using Normal loop")
// for(let i=0;i<num.length;i++){
//     document.write("<br/> Value is "+num[i])
// }
// document.write("<br/> Using for in loop")
// for(let i in num){          // it will give index position 
//     document.write("<br/> index is  "+i+" Value is "+num[i])
// }
// document.write("<br/> using for of loop");
// for(let n of num ){             // it will give value directly 
//     document.write("<br/> Value is  "+n)
// }
// document.write("<br/> using for each function ");
// num.forEach(v=>document.write("<br/> Value is "+v));
// document.write("<br/> Display the element with intermediate element map ")
// num.map(v=>v+100).forEach(v=>document.write("<br/> VAlue is "+v))
// document.write("<br/> intermediate function as filter ");
// num.filter(v=>v%2==0).forEach(v=>document.write("<br/> Value is "+v));
let num = [2,1,6,4,9,7,8];
document.write("Before Sort<br/>");
num.forEach(v=>document.write(" "+v));
document.write("<br/>After Sort<br/>");
num.sort().forEach(v=>document.write(" "+v));
document.write("<br/>")
let num1 =[1,10,15,34,6,19,20,18,8,3,54]
num1.forEach(v=>document.write(" "+v));
document.write("<br/>After Sort - Asc <br/>");
num1.sort((a,b)=>a-b).forEach(v=>document.write(" "+v));
document.write("<br/>After Sort - Desc <br/>");
num1.sort((a,b)=>b-a).forEach(v=>document.write(" "+v));
document.write("<br/> "+ num[1])
document.write("<br/> "+ num[-1])








