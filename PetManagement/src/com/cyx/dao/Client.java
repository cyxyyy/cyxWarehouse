package com.cyx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Pet{
	private String kind;
	private String veriety;
	private String age;
	private String sex;
	private int number;
	private String color;
	private String portion;
	private String inventery;
	private String price;
	public Pet() {}
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
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
	
	
	
	public Pet(String kind,String veriety,String age,String sex,int number,String color,String portion,String inventery,String price) {
		this.kind=kind;
		this.veriety=veriety;
		this.age=age;
		this.sex=sex;
		this.number=number;
		this.color=color;
		this.portion=portion;
		this.inventery=inventery;
		this.price=price;
	}
	
}

public class Client{
	private static void insertPet(int count) throws Exception{
		int n=22;
		String[] a= {"��ĦҮ","��ʿ��","����˹��","�»�","����","��ë","����"};
		String[] b= {"��ż","��è","�ϼ���è","Ӣ��","����","�ӷ�è","��˹è"};
		String[] c= {"1����","2����","3����","4����","5����","6����","7����","8����","9����","10����","11����","12����","1��","1��1����","1��2����","1��3����","2��","1��4����"};
		String[] d= {"����","����"};
		String[] e= {"��ɫ","��ɫ","�ڰ�ɫ","��ɫ","����ɫ","��ɫ","��ɫ","��ɫ","����ɫ"};
		String[] f= {"1","2","3","4","5","6","7","8"};
		String[] h= {"2000Ԫ","3000Ԫ","1200Ԫ","1100Ԫ","900Ԫ","800Ԫ","500Ԫ","600Ԫ","700Ԫ","1000Ԫ","1400Ԫ","1600Ԫ","1800Ԫ","2100Ԫ","2300Ԫ","2400Ԫ","4000Ԫ"};
		List<Pet> pets=new ArrayList<Pet>(count);
		
		/*Random aa=new Random();
		Random cc=new Random();
		Random dd=new Random();
		Random ee=new Random();
		Random ff=new Random();
		Random hh=new Random();
		Random bb=new Random();
		*/
		
		
		
		//for(int i=0;i<count;i++) {
			for(int j=0;j<count/2;j++) {
				n=n+1;
				Pet pet=new Pet();
				
				pet.setKind("��");
				pet.setVeriety(b[new Random().nextInt(a.length)]);
				pet.setAge(c[new Random().nextInt(c.length)]);
				pet.setSex(d[new Random().nextInt(d.length)]);
				pet.setNumber(n);
				pet.setColor(e[new Random().nextInt(e.length)]);
				pet.setPortion(f[new Random().nextInt(f.length)]);
				pet.setInventery(f[new Random().nextInt(f.length)]);
				pet.setPrice(h[new Random().nextInt(h.length)]);
				
				pets.add(pet);
				
			}
			for(int j=count/2;j<count;j++) {
				n=n+1;
				Pet pet=new Pet();
				
				pet.setKind("è");
				pet.setVeriety(a[new Random().nextInt(a.length)]);
				pet.setAge(c[new Random().nextInt(c.length)]);
				pet.setSex(d[new Random().nextInt(d.length)]);
				pet.setNumber(n);
				pet.setColor(e[new Random().nextInt(e.length)]);
				pet.setPortion(f[new Random().nextInt(f.length)]);
				pet.setInventery(f[new Random().nextInt(f.length)]);
				pet.setPrice(h[new Random().nextInt(h.length)]);
				
				pets.add(pet);
				
			}
			
		//}
		System.out.println("�û��������");
		
		Connection conn=new LoginSQL().getConnection();
		String sql="insert into Pet(kind,veriety,age,sex,number,color,portion,inventery,price) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		for(int i=0;i<pets.size();i++) {
			Pet pet=pets.get(i);
			pstmt.setString(1,pet.getKind());
			pstmt.setString(2,pet.getVeriety());
			pstmt.setString(3,pet.getAge());
			pstmt.setString(4,pet.getSex());
			pstmt.setInt(5,pet.getNumber());
			pstmt.setString(6,pet.getColor());
			pstmt.setString(7,pet.getPortion());
			pstmt.setString(8,pet.getInventery());
			pstmt.setString(9,pet.getPrice());
			
			pstmt.addBatch();
			//pstmt.executeUpdate();
			
		}
		//pstmt.executeUpdate();
		pstmt.executeBatch();
		pstmt.close();
		conn.close();
		System.out.println("��ɲ���");
		
	}
	
	public static void main(String[] args) throws Exception{
		insertPet(10000);
	}
	
}




