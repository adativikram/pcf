package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class DemoController {

	@Autowired
	private ProductService productservice;

	@GetMapping
	public String greeting() {

		return "hello";
	}

	@GetMapping(value = "/productid")
	public ResponseEntity<Product> greeting(@RequestParam(value="id",required = false,defaultValue = "2") Integer id) {

		Product result = productservice.getProductById(id);

		return  new ResponseEntity<>(result,HttpStatus.OK);
	}
}
