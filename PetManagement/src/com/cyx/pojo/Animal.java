package com.cyx.pojo;

public class Animal {
	private String kind;
	private String veriety;
	private String age;
	private String sex;
	private String number;
	private String color;
	private String portion;
	private String inventery;
	private String price;
	public Animal() {} 
	public Animal(String kind, String veriety, String age, String sex, String number, String color, String portion,
			String inventery, String price) {
		super();
		this.kind = kind;
		this.veriety = veriety;
		this.age = age;
		this.sex = sex;
		this.number = number;
		this.color = color;
		this.portion = portion;
		this.inventery = inventery;
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getVeriety() {
		return veriety;
	}
	public void setVeriety(String veriety) {
		this.veriety = veriety;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPortion() {
		return portion;
	}
	public void setPortion(String portion) {
		this.portion = portion;
	}
	public String getInventery() {
		return inventery;
	}
	public void setInventery(String inventery) {
		this.inventery = inventery;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Animal [kind=" + kind + ", veriety=" + veriety + ", age=" + age + ", sex=" + sex + ", number=" + number
				+ ", color=" + color + ", portion=" + portion + ", inventery=" + inventery + ", price=" + price + "]";
	}
	
}
