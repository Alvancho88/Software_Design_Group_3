package ereview;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MakeArticleReviewAssignmentConfirmationMessage extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MakeArticleReviewAssignmentConfirmationMessage dialog = new MakeArticleReviewAssignmentConfirmationMessage();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MakeArticleReviewAssignmentConfirmationMessage() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel makeArticleReviewAssignmentLabelConfirmationMessage = new JLabel("Do you really want to create \r\nthe article review assignment?");
			makeArticleReviewAssignmentLabelConfirmationMessage.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			makeArticleReviewAssignmentLabelConfirmationMessage.setBounds(24, 27, 389, 117);
			contentPanel.add(makeArticleReviewAssignmentLabelConfirmationMessage);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
//		final JOptionPane optionPane = new JOptionPane(
//			    "The only way to close this dialog is by\n"
//			    + "pressing one of the following buttons.\n"
//			    + "Do you understand?",
//			    JOptionPane.QUESTION_MESSAGE,
//			    JOptionPane.YES_NO_OPTION);
		
	}

}
