package com.cyx.dao;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cyx.ui.BossPanel;
import com.cyx.ui.FinishRegister;

public class Bregister extends JPanel {
	private JFrame frame=new JFrame("注册");
	private JLabel lbls=new JLabel("请输入：");
	private JLabel lblName=new JLabel("用户名");
	private JTextField txtName=new JTextField(50);
	private JLabel lblPassword=new JLabel("密码");
	private JTextField txtPassword=new JTextField(50);
	private JLabel lblPasswordAgain=new JLabel("请确认密码");
	private JTextField txtPasswordAgain=new JTextField(50);
	private JButton btnOK=new JButton("确认");
	private JButton btnReturn=new JButton("返回");
	public Bregister() {
		frame.setSize(600,600);
		frame.setLocation(400,200);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet7.jpg"));
		frame.setContentPane(bg);
		
		lbls.setBounds(200,20,200,50);
		lbls.setFont(new Font("宋体",Font.BOLD,40));
		frame.add(lbls);
		
		lblName.setBounds(100,100,100,20);//横轴x，数轴y，宽度，高度
		lblName.setFont(new Font("宋体",Font.BOLD,20));
		frame.add(lblName);
		txtName.setBounds(180,100,100,20);
		frame.add(txtName);
		
		lblPassword.setBounds(100,130,100,20);//横轴x，数轴y，宽度，高度
		lblPassword.setFont(new Font("宋体",Font.BOLD,20));
		frame.add(lblPassword);
		txtPassword.setBounds(180,130,100,20);
		frame.add(txtPassword);
		
		lblPasswordAgain.setBounds(100,160,100,20);//横轴x，数轴y，宽度，高度
		lblPasswordAgain.setFont(new Font("宋体",Font.BOLD,20));
		frame.add(lblPasswordAgain);
		txtPasswordAgain.setBounds(180,160,100,20);
		frame.add(txtPasswordAgain);
		
		btnOK.setBounds(100,200,80,30);//横轴x，数轴y，宽度，高度
		frame.add(btnOK);
		btnReturn.setBounds(200,200,80,30);
		frame.add(btnReturn);

		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BossPanel();
				
			}
			
		});
		
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtname=txtName.getText();
				String txtpassword=txtPassword.getText();
				String userId=String.valueOf(new Random().nextInt(899999)+100000);
				try {
					new LoginSQL().insertBoss(userId, txtpassword, txtname);
					new FinishRegister();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}			
			
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
			
}

/*public class BossRegister {
	public static void main(String[] args) {
		new Bregister();
	}
}*/
