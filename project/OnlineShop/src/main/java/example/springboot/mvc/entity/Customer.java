package example.springboot.mvc.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")

public class Customer {
	@Id
	@Column(name="cust_id")
	private String customerId;
	
	@Column(name="pwd")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="credit")
	private int credit;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ord_no")
	private Order order;
	
	
	public Customer() {}


	public Customer(String customerId, String password, String email, int credit, Order order) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.email = email;
		this.credit = credit;
		this.order = order;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCredit() {
		return credit;
	}


	public void setCredit(int credit) {
		this.credit = credit;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", password=" + password + ", email=" + email + ", credit="
				+ credit + ", order=" + order + "]";
	}

	
	
}
