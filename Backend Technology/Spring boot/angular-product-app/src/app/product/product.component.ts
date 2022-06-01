import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  products:Array<Product>=[];
  constructor(public ps:ProductService) { }   // DI for ProductService

  // this is life cycle method it will call only once 
  ngOnInit(): void {
    this.loadAllProductDetails();
  }

  loadAllProductDetails(): void {
    this.ps.loadAllProductDetails().subscribe(result=> {
      this.products=result;
    })
  }
}
