package com.lambda.ThreadTest;

public class Product {
	private boolean isAvailable;
	private String product;
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getProduct() {
		this.isAvailable=false;
		return product;
	}
	public void setProduct(String product) {
		this.isAvailable=true;
		this.product = product;
	}
	
}
