package com.cyx.ui;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

import com.cyx.dao.LoginSQL;
public class UserPanel extends JPanel{
	private JFrame frame=new JFrame("�û���½");
	private JLabel lblA=new JLabel("�ͻ�");
	private JLabel lblId=new JLabel("�˺�");
	private JTextField txtId=new JTextField(60);
	private JLabel lblPassword=new JLabel("����");
	private JTextField txtPassword=new JTextField(60);
	private JLabel lbls=new JLabel("ȥע��");
	private JButton btnOK=new JButton("ȷ��");
	private JButton btnCancel=new JButton("ȡ��");
	String s=null;
	public UserPanel(){
		frame.setSize(600,600);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		lblA.setBounds(200,20,200,50);
		lblA.setFont(new Font("����",Font.BOLD,40));
		frame.add(lblA);
		
		lblId.setBounds(100,100,100,20);//����x������y����ȣ��߶�
		lblId.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblId);
		txtId.setBounds(150,100,100,30);
		frame.add(txtId);
		
		lblPassword.setBounds(100,130,100,20);//����x������y����ȣ��߶�
		lblPassword.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblPassword);
		txtPassword.setBounds(150,130,100,30);
		frame.add(txtPassword);
		
		btnOK.setBounds(100,200,80,30);//����x������y����ȣ��߶�
		frame.add(btnOK);
		btnCancel.setBounds(200,200,80,30);
		frame.add(btnCancel);
		
		lbls.setBounds(100,170,80,20);
		frame.add(lbls);
		
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new Load();
				
			}
			
		});
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String tid=txtId.getText();
				String pwd=txtPassword.getText();
				
				boolean isMatch=false;
				try {
				ResultSet rs=null;
				rs=new LoginSQL().queryClient();
				while(rs.next()){
					String id=rs.getString("id");//���ݿ��ֶ�����������ʵ����д
					if(tid.equals(id)){//�����������������ݿ��е�������ͬ����Ƚ�����
						String p=rs.getString("password");//�����ֶΣ��밴ʵ�����д
						if(pwd.equals(p)){
							isMatch=true;
						}
					}
				}
				if(isMatch=true)	{//����˻���������ƥ��
					frame.setVisible(false);
					frame.dispose();
					new CInterface();
				}
				else{
					JOptionPane.showMessageDialog(null,"�˺Ż�������󣡣�");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			}	
			
		});
		
		lbls.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new register();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
/*public class UserLoad{
	public static void main(String[] args) {
		new UserPanel();
	}
}*/

