package ereview;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AssignmentDetailsPayment extends JFrame {

	private JPanel contentPane;
	private JTextField txtScreenshotpng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignmentDetailsPayment frame = new AssignmentDetailsPayment();
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
	public AssignmentDetailsPayment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 752);
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
		AssignmentDetailsPaymentTitleDetails.setBounds(350, 22, 208, 30);
		AssignmentDetailsPaymentPanel.add(AssignmentDetailsPaymentTitleDetails);
		AssignmentDetailsPaymentTitleDetails.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JButton AssignmentDetailsPaymentButtonBack = new JButton("");
		Image img3 = new ImageIcon (this.getClass().getResource("/BackButton.png")).getImage();
		AssignmentDetailsPaymentButtonBack.setIcon(new ImageIcon(img3));
		AssignmentDetailsPaymentButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				contentPane.setVisible(false); 
//				dispose();
//				PageMain.main(null);
				contentPane.setVisible(false);
				dispose();
				PageArticleReview par = new PageArticleReview();
				par.setVisible(true);
			}
		});
		AssignmentDetailsPaymentButtonBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		AssignmentDetailsPaymentButtonBack.setBounds(10, 22, 85, 27);
		AssignmentDetailsPaymentPanel.add(AssignmentDetailsPaymentButtonBack);
		
		JLabel AssignmentDetailsPaymentLabelInvoice = new JLabel("Invoice");
		AssignmentDetailsPaymentLabelInvoice.setFont(new Font("Times New Roman", Font.BOLD, 32));
		AssignmentDetailsPaymentLabelInvoice.setBounds(10, 80, 112, 30);
		contentPane.add(AssignmentDetailsPaymentLabelInvoice);
		
		JLabel lblNewLabel = new JLabel("Status : Waiting For Payment");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 120, 200, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order #INVEQXNMNEO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(761, 94, 175, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEditor = new JLabel("Editor:");
		lblEditor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor.setBounds(10, 175, 200, 20);
		contentPane.add(lblEditor);
		
		JLabel lblNewLabel_2_1 = new JLabel("Agustinus Aldi Irawan Rahardja");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 205, 231, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("aldialdi@gmail.com");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(10, 235, 200, 20);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Mandiri - Admin EReview 1 (123-123-123)");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(10, 295, 281, 20);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Bronze (Rp. 100.000,00 per 100 kata)");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_4.setBounds(10, 325, 246, 20);
		contentPane.add(lblNewLabel_2_4);
		
//		JButton AssignmentDetailsPaymentButtonUpload = new JButton("Upload");
//		AssignmentDetailsPaymentButtonUpload.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AssignmentDetailsPaymentPanelPoP.setVisible(true);
//			}
//		});
//		AssignmentDetailsPaymentButtonUpload.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		AssignmentDetailsPaymentButtonUpload.setBounds(10, 450, 150, 46);
//		contentPane.add(AssignmentDetailsPaymentButtonUpload);
		
		final JPanel AssignmentDetailsPaymentForm = new JPanel();
		AssignmentDetailsPaymentForm.setBounds(0, 506, 946, 199);
		contentPane.add(AssignmentDetailsPaymentForm);
		AssignmentDetailsPaymentForm.setLayout(null);
		AssignmentDetailsPaymentForm.setVisible(false);
		//AssignmentDetailsPaymentForm.setVisible(false);
		
		JButton AssignmentDetailsPaymentButtonUpload = new JButton("Upload");
		AssignmentDetailsPaymentButtonUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AssignmentDetailsPaymentForm.setVisible(true);
				//AssignmentDetailsPaymentForm.setVisible(true);
			}
		});
		AssignmentDetailsPaymentButtonUpload.setFont(new Font("Times New Roman", Font.BOLD, 20));
		AssignmentDetailsPaymentButtonUpload.setBounds(10, 450, 150, 46);
		contentPane.add(AssignmentDetailsPaymentButtonUpload);
		
		final JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(150, 99, 758, 22);
		AssignmentDetailsPaymentForm.add(lblNewLabel_2);
		
		JButton btnChooseFile = new JButton("Choose File");
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
		        chooser.showOpenDialog(null);
		        File f = chooser.getSelectedFile();
		        String filename = f.getAbsolutePath();
		        System.out.println(filename);
		        String fileName = filename.substring(filename.lastIndexOf("/")+1);
		        System.out.println(fileName);
		        lblNewLabel_2.setText(filename);
			}
		});
		btnChooseFile.setBounds(20, 93, 120, 33);
		AssignmentDetailsPaymentForm.add(btnChooseFile);
		btnChooseFile.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblNewLabel_2.getText() == null || lblNewLabel_2.getText().trim().isEmpty()) {
	                String message = "Do you really want to cancel the creation of the article review assignment?";
	                String title = "Proof Of Payment Cancelation Confirmation Message";
	                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION);
	                if (reply == JOptionPane.YES_OPTION)
	                {
	    				contentPane.setVisible(false); 
	    				dispose();
	    				PageMain.main(null);
	                }
				}
				else {
					JOptionPane.showMessageDialog(null, "Proof of Payment successfully uploaded");
					contentPane.setVisible(false);
    				dispose();
    				PageMain.main(null);
				}
//				JOptionPane.showMessageDialog(null, "Proof of Payment successfully uploaded");
//				contentPane.setVisible(false);
//				dispose();
//				AssignmentDetailsVerification details2 = new AssignmentDetailsVerification();
//				details2.setVisible(true);
			}
		});
		btnSubmit.setBounds(816, 156, 120, 33);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		AssignmentDetailsPaymentForm.add(btnSubmit);
		
		JLabel lblUploadProofOf = new JLabel("Upload Proof Of Payment");
		lblUploadProofOf.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblUploadProofOf.setBounds(330, 10, 273, 30);
		AssignmentDetailsPaymentForm.add(lblUploadProofOf);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Upload Proof of Payment File");
		lblNewLabel_2_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1.setBounds(10, 57, 200, 20);
		AssignmentDetailsPaymentForm.add(lblNewLabel_2_5_1);
		
		txtScreenshotpng = new JTextField();
		txtScreenshotpng.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtScreenshotpng.setColumns(10);
		txtScreenshotpng.setBounds(10, 87, 926, 48);
		AssignmentDetailsPaymentForm.add(txtScreenshotpng);
		
//		JLabel lblNewLabel_2 = new JLabel("New label");
//		lblNewLabel_2.setBounds(153, 104, 45, 13);
//		AssignmentDetailsPaymentForm.add(lblNewLabel_2);
		
		JLabel lblPaymentmethod = new JLabel("Payment Method");
		lblPaymentmethod.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPaymentmethod.setBounds(10, 265, 200, 20);
		contentPane.add(lblPaymentmethod);
	}
}
