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
	private JLabel lblS=new JLabel("��ѡ��������");
	
	
	public Load() {
		frame.setSize(600,600);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		btnA.setBounds(100,300,120,50);
		btnA.setFont(new Font("����",Font.BOLD,20));
		frame.add(btnA);
		btnB.setBounds(300,300,120,50);
		btnB.setFont(new Font("����",Font.BOLD,20));
		frame.add(btnB);
		
		lblS.setBounds(80,80,200,80);//����x������y����ȣ��߶�
		lblS.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblS);
		
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
