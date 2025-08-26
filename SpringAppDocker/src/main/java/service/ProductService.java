package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository prepo;
	
	public Product saveProduct(Product product) {
		
		return prepo.save(product);
	}
	
	public List<Product> saveProduct(List<Product> products) {
		
		return prepo.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return prepo.findAll();
	}
	
	public Product getProductbyId(int id){
		
		return prepo.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		
		return prepo.findbyName(name);
	}
	
	public String deleteProductbyId(int id)
	{
		prepo.deleteById(id);
		return "Product deleted";
	}
}
