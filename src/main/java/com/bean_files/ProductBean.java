package com.bean_files;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable {

	private String code, name;
	private double price;
	private int qty;
	private String imageUrl;
	
	public ProductBean(String code,String name, double price, int qty) {}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public ProductBean() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
