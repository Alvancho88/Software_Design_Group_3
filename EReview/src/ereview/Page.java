package ereview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Panel;

public class Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page frame = new Page();
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
	public Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu makeArticleReviewAssignmentMenu = new JMenu("Make Article Review Assignment");
		menuBar.add(makeArticleReviewAssignmentMenu);
		
		JPanel panel = new JPanel();
		makeArticleReviewAssignmentMenu.add(panel);
		
		JMenu assignmentVerificationMenu = new JMenu("Assignment Verification");
		menuBar.add(assignmentVerificationMenu);
		
		JMenu assignmentHistoryMenu = new JMenu("Assignment History");
		menuBar.add(assignmentHistoryMenu);
		
		JMenu uploadArticle = new JMenu("Upload Article");
		menuBar.add(uploadArticle);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
