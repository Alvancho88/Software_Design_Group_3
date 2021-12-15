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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Cursor;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;
import java.awt.Color;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class AssignmentDetailsUpload extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignmentDetailsUpload frame = new AssignmentDetailsUpload();
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
	public AssignmentDetailsUpload() {
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
		
		JButton AssignmentDetailsUploadButtonBack = new JButton("");
		Image img3 = new ImageIcon (this.getClass().getResource("/BackButton.png")).getImage();
		AssignmentDetailsUploadButtonBack.setIcon(new ImageIcon(img3));
		AssignmentDetailsUploadButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		AssignmentDetailsUploadButtonBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		AssignmentDetailsUploadButtonBack.setBounds(10, 22, 85, 27);
		AssignmentDetailsPaymentPanel.add(AssignmentDetailsUploadButtonBack);
		
		JLabel AssignmentDetailsPaymentLabelInvoice = new JLabel("Invoice");
		AssignmentDetailsPaymentLabelInvoice.setFont(new Font("Times New Roman", Font.BOLD, 32));
		AssignmentDetailsPaymentLabelInvoice.setBounds(10, 80, 112, 30);
		contentPane.add(AssignmentDetailsPaymentLabelInvoice);
		
		JLabel lblNewLabel = new JLabel("Status : Menunggu Rating");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 120, 200, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order #INVEQXNMNEO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(761, 95, 175, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEditor = new JLabel("Editor:");
		lblEditor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor.setBounds(10, 150, 200, 20);
		contentPane.add(lblEditor);
		
		JLabel lblNewLabel_2_1 = new JLabel("Agustinus Aldi Irawan Rahardja");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 180, 231, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("aldialdi@gmail.com");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(10, 210, 231, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblEditor_1 = new JLabel("File:");
		lblEditor_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1.setBounds(10, 240, 200, 20);
		contentPane.add(lblEditor_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Proposal Kadin.docx (1.9 Mb)");
		lblNewLabel_2_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_2_1.setBounds(10, 270, 231, 20);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Bukti Pembayaran.png (0.5 Mb)");
		lblNewLabel_2_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_2_2.setBounds(10, 330, 231, 20);
		contentPane.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("Rafi Akbar");
		lblNewLabel_2_1_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_2_3.setBounds(10, 386, 231, 20);
		contentPane.add(lblNewLabel_2_1_2_3);
		
		final JPanel RatingForm = new JPanel();
		RatingForm.setBounds(0, 508, 946, 205);
		contentPane.add(RatingForm);
		RatingForm.setLayout(null);
		RatingForm.setVisible(false);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RatingForm.setVisible(true);
			}
		});
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnOk.setBounds(786, 452, 150, 46);
		contentPane.add(btnOk);
		
		JLabel lblUploadProofOf = new JLabel("Rating Form");
		lblUploadProofOf.setBounds(356, 10, 136, 29);
		RatingForm.add(lblUploadProofOf);
		lblUploadProofOf.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Give Rating");
		lblNewLabel_2_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1.setBounds(10, 43, 200, 20);
		RatingForm.add(lblNewLabel_2_5_1);
		
		JRadioButton rdbtnveryBad = new JRadioButton("1 (Very Bad)");
		rdbtnveryBad.setForeground(Color.BLACK);
		rdbtnveryBad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnveryBad.setBounds(10, 69, 126, 21);
		RatingForm.add(rdbtnveryBad);
		
		JRadioButton rdbtnbad = new JRadioButton("2 (Bad)");
		rdbtnbad.setForeground(Color.BLACK);
		rdbtnbad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnbad.setBounds(138, 70, 126, 21);
		RatingForm.add(rdbtnbad);
		
		JRadioButton rdbtnmeh = new JRadioButton("3 (Meh)");
		rdbtnmeh.setForeground(Color.BLACK);
		rdbtnmeh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnmeh.setBounds(266, 70, 126, 21);
		RatingForm.add(rdbtnmeh);
		
		JRadioButton rdbtngood = new JRadioButton("4 (Good)");
		rdbtngood.setForeground(Color.BLACK);
		rdbtngood.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtngood.setBounds(394, 70, 126, 21);
		RatingForm.add(rdbtngood);
		
		JRadioButton rdbtnveryGood = new JRadioButton("5 (Very Good)");
		rdbtnveryGood.setForeground(Color.BLACK);
		rdbtnveryGood.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnveryGood.setBounds(522, 70, 126, 21);
		RatingForm.add(rdbtnveryGood);
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("Testimonial");
		lblNewLabel_2_5_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_5_1_1.setBounds(10, 96, 200, 20);
		RatingForm.add(lblNewLabel_2_5_1_1);
		
		textField = new JTextField();
		textField.setText("Judul");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setColumns(12);
		textField.setBounds(10, 126, 926, 19);
		RatingForm.add(textField);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.RED);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCancel.setBounds(816, 162, 120, 33);
		RatingForm.add(btnCancel);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Article History Succesfully Reviewed!\nAssignment Completed!!!");
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		btnSubmit_1.setBackground(Color.GREEN);
		btnSubmit_1.setBounds(686, 162, 120, 33);
		RatingForm.add(btnSubmit_1);
		btnSubmit_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblEditor_1_1 = new JLabel("Proof Of Payment:");
		lblEditor_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1_1.setBounds(10, 300, 200, 20);
		contentPane.add(lblEditor_1_1);
		
		JLabel lblEditor_1_1_1 = new JLabel("Reviewer");
		lblEditor_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1_1_1.setBounds(10, 356, 200, 20);
		contentPane.add(lblEditor_1_1_1);
		
		JLabel lblEditor_1_1_2 = new JLabel("Reviewed Article");
		lblEditor_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEditor_1_1_2.setBounds(10, 416, 200, 20);
		contentPane.add(lblEditor_1_1_2);
		
	    final String text = "Proposal Kadin Reviewed.pdf";
		final JLabel lblNewLabel_2_1_2_3_1 = new JLabel("Proposal Kadin Reviewed.pdf");
		lblNewLabel_2_1_2_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		//lblNewLabel_2_1_2_3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1_2_3_1.setBounds(10, 452, 273, 20);
		contentPane.add(lblNewLabel_2_1_2_3_1);
		
		lblNewLabel_2_1_2_3_1.addMouseListener(new MouseAdapter() {
        	 
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://drive.google.com/uc?export=download&id=1mv4DCaMXwSnNTA_Gx45YginQQRRSCCGl"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
            	lblNewLabel_2_1_2_3_1.setText(text);
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
            	lblNewLabel_2_1_2_3_1.setText("<html><a href='https://drive.google.com/uc?export=download&id=1mv4DCaMXwSnNTA_Gx45YginQQRRSCCGl'>" + text + "</a></html>");
            }
 
        });
		
		
//		lblNewLabel_2_1_2_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		private JHyperlink linkEmail = new JHyperlink("Email Us");
	}
	

}
