package ereview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import PageMain.java;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JTextField LogintextFieldEmail;
	private JPasswordField LoginpasswordField;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection=SQLiteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(23, 79, 85, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 130, 70, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		LogintextFieldEmail = new JTextField();
		LogintextFieldEmail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LogintextFieldEmail.setBounds(160, 71, 200, 31);
		frame.getContentPane().add(LogintextFieldEmail);
		LogintextFieldEmail.setColumns(10);
		
		LoginpasswordField = new JPasswordField();
		LoginpasswordField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LoginpasswordField.setBounds(160, 121, 200, 31);
		frame.getContentPane().add(LoginpasswordField);
		
		PageMain d;
		d = new PageMain();
		
		JButton LoginButtonLogin = new JButton("Login");
		LoginButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PageMain.main(null);
				//PageMain.PageMainAssignmentListPanel.setVisible(true);
//				try {
//					String query="select * from Editor where EmployeeEmail=? and EmployeePassword=?";
//					PreparedStatement pst = connection.prepareStatement(query);
//					pst.setString(1,LogintextFieldEmail.getText());
//					pst.setString(2,LoginpasswordField.getText());
//					
//					ResultSet rs = pst.executeQuery();
//					int count =0;
//					while(rs.next()) {
//						count=count+1;
//					}
//					if(count==1) {
//						JOptionPane.showMessageDialog(null, "Login Succesful");
//					}
//					if(count>1) {
//						JOptionPane.showMessageDialog(null, "Duplicate Variable");
//					}
//					else{
//						JOptionPane.showMessageDialog(null, "Email and Password is not correct, try again...");
//					}
////					rs.close();
////					pst.close();
//				}catch (Exception e2) {
//					JOptionPane.showMessageDialog(null, e);
//				}
//				finally {
//					try {
//						
//					}catch(Exception e3){
//						
//					}
//				}
			}
		});
		LoginButtonLogin.setBounds(135, 205, 140, 21);
		frame.getContentPane().add(LoginButtonLogin);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
