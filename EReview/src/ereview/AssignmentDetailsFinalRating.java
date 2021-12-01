package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AssignmentDetailsFinalRating extends JPanel {

	/**
	 * Create the panel.
	 */
	public AssignmentDetailsFinalRating() {
		setLayout(null);
		
		JLabel viewAssignmentHistoryLabelInvoice = new JLabel("Invoice");
		viewAssignmentHistoryLabelInvoice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		viewAssignmentHistoryLabelInvoice.setBounds(10, 10, 105, 24);
		add(viewAssignmentHistoryLabelInvoice);
		
		JLabel viewAssignmentHistoryLabelAssignmentStatus = new JLabel("Assignment Status : Waiting for Rating");
		viewAssignmentHistoryLabelAssignmentStatus.setFont(new Font("Times New Roman", Font.BOLD, 12));
		viewAssignmentHistoryLabelAssignmentStatus.setBounds(10, 44, 223, 13);
		add(viewAssignmentHistoryLabelAssignmentStatus);
		
		JLabel viewAssignmentHistoryLabelAssignmentSummary = new JLabel("Assignment Summary");
		viewAssignmentHistoryLabelAssignmentSummary.setFont(new Font("Times New Roman", Font.BOLD, 12));
		viewAssignmentHistoryLabelAssignmentSummary.setBounds(10, 124, 145, 13);
		add(viewAssignmentHistoryLabelAssignmentSummary);
		
		JLabel viewAssignmentHistoryLabelArticleFile = new JLabel("Article File");
		viewAssignmentHistoryLabelArticleFile.setFont(new Font("Times New Roman", Font.BOLD, 12));
		viewAssignmentHistoryLabelArticleFile.setBounds(10, 253, 105, 13);
		add(viewAssignmentHistoryLabelArticleFile);
		
		JLabel viewAssignmentHistoryLabelProofOfPayment = new JLabel("ProofOfPayment");
		viewAssignmentHistoryLabelProofOfPayment.setFont(new Font("Times New Roman", Font.BOLD, 12));
		viewAssignmentHistoryLabelProofOfPayment.setBounds(10, 301, 99, 13);
		add(viewAssignmentHistoryLabelProofOfPayment);
		
		JLabel viewAssignmentHistoryLabelReviewedArticle = new JLabel("Reviewed Article");
		viewAssignmentHistoryLabelReviewedArticle.setFont(new Font("Times New Roman", Font.BOLD, 12));
		viewAssignmentHistoryLabelReviewedArticle.setBounds(10, 350, 105, 13);
		add(viewAssignmentHistoryLabelReviewedArticle);
		
		JButton viewAssignmentHistoryButtonConfirmAndRateReviewer = new JButton("Confirm Work & Rate Reviewer");
		viewAssignmentHistoryButtonConfirmAndRateReviewer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		viewAssignmentHistoryButtonConfirmAndRateReviewer.setBounds(240, 469, 200, 21);
		add(viewAssignmentHistoryButtonConfirmAndRateReviewer);

	}

}
