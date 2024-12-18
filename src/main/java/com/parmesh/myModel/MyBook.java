package com.parmesh.myModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_book")
public class MyBook {
	@Id
	private int id;
	private String name;
	private String author;
	private	float price;
	public MyBook() {
		super();
	}
	public MyBook(int id, String name, String author, float price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MyBook [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	} 
}
