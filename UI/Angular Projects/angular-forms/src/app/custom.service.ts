

export class CustomService {

    checkUserDetails(login:any):string {
        if(login.email=="Raj@gmail.com" && login.password=="abc@123"){
            return "success";
        }else {
            return "failure";
        }
    }
}