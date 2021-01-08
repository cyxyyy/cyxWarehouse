package com.cyx.dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BDelete{
	private JFrame frame=new JFrame("信息删除");
	private JLabel lblNumber=new JLabel("宠物编号");
	private JTextField txtNumber=new JTextField(100);
	private JButton btnOK=new JButton("确认");
	private JButton btnReturn=new JButton("返回");

	public BDelete() {
		frame.setSize(500,500);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblNumber.setBounds(100,100,100,100);
		lblNumber.setFont(new Font("宋体",Font.BOLD,20));
		frame.add(lblNumber);
		
		txtNumber.setBounds(100,200,200,50);
		frame.add(txtNumber);
		
		btnOK.setBounds(100,300,100,50);
		frame.add(btnOK);
		
		btnReturn.setBounds(300,300,100,50);
		frame.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BInterface();
				
			}
			
		});
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
					String number=txtNumber.getText();
					new LoginSQL().deletePet(number);
					JOptionPane.showMessageDialog(null,"删除完毕");
				}
			});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
}


/*public class BossDelete {
	public static void main(String[]args) {
		new BDelete();
	}
}*/
