package cakeapi.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cakeapi.DTO.Cart;
import cakeapi.DTO.PlaceOrderdto;
import cakeapi.entity.Address;
import cakeapi.entity.Order;
import cakeapi.entity.OrderDetail;
import cakeapi.entity.Product;
import cakeapi.entity.User;
import cakeapi.service.AddressService;
import cakeapi.service.OrderDetailService;
import cakeapi.service.OrderService;
import cakeapi.service.ProductService;
import cakeapi.service.UserService;




@CrossOrigin
@RestController
public class OrderController {
	
	@Autowired
	private AddressService addressService;
	@Autowired
	private OrderDetailService orderDetailService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	
	@PostMapping("/placeorder")
	public ResponseEntity<?> saveorder(@RequestBody PlaceOrderdto dto)
	{
		Address address=addressService.saveAddress(dto.getAddress());
		Order order=new Order();
		order.setOrderDate(new Date());
		order.setAddress(address);
		User customer=userService.getUserById(dto.getUser_id());
		order.setUser(customer);
		Order orders=orderService.savenewOrder(order);
		
		Cart cart=dto.getCart();
		
			OrderDetail od=new OrderDetail();
			od.setOrder(orders);
			od.setMessage(cart.getMessage());
			od.setQuantity(cart. getQuantity());
			od.setWeight(cart.getWeight());
			Product product= productService.getProductById(cart. getProduct_id());
			od.setProduct(product);
			double temp =cart. getQuantity()* cart.getWeight()*product.getPricepercake();
			od.setAmount(temp);
			od.setOrderStatus(cart.getOrderStatus());
		
		
		return  ResponseEntity.ok("Order is in  processing");
		
	}
	
	
	@GetMapping
	public ResponseEntity<?> findAllOrders(Optional<Integer> custid) {
		List<Order> result=null;
		if(custid.isPresent()) {
			User customer=userService.getUserById(custid.get());
			 result= orderService.getOrderByUser(customer);
		}else {
			result = orderService.getAllOrder();
		}
		return ResponseEntity.ok(result);
	}
	
	
	
	
}
