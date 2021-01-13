package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BAlter{
	private JFrame frame=new JFrame("信息修改");
	private JLabel lblK=new JLabel("要修改的宠物种类");
	
	private JLabel lblV=new JLabel("修改品种");
	private JLabel lblP=new JLabel("修改份额");
	private JLabel lblI=new JLabel("修改库存");
	private JLabel lblR=new JLabel("修改价格");
	private JTextField txtK=new JTextField(70);
	
	private JTextField txtV=new JTextField(30);
	private JTextField txtP=new JTextField(30);
	private JTextField txtI=new JTextField(30);
	private JTextField txtR=new JTextField(30);
	private JButton btnOK=new JButton("确定");
	
	private JButton btnReturn=new JButton("返回");
	
	public BAlter() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		
		lblK.setBounds(100,200,200,100);
		lblK.setFont(new Font("宋体",Font.BOLD,25));
		lblK.setForeground(Color.PINK);
		frame.add(lblK);
		lblV.setBounds(100,300,200,100);
		lblV.setFont(new Font("宋体",Font.BOLD,25));
		lblV.setForeground(Color.PINK);
		frame.add(lblV);
		lblP.setBounds(100,400,200,100);
		lblP.setFont(new Font("宋体",Font.BOLD,25));
		lblP.setForeground(Color.PINK);
		frame.add(lblP);
		lblI.setBounds(100,500,200,100);
		lblI.setFont(new Font("宋体",Font.BOLD,25));
		lblI.setForeground(Color.PINK);
		frame.add(lblI);
		lblR.setBounds(100,600,200,100);
		lblR.setFont(new Font("宋体",Font.BOLD,25));
		lblR.setForeground(Color.PINK);
		frame.add(lblR);
		
		
		txtK.setBounds(400, 230, 200, 50);
		frame.add(txtK);
		txtV.setBounds(400, 330, 200, 50);
		frame.add(txtV);
		txtP.setBounds(400, 430, 200, 50);
		frame.add(txtP);
		txtI.setBounds(400, 530, 200, 50);
		frame.add(txtI);
		txtR.setBounds(400, 630, 200, 50);
		frame.add(txtR);
		
		btnOK.setBounds(400, 730, 80, 40);
		frame.add(btnOK);
		
		btnReturn.setBounds(520, 730, 80, 40);
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
				// TODO Auto-generated method stub
				String kind=txtK.getText();
				String variety=txtV.getText();
				String portion=txtP.getText();
				String inventery=txtI.getText();
				String price=txtR.getText();
				new LoginSQL().alterInfo(kind, variety, portion, inventery, price);
				JOptionPane.showMessageDialog(null,"修改完毕");	
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
/*public class BossAlter {
	public static void main(String[] args) {
		new BAlter();
	}
}*/
