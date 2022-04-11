function sayHello() {
    alert("Welcome to Simple Event")
}

function readValue() {
    //1st way to get the value of text field using name attribute 
    //var name = document.getElementsByName("user")[1].value;
    //alert("Welcome user "+name);
    //window.location

    //2nd way to get the value of text field using id attribute 
    // var name = document.getElementById("u2").value;
    // alert("Welcome user "+name);

    let h1TagValue  = document.getElementsByTagName("h1")[0].innerHTML;
    alert(h1TagValue);
    let fname = document.getElementById("u1").value;
    let lname = document.getElementById("u2").value;
    document.getElementById("fullname").value="Welcome "+fname+" "+lname;
    document.getElementById("u1").value = "";
    document.getElementById("u2").value = "";
    document.getElementById("out").innerHTML="Welcome "+fname+" "+lname;
}

function domOperation() {
    let userName = document.getElementById("userName").value;
    let userAge = document.getElementById("userAge").value;
    let ptag = document.createElement("p");
    let ptagContent = document.createTextNode("Name is "+userName+" Age is "+userAge);
    
    ptag.appendChild(ptagContent);      // content added in p tag 
    
    ptag.setAttribute("class","myPTagClass")

    document.getElementById("menu").appendChild(ptag);  // added p tag in div tag 
    document.getElementById("userName").value="";
    document.getElementById("userAge").value="";
}


