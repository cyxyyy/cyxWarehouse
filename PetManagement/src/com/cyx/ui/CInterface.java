package com.cyx.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cyx.dao.CBuy;
import com.cyx.dao.COrder;
import com.cyx.dao.PRank;

public class CInterface{
	private JFrame frame=new JFrame("�ͻ�������");
	private JLabel lblPet=new JLabel("�������");
	private JLabel lblOrder=new JLabel("�鿴����");
	private JLabel lblRank=new JLabel("�鿴���а�");
	private JButton btnReturn=new JButton("����");
	
	
	public CInterface() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet5.jpg"));
		frame.setContentPane(bg);
		
		lblPet.setBounds(100,100,200,100);//����x������y����ȣ��߶�
		lblPet.setFont(new Font("����",Font.BOLD,25));
		lblPet.setForeground(Color.YELLOW);
		frame.add(lblPet);
		lblOrder.setBounds(100,200,200,100);
		lblOrder.setFont(new Font("����",Font.BOLD,25));
		lblOrder.setForeground(Color.YELLOW);
		frame.add(lblOrder);
		lblRank.setBounds(100,300,200,100);
		lblRank.setFont(new Font("����",Font.BOLD,25));
		lblRank.setForeground(Color.YELLOW);
		frame.add(lblRank);
		
		btnReturn.setBounds(100, 800, 80, 30);
		frame.add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new UserPanel();
			}
			
		});
		
		lblRank.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new PRank();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		lblOrder.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new COrder();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});	
		lblPet.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new CBuy();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});	
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
/*public class ClientInterface {
	public static void main(String[] args) {
		new CInterface();	
	}
}*/
