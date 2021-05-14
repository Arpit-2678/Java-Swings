// A simple registration form


package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Registration Form");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);

		JLabel l1 = new JLabel("Registration Form");
		l1.setBounds(270, 10, 200, 50);
		Font f1 = new Font("Verdana", Font.BOLD, 16);
		l1.setFont(f1);
		c.add(l1);
		JLabel l2 = new JLabel("Name ");
		l2.setBounds(10, 70, 100, 30);
		Font f2 = new Font("Gothic", Font.BOLD, 14);
		l2.setFont(f2);
		c.add(l2);
		JTextField jt1 = new JTextField();
		jt1.setBounds(140, 75, 120, 20);
		c.add(jt1);
		JLabel l3 = new JLabel("Mobile No.");
		l3.setBounds(10, 120, 100, 30);
		Font f3 = new Font("Gothic", Font.BOLD, 14);
		l3.setFont(f3);
		c.add(l3);
		JTextField jt2 = new JTextField();
		jt2.setBounds(140, 125, 120, 20);
		c.add(jt2);
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(10, 170, 100, 30);
		Font f4 = new Font("Gothic", Font.BOLD, 14);
		l4.setFont(f4);
		c.add(l4);
		JRadioButton bt1 = new JRadioButton("Male");
		bt1.setBounds(135, 175, 55, 30);
		c.add(bt1);
		JRadioButton bt2 = new JRadioButton("Female");
		bt2.setBounds(200, 175, 70, 30);
		c.add(bt2);
		JRadioButton bt3 = new JRadioButton("Other");
		bt3.setBounds(280, 175, 70, 30);
		c.add(bt3);
		ButtonGroup bg = new ButtonGroup();
		bg.add(bt1);
		bg.add(bt2);
		bg.add(bt1);
		JLabel l5 = new JLabel("DOB");
		l5.setBounds(10, 220, 100, 30);
		Font f5 = new Font("Gothic", Font.BOLD, 14);
		l5.setFont(f5);
		c.add(l5);
		String[] date = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		JComboBox jBox = new JComboBox<>(date);
		jBox.setBounds(140, 225, 50, 30);
		c.add(jBox);
		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		JComboBox jBox1 = new JComboBox<>(month);
		jBox1.setBounds(200, 225, 50, 30);
		c.add(jBox1);
		String[] year = { "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008",
				"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020",
				"2021" };
		JComboBox jBox2 = new JComboBox<>(year);
		jBox2.setBounds(260, 225, 70, 30);
		c.add(jBox2);

		JLabel l6 = new JLabel("Address");
		l6.setBounds(10, 290, 100, 30);
		Font f6 = new Font("Gothic", Font.BOLD, 14);
		l6.setFont(f6);
		c.add(l6);

		JTextArea ja = new JTextArea();
		ja.setBounds(140, 275, 190, 90);
		ja.setLineWrap(true);
		c.add(ja);
		JCheckBox j1 = new JCheckBox("Please accept terms and conditons");
		j1.setBounds(50, 385, 300, 20);
		c.add(j1);
		JTextArea ja1 = new JTextArea();
		ja1.setBounds(390, 70, 350, 370);
		ja1.setLineWrap(true);
		ja1.setBackground(Color.pink);
		c.add(ja1);

		JButton jb = new JButton("Sumbit");
		jb.setBounds(150, 435, 100, 30);
		Font f7 = new Font("Gothic", Font.BOLD, 14);
		jb.setFont(f7);
		c.add(jb);

		JLabel l7 = new JLabel();
		l7.setBounds(30, 485, 200, 30);
		c.add(l7);
		// jb.addActionListener(jb);
		c.setBackground(Color.decode("#A1E3CF"));
		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (j1.isSelected()) {
					jb.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if (e.getSource() == jb)
								l7.setText("Registration Successful...");
							String name = jt1.getText();
							String mob = jt2.getText();
							String gen = "Male";
							if (bt2.isSelected()) {
								gen = "Female";
							} else if (bt3.isSelected()) {
								gen = "Others";
							}
							String dob = jBox.getSelectedItem() + "/" + jBox1.getSelectedItem() + "/"
									+ jBox2.getSelectedItem();
							String add = ja.getText();
							ja1.setText("Name : " + name + "\n" + "Mobile No : " + mob + "\n" + "Gender : " + gen + "\n"
									+ "DOB : " + dob + "\n" + "Address : " + add + "\n");

						}
					});

				}

			}
		});

		frame.setVisible(true);
	}

}
