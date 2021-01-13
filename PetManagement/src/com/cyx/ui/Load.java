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
	private JFrame frame=new JFrame("宠物系统登陆");
	private JButton btnA=new JButton("店主");
	private JButton btnB=new JButton("客户");
	private JLabel lblS=new JLabel("请选择你的身份");
	
	
	public Load() {
		frame.setSize(600,600);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		btnA.setBounds(100,300,120,50);
		btnA.setFont(new Font("宋体",Font.BOLD,20));
		frame.add(btnA);
		btnB.setBounds(300,300,120,50);
		btnB.setFont(new Font("宋体",Font.BOLD,20));
		frame.add(btnB);
		
		lblS.setBounds(80,80,200,80);//横轴x，数轴y，宽度，高度
		lblS.setFont(new Font("宋体",Font.BOLD,20));
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
