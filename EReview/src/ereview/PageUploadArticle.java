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
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class PageUploadArticle extends JFrame {

	private JPanel contentPane;
	private JTextField txtProposalKadinReviewedpdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageUploadArticle frame = new PageUploadArticle();
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
	public PageUploadArticle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
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
		
		JLabel lblUploadArticle = new JLabel("Upload Article");
		lblUploadArticle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblUploadArticle.setBounds(375, 22, 160, 30);
		AssignmentDetailsPaymentPanel.add(lblUploadArticle);
		
		JButton PageUploadArticleButtonBack = new JButton("");
		Image img3 = new ImageIcon (this.getClass().getResource("/BackButton.png")).getImage();
		PageUploadArticleButtonBack.setIcon(new ImageIcon(img3));
		PageUploadArticleButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		PageUploadArticleButtonBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageUploadArticleButtonBack.setBounds(10, 25, 85, 27);
		AssignmentDetailsPaymentPanel.add(PageUploadArticleButtonBack);
		
		final Panel PageUploadArticleForm = new Panel();
		PageUploadArticleForm.setBounds(10, 97, 936, 256);
		contentPane.add(PageUploadArticleForm);
		PageUploadArticleForm.setLayout(null);
		PageUploadArticleForm.setVisible(false);
		
		JButton btnNewButton = new JButton("Upload Reviewed Article");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageUploadArticleForm.setVisible(true);
			}
		});
		btnNewButton.setBounds(112, 26, 202, 24);
		AssignmentDetailsPaymentPanel.add(btnNewButton);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton btnUploadReviewedArticle = new JButton("Upload Reviewed Article");
		btnUploadReviewedArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Reviewed Article Successfully Uploaded!");
//				contentPane.setVisible(false); 
//				dispose();
//				PageMain.main(null);
				contentPane.setVisible(false);
				dispose();
				AssignmentDetailsUpload ADU = new AssignmentDetailsUpload();
				ADU.setVisible(true);
			}
		});
		btnUploadReviewedArticle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUploadReviewedArticle.setBounds(684, 453, 252, 40);
		contentPane.add(btnUploadReviewedArticle);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(176, 209, 715, 13);
		PageUploadArticleForm.add(lblNewLabel);
		
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
		        lblNewLabel.setText(filename);
		        
			}
		});
		btnChooseFile.setBounds(20, 200, 146, 29);
		PageUploadArticleForm.add(btnChooseFile);
		btnChooseFile.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblUploadReviewedArticle = new JLabel("Upload Reviewed Article");
		lblUploadReviewedArticle.setBounds(10, 10, 304, 34);
		PageUploadArticleForm.add(lblUploadReviewedArticle);
		lblUploadReviewedArticle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JFormattedTextField PageArticleReviewTextFieldAbstract = new JFormattedTextField();
		PageArticleReviewTextFieldAbstract.setBounds(10, 77, 916, 75);
		PageUploadArticleForm.add(PageArticleReviewTextFieldAbstract);
		PageArticleReviewTextFieldAbstract.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		txtProposalKadinReviewedpdf = new JTextField();
		txtProposalKadinReviewedpdf.setBounds(10, 192, 916, 48);
		PageUploadArticleForm.add(txtProposalKadinReviewedpdf);
		txtProposalKadinReviewedpdf.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtProposalKadinReviewedpdf.setColumns(10);
		
		JLabel lblRevisionDetail = new JLabel("Revision Detail");
		lblRevisionDetail.setBounds(10, 54, 127, 13);
		PageUploadArticleForm.add(lblRevisionDetail);
		lblRevisionDetail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Upload Reviewed Article File");
		lblNewLabel_2_5_1.setBounds(10, 162, 200, 20);
		PageUploadArticleForm.add(lblNewLabel_2_5_1);
		lblNewLabel_2_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	}
}
