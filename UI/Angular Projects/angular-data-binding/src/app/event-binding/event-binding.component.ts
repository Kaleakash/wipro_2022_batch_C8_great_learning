import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  msg:string ="hi"
  constructor() { }

  ngOnInit(): void {
  }

  fun(){
    //alert("Event generated...");
    //alert(this.msg)
    //this.msg = "Welcome to Angular";
    this.msg = "Hello"
    //alert(this.msg)
  }

  passValue(nameRef:any){
    let name = nameRef.value;
    alert("Welcome user "+name);
  }
}
