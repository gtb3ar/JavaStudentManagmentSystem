package frontEnd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class mainPanel {

	public JFrame frame;
	private JTable staffTable;
	private JTable moduleTable;
	private JTable studentTable;
	private JTextField studentID;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField studentFirstname;
	private JLabel lblNewLabel_4;
	private JTextField studentAddress;
	private JTextField studentSurname;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_1;
	private JTextField staffID;
	private JLabel lblNewLabel_6;
	private JTextField staffFirstname;
	private JLabel lblNewLabel_7;
	private JTextField staffSurname;
	private JLabel lblNewLabel_8;
	private JTextField staffAddress;
	private JLabel lblNewLabel_9;
	private JTextField staffType;
	private JLabel lblNewLabel_10;
	private JTextField studentGrades;
	private JLabel lblNewLabel_11;
	private JTextField moduleID;
	private JLabel lblNewLabel_12;
	private JTextField moduleName;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPanel window = new mainPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the application.
	 */
	public mainPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 517, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel moduleLabel = new JLabel("Modules");
		moduleLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		moduleLabel.setBounds(10, 11, 168, 20);
		frame.getContentPane().add(moduleLabel);
		
		JLabel staffLabel = new JLabel("Staff");
		staffLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel.setBounds(322, 11, 168, 20);
		frame.getContentPane().add(staffLabel);
		
		String[] staffColumnNames = {"Staff ID","Firstname","Surname","Address","Type"};
		DefaultTableModel staffModel = new DefaultTableModel();
		staffModel.setColumnIdentifiers(staffColumnNames);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(322, 42, 168, 257);
		frame.getContentPane().add(scrollPane);
		staffTable = new JTable(staffModel);
		scrollPane.setViewportView(staffTable);
		staffTable.setBackground(Color.BLUE);
		staffTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 121, 168, 178);
		frame.getContentPane().add(scrollPane_1);
		
		String[] moduleColumnNames = {"Module ID","Module Name"};
		DefaultTableModel moduleModel = new DefaultTableModel();
		moduleModel.setColumnIdentifiers(moduleColumnNames);
		moduleTable = new JTable(moduleModel);
		scrollPane_1.setViewportView(moduleTable);
		moduleTable.setBackground(Color.BLUE);
		moduleTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton moduleAdd = new JButton("Add");
		moduleAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		moduleAdd.setBackground(new Color(0, 255, 0));
		moduleAdd.setBounds(10, 310, 84, 29);
		frame.getContentPane().add(moduleAdd);
		
		JButton moduleDelete = new JButton("Delete");
		moduleDelete.setBackground(new Color(128, 0, 0));
		moduleDelete.setBounds(94, 310, 84, 29);
		frame.getContentPane().add(moduleDelete);
		
		JButton staffAdd = new JButton("Add");
		staffAdd.setBackground(new Color(0, 255, 0));
		staffAdd.setBounds(322, 310, 84, 29);
		frame.getContentPane().add(staffAdd);
		
		JButton staffDelete = new JButton("Delete");
		staffDelete.setBackground(new Color(128, 0, 0));
		staffDelete.setBounds(406, 310, 84, 29);
		frame.getContentPane().add(staffDelete);
		
		JButton moduleEdit = new JButton("Edit");
		moduleEdit.setBackground(new Color(30, 144, 255));
		moduleEdit.setBounds(10, 341, 84, 29);
		frame.getContentPane().add(moduleEdit);
		
		JButton staffEdit = new JButton("Edit");
		staffEdit.setBackground(new Color(30, 144, 255));
		staffEdit.setBounds(322, 341, 84, 29);
		frame.getContentPane().add(staffEdit);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(144, 412, 346, 257);
		frame.getContentPane().add(scrollPane_2);
		
		String[] studentColumnNames = {"Student ID","Firstname","Surname","Address","Grades"};
		DefaultTableModel studentModel = new DefaultTableModel();
		studentModel.setColumnIdentifiers(studentColumnNames);
		studentTable = new JTable(studentModel);
		scrollPane_2.setViewportView(studentTable);
		studentTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel studentLabel = new JLabel("Students");
		studentLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		studentLabel.setBounds(144, 381, 328, 20);
		frame.getContentPane().add(studentLabel);
		
		JButton studentAdd = new JButton("Add");
		studentAdd.setBackground(Color.GREEN);
		studentAdd.setBounds(10, 609, 60, 29);
		frame.getContentPane().add(studentAdd);
		
		JButton studentDelete = new JButton("Delete");
		studentDelete.setBackground(new Color(128, 0, 0));
		studentDelete.setBounds(74, 609, 60, 29);
		frame.getContentPane().add(studentDelete);
		
		JButton studentEdit = new JButton("Edit");
		studentEdit.setBackground(new Color(30, 144, 255));
		studentEdit.setBounds(10, 640, 60, 29);
		frame.getContentPane().add(studentEdit);
		
		studentID = new JTextField();
		studentID.setColumns(10);
		studentID.setBounds(10, 418, 124, 20);
		frame.getContentPane().add(studentID);
		
		lblNewLabel_2 = new JLabel("Student ID");
		lblNewLabel_2.setBounds(10, 404, 84, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Firstname");
		lblNewLabel_3.setBounds(10, 443, 84, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		studentFirstname = new JTextField();
		studentFirstname.setColumns(10);
		studentFirstname.setBounds(10, 457, 124, 20);
		frame.getContentPane().add(studentFirstname);
		
		lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(10, 522, 84, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		studentAddress = new JTextField();
		studentAddress.setColumns(10);
		studentAddress.setBounds(10, 536, 124, 20);
		frame.getContentPane().add(studentAddress);
		
		studentSurname = new JTextField();
		studentSurname.setColumns(10);
		studentSurname.setBounds(10, 497, 124, 20);
		frame.getContentPane().add(studentSurname);
		
		lblNewLabel_5 = new JLabel("Surname");
		lblNewLabel_5.setBounds(10, 483, 84, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_1 = new JLabel("Staff ID");
		lblNewLabel_1.setBounds(188, 42, 84, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		staffID = new JTextField();
		staffID.setColumns(10);
		staffID.setBounds(188, 56, 124, 20);
		frame.getContentPane().add(staffID);
		
		lblNewLabel_6 = new JLabel("Firstname");
		lblNewLabel_6.setBounds(188, 81, 84, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		staffFirstname = new JTextField();
		staffFirstname.setColumns(10);
		staffFirstname.setBounds(188, 95, 124, 20);
		frame.getContentPane().add(staffFirstname);
		
		lblNewLabel_7 = new JLabel("Surname");
		lblNewLabel_7.setBounds(188, 121, 84, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		staffSurname = new JTextField();
		staffSurname.setColumns(10);
		staffSurname.setBounds(188, 135, 124, 20);
		frame.getContentPane().add(staffSurname);
		
		lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setBounds(188, 160, 84, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		staffAddress = new JTextField();
		staffAddress.setColumns(10);
		staffAddress.setBounds(188, 174, 124, 20);
		frame.getContentPane().add(staffAddress);
		
		lblNewLabel_9 = new JLabel("Staff Type");
		lblNewLabel_9.setBounds(188, 200, 84, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		staffType = new JTextField();
		staffType.setColumns(10);
		staffType.setBounds(188, 214, 124, 20);
		frame.getContentPane().add(staffType);
		
		lblNewLabel_10 = new JLabel("Assignment Grades");
		lblNewLabel_10.setBounds(10, 564, 124, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		studentGrades = new JTextField();
		studentGrades.setColumns(10);
		studentGrades.setBounds(10, 578, 124, 20);
		frame.getContentPane().add(studentGrades);
		
		lblNewLabel_11 = new JLabel("Module ID");
		lblNewLabel_11.setBounds(10, 37, 84, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		moduleID = new JTextField();
		moduleID.setColumns(10);
		moduleID.setBounds(10, 51, 124, 20);
		frame.getContentPane().add(moduleID);
		
		lblNewLabel_12 = new JLabel("Name");
		lblNewLabel_12.setBounds(10, 76, 84, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		moduleName = new JTextField();
		moduleName.setColumns(10);
		moduleName.setBounds(10, 90, 124, 20);
		frame.getContentPane().add(moduleName);
	}
}
