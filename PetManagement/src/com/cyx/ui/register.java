package com.cyx.ui;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cyx.dao.LoginSQL;

public class register extends JPanel {
	private JFrame frame=new JFrame("ע��");
	private JLabel lbls=new JLabel("�����룺");
	private JLabel lblName=new JLabel("�û���");
	private JTextField txtName=new JTextField(50);
	private JLabel lblPassword=new JLabel("����");
	private JLabel lblA=new JLabel("��ַ");
	private JTextField txtPassword=new JTextField(50);
	private JLabel lblPasswordAgain=new JLabel("��ȷ������");
	private JTextField txtPasswordAgain=new JTextField(50);
	private JButton btnOK=new JButton("ȷ��");
	private JTextField txtA=new JTextField(50);
	private JButton btnReturn=new JButton("����");
	public register() {
		frame.setSize(600,600);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		lbls.setBounds(200,20,200,50);
		lbls.setFont(new Font("����",Font.BOLD,40));
		frame.add(lbls);
		
		lblName.setBounds(100,100,100,20);//����x������y����ȣ��߶�
		lblName.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblName);
		txtName.setBounds(180,100,100,20);
		frame.add(txtName);
		
		lblPassword.setBounds(100,130,100,20);//����x������y����ȣ��߶�
		lblPassword.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblPassword);
		txtPassword.setBounds(180,130,100,20);
		frame.add(txtPassword);
		
		lblPasswordAgain.setBounds(100,160,100,20);//����x������y����ȣ��߶�
		lblPasswordAgain.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblPasswordAgain);
		txtPasswordAgain.setBounds(180,160,100,20);
		frame.add(txtPasswordAgain);
		
		lblA.setBounds(100,190,100,20);//����x������y����ȣ��߶�
		lblA.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblA);
		txtA.setBounds(180,190,100,20);
		frame.add(txtA);
		
		btnOK.setBounds(100,200,80,30);//����x������y����ȣ��߶�
		frame.add(btnOK);
		btnReturn.setBounds(200,200,80,30);
		frame.add(btnReturn);
		
		
		
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new UserPanel();
				
			}
			
		});
		
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtname=txtName.getText();
				String txtpassword=txtPassword.getText();
				String userId=String.valueOf(new Random().nextInt(899999)+100000);
				try {
					
					new LoginSQL().insertClient(userId, txtpassword, txtname);
					new FinishRegister();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}			
			
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
			
}

/*public class ClientRegister {
	public static void main(String[] args) {
		new register();
	}
}*/
