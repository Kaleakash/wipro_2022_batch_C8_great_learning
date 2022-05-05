import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'  // it is equal to providers attribute in app.module.ts file to register the service class. 
})
export class ProductService {

  constructor(public http:HttpClient) { }     // DI for HttpClient pre defined API. 


  // loadProductData() {
  //   this.http.get("https://fakestoreapi.com/products").
  //   subscribe(result=>console.log(result),error=>console.log(error),
  //   ()=>console.log("done"));
  // }
// the URL provide the data in json format we convert these data in product of array. 
// we will call subscribe in component. 
  loadProductData():Observable<Product[]>{
    return this.http.get<Product[]>("https://fakestoreapi.com/products");
  }
}
