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

import com.cyx.ui.BInterface;
import com.cyx.ui.CInterface;

public class CBuy{
	private JFrame frame=new JFrame("�������");
	/*private JLabel lblK=new JLabel("����");
	private JLabel lblV=new JLabel("Ʒ��");
	private JLabel lblA=new JLabel("����");
	private JLabel lblS=new JLabel("�Ա�");
	private JLabel lblC=new JLabel("��ɫ");
	private JLabel lblN=new JLabel("����");
	private JLabel lblR=new JLabel("��ַ");
	
	private JTextField txtK=new JTextField(20);
	private JTextField txtV=new JTextField(20);
	private JTextField txtA=new JTextField(20);
	private JTextField txtS=new JTextField(20);
	private JTextField txtC=new JTextField(20);
	private JTextField txtN=new JTextField(20);
	private JTextField txtR=new JTextField(20);
	
	private JButton btnOK=new JButton("ȷ��");
	private JButton btnReturn=new JButton("����");
	
	public CBuy() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblK.setBounds(100,100,200,100);//����x������y����ȣ��߶�
		lblK.setFont(new Font("����",Font.BOLD,25));
		lblK.setForeground(Color.BLUE);
		frame.add(lblK);
		lblV.setBounds(100,200,200,100);
		lblV.setFont(new Font("����",Font.BOLD,25));
		lblV.setForeground(Color.BLUE);
		frame.add(lblV);
		lblA.setBounds(100,300,200,100);
		lblA.setFont(new Font("����",Font.BOLD,25));
		lblA.setForeground(Color.BLUE);
		frame.add(lblA);
		lblS.setBounds(100,400,200,100);
		lblS.setFont(new Font("����",Font.BOLD,25));
		lblS.setForeground(Color.BLUE);
		frame.add(lblS);
		lblC.setBounds(100,500,200,100);
		lblC.setFont(new Font("����",Font.BOLD,25));
		lblC.setForeground(Color.BLUE);
		frame.add(lblC);
		lblN.setBounds(100,600,200,100);
		lblN.setFont(new Font("����",Font.BOLD,25));
		lblN.setForeground(Color.BLUE);
		frame.add(lblN);
		lblR.setBounds(100,700,200,100);
		lblR.setFont(new Font("����",Font.BOLD,25));
		lblR.setForeground(Color.BLUE);
		frame.add(lblR);
		
		txtK.setBounds(350, 130, 200, 50);
		frame.add(txtK);
		txtV.setBounds(350, 230, 200, 50);
		frame.add(txtV);
		txtA.setBounds(350, 330, 200, 50);
		frame.add(txtA);
		txtS.setBounds(350, 430, 200, 50);
		frame.add(txtS);
		txtC.setBounds(350, 530, 200, 50);
		frame.add(txtC);
		txtN.setBounds(350, 630, 200, 50);
		frame.add(txtN);
		txtR.setBounds(350, 730, 200, 50);
		frame.add(txtR);
		
		btnOK.setBounds(400, 830, 80, 40);
		frame.add(btnOK);
		btnReturn.setBounds(500, 830, 80, 40);
		frame.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new CInterface();
				
			}
		});
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String k=txtK.getText();
				String v=txtV.getText();
				String a=txtA.getText();
				String s=txtS.getText();
				String c=txtC.getText();
				String n=txtN.getText();
				String r=txtR.getText();
				
				new LoginSQL().insertOrder(k, v, a, s, c, n,r );
				JOptionPane.showMessageDialog(null,"����ɹ�");
			}
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
	
	private JScrollPane scp;
	private JTableHeader jth;
	private JTable tab;
	private JButton btnOK;
	private JButton btnReturn=new JButton("����");
	private JButton btnBuy=new JButton("����");
	public CBuy() {
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
		btnOK.setBounds(100, 10, 100, 30);
		btnReturn.setBounds(250,10,100,30);
		btnBuy.setBounds(400,10,100,30);
		
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new CInterface();
			}
			
		});
		
		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnOK_ActionPerformed();
			}
			
		});
		
		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Buy();
			}
			
		});
		
		frame.add(scp);
		frame.add(btnOK);
		frame.add(btnReturn);
		frame.add(btnBuy);
		
		frame.setVisible(true);
	}
	
	public void btnOK_ActionPerformed() {
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
			Object[][] info=new Object[count][5];
			count=0;
			while(rs.next()) {
				info[count][0]=rs.getString(1);
				info[count][1]=rs.getString(2);
				info[count][2]=rs.getString(3);
				info[count][3]=rs.getString(4);
				info[count][4]=rs.getString(5);
				
				
				count++;
			}
			String[] title= {"����","Ʒ��","�ݶ�","���","�۸�"};
			this.tab=new JTable(info,title);
			this.jth=this.tab.getTableHeader();
			this.scp.getViewport().add(tab);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
/*public class ClientBuy {

	public static void main(String[] args) {
		new CBuy();

	}

}*/
