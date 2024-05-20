package com.employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Main_class extends JFrame{
	
	Main_class(){

		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("com/icon/homeicon2.png")); 
		Image i22 = i11.getImage().getScaledInstance(750, 425, Image.SCALE_DEFAULT);
		ImageIcon i33 = new ImageIcon(i22);
		JLabel imag = new JLabel(i33);
		imag.setBounds(350,100,750,425);
		add(imag);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/icon/homeimage.png.jpg")); 
		Image i2 = i1.getImage().getScaledInstance(1120, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel img = new JLabel(i3);
		img.setBounds(0,0,1120,650);
		add(img);
		
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(410, 20, 1050, 100);
		heading.setFont(new Font("Raleway", Font.BOLD,40));
		img.add(heading);
		
		JButton add =new JButton("Add Employee");
		add.setBounds(75, 150, 150, 40);
		add.setForeground(Color.BLACK);
		add.setBackground(Color.WHITE);
		img.add(add);
		
		JButton view =new JButton("View Employee");
		view.setBounds(75, 200, 150, 40);
		view.setForeground(Color.BLACK);
		view.setBackground(Color.WHITE);
		img.add(view);
		
		JButton update =new JButton("Update Employee");
		update.setBounds(75, 250, 150, 40);
		update.setForeground(Color.BLACK);
		update.setBackground(Color.WHITE);
		img.add(update);
		
		JButton remove =new JButton("Remove Employee");
		remove.setBounds(75, 300, 150, 40);
		remove.setForeground(Color.BLACK);
		remove.setBackground(Color.WHITE);
		img.add(remove);
		
		
						
		setSize(1120, 650);
		setLocation(350, 150);
		setLayout(null);
		setVisible(true);
	}
	
	private Font setFont(String string, int bold) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[]args) {
		new Main_class();
	}

}
