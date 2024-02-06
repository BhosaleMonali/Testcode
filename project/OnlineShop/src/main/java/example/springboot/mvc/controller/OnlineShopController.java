package example.springboot.mvc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import example.springboot.mvc.entity.Customer;
import example.springboot.mvc.entity.Product;
import example.springboot.mvc.repository.OnlineShopRepository;
import example.springboot.mvc.service.ProductService;


@RestController
public class OnlineShopController {

	@Autowired//Injecting the refernce of Movieservice
	private ProductService Servciceref;
	
	@GetMapping("/onlineshop")
	public Collection<Customer> getAllProduct(){
		System.out.println("controller called");
		 Collection<Customer> mylist =Servciceref.getAllProduct();
		 
		
		return mylist;
		}
	
	@GetMapping("/onlineshop/product")
	public Collection<Product> getAllProduct1(){
		Collection<Product> mylist=Servciceref.getAllProduct1();
		return mylist;
	}
	
	@GetMapping("/onlineshop/{id}")
	public Customer getorderById(@PathVariable("id") String custId) {
		Customer found=Servciceref.getorderById(custId);
		System.out.println(found.getOrder());
		return found;
	}
	
	
}
