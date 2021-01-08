package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import com.cyx.ui.CInterface;

public class COrder{
	private JFrame frame=new JFrame("��ѯ����");
	private JScrollPane scp;
	private JTableHeader jth;
	private JTable tab;
	private JButton btnOK=new JButton("����");
	private JLabel lblName=new JLabel("����");
	private JLabel lblId=new JLabel("�˺�");
	private JTextField txtName=new JTextField(20);
	private JTextField txtId=new JTextField(20);
	private JButton btnReturn=new JButton("����");
	
	public COrder() {
		//super("��ѯ����");
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblName.setBounds(20,30,100,50);//����x������y����ȣ��߶�
		lblName.setFont(new Font("����",Font.BOLD,40));
		lblName.setForeground(Color.BLUE);
		frame.add(lblName);
		
		lblId.setBounds(280,30,100,50);//����x������y����ȣ��߶�
		lblId.setFont(new Font("����",Font.BOLD,40));
		lblId.setForeground(Color.BLUE);
		frame.add(lblId);
		
		txtName.setBounds(150, 30, 100, 50);
		frame.add(txtName);
		txtId.setBounds(410, 30, 100, 50);
		frame.add(txtId);
		
		
		btnOK.setBounds(540,30,100,50);
		frame.add(btnOK);
		btnReturn.setBounds(670,30,100,50);
		frame.add(btnReturn);
		
		scp=new JScrollPane();
		//this.scp.setBounds(10,50,300,270);
		scp.setBounds(50, 100, 850, 800);
		
		this.btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new CInterface();
			}
			
		});
		
		
		this.btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String name=txtName.getText();
				String id=txtId.getText();
				btnActionPerformed(name,id);
				
			}
			
		});
		frame.add(scp);
		frame.add(btnOK);
		frame.add(btnReturn);
		
		frame.setVisible(true);
		
	}
	public void btnActionPerformed(String name,String id) {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from COrder where name=? and id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,id);
			ResultSet rs=pstmt.executeQuery();
			
			int count=0;
			while(rs.next()) {
				count++;
			}
			rs=pstmt.executeQuery();
			Object[][] info=new Object[count][8];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString("name");
				info[count][1]=rs.getString("adress");
				info[count][2]=rs.getString("kind");
				info[count][3]=rs.getString("veriety");
				info[count][4]=rs.getString("sex");
				info[count][5]=rs.getString("age");
				info[count][6]=rs.getString("color");
				info[count][7]=rs.getString("price");
				
				count++;
			}
			String[] title= {"����","��ַ","����","Ʒ��","�Ա�","����","��ɫ","�۸�"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
/*public class ClientOrder {
	public static void main(String[] args) {
		new COrder();

	}

}*/
