package com.cyx.dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import com.cyx.ui.CInterface;

public class PRank extends JFrame{
	private JScrollPane scp;
	private JTableHeader jth;
	private JTable tab;
	private JButton btnOK;
	private JButton btnReturn;
	public PRank() {
		super("查看宠物热度排行");
		//this.setSize(330,400);
		this.setSize(1000,1000);
		this.setLayout(null);
		this.setLocation(50,50);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		this.setContentPane(bg);
		
		this.scp=new JScrollPane();
		//this.scp.setBounds(10,50,300,270);
		this.scp.setBounds(50, 50, 920,920);
		this.btnOK=new JButton("确定");
		this.btnOK.setBounds(100, 10, 300, 30);
		
		this.btnReturn=new JButton("返回");
		this.btnReturn.setBounds(500, 10, 300, 30);
		
		this.btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				new CInterface();
				
			}
		});
		
		
		this.btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnOK_ActionPerformed(arg0);
			}
			
		});
		
		add(this.scp);
		add(this.btnOK);
		add(this.btnReturn);
		
		this.setVisible(true);
	}
	
	public void btnOK_ActionPerformed(ActionEvent arg0) {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from Pet order by portion desc";
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
			String[] title= {"物种","品种","年龄","性别","编号","颜色","份额","库存","价格"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
/*public class PetRank {

	public static void main(String[] args) {
		new PRank();

	}

}*/
