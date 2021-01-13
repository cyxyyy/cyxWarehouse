package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BAdd{
	private JFrame frame=new JFrame("��ӳ�����Ϣ");
	private JLabel lblK=new JLabel("����");
	private JLabel lblV=new JLabel("Ʒ��");
	private JLabel lblP=new JLabel("�ݶ�");
	private JLabel lblI=new JLabel("���");
	private JLabel lblR=new JLabel("�۸�");
	
	private JTextField txtK=new JTextField(30);
	private JTextField txtV=new JTextField(30);
	private JTextField txtP=new JTextField(30);
	private JTextField txtI=new JTextField(30);
	private JTextField txtR=new JTextField(30);
	private JButton btnOK=new JButton("ȷ��");
	
	private JButton btnReturn=new JButton("����");
	
	public BAdd() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblK.setBounds(100,100,200,100);//����x������y����ȣ��߶�
		lblK.setFont(new Font("����",Font.BOLD,25));
		lblK.setForeground(Color.BLUE);
		frame.add(lblK);
		lblV.setBounds(100,200,200,100);
		lblV.setFont(new Font("����",Font.BOLD,25));
		lblV.setForeground(Color.BLUE);
		frame.add(lblV);
		lblP.setBounds(100,300,200,100);
		lblP.setFont(new Font("����",Font.BOLD,25));
		lblP.setForeground(Color.BLUE);
		frame.add(lblP);
		lblI.setBounds(100,400,200,100);
		lblI.setFont(new Font("����",Font.BOLD,25));
		lblI.setForeground(Color.BLUE);
		frame.add(lblI);
		lblR.setBounds(100,500,200,100);
		lblR.setFont(new Font("����",Font.BOLD,25));
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
				JOptionPane.showMessageDialog(null,"�������");	
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
