package com.cyx.pojo;

public class Animal {
	private String kind;
	private String veriety;
	private String portion;
	private String inventery;
	private String price;
	public Animal() {}
	public Animal(String kind, String veriety,String inventery, String price) {
		super();
		this.kind = kind;
		this.veriety = veriety;
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
		return "Animal [kind=" + kind + ", veriety=" + veriety 
				+", portion=" + portion + ", inventery=" + inventery + ", price=" + price + "]";
	}
	
}
