let obj1 = [];      // literal style array creation 
let obj2 = new Array(); //object creation style 
let obj3 = [10,20,30,40,50];
let obj4 = new Array(10,20,30,40,50);
let obj5 = new Array(10);
document.write("<br/> Size of array "+obj1.length);
document.write("<br/> Size of array "+obj2.length);
document.write("<br/> Size of array "+obj3.length);
document.write("<br/> Size of array "+obj4.length);
document.write("<br/> Size of array "+obj5.length);
obj1.push(1);
obj1.push(2);
obj1.push(3);       // add the element from last
obj1.unshift(100);
obj1.unshift(200);
obj1.unshift(300);  // add the element from begining 
document.write("<br/> "+obj1);
obj1.pop();             // remove from last 
obj1.shift();           // remove from begining 
document.write("<br/>"+obj1)
// splice : this method is use to add,remove and replace the element in middle,
//obj1.splice(2,1);   //1st parameter index position and 2nd parameter number of elements to remove;
//obj1.splice(1,2);   // from 1 index position remove 2 elements. 
//obj1.splice(2,0,1111);  // 1st parameter index position, 2nd parater number of element
                            // 3rd parameter add the elements. 
//obj1.splice(2,1,1111);      // replace 2 position element by 1111
// obj1.splice(2,0,1111,2222,3333);    // 3rd to n parameter add elemenet in index position provided 
//                                 // in first parameter. 
// document.write("<br/>"+obj1)  

//1st way 
// let result1 = obj1.find(search);
// function search(v){
//     if(v==100){
//         return v;
//     }else {
//         return undefined;
//     }
// }

// // 2nd way 
// let result1 = obj1.find(function(v){
//     if(v==1000){
//         return v;
//     }else {
//         return undefined;
//     }
// });

//3rd way 
// 2nd way 
let result1 = obj1.find(v=>v==1000); // if element present it return that element else it return undefined. 
document.write("<br/> Search element "+result1);
let result2 = obj1.findIndex(v=>v==1000);    // if element present it return index position of that elemenet else it return -1
document.write("<br/> index position "+result2)








