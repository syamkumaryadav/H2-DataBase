package com.syam.service;

import java.util.List;

import com.syam.entity.Product;

public interface IProService {
	
	public String addProduct(Product product);
	
	public List<Product> listAllProduct();
	
	public String deleteProduct(Integer one);

}
