import { Component } from "@angular/core"

@Component({
    selector:"my-tag",
    templateUrl:"./custom.component.html",
    styleUrls:["./custom.component.css"]
})
export class CustomComponent {
    msg:string ="This is custom component"
}