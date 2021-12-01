package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class UploadArticleForm extends JPanel {

	/**
	 * Create the panel.
	 */
	public UploadArticleForm() {
		setLayout(null);
		
		JButton UploadArticleFormButtonUploadArticleFile = new JButton("Upload Reviewed Article File");
		UploadArticleFormButtonUploadArticleFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UploadArticleFormButtonUploadArticleFile.setBounds(20, 215, 171, 21);
		add(UploadArticleFormButtonUploadArticleFile);
		
		JLabel UploadArticleFormLabelTitle = new JLabel("Upload Article");
		UploadArticleFormLabelTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UploadArticleFormLabelTitle.setBounds(10, 10, 125, 24);
		add(UploadArticleFormLabelTitle);
		
		JLabel UploadArticleFormLabelRevisionDetails = new JLabel("Revision Detail");
		UploadArticleFormLabelRevisionDetails.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UploadArticleFormLabelRevisionDetails.setBounds(10, 44, 111, 24);
		add(UploadArticleFormLabelRevisionDetails);
		
		JTextArea UploadArticleFormTextBoxRevisionDetailsInformation = new JTextArea();
		UploadArticleFormTextBoxRevisionDetailsInformation.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		UploadArticleFormTextBoxRevisionDetailsInformation.setText("Revision Details Information");
		UploadArticleFormTextBoxRevisionDetailsInformation.setBounds(10, 78, 430, 80);
		add(UploadArticleFormTextBoxRevisionDetailsInformation);
		
		JLabel UploadArticleFormLabelUploadArticleFile = new JLabel("Upload Reviewed Article File");
		UploadArticleFormLabelUploadArticleFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UploadArticleFormLabelUploadArticleFile.setBounds(10, 168, 171, 24);
		add(UploadArticleFormLabelUploadArticleFile);
		
		JTextArea txtrNoFileUploaded = new JTextArea();
		txtrNoFileUploaded.setText("\r\n\t\t\tNo File Uploaded Yet");
		txtrNoFileUploaded.setBounds(10, 202, 430, 50);
		add(txtrNoFileUploaded);
		
		JButton UploadArticleFormButtonConfirm = new JButton("Confirm");
		UploadArticleFormButtonConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UploadArticleFormButtonConfirm.setBounds(355, 269, 85, 21);
		add(UploadArticleFormButtonConfirm);
		
		JButton UploadArticleButtonCancel = new JButton("Cancel");
		UploadArticleButtonCancel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UploadArticleButtonCancel.setBounds(260, 269, 85, 21);
		add(UploadArticleButtonCancel);

	}

}
