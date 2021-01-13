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
	private JFrame frame=new JFrame("店主主界面");
	private JLabel lblInfo=new JLabel("宠物信息录入");
	private JLabel lblDelete=new JLabel("宠物信息删除");
	private JLabel lblAlter=new JLabel("宠物信息修改");
	private JLabel lblCheck=new JLabel("查看所有宠物信息");
	private JLabel lblQuery=new JLabel("模糊查询");
	private JLabel lblOrder=new JLabel("查看购买订单");
	private JLabel lblPortion=new JLabel("查看订单份额");
	private JButton btnReturn=new JButton("返回");
	private JButton btnSC=new JButton("收藏");
	private JTextField txtSC=new JTextField(30);
	
	
	
	public BInterface() {
		frame.setSize(1000,1000);
		frame.setLocation(50,50);
		frame.setResizable(false);
		frame.setLayout(null);//设置空布局
		JLabel bg=new JLabel(new ImageIcon("D:\\JAVA\\pet7.jpg"));
		frame.setContentPane(bg);
		
		lblInfo.setBounds(100,100,200,100);//横轴x，数轴y，宽度，高度
		lblInfo.setFont(new Font("宋体",Font.BOLD,25));
		lblInfo.setForeground(Color.YELLOW);
		frame.add(lblInfo);
		lblDelete.setBounds(100,200,200,100);
		lblDelete.setFont(new Font("宋体",Font.BOLD,25));
		lblDelete.setForeground(Color.YELLOW);
		frame.add(lblDelete);
		lblAlter.setBounds(100,300,200,100);
		lblAlter.setFont(new Font("宋体",Font.BOLD,25));
		lblAlter.setForeground(Color.YELLOW);
		frame.add(lblAlter);
		lblCheck.setBounds(100,400,200,100);
		lblCheck.setFont(new Font("宋体",Font.BOLD,25));
		lblCheck.setForeground(Color.YELLOW);
		frame.add(lblCheck);
		lblQuery.setBounds(100,500,200,100);
		lblQuery.setFont(new Font("宋体",Font.BOLD,25));
		lblQuery.setForeground(Color.YELLOW);
		frame.add(lblQuery);
		lblOrder.setBounds(100,600,200,100);
		lblOrder.setFont(new Font("宋体",Font.BOLD,25));
		lblOrder.setForeground(Color.YELLOW);
		frame.add(lblOrder);
		lblPortion.setBounds(100,700,200,100);
		lblPortion.setFont(new Font("宋体",Font.BOLD,25));
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
		
		lblCheck.addMouseListener(new MouseListener() {//查看宠物列表

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
		lblQuery.addMouseListener(new MouseListener() {//查看宠物列表

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
		lblDelete.addMouseListener(new MouseListener() {//删除宠物信息
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
		lblInfo.addMouseListener(new MouseListener() {//添加宠物信息
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
		lblAlter.addMouseListener(new MouseListener() {//修改宠物信息
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
