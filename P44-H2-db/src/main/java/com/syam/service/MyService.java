package com.syam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syam.entity.Product;
import com.syam.repo.MyRepository;

@Service
public class MyService implements IProService {

	@Autowired
	private MyRepository myRepository;

	public MyService(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	@Override
	public String addProduct(Product product) {
		Integer one = product.getOne();
		myRepository.save(product);
		if (one == null) {
			return "Inserted succesfully.......";
		} else {
			return "updated succesfully.......";
		}
	}

	@Override
	public List<Product> listAllProduct() {
		List<Product> all = myRepository.findAll();
		return all;
	}

	@Override
	public String deleteProduct(Integer one) {
		 myRepository.deleteById(one);
		 return "deleted successfully......";
	}

}
