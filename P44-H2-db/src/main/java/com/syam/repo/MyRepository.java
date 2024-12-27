package com.syam.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syam.entity.Product;

@Repository
public interface MyRepository extends JpaRepository<Product, Serializable> {

}
