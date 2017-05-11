import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AuthorForm1 {

	private JFrame frmAuthorInfo;
	private JTextField txtAuthoridtextfield;
	private JTextField txtFnameauthortextfield;
	private JTextField txtLnametextfield;
	private JTextField txtBirthdaytexfield;
	
	private AuthorsDriver driver;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthorForm1 window = new AuthorForm1();
					window.frmAuthorInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void ShowWindow()
	{
		this.frmAuthorInfo.setVisible(true);
	}
	
	public void HideWindow()
	{
		this.frmAuthorInfo.setVisible(false);
	}

	/**
	 * Create the application.
	 */
	public AuthorForm1() {
		initialize();
		driver = new AuthorsDriver();
		setFields(driver.GetFirstAuthor());
	}

	/**
	 * Initialize Form 1 the contents of the frame.
	 */
	private void initialize() {
		frmAuthorInfo = new JFrame();
		frmAuthorInfo.setTitle("Author Info.");
		frmAuthorInfo.setBounds(100, 100, 645, 402);
		frmAuthorInfo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmAuthorInfo.getContentPane().setLayout(null);
		
		JButton btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields(driver.GetFirstAuthor());
			}
		});
		btnFirst.setBounds(12, 292, 122, 50);
		frmAuthorInfo.getContentPane().add(btnFirst);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(driver.GetPrevAuthor());
			}
		});
		btnPrevious.setBounds(146, 292, 141, 50);
		frmAuthorInfo.getContentPane().add(btnPrevious);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(driver.GetNextAuthor());
			}
		});
		btnNext.setBounds(299, 292, 151, 50);
		frmAuthorInfo.getContentPane().add(btnNext);
		
		JButton btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFields(driver.GetLastAuthor());
			}
		});
		btnLast.setBounds(462, 292, 153, 50);
		frmAuthorInfo.getContentPane().add(btnLast);
		
		JLabel lblAuthorId = new JLabel("Author ID");
		lblAuthorId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAuthorId.setBounds(32, 38, 77, 28);
		frmAuthorInfo.getContentPane().add(lblAuthorId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstName.setBounds(32, 79, 102, 35);
		frmAuthorInfo.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLastName.setBounds(32, 135, 102, 28);
		frmAuthorInfo.getContentPane().add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDateOfBirth.setBounds(32, 190, 102, 35);
		frmAuthorInfo.getContentPane().add(lblDateOfBirth);
		
		txtAuthoridtextfield = new JTextField();
		txtAuthoridtextfield.setText("AuthorIDTextField");
		txtAuthoridtextfield.setBounds(132, 43, 247, 28);
		frmAuthorInfo.getContentPane().add(txtAuthoridtextfield);
		txtAuthoridtextfield.setColumns(10);
		
		txtFnameauthortextfield = new JTextField();
		txtFnameauthortextfield.setText("FNameAuthorTextField");
		txtFnameauthortextfield.setBounds(132, 86, 247, 25);
		frmAuthorInfo.getContentPane().add(txtFnameauthortextfield);
		txtFnameauthortextfield.setColumns(10);
		
		txtLnametextfield = new JTextField();
		txtLnametextfield.setText("LNameTextField");
		txtLnametextfield.setBounds(132, 140, 247, 25);
		frmAuthorInfo.getContentPane().add(txtLnametextfield);
		txtLnametextfield.setColumns(10);
		
		txtBirthdaytexfield = new JTextField();
		txtBirthdaytexfield.setText("BirthdayTexField");
		txtBirthdaytexfield.setBounds(132, 198, 247, 27);
		frmAuthorInfo.getContentPane().add(txtBirthdaytexfield);
		txtBirthdaytexfield.setColumns(10);
	}
	
	private void setFields(Author author)
	{
		txtAuthoridtextfield.setText(Integer.toString(author.getAuthorID()));
		txtFnameauthortextfield.setText(author.getFirstName());
		txtLnametextfield.setText(author.getLastName());
		txtBirthdaytexfield.setText(author.getBirthday());
	}
}
