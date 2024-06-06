package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Product;
import com.example.demo.Exception.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product getProductById(Integer id) {
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Product> result = productsList.stream().filter(product -> product.getId() == id)
				.collect(Collectors.toList());
		if (!result.isEmpty()) {
			return result.get(0);
		} else {
			throw new ProductNotFoundException("no product found");
		}

	}

}
