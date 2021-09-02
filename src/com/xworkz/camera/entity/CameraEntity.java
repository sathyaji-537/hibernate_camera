package com.xworkz.camera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="camera_table")

public class CameraEntity implements Serializable {
	@Column (name="c_id")
	@Id
	private int id;
	@Column (name="c_name")
	private String name;
	@Column (name="c_brand")
	private String brand;
	@Column (name="c_type")
	private String type;
	@Column (name="c_price")
	private double price;
	@Column (name="c_warranty")
	private int warranty;
	@Column (name="c_pixel")
	private int pixel;
	
	public CameraEntity() {
		// TODO Auto-generated constructor stub
	}

	public CameraEntity(int id, String name, String brand, String type, double price, int warranty, int pixel) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.warranty = warranty;
		this.pixel = pixel;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", type=" + type + ", price=" + price
				+ ", warranty=" + warranty + ", pixel=" + pixel + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	

}
