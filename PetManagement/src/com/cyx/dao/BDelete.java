package com.cyx.dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BDelete{
	private JFrame frame=new JFrame("��Ϣɾ��");
	private JLabel lblV=new JLabel("���������");
	private JTextField txtV=new JTextField(100);
	private JButton btnOK=new JButton("ȷ��");
	private JButton btnReturn=new JButton("����");

	public BDelete() {
		frame.setSize(500,500);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblV.setBounds(100,100,100,100);
		lblV.setFont(new Font("����",Font.BOLD,20));
		frame.add(lblV);
		
		txtV.setBounds(100,200,200,50);
		frame.add(txtV);
		
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
					String veriety=txtV.getText();
					new LoginSQL().deletePet(veriety);
					JOptionPane.showMessageDialog(null,"ɾ�����");
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
