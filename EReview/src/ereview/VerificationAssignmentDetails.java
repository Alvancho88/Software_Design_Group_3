package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VerificationAssignmentDetails extends JPanel {

	/**
	 * Create the panel.
	 */
	public VerificationAssignmentDetails() {
		setLayout(null);
		
		JLabel VerificationAssignmentLabelInvoice = new JLabel("Invoice");
		VerificationAssignmentLabelInvoice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		VerificationAssignmentLabelInvoice.setBounds(10, 10, 141, 30);
		add(VerificationAssignmentLabelInvoice);
		
		JButton VerificationAssignmentButtonKonfirmasiPesanan = new JButton("Konfirmasi Pesanan");
		VerificationAssignmentButtonKonfirmasiPesanan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		VerificationAssignmentButtonKonfirmasiPesanan.setBounds(313, 269, 127, 21);
		add(VerificationAssignmentButtonKonfirmasiPesanan);
		
		JButton VerificationAssignmentButton = new JButton("Batalkan Pesanan");
		VerificationAssignmentButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		VerificationAssignmentButton.setBounds(176, 269, 127, 21);
		add(VerificationAssignmentButton);
		
		JComboBox VerificationAssignmentDropdownChangeReviewer = new JComboBox();
		VerificationAssignmentDropdownChangeReviewer.setModel(new DefaultComboBoxModel(new String[] {"Change Reviewer", "Reviewer 1", "Reviewer 2"}));
		VerificationAssignmentDropdownChangeReviewer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		VerificationAssignmentDropdownChangeReviewer.setBounds(10, 101, 430, 21);
		add(VerificationAssignmentDropdownChangeReviewer);
		
		JLabel AssignmentVerificationLabelTitle = new JLabel("Konfirmasi Pesanan");
		AssignmentVerificationLabelTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		AssignmentVerificationLabelTitle.setBounds(216, 10, 224, 30);
		add(AssignmentVerificationLabelTitle);
		
		JLabel VerificationAssignmentLabelChooseReviewer = new JLabel("Choose Reviewer");
		VerificationAssignmentLabelChooseReviewer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		VerificationAssignmentLabelChooseReviewer.setBounds(10, 60, 100, 30);
		add(VerificationAssignmentLabelChooseReviewer);

	}

}
