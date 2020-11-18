package com.furniture.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = furniture)
public class ProductsModel {
	
	private int id;
	private String name;
	private String description;
	private String price;
	private String picture;
	
	public int getId( ) {
		return id;
	}
	public void setId(int id) {
		this.id= is;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescrption() {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice() {
		this.price = price;
		
	}
	public String getPicture() {
		return picture;
	}
	
	public void setPicture() {
		this.picture = picture;
	}
	
	
	

}
