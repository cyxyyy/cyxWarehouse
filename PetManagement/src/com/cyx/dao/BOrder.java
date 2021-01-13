package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import com.cyx.ui.BInterface;

public class BOrder extends JFrame{
	private JButton btnOK=new JButton("搜索");
	//private JLabel lblName=new JLabel("姓名");
	//private JTextField txtName=new JTextField(20);
	private JButton btnReturn=new JButton("返回");
	
	private JScrollPane scp;
	private JTableHeader jth;
	private JTable tab;
	
	public BOrder() {
		super("查看客户订单");
		this.setSize(1000,1000);
		this.setLocation(50,50);
		this.setResizable(false);
		this.setLayout(null);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		this.setContentPane(bg);
		
//		lblName.setBounds(20,30,100,50);//横轴x，数轴y，宽度，高度
//		lblName.setFont(new Font("宋体",Font.BOLD,40));
//		lblName.setForeground(Color.BLUE);
//		this.add(lblName);
		
//		txtName.setBounds(150, 30, 100, 50);
//		this.add(txtName);
		
		btnOK.setBounds(280,30,100,50);
		this.add(btnOK);
		btnReturn.setBounds(410,30,100,50);
		this.add(btnReturn);
		
		this.scp=new JScrollPane();
		//this.scp.setBounds(10,50,300,270);
		this.scp.setBounds(50, 100, 850, 800);
		
		this.btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				new BInterface();
				
			}
			
		});
		
		this.btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//String name=txtName.getText();
				btnActionPerformed();
				
			}
			
		});
		add(this.scp);
		add(this.btnOK);
		add(this.btnReturn);
		
		this.setVisible(true);
		
	}
	/*public void btnActionPerformed(String name) {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from COrder where name=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
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
			String[] title= {"姓名","地址","物种","品种","性别","年龄","颜色","价格"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	public void btnActionPerformed() {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from COrder";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			int count=0;
			while(rs.next()) {
				count++;
			}
			rs=pstmt.executeQuery();
			Object[][] info=new Object[count][6];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString("name");
				info[count][1]=rs.getString("id");
				info[count][2]=rs.getString("adress");
				info[count][3]=rs.getString("kind");
				info[count][4]=rs.getString("veriety");
				info[count][5]=rs.getString("price");
				
				
				count++;
			}
			String[] title= {"姓名","账号","地址","物种","品种","价格"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


/*public class CheckOrderList {
	public static void main(String[] args) {
		new BOrder();

	}

}*/
