import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginRef = new FormGroup({
    email:new FormControl(),
    password:new FormControl()
  });

  constructor(public router:Router) { } // DI for Router API 
  msg:string ="";
  ngOnInit(): void {
  }

  checkUser(){
    let login = this.loginRef.value;
    /*
    this.ls.checkUserDetails(login).subscribe(result=> {
        if(result=="success"){

        }else {

        }
    },error=> console.log(error),()=>console.log("done"))


if(result=="condition") {

}else {

}
	
    */
    if(login.email=="raj@gmail.com" && login.password=="123"){
      sessionStorage.setItem("user","raj@gmail.com");
      // value can be dynamic if we check from backend technologies. 
        this.router.navigate(["home"],{skipLocationChange:true});
    }else {
        this.msg = "Email or Password is wrong";
    }

    this.loginRef.reset();
  }
}
