import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:Array<Employee>=[];
employeeRef = new FormGroup({
  id:new FormControl(),
  name:new FormControl(),
  age:new FormControl()
})
  constructor(public empSer:EmployeeService) { }  // DI for service class

  ngOnInit(): void {
    this.loadEmployeeDetails();
  }

  loadEmployeeDetails() {
    this.empSer.loadEmployeeDetails().subscribe(result=>this.employees=result,error=>console.log(error),()=>console.log("Done!"));

  }

  storeData(){
    let employee = this.employeeRef.value;
    this.empSer.storeEmployeeDetails(employee).subscribe(result=>console.log(result),
    (error)=>console.log(error),()=>{
      console.log("done");
      this.loadEmployeeDetails();
  });
    this.employeeRef.reset();    
  }
}
