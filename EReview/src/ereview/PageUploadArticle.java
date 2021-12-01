package ereview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class PageUploadArticle extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PageUploadArticle() {
		setLayout(null);
		
		JLabel UploadArticleLabelDaftarReview = new JLabel("Daftar Review");
		UploadArticleLabelDaftarReview.setFont(new Font("Times New Roman", Font.BOLD, 16));
		UploadArticleLabelDaftarReview.setBounds(10, 10, 112, 25);
		add(UploadArticleLabelDaftarReview);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Invoice", "Editor", "Tanggal Pemesanan", "Status", "Action"
			}
		));
		table.setBounds(20, 165, 420, -119);
		add(table);
		
		JButton uploadArticleButtonUploadReviewedArticle = new JButton("Upload Reviewed Article");
		uploadArticleButtonUploadReviewedArticle.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		uploadArticleButtonUploadReviewedArticle.setBounds(264, 269, 176, 21);
		add(uploadArticleButtonUploadReviewedArticle);

	}

}
