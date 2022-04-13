let obj;
function loadObject() {
   obj = new XMLHttpRequest();  // pre-defined object. 
     // method get to get the data and page is static
        obj.onreadystatechange=callback; // this property keep the track about the reqeust.
     //obj.open("Get","demo.txt"); 
     obj.open("get","https://jsonplaceholder.typicode.com/todos")
     obj.send();
     alert(obj.responseText);
}



function callback() {
    //alert(obj.readyState);  
    if(obj.readyState ==4){
        //alert(obj.responseText);
        //console.log(obj.responseText);
        let data = JSON.parse(obj.responseText);
        //console.log(data)
        data.forEach(d=>console.log(" id is "+d.id+" title is "+d.title))
     }    
}