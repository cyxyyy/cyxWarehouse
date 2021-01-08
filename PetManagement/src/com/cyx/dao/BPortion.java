package com.cyx.dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import com.cyx.ui.BInterface;

public class BPortion extends JFrame{
	//private JFrame frame=new JFrame("查看月订单份额");
	private JScrollPane scp;
	private JTableHeader jth;
	private JTable tab;
	private JButton btnOK;
	private JButton btnReturn=new JButton("返回");
	public BPortion() {
		super("查看月订单份额");
		//this.setSize(330,400);
		this.setSize(1000,1000);
		this.setLayout(null);
		this.setLocation(50,50);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		this.setContentPane(bg);
		
		this.scp=new JScrollPane();
		//this.scp.setBounds(30,100,900,850);
		this.scp.setBounds(50, 50, 920, 920);
		this.btnOK=new JButton("确定");
		this.btnOK.setBounds(100, 10, 300, 30);
		this.btnReturn.setBounds(500,10,300,30);
		
		//this.btnReturn.setBounds(1500,150,100,30);
		
		this.btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//this.dispose();
				setVisible(false);
				dispose();
				new BInterface();
				
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
			String sql="select veriety,portion from Pet order by portion desc";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			int count=0;
			while(rs.next()) {
				count++;
			}
			rs=pstmt.executeQuery();
			Object[][] info=new Object[count][2];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString("veriety");
				info[count][1]=rs.getString("portion");
				count++;
			}
			String[] title= {"品种","份额"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
/*public class BossPortion {

	public static void main(String[] args) {
		new BPortion();

	}

}*/
