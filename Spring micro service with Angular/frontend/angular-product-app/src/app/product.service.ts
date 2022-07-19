import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }


  loadAddProdcut():Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:8080/product/allProduct");
  }
}
