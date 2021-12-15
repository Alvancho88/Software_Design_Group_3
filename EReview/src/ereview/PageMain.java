package ereview;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import EReviewDatabases;

public class PageMain {

	protected static Object PageMainAssignmentListPanel;
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageMain window = new PageMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PageMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img2 = new ImageIcon (this.getClass().getResource("/Menu.png")).getImage();
		frame.getContentPane().setLayout(null);
		Image img = new ImageIcon (this.getClass().getResource("/Menu.png")).getImage();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 946, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 122, 73);
		panel.add(menuBar);
		
		//Image img = new ImageIcon (this.getClass().getResource("/Menu.png")).getImage();
		//mnNewMenu.setIcon(new ImageIcon(img));
		
		JMenu PageMainMenuList = new JMenu("");
		menuBar.add(PageMainMenuList);
		PageMainMenuList.setIcon(new ImageIcon(img2));
		PageMainMenuList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		JButton PageMainButtonMakeArticle = new JButton("Article Review");
		PageMainButtonMakeArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PageMainButtonMakeArticle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageMainButtonMakeArticle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PageArticleReview page2 = new PageArticleReview();
				page2.setVisible(true);
			}
		});
		PageMainMenuList.add(PageMainButtonMakeArticle);
		
		JButton PageMainButtonAssignmentVerification = new JButton("Assignment Verification");
		PageMainButtonAssignmentVerification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AssignmentDetailsVerification page4 = new AssignmentDetailsVerification();
				page4.setVisible(true);
			}
		});
		PageMainButtonAssignmentVerification.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageMainMenuList.add(PageMainButtonAssignmentVerification);
		
		JButton PageMainButtonUploadReviewedArticle = new JButton("Upload Reviewed Article");
		PageMainButtonUploadReviewedArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PageUploadArticle page5 = new PageUploadArticle();
				page5.setVisible(true);
			}
		});
		PageMainButtonUploadReviewedArticle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageMainMenuList.add(PageMainButtonUploadReviewedArticle);
		
		JButton PageMainButtonAssignmentHistory = new JButton("Assignment History");
		PageMainButtonAssignmentHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AssignmentDetailsUpload page6 = new AssignmentDetailsUpload();
				page6.setVisible(true);
			}
		});
		PageMainButtonAssignmentHistory.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageMainMenuList.add(PageMainButtonAssignmentHistory);
		
		JLabel PageMainLabelTitle = new JLabel("EReview");
		PageMainLabelTitle.setBounds(840, 25, 96, 24);
		panel.add(PageMainLabelTitle);
		PageMainLabelTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JLabel lblHomePage = new JLabel("Home Page");
		lblHomePage.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblHomePage.setBounds(351, 19, 122, 30);
		panel.add(lblHomePage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 68, 946, 70);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBounds(698, 10, 127, 29);
		panel_1.add(btnRegister);
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
//				Login page7 = new Login();
//				page7.setVisible(true);
				PageLogin.main(null);
			}
		});
		btnNewButton.setBounds(835, 10, 101, 29);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRegister.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Welcome, Aldi!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 30, 329, 30);
		panel_1.add(lblNewLabel);
		
		JPanel PageMainAssignmentListPanel = new JPanel();
		PageMainAssignmentListPanel.setBackground(Color.CYAN);
		PageMainAssignmentListPanel.setBounds(0, 136, 946, 367);
		frame.getContentPane().add(PageMainAssignmentListPanel);
		PageMainAssignmentListPanel.setLayout(null);
		PageMainAssignmentListPanel.setVisible(false);
		
//		public void PageMainAssignmentPanel(PageMainAssignmentListPanel){
//			
//		}
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "Ngoding", "On Progress"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"No", "Assignment", "Status"
			}
		));
		table.setBounds(122, 294, 429, -210);
		
		//table.setModel(model);
		
		table.setBackground(Color.WHITE);
		PageMainAssignmentListPanel.add(table);
		
		JLabel lblAssignmentList = new JLabel("Assignment List");
		lblAssignmentList.setBounds(326, 23, 179, 29);
		lblAssignmentList.setFont(new Font("Times New Roman", Font.BOLD, 24));
		PageMainAssignmentListPanel.add(lblAssignmentList);
		
		//https://www.enterprisedb.com/postgres-tutorials/how-connect-postgres-database-using-eclipse-and-netbeans
	}
}
