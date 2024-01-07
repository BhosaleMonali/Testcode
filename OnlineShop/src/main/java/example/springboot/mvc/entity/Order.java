package example.springboot.mvc.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@Column(name="ord_no")
	private Integer orderNo;
	private Date orderDate;
	@Column(name="cust_id")
	private String customerId;
	@Column(name="pno")
	private Integer productNo;
	@Column(name="qty")
	private Integer quantity;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderNo, Date orderDate, String customerId, Integer productNo, Integer quantity) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.productNo = productNo;
		this.quantity = quantity;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getProductNo() {
		return productNo;
	}

	public void setProductNo(Integer productNo) {
		this.productNo = productNo;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate + ", customerId=" + customerId + ", productNo="
				+ productNo + ", quantity=" + quantity + "]";
	}

}
