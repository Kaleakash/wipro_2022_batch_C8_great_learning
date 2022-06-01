import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  products:Array<Product>=[];

  productRef = new FormGroup({
    pid:new FormControl(),
    pname:new FormControl(),
    price:new FormControl(),
    url:new FormControl()
  })

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

  storeProduct(){
    let product  = this.productRef.value;
    //alert(product)
    //console.log(product);
    this.ps.storeProduct(product).subscribe(result=> {
      alert(result);
    },error=>console.log(error),()=>{
      this.loadAllProductDetails();
    })
    this.productRef.reset();
  }
}
