package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Color;
import javax.swing.UIManager;

public class MakeArticleReviewAssignmentForm extends JPanel {
	private JTextField makeArticleReviewAssignmentTextBoxJudul;
	private final JButton makeArticleReviewAssignmentButtonFile = new JButton("Choose File");
	private JTextField makeArticleReviewAssignmentTextBoxKeyword;
	private JTextField makeArticleReviewAssignmentFormTextBoxTotalKata;

	/**
	 * Create the panel.
	 */
	public MakeArticleReviewAssignmentForm() {
		setLayout(null);
		
		JLabel makeArticleReviewAssignmentFormLabelTitle = new JLabel("Buat Pesanan");
		makeArticleReviewAssignmentFormLabelTitle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		makeArticleReviewAssignmentFormLabelTitle.setBounds(20, 10, 304, 44);
		add(makeArticleReviewAssignmentFormLabelTitle);
		makeArticleReviewAssignmentButtonFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentButtonFile.setBounds(30, 378, 98, 21);
		add(makeArticleReviewAssignmentButtonFile);
		
		makeArticleReviewAssignmentTextBoxJudul = new JTextField();
		makeArticleReviewAssignmentTextBoxJudul.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentTextBoxJudul.setBounds(20, 87, 409, 19);
		makeArticleReviewAssignmentTextBoxJudul.setText("Judul");
		add(makeArticleReviewAssignmentTextBoxJudul);
		makeArticleReviewAssignmentTextBoxJudul.setColumns(12);
		
		JLabel makeArticleReviewAssignmentLabelJudul = new JLabel("Judul");
		makeArticleReviewAssignmentLabelJudul.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelJudul.setBounds(20, 64, 45, 13);
		add(makeArticleReviewAssignmentLabelJudul);
		
		JLabel makeArticleReviewAssignmentLabelAbstract = new JLabel("Abstract");
		makeArticleReviewAssignmentLabelAbstract.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelAbstract.setBounds(20, 116, 45, 13);
		add(makeArticleReviewAssignmentLabelAbstract);
		
		JLabel makeArticleReviewAssignmentLabelKeyword = new JLabel("Keyword");
		makeArticleReviewAssignmentLabelKeyword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelKeyword.setBounds(20, 193, 45, 13);
		add(makeArticleReviewAssignmentLabelKeyword);
		
		JLabel makeArticleReviewAssignmentLabelSubjectArea = new JLabel("Subject Area");
		makeArticleReviewAssignmentLabelSubjectArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelSubjectArea.setBounds(20, 245, 75, 13);
		add(makeArticleReviewAssignmentLabelSubjectArea);
		
		JLabel makeArticleReviewAssignmentLabelCategory = new JLabel("Category");
		makeArticleReviewAssignmentLabelCategory.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelCategory.setBounds(20, 299, 45, 13);
		add(makeArticleReviewAssignmentLabelCategory);
		
		JFormattedTextField makeArticleReviewAssignmentFormTextBoxAbstract = new JFormattedTextField();
		makeArticleReviewAssignmentFormTextBoxAbstract.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentFormTextBoxAbstract.setText("Abstract");
		makeArticleReviewAssignmentFormTextBoxAbstract.setBounds(20, 139, 409, 44);
		add(makeArticleReviewAssignmentFormTextBoxAbstract);
		
		makeArticleReviewAssignmentTextBoxKeyword = new JTextField();
		makeArticleReviewAssignmentTextBoxKeyword.setText("EX: Data Mining, SVM");
		makeArticleReviewAssignmentTextBoxKeyword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentTextBoxKeyword.setBounds(20, 216, 409, 19);
		add(makeArticleReviewAssignmentTextBoxKeyword);
		makeArticleReviewAssignmentTextBoxKeyword.setColumns(10);
		
		JComboBox makeArticleReviewAssignmentComboBoxSubjectArea = new JComboBox();
		makeArticleReviewAssignmentComboBoxSubjectArea.setModel(new DefaultComboBoxModel(new String[] {"Computer Science", "Biomedic"}));
		makeArticleReviewAssignmentComboBoxSubjectArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentComboBoxSubjectArea.setBounds(20, 268, 409, 21);
		add(makeArticleReviewAssignmentComboBoxSubjectArea);
		
		JComboBox makeArticleReviewAssignmentComboBoxCategory = new JComboBox();
		makeArticleReviewAssignmentComboBoxCategory.setModel(new DefaultComboBoxModel(new String[] {"Data Mining", "Software Engineer"}));
		makeArticleReviewAssignmentComboBoxCategory.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentComboBoxCategory.setBounds(20, 322, 409, 21);
		add(makeArticleReviewAssignmentComboBoxCategory);
		
		JTextArea makeArticleReviewAssignmentTextAreaFileUpload = new JTextArea();
		makeArticleReviewAssignmentTextAreaFileUpload.setText("\t\tNo File Chosen");
		makeArticleReviewAssignmentTextAreaFileUpload.setToolTipText("");
		makeArticleReviewAssignmentTextAreaFileUpload.setBounds(20, 376, 409, 30);
		add(makeArticleReviewAssignmentTextAreaFileUpload);
		
		JLabel makeArticleReviewAssignmentLabelFile = new JLabel("File (Docx / Doc / PDF)");
		makeArticleReviewAssignmentLabelFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelFile.setBounds(20, 353, 123, 13);
		add(makeArticleReviewAssignmentLabelFile);
		
		JRadioButton makeArticleReviewAssignmentFormRadioButtonBronze = new JRadioButton("Bronze (Rp. 100.000,00 per 100 kata)");
		makeArticleReviewAssignmentFormRadioButtonBronze.setForeground(SystemColor.textHighlight);
		makeArticleReviewAssignmentFormRadioButtonBronze.setBounds(20, 428, 199, 21);
		add(makeArticleReviewAssignmentFormRadioButtonBronze);
		
		JButton makeArticleReviewAssignmentFormButtonPesan = new JButton("Pesan");
		makeArticleReviewAssignmentFormButtonPesan.setForeground(UIManager.getColor("Button.focus"));
		makeArticleReviewAssignmentFormButtonPesan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentFormButtonPesan.setBounds(344, 619, 85, 21);
		add(makeArticleReviewAssignmentFormButtonPesan);
		
		JRadioButton makeArticleReviewAssignmentFormRadioButtonSilver = new JRadioButton("Silver (Rp. 200.000,00 per 1000 kata)");
		makeArticleReviewAssignmentFormRadioButtonSilver.setBounds(20, 451, 199, 21);
		add(makeArticleReviewAssignmentFormRadioButtonSilver);
		
		JLabel makeArticleReviewAssignmentFormLabelPaketHarga = new JLabel("Paket Harga");
		makeArticleReviewAssignmentFormLabelPaketHarga.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentFormLabelPaketHarga.setBounds(20, 409, 67, 13);
		add(makeArticleReviewAssignmentFormLabelPaketHarga);
		
		JLabel makeArticleReviewAssignmentLabelTotalKata = new JLabel("Total Kata");
		makeArticleReviewAssignmentLabelTotalKata.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelTotalKata.setBounds(20, 478, 75, 13);
		add(makeArticleReviewAssignmentLabelTotalKata);
		
		makeArticleReviewAssignmentFormTextBoxTotalKata = new JTextField();
		makeArticleReviewAssignmentFormTextBoxTotalKata.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentFormTextBoxTotalKata.setText("1000");
		makeArticleReviewAssignmentFormTextBoxTotalKata.setBounds(20, 501, 409, 19);
		add(makeArticleReviewAssignmentFormTextBoxTotalKata);
		makeArticleReviewAssignmentFormTextBoxTotalKata.setColumns(10);
		
		JLabel makeArticleReviewAssignmentLabelPembayaran = new JLabel("Pembayaran");
		makeArticleReviewAssignmentLabelPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentLabelPembayaran.setBounds(20, 530, 75, 13);
		add(makeArticleReviewAssignmentLabelPembayaran);
		
		JRadioButton makeArticleReviewAssignmentFormRadioButtonMandiri = new JRadioButton("Mandiri - Admin EReview 1 (123-123-123)");
		makeArticleReviewAssignmentFormRadioButtonMandiri.setBounds(20, 549, 219, 21);
		add(makeArticleReviewAssignmentFormRadioButtonMandiri);
		
		JRadioButton makeArticleReviewAssignmentFormRadioButtonBCA = new JRadioButton("BCA - Admin EReview 2 (456-456-456)");
		makeArticleReviewAssignmentFormRadioButtonBCA.setBounds(20, 572, 219, 21);
		add(makeArticleReviewAssignmentFormRadioButtonBCA);

	}
}
