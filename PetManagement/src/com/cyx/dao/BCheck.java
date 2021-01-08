package com.cyx.dao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.sql.*;
import java.awt.Event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.cyx.ui.BInterface;

public class BCheck{
	private JFrame frame=new JFrame("�鿴���г����б�");
	private JScrollPane scp;
	private JTableHeader jth;
	private JTable tab;
	private JButton btnOK;
	private JButton btnReturn=new JButton("����");
	public BCheck() {
		//super("�鿴���г����б�");
		frame.setSize(1000,1000);
		frame.setLayout(null);
		frame.setLocation(50,50);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		scp=new JScrollPane();
		//this.scp.setBounds(10,50,300,270);
		scp.setBounds(30, 50, 920, 920);
		btnOK=new JButton("ȷ��");
		btnOK.setBounds(100, 10, 300, 30);
		btnReturn.setBounds(500,10,300,30);
		
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BInterface();
			}
			
		});
		
		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnOK_ActionPerformed(arg0);
			}
			
		});
		
		frame.add(scp);
		frame.add(btnOK);
		frame.add(btnReturn);
		
		frame.setVisible(true);
	}
	
	public void btnOK_ActionPerformed(ActionEvent arg0) {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from Pet";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			int count=0;
			while(rs.next()) {
				count++;
			}
			rs=pstmt.executeQuery();
			Object[][] info=new Object[count][9];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString(1);
				info[count][1]=rs.getString(2);
				info[count][2]=rs.getString(3);
				info[count][3]=rs.getString(4);
				info[count][4]=rs.getString(5);
				info[count][5]=rs.getString(6);
				info[count][6]=rs.getString(7);
				info[count][7]=rs.getString(8);
				info[count][8]=rs.getString(9);
				
				count++;
			}
			String[] title= {"����","Ʒ��","����","�Ա�","���","��ɫ","�ݶ�","���","�۸�"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
/*public class BossCheck{
	public static void main(String[] args) {
		new BCheck();
	}
}*/
