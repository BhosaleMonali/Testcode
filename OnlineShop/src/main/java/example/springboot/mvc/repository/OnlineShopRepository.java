package example.springboot.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.springboot.mvc.entity.Customer;

//import org.springframework.data.jpa.repository.JpaRepository;

//import example.springboot.mvc.entity.Product;

public interface OnlineShopRepository extends JpaRepository<Customer, String> {
	
	 

}
