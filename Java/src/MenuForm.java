import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuForm {

	private JFrame frmMenuform;
	private AuthorForm1 authorWindow;
	private BookForm2 bookWindow;
	private ISBNForm3 isbnWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuForm window = new MenuForm();
					window.frmMenuform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuForm() {
		initialize();
		authorWindow = new AuthorForm1();
		bookWindow = new BookForm2();
		isbnWindow = new ISBNForm3();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuform = new JFrame();
		frmMenuform.setTitle("Menu Form");
		frmMenuform.setBounds(100, 100, 362, 317);
		frmMenuform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuform.getContentPane().setLayout(null);
		
		JButton btnAuthors = new JButton("Authors");
		btnAuthors.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAuthors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				authorWindow.ShowWindow();
			}
		});
		btnAuthors.setBounds(12, 27, 320, 64);
		frmMenuform.getContentPane().add(btnAuthors);
		
		JButton btnBooks = new JButton("Books");
		btnBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bookWindow.ShowWindow();
			}
		});
		btnBooks.setBounds(12, 113, 320, 64);
		frmMenuform.getContentPane().add(btnBooks);
		
		JButton btnIsbnSearch = new JButton("ISBN Search");
		btnIsbnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isbnWindow.ShowWindow();
			}
		});
		btnIsbnSearch.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnIsbnSearch.setBounds(12, 190, 320, 70);
		frmMenuform.getContentPane().add(btnIsbnSearch);
	}

}
