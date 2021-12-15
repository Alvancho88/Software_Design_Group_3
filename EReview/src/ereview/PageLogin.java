package ereview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import PageMain.java;

public class PageLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageLogin frame = new PageLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PageLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToEreview = new JLabel("Welcome to EReview");
		lblWelcomeToEreview.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblWelcomeToEreview.setBounds(300, 30, 299, 51);
		contentPane.add(lblWelcomeToEreview);
		
		JFormattedTextField PageArticleReviewTextFieldAbstract = new JFormattedTextField();
		PageArticleReviewTextFieldAbstract.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewTextFieldAbstract.setBounds(218, 140, 500, 44);
		contentPane.add(PageArticleReviewTextFieldAbstract);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmail.setBounds(218, 110, 96, 20);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblPassword.setBounds(218, 194, 109, 20);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwordField.setBounds(218, 224, 500, 44);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
				//PageMain.PageMainAssignmentListPanel;
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBackground(Color.GREEN);
		btnLogin.setBounds(218, 300, 500, 33);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRegister.setBackground(Color.BLUE);
		btnRegister.setBounds(218, 343, 500, 33);
		contentPane.add(btnRegister);
	}
}
