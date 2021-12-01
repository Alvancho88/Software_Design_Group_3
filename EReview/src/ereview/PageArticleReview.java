package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PageArticleReview extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PageArticleReview() {
		setLayout(null);
		
		JLabel makeArticleReviewAssignmentFormLabelDaftarTransaksi = new JLabel("Daftar Transaksi");
		makeArticleReviewAssignmentFormLabelDaftarTransaksi.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		makeArticleReviewAssignmentFormLabelDaftarTransaksi.setBounds(10, 10, 142, 25);
		add(makeArticleReviewAssignmentFormLabelDaftarTransaksi);
		
		JButton makeArticleReviewAssignmentButtonBuatPesanan = new JButton("Buat Pesanan");
		makeArticleReviewAssignmentButtonBuatPesanan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		makeArticleReviewAssignmentButtonBuatPesanan.setBounds(315, 10, 125, 21);
		add(makeArticleReviewAssignmentButtonBuatPesanan);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 259, 430, -203);
		add(table);

	}

}
