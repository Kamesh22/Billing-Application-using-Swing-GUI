package digital.assignment;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bill_template {

	protected static final  String[] row = new String[5];
	private JFrame frmBillingApplication;
	private JTextField InvoiceNo;
	private JTextField name;
	private JTextField address;
	private JTextField address1;
	private JTextField phoneNo;
	private JTextField InvoiceDate;
	private JTextField slNO;
	private JTextField quantity;
	private JTextField description;
	private JTextField rate;
	private JTable table;
	DefaultTableModel model;
	private JTextField totalBill;
	
	/**
	 * Create the application.
	 */
	public Bill_template() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBillingApplication = new JFrame();
		frmBillingApplication.setTitle("Billing Application");
		frmBillingApplication.setBounds(100, 100, 502, 538);
		frmBillingApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBillingApplication.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 491, 499);
		frmBillingApplication.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblInvoiceNo = new JLabel("Invoice No:");
		lblInvoiceNo.setBounds(25, 128, 67, 14);
		panel.add(lblInvoiceNo);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(25, 153, 67, 14);
		panel.add(lblName);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setBounds(25, 178, 67, 14);
		panel.add(lblAddress);
		
		JLabel lblInvoiceDate = new JLabel("Invoice Date :");
		lblInvoiceDate.setBounds(320, 128, 83, 14);
		panel.add(lblInvoiceDate);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setBounds(197, 205, 83, 14);
		panel.add(lblPhoneNumber);
		
		JLabel lblCompany = new JLabel("R.K SuperMarket");
		lblCompany.setForeground(new Color(0, 0, 139));
		lblCompany.setBackground(new Color(0, 0, 0));
		lblCompany.setFont(new Font("Sitka Heading", Font.PLAIN, 20));
		lblCompany.setBounds(197, 11, 151, 22);
		panel.add(lblCompany);
		
		JLabel lblSlogan = new JLabel("Discover new things");
		lblSlogan.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSlogan.setForeground(new Color(0, 0, 255));
		lblSlogan.setHorizontalAlignment(SwingConstants.LEFT);
		lblSlogan.setBounds(218, 32, 104, 14);
		panel.add(lblSlogan);
		
		JLabel lblComAddress = new JLabel("34/5,Opposite to ATM,Thorapadi, Vellore - 02");
		lblComAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblComAddress.setBounds(104, 57, 302, 14);
		panel.add(lblComAddress);
		
		JLabel lblContact = new JLabel("9360632511, 9360632512");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setBounds(173, 78, 175, 14);
		panel.add(lblContact);
		
		JLabel lblmailWeb = new JLabel("rksupermarket@gmail.com, www.rksupermarket.com");
		lblmailWeb.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblmailWeb.setBounds(135, 96, 257, 14);
		panel.add(lblmailWeb);
		
		JLabel lblInvoice1 = new JLabel("INVOICE");
		lblInvoice1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInvoice1.setForeground(new Color(0, 0, 0));
		lblInvoice1.setBounds(217, 126, 73, 14);
		panel.add(lblInvoice1);
		
		InvoiceNo = new JTextField();
		InvoiceNo.setBounds(90, 125, 86, 20);
		panel.add(InvoiceNo);
		InvoiceNo.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(90, 150, 391, 20);
		panel.add(name);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(90, 175, 391, 20);
		panel.add(address);
		
		address1 = new JTextField();
		address1.setColumns(10);
		address1.setBounds(25, 202, 162, 20);
		panel.add(address1);
		
		phoneNo = new JTextField();
		phoneNo.setColumns(10);
		phoneNo.setBounds(290, 202, 191, 20);
		panel.add(phoneNo);
		
		InvoiceDate = new JTextField();
		InvoiceDate.setColumns(10);
		InvoiceDate.setBounds(395, 125, 86, 20);
		panel.add(InvoiceDate);
		
		JLabel lblSerial = new JLabel("Sl. No:");
		lblSerial.setBounds(25, 244, 46, 14);
		panel.add(lblSerial);
		
		JLabel lblDescrip = new JLabel("Description :");
		lblDescrip.setBounds(173, 244, 67, 14);
		panel.add(lblDescrip);
		
		JLabel lblquan = new JLabel("Quantity: ");
		lblquan.setBounds(25, 269, 57, 14);
		panel.add(lblquan);
		
		JLabel lblNewRate = new JLabel("Rate :");
		lblNewRate.setBounds(173, 269, 57, 14);
		panel.add(lblNewRate);
		
		slNO = new JTextField();
		slNO.setBounds(62, 241, 57, 20);
		panel.add(slNO);
		slNO.setColumns(10);
		
		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(72, 266, 57, 20);
		panel.add(quantity);
		
		description = new JTextField();
		description.setColumns(10);
		description.setBounds(237, 241, 244, 20);
		panel.add(description);
		
		rate = new JTextField();
		rate.setColumns(10);
		rate.setBounds(218, 269, 83, 20);
		panel.add(rate);
		
		JButton btnCalculateButton = new JButton("Calculate Bill");
		btnCalculateButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(slNO.getText().equals("") || description.getText().equals("") || quantity.getText().equals("") || rate.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				}
				else {
					row[0]=slNO.getText();	
					row[1]=description.getText();
					row[2]=quantity.getText();
					row[3]=rate.getText();
					
					double qty=Double.parseDouble(quantity.getText());
					double rate1=Double.parseDouble(rate.getText());
					double amount1=qty*rate1;
					row[4]=amount1+"";
					model.addRow(row);
					
					slNO.setText("");
					description.setText("");
					quantity.setText("");
					rate.setText("");
					JOptionPane.showMessageDialog(null, "Amount Calculated Successfully");
				
				}
			
			}
		});
		btnCalculateButton.setBounds(350, 265, 117, 23);
		panel.add(btnCalculateButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 314, 456, 144);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(175, 238, 238));
		model = new DefaultTableModel();
		Object[] column = {"Sl.No.","Description","Qty.","Rate","Amount"};
		Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnTotalButton = new JButton("Total Amount");
		btnTotalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total=0;
				for(int i=0;i<table.getRowCount();i++)
				{
					double Total_amt=Double.parseDouble(table.getValueAt(i, 4)+"");
					total +=Total_amt;
					String totalAmount=total+"";
					totalBill.setText(totalAmount);		
				}
				JOptionPane.showMessageDialog(null, "Total Amount Calculated Successfully");
			}
		});
		btnTotalButton.setBounds(275, 465, 117, 23);
		panel.add(btnTotalButton);
		
		totalBill = new JTextField();
		totalBill.setBounds(395, 466, 86, 20);
		panel.add(totalBill);
		totalBill.setColumns(10);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill_template window = new Bill_template();
					window.frmBillingApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
