package com.iskander.capstoneBackend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "products") 
public class Product {
	
	
		@Id
	  @GeneratedValue
	  @Column(name = "emp_id")
	  private long id;
		
		
		@Column(name = "name")
	  private String name;
		
		@Column(name = "description")
	  private String description;
		
		@Column(name = "keywords")
	  private String keywords;
		
		@Column(name = "image")
		  private String image;
		
		@Column(name = "age")
		  private int age;
		
		@Column(name = "price")
		  private int price;
	   
		public Product() {
			super();
		}
	  
		public Product(long id, String name, String description, String keywords, String image, int age, int price) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.keywords = keywords;
			this.image = image;
			this.age = age;
			this.price = price;
		}

	 

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getKeywords() {
			return keywords;
		}

		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
}