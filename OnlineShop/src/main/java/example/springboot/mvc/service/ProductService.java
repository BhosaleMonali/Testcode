package example.springboot.mvc.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import example.springboot.mvc.entity.Customer;
import example.springboot.mvc.entity.Product;
import example.springboot.mvc.repository.OnlineShopRepository;
import example.springboot.mvc.repository.ProductRepository;



@Service
public class ProductService {

		@Autowired
		private OnlineShopRepository ObjectRespository;
		@Autowired
		private ProductRepository productObject;
		
		public Collection<Customer> getAllProduct(){
			 System.out.println("service called");
			
		 Collection<Customer> mylist = ObjectRespository.findAll();
	
		
		     return mylist;
		}
		
		public Collection<Product> getAllProduct1(){
			 System.out.println("service called");
			
		 Collection<Product> mylist = productObject.findAll();
		     return mylist;
		}
		public Customer getorderById(String custId) {
			Optional<Customer> optionalRef = ObjectRespository.findById(custId);
//			Movie foundMovie=movieRepositoryRef.getMovieById(movieId);
			Customer found=null;
			if(!optionalRef.isEmpty())
			 found = optionalRef.get();
			return  found;
		}
}
