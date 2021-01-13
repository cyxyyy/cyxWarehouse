package com.cyx.dao;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.LinkRef;

import com.cyx.pojo.Animal;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginSQL {
	public static Connection getConnection() throws Exception{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String uri="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=cyx";
		String userName="sa";
		String userPassword="123456";
		Class.forName(driverName);
		return DriverManager.getConnection(uri, userName, userPassword); 
		
	}
	public static ResultSet queryClient()throws Exception{
		Connection conn=getConnection();
		Statement stmt=conn.createStatement();
		String sql="select id,password from Client";
		ResultSet rs=null;
		rs= stmt.executeQuery(sql);
		return rs;
	}
	public static ResultSet queryBoss()throws Exception{
		Connection conn=getConnection();
		java.sql.Statement stmt=conn.createStatement();
		String sql="select id,password from Boss";
		ResultSet rs=null;
		rs=stmt.executeQuery(sql);
		return rs;
	}
	//查看宠物列表
	public static ResultSet queryPet() throws Exception{
		Connection conn=getConnection();
		Statement stmt=conn.createStatement();
		String sql="select kind,veriety,portion,inventery,price from Pet";
		ResultSet rs=stmt.executeQuery(sql);
		return rs;
	}
	public static void insertClient(String id,String password,String name) {
		try {
			Connection conn=getConnection();
			String sql="insert into Client(id,password,name) values (?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			pstmt.setString(3,name);
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void insertBoss(String id,String password,String name) {
		try {
			Connection conn=getConnection();
			String sql="insert into Boss(id,password,name) values (?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			pstmt.setString(3,name);
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void deletePet(String veriety) {//删除宠物信息
		try {
			Connection conn=getConnection();
			String sql="delete from Pet where veriety=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,veriety);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//添加宠物信息
	public static void addInfo(String kind,String variety,String portion,String inventery,String price) {
		try {
			Connection conn=getConnection();
			String sql="insert into Pet(kind,veriety,portion,inventery,price)values (?,?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, kind);
			pstmt.setString(2, variety);
			pstmt.setString(3, portion);
			pstmt.setString(4, inventery);
			pstmt.setString(5, price);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//修改宠物信息
	public static void alterInfo(String kind,String veriety,String portion,String inventery,String price) {
		try {
			Connection conn=getConnection();
			String sql="update Pet set kind=?,portion=?,inventery=?,price=? where veriety=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, kind);
			pstmt.setString(2, portion);
			pstmt.setString(3, inventery);
			pstmt.setString(4, price);
			pstmt.setString(5, veriety);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insertOrder(String kind,String veriety,String name,String adress,String price,String id) {
		try {
			Connection conn=getConnection();
			String sql="insert into COrder(name,id,adress,kind,veriety,price) values (?,?,?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, adress);
			pstmt.setString(4, kind);
			pstmt.setString(5, veriety);
			pstmt.setString(6, price);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*public static String queryName(String id) {
		String s=null;
		try {
			Connection conn=getConnection();
			String sql="select name from Client where id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery(sql);
			pstmt.setString(1,id);
			while(rs.next()) {
				s=rs.getString("name");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}*/
	public static void enshrine(String number) {
		Connection conn;
		try {
			conn = new LoginSQL().getConnection();
			PreparedStatement pstmt1=conn.prepareStatement("select * from Pet where vetiety=?");
			 pstmt1.setString(1, number);
			 ResultSet rs1=pstmt1.executeQuery();
			 ArrayList<Animal> list1=new ArrayList<>();
			 while(rs1.next()) {
				 Animal animal=new Animal();
				 animal.setKind(rs1.getString(1));
				 animal.setVeriety(rs1.getString(2));
				 animal.setPortion(rs1.getString(3));
				 animal.setInventery(rs1.getString(4));
				 animal.setPrice(rs1.getString(5));
				 
				 list1.add(animal);
			 }
			 FileOutputStream fileOutputStream1=new FileOutputStream(new File("D:\\my javaSQL\\Aniamal.txt"));
			 byte bt1[]=new byte[1024];
			 bt1= list1.toString().getBytes();
			 fileOutputStream1.write(bt1);
			 fileOutputStream1.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
