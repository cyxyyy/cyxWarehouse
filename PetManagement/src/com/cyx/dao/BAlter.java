package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BAlter{
	private JFrame frame=new JFrame("信息修改");
	private JLabel lblN=new JLabel("要修改的宠物编号");
	private JLabel lblK=new JLabel("修改物种");
	private JLabel lblV=new JLabel("修改品种");
	private JLabel lblA=new JLabel("修改年龄");
	private JLabel lblS=new JLabel("修改性别");
	private JLabel lblC=new JLabel("修改颜色");
	private JTextField txtN=new JTextField(30);
	private JTextField txtK=new JTextField(30);
	private JTextField txtV=new JTextField(30);
	private JTextField txtA=new JTextField(30);
	private JTextField txtS=new JTextField(30);
	private JTextField txtC=new JTextField(30);
	private JButton btnOK=new JButton("确定");
	
	private JButton btnReturn=new JButton("返回");
	
	public BAlter() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		lblN.setBounds(100,100,220,100);//横轴x，数轴y，宽度，高度
		lblN.setFont(new Font("宋体",Font.BOLD,25));
		lblN.setForeground(Color.PINK);
		frame.add(lblN);
		lblK.setBounds(100,200,200,100);
		lblK.setFont(new Font("宋体",Font.BOLD,25));
		lblK.setForeground(Color.PINK);
		frame.add(lblK);
		lblV.setBounds(100,300,200,100);
		lblV.setFont(new Font("宋体",Font.BOLD,25));
		lblV.setForeground(Color.PINK);
		frame.add(lblV);
		lblA.setBounds(100,400,200,100);
		lblA.setFont(new Font("宋体",Font.BOLD,25));
		lblA.setForeground(Color.PINK);
		frame.add(lblA);
		lblS.setBounds(100,500,200,100);
		lblS.setFont(new Font("宋体",Font.BOLD,25));
		lblS.setForeground(Color.PINK);
		frame.add(lblS);
		lblC.setBounds(100,600,200,100);
		lblC.setFont(new Font("宋体",Font.BOLD,25));
		lblC.setForeground(Color.PINK);
		frame.add(lblC);
		
		txtN.setBounds(400, 130, 200, 50);
		frame.add(txtN);
		txtK.setBounds(400, 230, 200, 50);
		frame.add(txtK);
		txtV.setBounds(400, 330, 200, 50);
		frame.add(txtV);
		txtA.setBounds(400, 430, 200, 50);
		frame.add(txtA);
		txtS.setBounds(400, 530, 200, 50);
		frame.add(txtS);
		txtC.setBounds(400, 630, 200, 50);
		frame.add(txtC);
		
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
				String number=txtN.getText();
				String kind=txtN.getText();
				String variety=txtN.getText();
				String age=txtN.getText();
				String sex=txtN.getText();
				String color=txtN.getText();
				new LoginSQL().addInfo(number, kind, variety, age, sex, color);
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
