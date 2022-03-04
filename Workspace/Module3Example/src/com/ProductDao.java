package com;

import java.util.Scanner;

public class ProductDao {
		Product allProduct[]=new Product[10];
		Scanner obj = new Scanner(System.in);
		static int index =0;
		void addProduct() {
			System.out.println("Plz enter the product id");
			int id = obj.nextInt();
			System.out.println("Plz enter the product name");
			String name = obj.next();
			System.out.println("plz enter the product price");
			float price = obj.nextFloat();
			Product pp = new Product(id, name, price);
			allProduct[index]=pp;
			index++;
		}
		void updatePrice() {
			int flag =0;
			System.out.println("Plz enter the product id");
			int id = obj.nextInt();
			System.out.println("plz enter the product price");
			float price = obj.nextFloat();
			for(int i=0;i<index;i++) {
					if(allProduct[i].getPid()==id) {
						//allProduct[i].setPrice(price);
						allProduct[i]=null;
						flag++;
						break;
					}
			}
			if(flag>0) {
				System.out.println("product price updated");
			}else {
				System.out.println("product id not present");
			}
		}
}
