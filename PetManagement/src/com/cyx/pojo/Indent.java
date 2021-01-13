package com.cyx.pojo;

public class Indent {
	private String name;
	private String kind;
	private String adress;
	private String veriety;
	private String price;
	private String id;
	public Indent() {};
	public Indent(String name, String kind,String adress,String veriety,
			String price, String id) {
		super();
		this.name = name;
		this.kind = kind;
		this.adress = adress;
		this.veriety = veriety;
		this.price = price;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getVeriety() {
		return veriety;
	}
	public void setVeriety(String veriety) {
		this.veriety = veriety;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Indent [name=" + name + ", kind=" + kind +  ", adress=" + adress 
				+  ", veriety=" + veriety + ", price=" + price + ", id=" + id + "]";
	}
	
	
}
