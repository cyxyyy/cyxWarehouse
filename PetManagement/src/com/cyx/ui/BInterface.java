package com.cyx.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.cyx.dao.BAdd;
import com.cyx.dao.BAlter;
import com.cyx.dao.BCheck;
import com.cyx.dao.BDelete;
import com.cyx.dao.BOrder;
import com.cyx.dao.BPortion;
import com.cyx.dao.BossFuzzy;
import com.cyx.dao.LoginSQL;

public class BInterface extends JFrame{
	private JFrame frame=new JFrame("����������");
	private JLabel lblInfo=new JLabel("������Ϣ¼��");
	private JLabel lblDelete=new JLabel("������Ϣɾ��");
	private JLabel lblAlter=new JLabel("������Ϣ�޸�");
	private JLabel lblCheck=new JLabel("�鿴���г�����Ϣ");
	private JLabel lblQuery=new JLabel("ģ����ѯ");
	private JLabel lblOrder=new JLabel("�鿴���򶩵�");
	private JLabel lblPortion=new JLabel("�鿴�����ݶ�");
	private JButton btnReturn=new JButton("����");
	private JButton btnSC=new JButton("�ղ�");
	private JTextField txtSC=new JTextField(30);
	
	
	
	public BInterface() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//���ÿղ���
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet7.jpg"));
		frame.setContentPane(bg);
		
		lblInfo.setBounds(100,100,200,100);//����x������y����ȣ��߶�
		lblInfo.setFont(new Font("����",Font.BOLD,25));
		lblInfo.setForeground(Color.YELLOW);
		frame.add(lblInfo);
		lblDelete.setBounds(100,200,200,100);
		lblDelete.setFont(new Font("����",Font.BOLD,25));
		lblDelete.setForeground(Color.YELLOW);
		frame.add(lblDelete);
		lblAlter.setBounds(100,300,200,100);
		lblAlter.setFont(new Font("����",Font.BOLD,25));
		lblAlter.setForeground(Color.YELLOW);
		frame.add(lblAlter);
		lblCheck.setBounds(100,400,200,100);
		lblCheck.setFont(new Font("����",Font.BOLD,25));
		lblCheck.setForeground(Color.YELLOW);
		frame.add(lblCheck);
		lblQuery.setBounds(100,500,200,100);
		lblQuery.setFont(new Font("����",Font.BOLD,25));
		lblQuery.setForeground(Color.YELLOW);
		frame.add(lblQuery);
		lblOrder.setBounds(100,600,200,100);
		lblOrder.setFont(new Font("����",Font.BOLD,25));
		lblOrder.setForeground(Color.YELLOW);
		frame.add(lblOrder);
		lblPortion.setBounds(100,700,200,100);
		lblPortion.setFont(new Font("����",Font.BOLD,25));
		lblPortion.setForeground(Color.YELLOW);
		frame.add(lblPortion);
		
		btnReturn.setBounds(100, 900, 80, 30);
		frame.add(btnReturn);
		
		txtSC.setBounds(100, 800, 80, 30);
		frame.add(txtSC);
		btnSC.setBounds(210,800,80,30);
		frame.add(btnSC);
		
		btnReturn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BossPanel();
				
			}
			
		});
		
		lblCheck.addMouseListener(new MouseListener() {//�鿴�����б�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				frame.dispose();
				new BCheck();
				
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
		lblQuery.addMouseListener(new MouseListener() {//�鿴�����б�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				frame.dispose();
				new BossFuzzy();
				
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
		lblDelete.addMouseListener(new MouseListener() {//ɾ��������Ϣ
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BDelete();
				
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
		lblInfo.addMouseListener(new MouseListener() {//��ӳ�����Ϣ
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BAdd();
				
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
		lblAlter.addMouseListener(new MouseListener() {//�޸ĳ�����Ϣ
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BAlter();
				
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
		lblCheck.addMouseListener(new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BCheck();
				
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
		lblPortion.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BPortion();
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
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				frame.dispose();
				new BOrder();
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
		btnSC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new LoginSQL().enshrine(txtSC.getText());
			}
			
		});
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
/*public class BossInterface {
	public static void main(String[] args) {
		new BInterface();
	}
}*/
