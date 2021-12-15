package ereview;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.SystemColor;

import java.io.File;

public class PageArticleReview extends JFrame {

	private JPanel contentPane;
	private JTextField PageArticleReviewTextFieldJudul;
	private JTextField PageArticleReviewTextFieldKeyword;
	private JTextField PageArticleReviewTextFieldTotalKata;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageArticleReview frame = new PageArticleReview();
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
	public PageArticleReview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 946, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel PageArticleReviewLabelTitle = new JLabel("EReview");
		PageArticleReviewLabelTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		PageArticleReviewLabelTitle.setBounds(840, 25, 96, 24);
		panel.add(PageArticleReviewLabelTitle);
		
		JButton PageArticleReviewButtonBack = new JButton("");
		PageArticleReviewButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		PageArticleReviewButtonBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
//		Image img3 = new ImageIcon (this.getClass().getResource("/BackButton.png")).getImage();
//		PageArticleReviewButtonBack.setIcon(new ImageIcon(img3));
		Image img3 = new ImageIcon (this.getClass().getResource("/BackButton.png")).getImage();
		PageArticleReviewButtonBack.setIcon(new ImageIcon(img3));
		PageArticleReviewButtonBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//contentPane.setVisible(false); 
				//dispose();
				//PageMain.main(null);
				contentPane.setVisible(false); 
				dispose();
				PageMain.main(null);
			}
		});
		PageArticleReviewButtonBack.setBounds(10, 25, 85, 27);
		panel.add(PageArticleReviewButtonBack);
		
//		JButton PageArticleReviewButtonBuatPesanan = new JButton("Buat Pesanan");
//		PageArticleReviewButtonBuatPesanan.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				PageArticleReviewForm.setVisible(true);
//			}
//		});
//		PageArticleReviewButtonBuatPesanan.setBounds(120, 25, 125, 24);
//		panel.add(PageArticleReviewButtonBuatPesanan);
//		PageArticleReviewButtonBuatPesanan.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//contentPane.setVisible(false);
//				//dispose();
//				//FormMakeArticleReviewAssignment form1 = new FormMakeArticleReviewAssignment();
//				//form1.setVisible(true);
//			}
//		});
//		PageArticleReviewButtonBuatPesanan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		final JPanel PageArticleReviewForm = new JPanel();
		PageArticleReviewForm.setBounds(0, 69, 946, 644);
		contentPane.add(PageArticleReviewForm);
		PageArticleReviewForm.setVisible(false);
		PageArticleReviewForm.setLayout(null);
		
		JButton PageArticleReviewButtonBuatPesanan = new JButton("Create Article Review");
		PageArticleReviewButtonBuatPesanan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageArticleReviewForm.setVisible(true);
			}
		});
		PageArticleReviewButtonBuatPesanan.setBounds(120, 25, 198, 24);
		panel.add(PageArticleReviewButtonBuatPesanan);
		PageArticleReviewButtonBuatPesanan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//contentPane.setVisible(false);
				//dispose();
				//FormMakeArticleReviewAssignment form1 = new FormMakeArticleReviewAssignment();
				//form1.setVisible(true);
			}
		});
		PageArticleReviewButtonBuatPesanan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblArticleReviewForm = new JLabel("Article Review Form");
		lblArticleReviewForm.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblArticleReviewForm.setBounds(350, 22, 248, 30);
		panel.add(lblArticleReviewForm);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(128, 376, 790, 13);
		PageArticleReviewForm.add(lblNewLabel);
		
		JLabel PageArticleReviewLabelBuatPesanan = new JLabel("Buat Pesanan");
		PageArticleReviewLabelBuatPesanan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		PageArticleReviewLabelBuatPesanan.setBounds(10, 10, 304, 34);
		PageArticleReviewForm.add(PageArticleReviewLabelBuatPesanan);
		
		JLabel PageArticleReviewLabelJudul = new JLabel("Judul");
		PageArticleReviewLabelJudul.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelJudul.setBounds(10, 54, 45, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelJudul);
		
		PageArticleReviewTextFieldJudul = new JTextField();
		PageArticleReviewTextFieldJudul.setText("Judul");
		PageArticleReviewTextFieldJudul.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewTextFieldJudul.setColumns(12);
		PageArticleReviewTextFieldJudul.setBounds(10, 77, 926, 19);
		PageArticleReviewForm.add(PageArticleReviewTextFieldJudul);
		
		JLabel PageArticleReviewLabelAbstract = new JLabel("Abstract");
		PageArticleReviewLabelAbstract.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelAbstract.setBounds(10, 106, 58, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelAbstract);
		
		JFormattedTextField PageArticleReviewTextFieldAbstract = new JFormattedTextField();
		PageArticleReviewTextFieldAbstract.setText("Abstract");
		PageArticleReviewTextFieldAbstract.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewTextFieldAbstract.setBounds(10, 129, 926, 44);
		PageArticleReviewForm.add(PageArticleReviewTextFieldAbstract);
		
		JLabel PageArticleReviewLabelKeyword = new JLabel("Keyword");
		PageArticleReviewLabelKeyword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelKeyword.setBounds(10, 183, 66, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelKeyword);
		
		PageArticleReviewTextFieldKeyword = new JTextField();
		PageArticleReviewTextFieldKeyword.setText("EX: Data Mining, SVM");
		PageArticleReviewTextFieldKeyword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PageArticleReviewTextFieldKeyword.setColumns(10);
		PageArticleReviewTextFieldKeyword.setBounds(10, 206, 926, 19);
		PageArticleReviewForm.add(PageArticleReviewTextFieldKeyword);
		
		JLabel PageArticleReviewLabelSubjectArea = new JLabel("Subject Area");
		PageArticleReviewLabelSubjectArea.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelSubjectArea.setBounds(10, 235, 96, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelSubjectArea);
		
		JComboBox PageArticleReviewChooseSubject = new JComboBox();
		PageArticleReviewChooseSubject.setForeground(Color.BLACK);
		PageArticleReviewChooseSubject.setBackground(Color.WHITE);
		PageArticleReviewChooseSubject.setModel(new DefaultComboBoxModel(new String[] {"Computer Science", "Network Security"}));
		PageArticleReviewChooseSubject.setToolTipText("");
		PageArticleReviewChooseSubject.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PageArticleReviewChooseSubject.setBounds(10, 258, 926, 21);
		PageArticleReviewForm.add(PageArticleReviewChooseSubject);
		
		JLabel PageArticleReviewLabelCategory = new JLabel("Category");
		PageArticleReviewLabelCategory.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelCategory.setBounds(10, 289, 66, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelCategory);
		
		JComboBox PageArticleReviewChooseCategory = new JComboBox();
		PageArticleReviewChooseCategory.setModel(new DefaultComboBoxModel(new String[] {"Data Mining", "Software Engineer"}));
		PageArticleReviewChooseCategory.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PageArticleReviewChooseCategory.setBounds(10, 312, 926, 21);
		PageArticleReviewForm.add(PageArticleReviewChooseCategory);
		
		JLabel PageArticleReviewLabelFile = new JLabel("File (Docx / Doc / PDF)");
		PageArticleReviewLabelFile.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelFile.setBounds(10, 343, 162, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelFile);
		
		JButton PageArticleReviewButtonChooseFile = new JButton("Choose File");
		PageArticleReviewButtonChooseFile.addActionListener(new ActionListener() {
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
		PageArticleReviewButtonChooseFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PageArticleReviewButtonChooseFile.setBounds(20, 372, 98, 21);
		PageArticleReviewForm.add(PageArticleReviewButtonChooseFile);
		
		JLabel PageArticleReviewLabelPaketHarga = new JLabel("Paket Harga");
		PageArticleReviewLabelPaketHarga.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelPaketHarga.setBounds(10, 410, 86, 19);
		PageArticleReviewForm.add(PageArticleReviewLabelPaketHarga);
		
		JRadioButton PageArticleReviewRadioBronze = new JRadioButton("Bronze (Rp. 100.000,00 per 100 kata)");
		PageArticleReviewRadioBronze.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewRadioBronze.setForeground(Color.BLACK);
		PageArticleReviewRadioBronze.setBounds(10, 435, 304, 21);
		PageArticleReviewForm.add(PageArticleReviewRadioBronze);
		
		JRadioButton PageArticleReviewRadioSilver = new JRadioButton("Silver (Rp. 200.000,00 per 1000 kata)");
		PageArticleReviewRadioSilver.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewRadioSilver.setBounds(10, 458, 310, 21);
		PageArticleReviewForm.add(PageArticleReviewRadioSilver);
		
		JLabel PageArticleReviewLabelTotalKata = new JLabel("Total Kata");
		PageArticleReviewLabelTotalKata.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelTotalKata.setBounds(10, 485, 75, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelTotalKata);
		
		PageArticleReviewTextFieldTotalKata = new JTextField();
		PageArticleReviewTextFieldTotalKata.setText("1000");
		PageArticleReviewTextFieldTotalKata.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PageArticleReviewTextFieldTotalKata.setColumns(10);
		PageArticleReviewTextFieldTotalKata.setBounds(10, 508, 926, 19);
		PageArticleReviewForm.add(PageArticleReviewTextFieldTotalKata);
		
		JLabel PageArticleReviewLabelPembayaran = new JLabel("Pembayaran");
		PageArticleReviewLabelPembayaran.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PageArticleReviewLabelPembayaran.setBounds(10, 537, 96, 13);
		PageArticleReviewForm.add(PageArticleReviewLabelPembayaran);
		
		JRadioButton PageArticleReviewRadioMandiri = new JRadioButton("Mandiri - Admin EReview 1 (123-123-123)");
		PageArticleReviewRadioMandiri.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewRadioMandiri.setBounds(10, 556, 336, 21);
		PageArticleReviewForm.add(PageArticleReviewRadioMandiri);
		
		JRadioButton PageArticleReviewRadioBCA = new JRadioButton("BCA - Admin EReview 2 (456-456-456)");
		PageArticleReviewRadioBCA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		PageArticleReviewRadioBCA.setBounds(10, 579, 304, 21);
		PageArticleReviewForm.add(PageArticleReviewRadioBCA);
		
		JButton PageArticleReviewButtonAssign = new JButton("Assign");
		PageArticleReviewButtonAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showConfirmDialog(null, "Do you really want to create the Article Review Assignment?");
                String message = "Do you really want to create the Article Review Assignment? ";
                String title = "Article Review Assignment Confirmation Message";
                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {
    				contentPane.setVisible(false);
    				dispose();
    				AssignmentDetailsPayment details1 = new AssignmentDetailsPayment();
    				details1.setVisible(true);
//    				contentPane.setVisible(false);
//    				dispose();
//    				AssignmentDetailsPayment details1 = new AssignmentDetailsPayment();
//    				details1.setVisible(true);
                }
//				contentPane.setVisible(false);
//				dispose();
//				AssignmentDetailsPayment details1 = new AssignmentDetailsPayment();
//				details1.setVisible(true);
//				contentPane.setVisible(false);
//				dispose();
//				AssignmentDetailsPayment details1 = new AssignmentDetailsPayment();
//				details1.setVisible(true);
			}
		});
		PageArticleReviewButtonAssign.setForeground(Color.BLACK);
		PageArticleReviewButtonAssign.setFont(new Font("Times New Roman", Font.BOLD, 20));
		PageArticleReviewButtonAssign.setBounds(811, 600, 125, 34);
		PageArticleReviewForm.add(PageArticleReviewButtonAssign);
		
		textField = new JTextField();
		textField.setBounds(10, 366, 926, 34);
		PageArticleReviewForm.add(textField);
		textField.setColumns(10);
	}
}
