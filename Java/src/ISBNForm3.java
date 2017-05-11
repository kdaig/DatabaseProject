import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ISBNForm3 {

	private JFrame frmIsbnSearch;
	private JTextField txtIsbnsearch;
	private JTextField txtRstitle;
	private JTextField txtRsauthor;
	private ISBNDriver isbndriver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ISBNForm3 window = new ISBNForm3();
					window.frmIsbnSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void ShowWindow()
	{
		this.frmIsbnSearch.setVisible(true);
	}
	
	public void HideWindow()
	{
		this.frmIsbnSearch.setVisible(false);
	}

	/**
	 * Create the application.
	 */
	public ISBNForm3() {
		initialize();
		isbndriver = new ISBNDriver();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIsbnSearch = new JFrame();
		frmIsbnSearch.setTitle("ISBN Search");
		frmIsbnSearch.setBounds(100, 100, 547, 376);
		frmIsbnSearch.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmIsbnSearch.getContentPane().setLayout(null);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIsbn.setBounds(49, 36, 56, 16);
		frmIsbnSearch.getContentPane().add(lblIsbn);
		
		txtIsbnsearch = new JTextField();
		txtIsbnsearch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtIsbnsearch.setText("");
		txtIsbnsearch.setBounds(45, 65, 436, 51);
		frmIsbnSearch.getContentPane().add(txtIsbnsearch);
		txtIsbnsearch.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				setFields(isbndriver.GetBookByISBN(txtIsbnsearch.getText()));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(49, 129, 432, 41);
		frmIsbnSearch.getContentPane().add(btnNewButton);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setBounds(45, 198, 60, 27);
		frmIsbnSearch.getContentPane().add(lblTitle);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAuthor.setBounds(49, 253, 69, 51);
		frmIsbnSearch.getContentPane().add(lblAuthor);
		
		txtRstitle = new JTextField();
		txtRstitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtRstitle.setText("");
		txtRstitle.setBounds(179, 190, 302, 44);
		frmIsbnSearch.getContentPane().add(txtRstitle);
		txtRstitle.setColumns(10);
		
		txtRsauthor = new JTextField();
		txtRsauthor.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtRsauthor.setText("");
		txtRsauthor.setBounds(179, 258, 302, 41);
		frmIsbnSearch.getContentPane().add(txtRsauthor);
		txtRsauthor.setColumns(10);
	}
	private void setFields(Book book)
	{
		txtRstitle.setText(book.getTitle());
		txtRsauthor.setText(book.getAuthorFName() + " " + book.getAuthorLName());
	}
}
