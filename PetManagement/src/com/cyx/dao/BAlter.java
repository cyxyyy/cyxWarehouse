package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BAlter{
	private JFrame frame=new JFrame("��Ϣ�޸�");
	private JLabel lblN=new JLabel("Ҫ�޸ĵĳ�����");
	private JLabel lblK=new JLabel("�޸�����");
	private JLabel lblV=new JLabel("�޸�Ʒ��");
	private JLabel lblA=new JLabel("�޸�����");
	private JLabel lblS=new JLabel("�޸��Ա�");
	private JLabel lblC=new JLabel("�޸���ɫ");
	private JTextField txtN=new JTextField(30);
	private JTextField txtK=new JTextField(30);
	private JTextField txtV=new JTextField(30);
	private JTextField txtA=new JTextField(30);
	private JTextField txtS=new JTextField(30);
	private JTextField txtC=new JTextField(30);
	private JButton btnOK=new JButton("ȷ��");
	
	private JButton btnReturn=new JButton("����");
	
	public BAlter() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		lblN.setBounds(100,100,220,100);//����x������y����ȣ��߶�
		lblN.setFont(new Font("����",Font.BOLD,25));
		lblN.setForeground(Color.PINK);
		frame.add(lblN);
		lblK.setBounds(100,200,200,100);
		lblK.setFont(new Font("����",Font.BOLD,25));
		lblK.setForeground(Color.PINK);
		frame.add(lblK);
		lblV.setBounds(100,300,200,100);
		lblV.setFont(new Font("����",Font.BOLD,25));
		lblV.setForeground(Color.PINK);
		frame.add(lblV);
		lblA.setBounds(100,400,200,100);
		lblA.setFont(new Font("����",Font.BOLD,25));
		lblA.setForeground(Color.PINK);
		frame.add(lblA);
		lblS.setBounds(100,500,200,100);
		lblS.setFont(new Font("����",Font.BOLD,25));
		lblS.setForeground(Color.PINK);
		frame.add(lblS);
		lblC.setBounds(100,600,200,100);
		lblC.setFont(new Font("����",Font.BOLD,25));
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
				JOptionPane.showMessageDialog(null,"�޸����");	
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
