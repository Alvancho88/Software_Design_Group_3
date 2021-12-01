package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class ArticleReviewAssignmentForm extends JPanel {

	/**
	 * Create the panel.
	 */
	public ArticleReviewAssignmentForm() {
		setLayout(null);
		
		JButton sendProofOfPaymentButtonChooseFile = new JButton("Choose File");
		sendProofOfPaymentButtonChooseFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sendProofOfPaymentButtonChooseFile.setBounds(20, 95, 103, 21);
		add(sendProofOfPaymentButtonChooseFile);
		
		JLabel sendProofOfPaymentFormLabelKonfirmasi = new JLabel("Konfirmasi");
		sendProofOfPaymentFormLabelKonfirmasi.setFont(new Font("Times New Roman", Font.BOLD, 16));
		sendProofOfPaymentFormLabelKonfirmasi.setBounds(10, 10, 103, 20);
		add(sendProofOfPaymentFormLabelKonfirmasi);
		
		JLabel sendProofOfPaymentFormLabelUploadText = new JLabel("Upload bukti pembayaran anda dan konfirmasi pembayaran disini");
		sendProofOfPaymentFormLabelUploadText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sendProofOfPaymentFormLabelUploadText.setBounds(10, 40, 394, 13);
		add(sendProofOfPaymentFormLabelUploadText);
		
		JLabel sendProofOfPaymentFormLabelBuktiPembayaran = new JLabel("Bukti Pembayaran");
		sendProofOfPaymentFormLabelBuktiPembayaran.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sendProofOfPaymentFormLabelBuktiPembayaran.setBounds(10, 63, 214, 13);
		add(sendProofOfPaymentFormLabelBuktiPembayaran);
		
		JTextPane sendProofOfPaymentTextPaneFileStatus = new JTextPane();
		sendProofOfPaymentTextPaneFileStatus.setText("\r\n\t\tNo File Chosen");
		sendProofOfPaymentTextPaneFileStatus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sendProofOfPaymentTextPaneFileStatus.setBounds(10, 86, 410, 40);
		add(sendProofOfPaymentTextPaneFileStatus);
		
		JButton sendProofOfPaymentButtonCancel = new JButton("Cancel");
		sendProofOfPaymentButtonCancel.setBounds(260, 169, 85, 21);
		add(sendProofOfPaymentButtonCancel);
		
		JButton sendProofOfPaymentButtonSubmit = new JButton("Submit");
		sendProofOfPaymentButtonSubmit.setBounds(355, 169, 85, 21);
		add(sendProofOfPaymentButtonSubmit);

	}
}
