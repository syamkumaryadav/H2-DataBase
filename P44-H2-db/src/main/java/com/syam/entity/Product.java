package com.syam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer one;
	
	@Column
	private Integer two;
	
	@Column
	private String three;

}
