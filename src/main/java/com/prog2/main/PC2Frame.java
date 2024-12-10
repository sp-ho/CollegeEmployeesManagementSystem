package com.prog2.main;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PC2Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTeacherAddress;
	private JTextField tfTeacherPhone;
	private JTextField tfTeacherEmail;
	private JTextField tfTeacherGender;
	private JTextField tfTeacherHrWorked;
	private JTextField tfTeacherDegree;
	private JTextField tfTeacherSpecialty;
	private JTextField tfTeacherOffice;
	private JTextField tfTeacherLname;
	private JTextField tfTeacherFname;
	private JTextField tfTeacherID;
	private JTextField tfTeacherDeptId;
	private JTextField tfStaffAddress;
	private JTextField tfStaffPhone;
	private JTextField tfStaffEmail;
	private JTextField tfStaffGender;
	private JTextField tfStaffWorkLoad;
	private JTextField tfStaffDuty;
	private JTextField tfStaffOffice;
	private JTextField tfStaffLname;
	private JTextField tfStaffFname;
	private JTextField tfStaffID;
	private JTextField tfStaffDeptId;
	private JTable tableTeacher;
	private JTable tableStaff;
	private DefaultTableModel modelTeacher;
	private DefaultTableModel modelStaff;
	private static ArrayList<Department> departments;
	private boolean isTeacherDataDisplayed = false;
	private boolean isStaffDataDisplayed = false;
//	private static Department deptArt = new Department(1, "Art", new ArrayList<Teacher>(), new ArrayList<Staff>());
//	private static Department deptStat = new Department(2, "Statistics", new ArrayList<Teacher>(), new ArrayList<Staff>());
//	private static Department deptEng = new Department(3, "Engineering", new ArrayList<Teacher>(), new ArrayList<Staff>());
//	private static Department deptMech = new Department(4, "Mechanical", new ArrayList<Teacher>(), new ArrayList<Staff>());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PC2Frame frame = new PC2Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

//		System.out.println(departments.toString());
//		if(departments == null) 
//			departments = new ArrayList<Department>();
//			departments.add(deptArt);
//			departments.add(deptStat);
//			departments.add(deptEng);
//			departments.add(deptMech);
//			System.out.println(departments.toString());
	}

	public PC2Frame() {
		
		departments = UtilityMethods.deserialization();
//
//		if (this.departments == null)
//			System.out.println("It is null");
//		System.out.println(departments.toString());
		createContent() ;
		System.out.println(departments.toString());
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void createContent() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				UtilityMethods.serialization(departments);
			}
		});
		
		// title of frame
		setTitle("Ariana College Directory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 669);
		
		// panel of GUI
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 538, 608);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Teacher", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeacher.setBounds(22, 24, 87, 14);
		panel.add(lblTeacher);
		
		JLabel lblTeacherdeptID = new JLabel("Department ID:");
		lblTeacherdeptID.setBounds(22, 63, 87, 14);
		panel.add(lblTeacherdeptID);
		
		JLabel lblTeacherId = new JLabel("Teacher ID:");
		lblTeacherId.setBounds(22, 98, 87, 14);
		panel.add(lblTeacherId);
		
		JLabel lblTeacherLname = new JLabel("Last name:");
		lblTeacherLname.setBounds(22, 168, 87, 14);
		panel.add(lblTeacherLname);
		
		JLabel lblTeacherFname = new JLabel("First name:");
		lblTeacherFname.setBounds(22, 133, 87, 14);
		panel.add(lblTeacherFname);
		
		JLabel lblTeacherEmail = new JLabel("Email:");
		lblTeacherEmail.setBounds(22, 234, 66, 14);
		panel.add(lblTeacherEmail);
		
		JLabel lblTeacherGender = new JLabel("Gender:");
		lblTeacherGender.setBounds(22, 199, 76, 14);
		panel.add(lblTeacherGender);
		
		JLabel lblTeacherDegree = new JLabel("Degree:");
		lblTeacherDegree.setBounds(22, 407, 66, 14);
		panel.add(lblTeacherDegree);
		
		JLabel lblTeacherHrWorked = new JLabel("Hours worked:");
		lblTeacherHrWorked.setBounds(22, 442, 101, 14);
		panel.add(lblTeacherHrWorked);
		
		JLabel lblTeacherSpecialty = new JLabel("Specialty:");
		lblTeacherSpecialty.setBounds(22, 372, 66, 14);
		panel.add(lblTeacherSpecialty);
		
		JLabel lblTeacherOffice = new JLabel("Office:");
		lblTeacherOffice.setBounds(22, 337, 66, 14);
		panel.add(lblTeacherOffice);
		
		JLabel lblTeacherAddress = new JLabel("Address:");
		lblTeacherAddress.setBounds(22, 304, 66, 14);
		panel.add(lblTeacherAddress);
		
		JLabel lblTeacherPhone = new JLabel("Phone:");
		lblTeacherPhone.setBounds(22, 269, 66, 14);
		panel.add(lblTeacherPhone);
		
		JRadioButton rbDean = new JRadioButton("Dean");
		rbDean.setFont(new Font("Tahoma", Font.BOLD, 13));
		rbDean.setBounds(141, 20, 109, 23);
		panel.add(rbDean);
		
		tfTeacherAddress = new JTextField();
		tfTeacherAddress.setBounds(129, 301, 121, 20);
		panel.add(tfTeacherAddress);
		tfTeacherAddress.setColumns(10);
		
		tfTeacherPhone = new JTextField();
		tfTeacherPhone.setToolTipText("Please enter number");
		tfTeacherPhone.setColumns(10);
		tfTeacherPhone.setBounds(129, 266, 121, 20);
		panel.add(tfTeacherPhone);
		
		tfTeacherEmail = new JTextField();
		tfTeacherEmail.setColumns(10);
		tfTeacherEmail.setBounds(129, 231, 121, 20);
		panel.add(tfTeacherEmail);
		
		tfTeacherGender = new JTextField();
		tfTeacherGender.setColumns(10);
		tfTeacherGender.setBounds(129, 196, 121, 20);
		panel.add(tfTeacherGender);
		
		tfTeacherHrWorked = new JTextField();
		tfTeacherHrWorked.setToolTipText("Please enter number");
		tfTeacherHrWorked.setColumns(10);
		tfTeacherHrWorked.setBounds(129, 439, 121, 20);
		panel.add(tfTeacherHrWorked);
		
		tfTeacherDegree = new JTextField();
		tfTeacherDegree.setToolTipText("Please enter PhD, Master or Bachelor");
		tfTeacherDegree.setColumns(10);
		tfTeacherDegree.setBounds(129, 404, 121, 20);
		panel.add(tfTeacherDegree);
		
		tfTeacherSpecialty = new JTextField();
		tfTeacherSpecialty.setColumns(10);
		tfTeacherSpecialty.setBounds(129, 369, 121, 20);
		panel.add(tfTeacherSpecialty);
		
		tfTeacherOffice = new JTextField();
		tfTeacherOffice.setColumns(10);
		tfTeacherOffice.setBounds(129, 334, 121, 20);
		panel.add(tfTeacherOffice);
		
		tfTeacherLname = new JTextField();
		tfTeacherLname.setColumns(10);
		tfTeacherLname.setBounds(129, 165, 121, 20);
		panel.add(tfTeacherLname);
		
		tfTeacherFname = new JTextField();
		tfTeacherFname.setColumns(10);
		tfTeacherFname.setBounds(129, 130, 121, 20);
		panel.add(tfTeacherFname);
		
		tfTeacherID = new JTextField();
		tfTeacherID.setColumns(10);
		tfTeacherID.setBounds(129, 95, 121, 20);
		panel.add(tfTeacherID);
		
		tfTeacherDeptId = new JTextField();
		tfTeacherDeptId.setColumns(10);
		tfTeacherDeptId.setBounds(129, 60, 121, 20);
		panel.add(tfTeacherDeptId);
		
		JCheckBox cbFullTime = new JCheckBox("Full-time");
		cbFullTime.setBounds(22, 477, 76, 23);
		panel.add(cbFullTime);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 511, 230, 58);
		panel.add(scrollPane);
			
		JTextArea taTeacher = new JTextArea();
		scrollPane.setViewportView(taTeacher);
		taTeacher.setText("Status:\n");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Staff", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextArea taStaff = new JTextArea();
		taStaff.setBounds(23, 473, 227, 96);
		panel_1.add(taStaff);
		taStaff.setText("Status:\n");
		
		JLabel lblStaff = new JLabel("Staff");
		lblStaff.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStaff.setBounds(22, 24, 87, 14);
		panel_1.add(lblStaff);
		
		JLabel lblStaffdeptID = new JLabel("Department ID:");
		lblStaffdeptID.setBounds(22, 63, 87, 14);
		panel_1.add(lblStaffdeptID);
		
		JLabel lblStaffID = new JLabel("Staff ID:");
		lblStaffID.setBounds(22, 98, 87, 14);
		panel_1.add(lblStaffID);
		
		JLabel lblStaffLname = new JLabel("Last name:");
		lblStaffLname.setBounds(22, 168, 87, 14);
		panel_1.add(lblStaffLname);
		
		JLabel lblStaffFname = new JLabel("First name:");
		lblStaffFname.setBounds(22, 133, 87, 14);
		panel_1.add(lblStaffFname);
		
		JLabel lblStaffEmail = new JLabel("Email:");
		lblStaffEmail.setBounds(22, 234, 66, 14);
		panel_1.add(lblStaffEmail);
		
		JLabel lblStaffrGender = new JLabel("Gender:");
		lblStaffrGender.setBounds(22, 199, 76, 14);
		panel_1.add(lblStaffrGender);
		
		JLabel lblStaffWorkLoad = new JLabel("Workload:");
		lblStaffWorkLoad.setBounds(22, 407, 66, 14);
		panel_1.add(lblStaffWorkLoad);
		
		JLabel lblStaffDuty = new JLabel("Duty:");
		lblStaffDuty.setBounds(22, 372, 66, 14);
		panel_1.add(lblStaffDuty);
		
		JLabel lblStaffOffice = new JLabel("Office:");
		lblStaffOffice.setBounds(22, 337, 66, 14);
		panel_1.add(lblStaffOffice);
		
		JLabel lblStaffAddress = new JLabel("Address:");
		lblStaffAddress.setBounds(22, 304, 66, 14);
		panel_1.add(lblStaffAddress);
		
		JLabel lblStaffPhone = new JLabel("Phone:");
		lblStaffPhone.setBounds(22, 269, 66, 14);
		panel_1.add(lblStaffPhone);
		
		tfStaffAddress = new JTextField();
		tfStaffAddress.setColumns(10);
		tfStaffAddress.setBounds(129, 301, 121, 20);
		panel_1.add(tfStaffAddress);
		
		tfStaffPhone = new JTextField();
		tfStaffPhone.setToolTipText("Please enter number");
		tfStaffPhone.setColumns(10);
		tfStaffPhone.setBounds(129, 266, 121, 20);
		panel_1.add(tfStaffPhone);
		
		tfStaffEmail = new JTextField();
		tfStaffEmail.setColumns(10);
		tfStaffEmail.setBounds(129, 231, 121, 20);
		panel_1.add(tfStaffEmail);
		
		tfStaffGender = new JTextField();
		tfStaffGender.setColumns(10);
		tfStaffGender.setBounds(129, 196, 121, 20);
		panel_1.add(tfStaffGender);
		
		tfStaffWorkLoad = new JTextField();
		tfStaffWorkLoad.setToolTipText("Cannot exceed 40 hours");
		tfStaffWorkLoad.setColumns(10);
		tfStaffWorkLoad.setBounds(129, 404, 121, 20);
		panel_1.add(tfStaffWorkLoad);
		
		tfStaffDuty = new JTextField();
		tfStaffDuty.setColumns(10);
		tfStaffDuty.setBounds(129, 369, 121, 20);
		panel_1.add(tfStaffDuty);
		
		tfStaffOffice = new JTextField();
		tfStaffOffice.setColumns(10);
		tfStaffOffice.setBounds(129, 334, 121, 20);
		panel_1.add(tfStaffOffice);
		
		tfStaffLname = new JTextField();
		tfStaffLname.setColumns(10);
		tfStaffLname.setBounds(129, 165, 121, 20);
		panel_1.add(tfStaffLname);
		
		tfStaffFname = new JTextField();
		tfStaffFname.setColumns(10);
		tfStaffFname.setBounds(129, 130, 121, 20);
		panel_1.add(tfStaffFname);
		
		tfStaffID = new JTextField();
		tfStaffID.setColumns(10);
		tfStaffID.setBounds(129, 95, 121, 20);
		panel_1.add(tfStaffID);
		
		tfStaffDeptId = new JTextField();
		tfStaffDeptId.setColumns(10);
		tfStaffDeptId.setBounds(129, 60, 121, 20);
		panel_1.add(tfStaffDeptId);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(271, 63, 252, 506);
		panel_1.add(scrollPane_2);
		
		tableStaff = new JTable();
		scrollPane_2.setViewportView(tableStaff);
		modelStaff = new DefaultTableModel();
		Object[] columnStaff = { "ID", "Dept", "Fname", "Lname", "Salary" };
		modelStaff.setColumnIdentifiers(columnStaff);
		tableStaff.setModel(modelStaff);
		scrollPane_2.setViewportView(tableStaff);
		
		JScrollPane scrollPaneTeacher = new JScrollPane();
		scrollPaneTeacher.setBounds(271, 59, 252, 510);
		panel.add(scrollPaneTeacher);
		
		tableTeacher = new JTable();
		scrollPaneTeacher.setViewportView(tableTeacher);
		modelTeacher = new DefaultTableModel();
		Object[] columnTeacher = { "ID", "Dept", "Fname", "Lname", "Salary" };
		modelTeacher.setColumnIdentifiers(columnTeacher);
		tableTeacher.setModel(modelTeacher);
		scrollPaneTeacher.setViewportView(tableTeacher);
		
		JButton btnShowTeacher = new JButton("Show Teachers");
		btnShowTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isTeacherDataDisplayed) { // check if data has not been displayed				
				// retrieve teacher ID, fname, lname and salary from serialized file
					for(int i = 0; i < departments.size(); i++) {
						for (int j = 0; j < departments.get(i).getTeachers().size(); j++) {
						Object[] rowTeacher = {departments.get(i).getDeptId(),
										departments.get(i).getTeachers().get(j).getTeacherId(),
										departments.get(i).getTeachers().get(j).getFname(),
										departments.get(i).getTeachers().get(j).getLname(),
										departments.get(i).getTeachers().get(j).ComputePayRoll()};
						modelTeacher.addRow(rowTeacher);
						}
					}
				isTeacherDataDisplayed = true; // set flag to true
				}
			}
		});
		btnShowTeacher.setBounds(271, 21, 252, 23);
		panel.add(btnShowTeacher);
		
		JButton btnShowStaff = new JButton("Show Staffs");
		btnShowStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!isStaffDataDisplayed) { // check if data has not been displayed
					// retrieve staff ID, fname, lname and salary from serialized file
					for(int i = 0; i < departments.size(); i++) {
						for (int j = 0; j < departments.get(i).getStaffs().size(); j++) {
						Object[] rowStaff = {departments.get(i).getDeptId(),
										departments.get(i).getStaffs().get(j).getStaffId(),
										departments.get(i).getStaffs().get(j).getFname(),
										departments.get(i).getStaffs().get(j).getLname(),
										departments.get(i).getStaffs().get(j).ComputePayRoll()};
						modelStaff.addRow(rowStaff);
						}
					}
				isStaffDataDisplayed = true; // set flag to true
				}
			}
		});
		btnShowStaff.setBounds(271, 21, 252, 23);
		panel_1.add(btnShowStaff);
		
		JButton btnAddTeacher = new JButton("Add Teacher");
		btnAddTeacher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// create a teacher object when button is clicked
				try {
					// if dean radio button is selected
					if (rbDean.isSelected()) {
						Dean dean = new Dean(tfTeacherFname.getText(), tfTeacherLname.getText(),
								tfTeacherGender.getText(), tfTeacherEmail.getText(), tfTeacherPhone.getText(),
								tfTeacherAddress.getText(), tfTeacherOffice.getText(),
								Integer.valueOf(tfTeacherID.getText()), tfTeacherSpecialty.getText(),
								tfTeacherDegree.getText(), Double.parseDouble(tfTeacherHrWorked.getText()),
								cbFullTime.isSelected());
						
						// check if the dean already existed
						// if not, add the dean
						Department.addDean(dean, departments, tfTeacherDeptId, taTeacher);
					} else {
						Teacher teacher = new Teacher(tfTeacherFname.getText(), tfTeacherLname.getText(),
								tfTeacherGender.getText(), tfTeacherEmail.getText(), tfTeacherPhone.getText(),
								tfTeacherAddress.getText(), tfTeacherOffice.getText(),
								Integer.valueOf(tfTeacherID.getText()), tfTeacherSpecialty.getText(),
								tfTeacherDegree.getText(), Double.valueOf(tfTeacherHrWorked.getText()),
								cbFullTime.isSelected());
//						System.out.println(teacher.toString());

						// check if the dean already existed
						// if not, add the teacher
						Department.addTeacher(teacher, departments, tfTeacherDeptId, taTeacher);
					}
				} catch (InexistenceDeptException e1) {
					taTeacher.setText(e1.getMessage());
//					e1.printStackTrace();
				} catch (AlreadyExistsException e2) {
					taTeacher.setText(e2.getMessage());
//					e2.printStackTrace();
				} catch (Exception e3) {
					taTeacher.setText(e3.getMessage());
//					e3.printStackTrace();
				}
			}
		});
		btnAddTeacher.setBounds(129, 477, 121, 23);
		panel.add(btnAddTeacher);

		JButton btnAddStaff = new JButton("Add Staff");
		btnAddStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Staff staff = new Staff(tfStaffFname.getText(), tfStaffLname.getText(), tfStaffGender.getText(),
							tfStaffEmail.getText(), tfStaffPhone.getText(), tfStaffAddress.getText(),
							tfStaffOffice.getText(), Integer.valueOf(tfStaffID.getText()), tfStaffDuty.getText(),
							Double.parseDouble(tfStaffWorkLoad.getText()));
					
					// check if staff is existed
					// if not, add the staff
					Department.addStaff(staff, departments, tfStaffDeptId, taStaff);
				} catch (InexistenceDeptException e1) {
					taStaff.setText(e1.getMessage());
					// e1.printStackTrace();
				} catch (AlreadyExistsException e2) {
					taStaff.setText(e2.getMessage());
					// e2.printStackTrace();
				} catch (Exception e3) {
					taStaff.setText(e3.getMessage());
					// e3.printStackTrace();
				}
			}
		});
		btnAddStaff.setBounds(129, 435, 121, 23);
		panel_1.add(btnAddStaff);
	}
}
