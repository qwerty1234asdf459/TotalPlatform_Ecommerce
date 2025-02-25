package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "admin_product")
public class AdminProduct {
	
//	확인 필요
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminProductId;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;


	
	
	

}
