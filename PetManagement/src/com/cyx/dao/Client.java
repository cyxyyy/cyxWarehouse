package com.cyx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class cent{
	String id;
	String name;
	String password;
	public cent() {}
	public cent(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "id:"+id+"password:"+password+"name"+name;
	}
	
	
	
	
	
}

public class Client{
	private static void insertPet() throws Exception{
		String[] a= {"1","2","3","4","5","6","7","8","9","0"};
		String[] b= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
		String[] c= {"��","��","��","��","��","��","��","��","�","��","ϼ��","ޱ��","�Ĺ�","ޱ��","ϼ��","�ܰ" ,"�ſ�" ,"���","��ɼ","����","����","����","����" ,"¶�","�ش�","����","��ǿ" ,"���� ","����","����","𩺣","����" ,"����" ,"ط��","����"};
		
		List<cent> ccs=new ArrayList<cent>(10000);
		
		for(int j=0;j<10000;j++) {
			cent cl=new cent();
				cl.setId(a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]);
				cl.setPassword(a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]+a[new Random().nextInt(10)]);
				cl.setName(b[new Random().nextInt(b.length)]+c[new Random().nextInt(c.length)]);
				ccs.add(cl);
			}
			for(int i=0;i<ccs.size();i++) {
				cent pet=ccs.get(i);
				System.out.println(pet);
			}
		System.out.println("�û��������");
	
		Connection conn=new LoginSQL().getConnection();
		String sql="insert into Client(name,id,password) values(?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		for(int i=0;i<ccs.size();i++) {
			cent pet=ccs.get(i);
			pstmt.setString(1,pet.getName());
			pstmt.setString(2,pet.getId());
			pstmt.setString(3,pet.getPassword());
			
			
			//pstmt.addBatch();
			pstmt.executeUpdate();
		
		}System.out.println("��ɲ���");
	}
	
	public static void main(String[] args) throws Exception{
		insertPet();
	}
	
}




