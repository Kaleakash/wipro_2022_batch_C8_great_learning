import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CustomService } from '../custom.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {
  
  loginRef  = new FormGroup({
                            // it is equal to required attribute in html page 
    email:new FormControl("",[Validators.required,Validators.minLength(3)]),
    password:new FormControl("",[Validators.required,Validators.pattern("[a-z]+@[a-d,0-9]+")])
  });
  msg:string ="";
  constructor(public ls:LoginService) { }   // DI for service class

  ngOnInit(): void {
  }

  checkUser() {
    let login = this.loginRef.value;
    // let obj = new CustomService();
    // this.msg = obj.checkUserDetails(login);
    
    this.msg = this.ls.checkUserDetails(login);

  //   if(login.email=="Raj@gmail.com" && login.pass=="123"){
  //     this.msg = "Successfull login";
  //   }else {
  //       this.msg  = "Failure try once again";
  //   }
  }
}
