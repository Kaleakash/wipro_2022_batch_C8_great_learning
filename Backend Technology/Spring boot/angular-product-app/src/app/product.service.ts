import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }   // DI for HttpClient



  loadAllProductDetails():Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:8080/products/findAll");
  }
// by default all HttpClient method return type is json if string then we have to write responseType as text 
  storeProduct(product:Product):Observable<string>{
    return this.http.post("http://localhost:8080/products/storeProduct",product,{responseType:'text'})
  }

  deleteProduct(pid:number):Observable<string> {
    return this.http.delete("http://localhost:8080/products/deleteProduct/"+pid,{responseType:'text'});
  }
  updateProduct(product:any):Observable<string> {
    return this.http.put("http://localhost:8080/products/updateProduct",product,{responseType:"text"});
  }

}
