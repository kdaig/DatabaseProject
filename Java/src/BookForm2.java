import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookForm2 {

	private JFrame frmBookForm;
	private JTextField txtTitletextfield;
	private JTextField txtGenretextfield;
	private JTextField txtAuthortextfield;
	private BookDriver bdriver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookForm2 window = new BookForm2();
					window.frmBookForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void ShowWindow()
	{
		this.frmBookForm.setVisible(true);
	}
	
	public void HideWindow()
	{
		this.frmBookForm.setVisible(false);
	}

	/**
	 * Create the application.
	 */
	public BookForm2() {
		initialize();
		bdriver = new BookDriver();
		setFields(bdriver.GetFirstBook());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookForm = new JFrame();
		frmBookForm.setTitle("Book Form 2");
		frmBookForm.setBounds(100, 100, 464, 341);
		frmBookForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmBookForm.getContentPane().setLayout(null);
		
		JLabel lblBookTitle = new JLabel("Title");
		lblBookTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBookTitle.setBounds(36, 32, 68, 19);
		frmBookForm.getContentPane().add(lblBookTitle);
		
		JLabel lblBookGenre = new JLabel("Genre");
		lblBookGenre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBookGenre.setBounds(36, 96, 68, 25);
		frmBookForm.getContentPane().add(lblBookGenre);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAuthor.setBounds(36, 153, 88, 32);
		frmBookForm.getContentPane().add(lblAuthor);
		
		JButton btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(bdriver.GetFirstBook());
			}
		});
		btnFirst.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnFirst.setBounds(12, 237, 97, 43);
		frmBookForm.getContentPane().add(btnFirst);
		
		JButton btnPervious = new JButton("Pervious");
		btnPervious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(bdriver.GetPrevBook());
			}
		});
		btnPervious.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPervious.setBounds(121, 237, 97, 43);
		frmBookForm.getContentPane().add(btnPervious);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(bdriver.GetNextBook());
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNext.setBounds(214, 237, 97, 43);
		frmBookForm.getContentPane().add(btnNext);
		
		JButton btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(bdriver.GetLastBook());
			}
		});
		btnLast.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLast.setBounds(323, 237, 107, 43);
		frmBookForm.getContentPane().add(btnLast);
		
		txtTitletextfield = new JTextField();
		txtTitletextfield.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtTitletextfield.setText("TitleTextField");
		txtTitletextfield.setBounds(136, 26, 271, 32);
		frmBookForm.getContentPane().add(txtTitletextfield);
		txtTitletextfield.setColumns(10);
		
		txtGenretextfield = new JTextField();
		txtGenretextfield.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtGenretextfield.setText("GenreTextField");
		txtGenretextfield.setBounds(136, 93, 271, 28);
		frmBookForm.getContentPane().add(txtGenretextfield);
		txtGenretextfield.setColumns(10);
		
		txtAuthortextfield = new JTextField();
		txtAuthortextfield.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtAuthortextfield.setText("AuthorTextField");
		txtAuthortextfield.setBounds(136, 150, 271, 35);
		frmBookForm.getContentPane().add(txtAuthortextfield);
		txtAuthortextfield.setColumns(10);
	}

	private void setFields(Book book)
	{
		txtTitletextfield.setText(book.getTitle());
		txtGenretextfield.setText(book.getGenre());
		txtAuthortextfield.setText(book.getAuthorFName() + " " + book.getAuthorLName());
	}
}
