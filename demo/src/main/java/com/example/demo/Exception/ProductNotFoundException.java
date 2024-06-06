package com.example.demo.Exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -5962935772819871623L;

	public ProductNotFoundException(String msg) {
		super(msg);
	}

}
