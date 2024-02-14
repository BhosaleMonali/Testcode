package cakeapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 20)
	private String city;
	
	@Column(length = 20)
	private String state;
	
	@Column(name = "pincode", length = 8)
	private String pincode;
	
	@Column(name = "mobile_no", length = 15)
	private String mobileno;

}
