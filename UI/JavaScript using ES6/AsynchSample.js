// synchronous statement exection 

// document.write("<br/> 1st Statement");
// document.write("<br/> 2nd Statement");
// document.write("<br/> 3rd Statement");

// synchronous statement exection 
var i=0;
document.write("<br/> 1st Statement");

setTimeout(()=> {
   // document.write("<br/> 2nd Statement");
   document.getElementById("obj1").innerHTML="<br/> 2nd Statement";
},3000);

var obj = setInterval(()=> {
    document.getElementById("obj2").innerHTML="<br/> 4th Statement "+i;
    var dd = new Date();
    
    if(i%2==0){
       // document.getElementsByTagName("body")[0].bgColor="RED";
       document.getElementById("obj3").style.color="#ffabff"
       document.getElementById("obj3").style.fontSize="30pt"
       document.getElementById("dd").innerHTML=dd.getHours()+":"+dd.getMinutes()+":"+dd.getSeconds();
    }else {
        //document.getElementsByTagName("body")[0].bgColor="GREEN";
        document.getElementById("obj3").style.color="#abc123"
        document.getElementById("obj3").style.fontSize="20pt"
        document.getElementById("dd").innerHTML=dd.getHours()+":"+dd.getMinutes()+":"+dd.getSeconds();
    }
    
    i++;
},1000)
document.write("<br/> 3rd Statement");


function stop() {
    clearInterval(obj);
}




