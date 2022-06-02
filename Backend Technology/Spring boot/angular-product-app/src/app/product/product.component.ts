import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormControl, FormGroup } from '@angular/forms';
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
  deleteMsg:string ="";
  storeMsg:string ="";
  
    buttonName:string ="Store Product";
    updateMsg:string="";
  constructor(public ps:ProductService) { }   // DI for ProductService

  // this is life cycle method it will call only once 
  ngOnInit(): void {
    this.loadAllProductDetails();
  }
  f1:boolean = false;
  loadAllProductDetails(): void {
    this.ps.loadAllProductDetails().subscribe(result=> {
      this.products=result;
    })
  }

  storeProduct(b1:any){
    console.log(b1.value);
    if(b1.value=="Store Product"){
    let product:Product  = this.productRef.value;
    //alert(product)
    //console.log(product);
    this.ps.storeProduct(product).subscribe(result=> {
      //alert(result);
      this.storeMsg=result;
    },error=>console.log(error),()=>{
      this.loadAllProductDetails();
    })
    this.productRef.reset();
  } else {
    let product  = this.productRef.value;
    console.log(product);
    this.ps.updateProduct(product).subscribe(result=> {
      this.updateMsg=result
    },error=> console.log(error),()=> {
      this.loadAllProductDetails();
      this.buttonName="Store Product";
      this.productRef.reset();
      this.productRef.get("pname")?.disable({onlySelf:false});
      this.productRef.get("url")?.disable({onlySelf:false});
    })
  }

  }
  deleteRec(pid:number): void {
    //console.log(pid);
    this.ps.deleteProduct(pid).subscribe(result=> {
      this.deleteMsg=result;
    },error=>console.log(error),()=> {
      this.loadAllProductDetails();
      
    })
  }

  updateRec(product:Product): void {
    //console.log(product);
    this.buttonName="Update Product";
    this.productRef.get("pid")?.setValue(product.pid);
    //this.productRef.get("pid")?.disable({onlySelf:true});
    
    this.productRef.get("pname")?.setValue(product.pname);
    this.productRef.get("pname")?.disable({onlySelf:true});
    this.productRef.get("price")?.setValue(product.price);
    this.productRef.get("url")?.setValue(product.url);
    this.productRef.get("url")?.disable({onlySelf:true});
  }

}
