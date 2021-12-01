package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AssignmentDetails extends JPanel {

	/**
	 * Create the panel.
	 */
	public AssignmentDetails() {
		setLayout(null);
		
		JLabel sendProofOfPaymentLabelInvoice = new JLabel("Invoice");
		sendProofOfPaymentLabelInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		sendProofOfPaymentLabelInvoice.setBounds(10, 10, 122, 24);
		add(sendProofOfPaymentLabelInvoice);
		
		JButton sendProofOfPaymentButtonKonfirmasiPembayaran = new JButton("Konfirmasi Pembayaran");
		sendProofOfPaymentButtonKonfirmasiPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		sendProofOfPaymentButtonKonfirmasiPembayaran.setBounds(185, 478, 200, 21);
		add(sendProofOfPaymentButtonKonfirmasiPembayaran);

	}

}
