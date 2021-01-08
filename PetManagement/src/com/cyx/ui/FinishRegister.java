package com.cyx.ui;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class FinishRegister{
	private JFrame frame=new JFrame("完成");
	private JLabel lblR=new JLabel("您已完成注册！");
	private JButton btnOK=new JButton("确认");
	
	public FinishRegister() {
		frame.setSize(400,220);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		
		/*JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet7.jpg"));
		frame.setContentPane(bg);*/
		
		lblR.setBounds(20,50,200,25);
		lblR.setFont(new Font("宋体",Font.BOLD,25));
		frame.add(lblR);
		
		btnOK.setBounds(50,100,100,50);
		frame.add(btnOK);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new UserPanel();
				
			}
		});
		
	}
}
/*public class TestRegister {
	public static void main(String[] args) {
		new FinishRegister();
	}
}*/
