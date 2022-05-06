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

  constructor(public ps:ProductService) { }   // di for ProductService 

  ngOnInit(): void {
  }

  loadProductInfo() {
    this.ps.loadProductData().subscribe(result=>this.products=result,error=>console.log(error),()=>console.log("done"));
  }
}
