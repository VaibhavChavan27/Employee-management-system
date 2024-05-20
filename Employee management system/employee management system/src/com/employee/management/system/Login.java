package com.employee.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class Login extends JFrame implements ActionListener{
	
	JTextField tusername;
	
	JTextField tpassword;

	JButton login ,back;
	
	Login(){
		
		
		
		
		JLabel username = new JLabel("Username");
		username.setBounds(40, 20, 100, 30);
		username.setForeground(Color.white);
		add(username);
		
		tusername = new JTextField();
		tusername.setBounds(150, 20, 150, 30);
		add(tusername);
		
		JLabel password = new JLabel("Password");
		password.setBounds(40, 60, 100, 30);
		password.setForeground(Color.white);
		add(password);
		
		tpassword = new JTextField();
		tpassword.setBounds(150, 60, 150, 30);
		add(tpassword);
		
		login = new JButton ("LOGIN");
		login.setBounds(150, 120, 150, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		back = new JButton ("BACK");
		back.setBounds(150, 160, 150, 30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("com/icon/loginicon.jpg"));
		Image i22 = i11.getImage().getScaledInstance(250, 185, Image.SCALE_DEFAULT);
		ImageIcon i33 = new ImageIcon(i22);
		JLabel imag = new JLabel(i33);
		imag.setBounds(320, 30, 250, 185);
		add(imag);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com\\icon\\loginpage.png.jpg"));
		Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel img = new JLabel(i3);
		img.setBounds(0, 0, 600, 300);
		add(img);
		
		setSize(600,300);
		setLocation(650,250);
		setLayout(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == login) {
			
			try {
				
				String username = tusername.getText();
				String password = tpassword.getText();
				
				Connections conn = new Connections();
				
				String query ="select * from login where username ='"+username+"' and password ='"+password+"'";
				ResultSet resultset = conn.statement.executeQuery(query);
				if(resultset.next()) {
					setVisible(false);
					new Main_class();
				}
				else{
					JOptionPane.showMessageDialog(null, "invalid username or password");
				}
				
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
			
		}
		
		else if(e.getSource() == back) {
			System.exit(25);
		}
		
		
	}
	
	public static void main(String[]args) {
		new Login();
	}

}
