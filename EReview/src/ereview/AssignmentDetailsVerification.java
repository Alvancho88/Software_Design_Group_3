package ereview;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class AssignmentDetailsVerification extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignmentDetailsVerification frame = new AssignmentDetailsVerification();
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
	public AssignmentDetailsVerification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel AssignmentDetailsPaymentPanel = new JPanel();
		AssignmentDetailsPaymentPanel.setLayout(null);
		AssignmentDetailsPaymentPanel.setBackground(Color.WHITE);
		AssignmentDetailsPaymentPanel.setBounds(0, 0, 946, 70);
		contentPane.add(AssignmentDetailsPaymentPanel);
		
		JLabel AssignmentDetailsPaymentLabelTitle = new JLabel("EReview");
		AssignmentDetailsPaymentLabelTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		AssignmentDetailsPaymentLabelTitle.setBounds(840, 25, 96, 24);
		AssignmentDetailsPaymentPanel.add(AssignmentDetailsPaymentLabelTitle);
		
		JLabel AssignmentDetailsPaymentTitleDetails = new JLabel("Assignment Details");
		AssignmentDetailsPaymentTitleDetails.setFont(new Font("Times New Roman", Font.BOLD, 24));
		AssignmentDetailsPaymentTitleDetails.setBounds(350, 22, 208, 30);
		AssignmentDetailsPaymentPanel.add(AssignmentDetailsPaymentTitleDetails);
		
		JButton AssignmentDetailsVerificationButtonBack = new JButton("");
		Image img3 = new ImageIcon (this.getClass().getResource("/BackButton.png")).getImage();
		AssignmentDetailsVerificationButtonBack.setIcon(new ImageIcon(img3));
		AssignmentDetailsVerificationButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		AssignmentDetailsVerificationButtonBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		AssignmentDetailsVerificationButtonBack.setBounds(10, 22, 85, 27);
		AssignmentDetailsPaymentPanel.add(AssignmentDetailsVerificationButtonBack);
		
		JLabel AssignmentDetailsPaymentLabelInvoice = new JLabel("Invoice");
		AssignmentDetailsPaymentLabelInvoice.setFont(new Font("Times New Roman", Font.BOLD, 32));
		AssignmentDetailsPaymentLabelInvoice.setBounds(10, 80, 112, 30);
		contentPane.add(AssignmentDetailsPaymentLabelInvoice);
		
		JLabel lblNewLabel = new JLabel("Status : Waiting For Confirmation");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 120, 231, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order #INVEQXNMNEO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(761, 95, 175, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEditor = new JLabel("Editor:");
		lblEditor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor.setBounds(10, 205, 200, 20);
		contentPane.add(lblEditor);
		
		JLabel lblNewLabel_2_1 = new JLabel("Agustinus Aldi Irawan Rahardja");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 235, 231, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("aldialdi@gmail.com");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(10, 265, 231, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblEditor_1 = new JLabel("File:");
		lblEditor_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1.setBounds(10, 295, 200, 20);
		contentPane.add(lblEditor_1);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Proposal Kadin.docx (1.9 Mb)");
		lblNewLabel_2_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_3.setBounds(10, 325, 231, 20);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Bukti Pembayaran.png (0.5 Mb)");
		lblNewLabel_2_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_4.setBounds(10, 385, 231, 20);
		contentPane.add(lblNewLabel_2_1_4);
		
		JButton btnRejectOrder = new JButton("Reject Assignment");
		btnRejectOrder.setBackground(Color.RED);
		btnRejectOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Assignment Cancelled");
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		btnRejectOrder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRejectOrder.setBounds(736, 670, 200, 33);
		contentPane.add(btnRejectOrder);
		
		JButton btnAcceptAssignment = new JButton("Accept Assignment");
		btnAcceptAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Assignment Verified");
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		btnAcceptAssignment.setBackground(Color.GREEN);
		btnAcceptAssignment.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAcceptAssignment.setBounds(526, 670, 200, 33);
		contentPane.add(btnAcceptAssignment);
		
		JLabel lblEditor_1_1 = new JLabel("Reviewer:");
		lblEditor_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1_1.setBounds(10, 575, 200, 20);
		contentPane.add(lblEditor_1_1);
		
		JComboBox PageArticleReviewChooseCategory = new JComboBox();
		PageArticleReviewChooseCategory.setModel(new DefaultComboBoxModel(new String[] {"Rafi Akbar", "Salma Rahma"}));
		PageArticleReviewChooseCategory.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PageArticleReviewChooseCategory.setBounds(10, 605, 926, 21);
		contentPane.add(PageArticleReviewChooseCategory);
		
		JLabel lblEditor_1_2 = new JLabel("Proof Of Payment:");
		lblEditor_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1_2.setBounds(10, 355, 200, 20);
		contentPane.add(lblEditor_1_2);
	}

}
