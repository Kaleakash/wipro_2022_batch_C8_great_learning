import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
  f1:boolean = true;
  f2:boolean = false;
  f3:boolean = false;
  flag:boolean = false;
  b1:string ="Show";
  names:Array<string>=["Ravi","Ajay","Vijay","Ramesh","Lokesh","Mahesh","Kumar"];
  
  emp:Employee=new Employee(100,"Ravi",21);
  employees :Array<Employee>=[];    // array of employee memory created.   
  constructor() { }
  // it is life of component. it will call automatically when component loaded 
  // it will call only once after constructor. 
  ngOnInit(): void {
    // let emp1 = new Employee(100,"Ajay",23);
    // let emp2 = new Employee(101,"Vijay",25);
    // let emp3 = new Employee(102,"Lokesh",28);
    // this.employees.push(emp1);
    // this.employees.push(emp2);
    // this.employees.push(emp3);
  }

  
  changevalue(){
    this.f3=true;
  }

  toggle() {
    if(this.flag){
      this.flag=false;
      this.b1="Show";
    }else {
      this.flag=true;
      this.b1="Hide";
    }
  }
}
