import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CustomService } from '../custom.service';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  msg:string=""
  constructor(public ls:LoginService) { }   // DI means pull the object. 
  ngOnInit(): void {
  }

  checkUser(loginRef:NgForm){
    let login = loginRef.value;
    // let obj = new CustomService();
    // this.msg = obj.checkUserDetails(login);
    
    this.msg = this.ls.checkUserDetails(login);
    
    // if(login.email =="Raj@gmail.com" && login.password=="123"){
    //     this.msg  ="Successfully login";
    // }else {
    //     this.msg  = "Failure try once again";
    // }

    loginRef.reset();
  }
}
