package example.springboot.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="  products")
public class Product {
	@Id
	@Column(name="pno")
	private Integer productNo;
	
	@Column(name="price")
	private double Price;
	
	@Column(name="stock")
	private Integer stock;
	
	

	public Product() {
		// TODO Auto-generated constructor stub
	}



	public Product(Integer productNo, double price, Integer stock) {
		super();
		this.productNo = productNo;
		Price = price;
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", Price=" + Price + ", stock=" + stock + "]";
	}



	public Integer getProductNo() {
		return productNo;
	}



	public void setProductNo(Integer productNo) {
		this.productNo = productNo;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}



	public Integer getStock() {
		return stock;
	}



	public void setStock(Integer stock) {
		this.stock = stock;
	}
	

}
