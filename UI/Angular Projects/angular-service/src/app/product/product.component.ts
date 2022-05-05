import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(public ps:ProductService) { }   // di for ProductService 

  ngOnInit(): void {
  }

  loadProductInfo() {
    this.ps.loadProductData();
  }
}
