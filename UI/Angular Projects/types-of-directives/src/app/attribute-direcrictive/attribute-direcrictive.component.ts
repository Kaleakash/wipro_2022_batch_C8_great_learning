import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-direcrictive',
  templateUrl: './attribute-direcrictive.component.html',
  styleUrls: ['./attribute-direcrictive.component.css']
})
export class AttributeDirecrictiveComponent implements OnInit {
  styleProperites = {'color':'orange','font-size':'25pt'};
  
  constructor() { }

  ngOnInit(): void {
  }

}
