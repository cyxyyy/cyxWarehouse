package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.CInterface;

public class CBuy{
	private JFrame frame=new JFrame("购买界面");
	private JLabel lblK=new JLabel("物种");
	private JLabel lblV=new JLabel("品种");
	private JLabel lblA=new JLabel("年龄");
	private JLabel lblS=new JLabel("性别");
	private JLabel lblC=new JLabel("颜色");
	private JLabel lblN=new JLabel("姓名");
	private JLabel lblR=new JLabel("地址");
	
	private JTextField txtK=new JTextField(20);
	private JTextField txtV=new JTextField(20);
	private JTextField txtA=new JTextField(20);
	private JTextField txtS=new JTextField(20);
	private JTextField txtC=new JTextField(20);
	private JTextField txtN=new JTextField(20);
	private JTextField txtR=new JTextField(20);
	
	private JButton btnOK=new JButton("确定");
	private JButton btnReturn=new JButton("返回");
	
	public CBuy() {
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
		lblA.setBounds(100,300,200,100);
		lblA.setFont(new Font("宋体",Font.BOLD,25));
		lblA.setForeground(Color.BLUE);
		frame.add(lblA);
		lblS.setBounds(100,400,200,100);
		lblS.setFont(new Font("宋体",Font.BOLD,25));
		lblS.setForeground(Color.BLUE);
		frame.add(lblS);
		lblC.setBounds(100,500,200,100);
		lblC.setFont(new Font("宋体",Font.BOLD,25));
		lblC.setForeground(Color.BLUE);
		frame.add(lblC);
		lblN.setBounds(100,600,200,100);
		lblN.setFont(new Font("宋体",Font.BOLD,25));
		lblN.setForeground(Color.BLUE);
		frame.add(lblN);
		lblR.setBounds(100,700,200,100);
		lblR.setFont(new Font("宋体",Font.BOLD,25));
		lblR.setForeground(Color.BLUE);
		frame.add(lblR);
		
		txtK.setBounds(350, 130, 200, 50);
		frame.add(txtK);
		txtV.setBounds(350, 230, 200, 50);
		frame.add(txtV);
		txtA.setBounds(350, 330, 200, 50);
		frame.add(txtA);
		txtS.setBounds(350, 430, 200, 50);
		frame.add(txtS);
		txtC.setBounds(350, 530, 200, 50);
		frame.add(txtC);
		txtN.setBounds(350, 630, 200, 50);
		frame.add(txtN);
		txtR.setBounds(350, 730, 200, 50);
		frame.add(txtR);
		
		btnOK.setBounds(400, 830, 80, 40);
		frame.add(btnOK);
		btnReturn.setBounds(500, 830, 80, 40);
		frame.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new CInterface();
				
			}
		});
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String k=txtK.getText();
				String v=txtV.getText();
				String a=txtA.getText();
				String s=txtS.getText();
				String c=txtC.getText();
				String n=txtN.getText();
				String r=txtR.getText();
				
				new LoginSQL().insertOrder(k, n, s, r, a, c,v );
				JOptionPane.showMessageDialog(null,"购买成功");
			}
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
/*public class ClientBuy {

	public static void main(String[] args) {
		new CBuy();

	}

}*/
