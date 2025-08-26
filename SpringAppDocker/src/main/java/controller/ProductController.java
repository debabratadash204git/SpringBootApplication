package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		
		return pservice.saveProduct(product);
	}
	@PostMapping
    public List<Product> addProduct(@RequestBody List<Product> products) {
		
		return pservice.saveProduct(products);
	}
	
	@GetMapping("products")
	public List<Product> getproduct(){
		return pservice.getProducts();
	}

}
