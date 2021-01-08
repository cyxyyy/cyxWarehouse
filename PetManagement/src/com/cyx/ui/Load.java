package com.cyx.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Load{
	private JFrame frame=new JFrame("����ϵͳ��½");
	private JButton btnA=new JButton("����");
	private JButton btnB=new JButton("�ͻ�");
	private JLabel lblId=new JLabel("�˺�");
	private JTextField txtId=new JTextField(60);
	private JLabel lblPassword=new JLabel("����");
	private JTextField txtPassword=new JTextField(60);
	private JLabel lbls=new JLabel("ȥע��");
	private JButton btnOK=new JButton("ȷ��");
	private JButton btnCancel=new JButton("ȡ��");
	public Load() {
		frame.setSize(600,600);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		btnA.setBounds(100,20,200,50);
		btnA.setFont(new Font("����",Font.BOLD,20));
		frame.add(btnA);
		btnB.setBounds(300,20,200,50);
		btnB.setFont(new Font("����",Font.BOLD,20));
		frame.add(btnB);
		
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
		
		btnA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				frame.dispose();
				new BossPanel();
				
				//frame.setVisible(true);
			}
		});
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				frame.dispose();
				new UserPanel();
				
			}
		});
		
		/*lbls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new
			}
		});*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Load();
	}
	
}	
