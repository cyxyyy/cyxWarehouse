package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BAdd{
	private JFrame frame=new JFrame("添加宠物信息");
	private JLabel lblK=new JLabel("物种");
	private JLabel lblV=new JLabel("品种");
	private JLabel lblP=new JLabel("份额");
	private JLabel lblI=new JLabel("库存");
	private JLabel lblR=new JLabel("价格");
	
	private JTextField txtK=new JTextField(30);
	private JTextField txtV=new JTextField(30);
	private JTextField txtP=new JTextField(30);
	private JTextField txtI=new JTextField(30);
	private JTextField txtR=new JTextField(30);
	private JButton btnOK=new JButton("确定");
	
	private JButton btnReturn=new JButton("返回");
	
	public BAdd() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblK.setBounds(100,100,200,100);//横轴x，数轴y，宽度，高度
		lblK.setFont(new Font("宋体",Font.BOLD,25));
		lblK.setForeground(Color.BLUE);
		frame.add(lblK);
		lblV.setBounds(100,200,200,100);
		lblV.setFont(new Font("宋体",Font.BOLD,25));
		lblV.setForeground(Color.BLUE);
		frame.add(lblV);
		lblP.setBounds(100,300,200,100);
		lblP.setFont(new Font("宋体",Font.BOLD,25));
		lblP.setForeground(Color.BLUE);
		frame.add(lblP);
		lblI.setBounds(100,400,200,100);
		lblI.setFont(new Font("宋体",Font.BOLD,25));
		lblI.setForeground(Color.BLUE);
		frame.add(lblI);
		lblR.setBounds(100,500,200,100);
		lblR.setFont(new Font("宋体",Font.BOLD,25));
		lblR.setForeground(Color.BLUE);
		frame.add(lblR);
		
		
		txtK.setBounds(350, 130, 200, 50);
		frame.add(txtK);
		txtV.setBounds(350, 230, 200, 50);
		frame.add(txtV);
		txtP.setBounds(350, 330, 200, 50);
		frame.add(txtP);
		txtI.setBounds(350, 430, 200, 50);
		frame.add(txtI);
		txtR.setBounds(350, 530, 200, 50);
		frame.add(txtR);
		
		
		btnOK.setBounds(400, 730, 80, 40);
		frame.add(btnOK);
		
		btnReturn.setBounds(530, 730, 80, 40);
		frame.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new BInterface();
				frame.setVisible(false);
				frame.dispose();
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
				new LoginSQL().addInfo(kind, variety, portion,inventery,price);
				JOptionPane.showMessageDialog(null,"保存完毕");	
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
/*public class BossAdd {
	public static void main(String[] args) {
		new BAdd();

	}

}*/
