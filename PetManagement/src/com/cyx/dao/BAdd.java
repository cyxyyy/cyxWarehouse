package com.cyx.dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.cyx.ui.BInterface;

public class BAdd{
	private JFrame frame=new JFrame("��ӳ�����Ϣ");
	private JLabel lblN=new JLabel("���");
	private JLabel lblK=new JLabel("����");
	private JLabel lblV=new JLabel("Ʒ��");
	private JLabel lblA=new JLabel("����");
	private JLabel lblS=new JLabel("�Ա�");
	private JLabel lblC=new JLabel("��ɫ");
	private JTextField txtN=new JTextField(30);
	private JTextField txtK=new JTextField(30);
	private JTextField txtV=new JTextField(30);
	private JTextField txtA=new JTextField(30);
	private JTextField txtS=new JTextField(30);
	private JTextField txtC=new JTextField(30);
	private JButton btnOK=new JButton("ȷ��");
	
	private JButton btnReturn=new JButton("����");
	
	public BAdd() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet4.jpg"));
		frame.setContentPane(bg);
		
		lblN.setBounds(100,100,200,100);//����x������y����ȣ��߶�
		lblN.setFont(new Font("����",Font.BOLD,25));
		lblN.setForeground(Color.BLUE);
		frame.add(lblN);
		lblK.setBounds(100,200,200,100);
		lblK.setFont(new Font("����",Font.BOLD,25));
		lblK.setForeground(Color.BLUE);
		frame.add(lblK);
		lblV.setBounds(100,300,200,100);
		lblV.setFont(new Font("����",Font.BOLD,25));
		lblV.setForeground(Color.BLUE);
		frame.add(lblV);
		lblA.setBounds(100,400,200,100);
		lblA.setFont(new Font("����",Font.BOLD,25));
		lblA.setForeground(Color.BLUE);
		frame.add(lblA);
		lblS.setBounds(100,500,200,100);
		lblS.setFont(new Font("����",Font.BOLD,25));
		lblS.setForeground(Color.BLUE);
		frame.add(lblS);
		lblC.setBounds(100,600,200,100);
		lblC.setFont(new Font("����",Font.BOLD,25));
		lblC.setForeground(Color.BLUE);
		frame.add(lblC);
		
		txtN.setBounds(350, 130, 200, 50);
		frame.add(txtN);
		txtK.setBounds(350, 230, 200, 50);
		frame.add(txtK);
		txtV.setBounds(350, 330, 200, 50);
		frame.add(txtV);
		txtA.setBounds(350, 430, 200, 50);
		frame.add(txtA);
		txtS.setBounds(350, 530, 200, 50);
		frame.add(txtS);
		txtC.setBounds(350, 630, 200, 50);
		frame.add(txtC);
		
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
				String number=txtN.getText();
				String kind=txtN.getText();
				String variety=txtN.getText();
				String age=txtN.getText();
				String sex=txtN.getText();
				String color=txtN.getText();
				new LoginSQL().addInfo(number, kind, variety, age, sex, color);
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
