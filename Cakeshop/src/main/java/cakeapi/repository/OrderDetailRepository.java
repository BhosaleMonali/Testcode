package cakeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cakeapi.entity.Order;
import cakeapi.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
	
	public List<OrderDetail> findByOrder(Order order);

}
