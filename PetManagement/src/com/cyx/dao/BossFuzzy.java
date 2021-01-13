package com.cyx.dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import com.cyx.ui.BInterface;

public class BossFuzzy extends JFrame{
	private JPanel jp=new JPanel();
	private JLabel lbl1=new JLabel("菜单");
	private JLabel lbl2=new JLabel("输入");
	private JComboBox cmb=new JComboBox();
	
	private JScrollPane scp=new JScrollPane();
	private JTableHeader jth=new JTableHeader();
	private JTable tab=new JTable();
	
	private JButton btnOK=new JButton("搜索");
	private JTextField txt=new JTextField(20);
	
	private JButton btnReturn=new JButton("返回");
	
	public BossFuzzy() {
		super("宠物的模糊查询");
		this.setSize(1000,1000);
		this.setLocation(50,50);
		this.setResizable(false);
		this.setLayout(null);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		this.setContentPane(bg);
		
		//this.add(jp);

		cmb.setBounds(110, 30,100,30);
		cmb.addItem("--请选择--");
		cmb.addItem("物种");
		cmb.addItem("品种");
		
		this.add(cmb);
		
		this.scp.setBounds(40,80, 920, 920);
		
		lbl1.setBounds(50, 30, 50, 30);
		this.add(lbl1);
		lbl2.setBounds(240, 30, 50, 30);
		this.add(lbl2);
		
		
		txt.setBounds(280, 30, 100, 30);
		this.add(txt);
		
		btnOK.setBounds(410,30,100,30);
		this.add(btnOK);
		
		btnReturn.setBounds(540,30,100,30);
		this.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				new BInterface();
				
			}
		});
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(cmb.getSelectedItem().equals("物种")){
					//System.out.println(cmb.getSelectedItem());
					String kind=txt.getText(); 
					btnKindPerformed(kind);
					
				}else if(cmb.getSelectedItem().equals("品种")){
					String veriety=txt.getText(); 
					btnVerietyPerformed(veriety);
					
				}
				
				
			}
			
		});
		add(this.scp);
		add(this.btnOK);	
		this.setVisible(true);
		
	}
	public void btnKindPerformed(String s) {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from Pet where kind like ?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+s+"%");
			//pstmt.setString(1,s);
			ResultSet rs=pstmt.executeQuery();
			
			int count=0;
			while(rs.next()) {
				count++;
			}
			rs=pstmt.executeQuery();
			Object[][] info=new Object[count][5];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString("kind");
				info[count][1]=rs.getString("veriety");
				info[count][2]=rs.getString("portion");
				info[count][3]=rs.getString("inventery");
				info[count][4]=rs.getString("price");
				
				count++;
			}
			String[] title= {"物种","品种","份额","库存","价格"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void btnVerietyPerformed(String s) {
		try {
			Connection conn=null;
			conn=new LoginSQL().getConnection();
			String sql="select * from Pet where veriety like ?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+s+"%");
			//pstmt.setString(1,s);
			ResultSet rs=pstmt.executeQuery();
			
			int count=0;
			while(rs.next()) {
				count++;
			}
			rs=pstmt.executeQuery();
			Object[][] info=new Object[count][5];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString("kind");
				info[count][1]=rs.getString("veriety");
				info[count][2]=rs.getString("portion");
				info[count][3]=rs.getString("inventery");
				info[count][4]=rs.getString("price");
				
				count++;
			}
			String[] title= {"物种","品种","份额","库存","价格"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}


/*public class Fuzzy {

	public static void main(String[] args) {
		new BossFuzzy();

	}

}*/
