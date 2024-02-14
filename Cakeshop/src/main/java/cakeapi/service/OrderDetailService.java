package cakeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cakeapi.entity.Order;
import cakeapi.entity.OrderDetail;
import cakeapi.repository.OrderDetailRepository;

@Service
public class OrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepo;
	
	public OrderDetail saveOrderDetails(OrderDetail orderdetail)
	{
		return orderDetailRepo.save(orderdetail);
	}
	
	public List<OrderDetail> getAllOrderDetail(Order order)
	{
		return orderDetailRepo.findByOrder(order);
	}
	
	public OrderDetail findByOne(int id){
		return orderDetailRepo.findById(id).orElse(null);
	}

}
