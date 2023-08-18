package com.ProductSpringWeb.ProductSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class ProductService {
		
		@Autowired
		ProductDB db;
		
		
		
		
		
		
		

		public void addProduct(Product p) {
			 //products.add(p);
			db.save(p);
		}
	
		

		public List<Product> getAllProducts(){
			return db.findAll();
		}
		
		public Product getProduct(String name){
			return db.findByName(name);
		}
/*
		public List<Product> getProductWithText(String text) {
		
			List<Product> prods = new ArrayList<>();
			
			for(Product p : products){
				if(p.getName().contains(text) || p.getType().contains(text)|| p.getPlace().contains(text))
			prods.add(p);
			}
			return prods;
		}
		
		public List<Product> getProductWithPlace(String place){
			
			List<Product> prod = new ArrayList<>();
			
			for(Product p: products) {
				if(p.getPlace().equals(place))
					prod.add(p);
			}
			return prod;
		}
		
		*/
	}


