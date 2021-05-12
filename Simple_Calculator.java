// LINK= It is a mini simple calculator project in which we can add, substract,multipy and divide two numbers. Concept used is java swings.



package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class Simple extends JFrame implements ActionListener {
	private Container c;
	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3;
	private JButton add, sub, mul, div;

	public Simple() {
		// TODO Auto-generated constructor stub
		setTitle("Simple Calculator");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);
		l1 = new JLabel("First Number ");
		l1.setBounds(10, 20, 100, 20);
		Font font = new Font("Times New Roman", Font.BOLD, 14);
		l1.setFont(font);
		c.add(l1);
		t1 = new JTextField();
		t1.setBounds(120, 20, 100, 20);
		c.add(t1);
		l2 = new JLabel("Second Number ");
		l2.setBounds(8, 50, 100, 20);
		Font font1 = new Font("Times New Roman", Font.BOLD, 14);
		l2.setFont(font1);
		c.add(l2);
		t2 = new JTextField();
		t2.setBounds(120, 50, 100, 20);
		c.add(t2);
		add = new JButton("+");
		add.setBounds(20, 80, 50, 30);
		c.add(add);
		sub = new JButton("-");
		sub.setBounds(80, 80, 50, 30);
		c.add(sub);
		mul = new JButton("*");
		mul.setBounds(140, 80, 50, 30);
		c.add(mul);
		div = new JButton("/");
		div.setBounds(200, 80, 50, 30);
		c.add(div);
		l3 = new JLabel("Result ");
		l3.setBounds(10, 120, 150, 20);
		Font font2 = new Font("Times New Roman", Font.BOLD, 14);
		l3.setFont(font2);
		c.add(l3);
		t3 = new JTextField();
		t3.setBounds(70, 120, 150, 20);
		c.add(t3);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if (e.getSource() == add) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a + b;
				t3.setText(String.valueOf(cc));
				c.setBackground(Color.gray);
			} else if (e.getSource() == sub) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a - b;
				t3.setText(String.valueOf(cc));
				c.setBackground(Color.pink);
			} else if (e.getSource() == mul) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a * b;
				t3.setText(String.valueOf(cc));
				c.setBackground(Color.CYAN);
			} else {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a / b;
				t3.setText(String.valueOf(cc));
				c.setBackground(Color.decode("#7be0a9"));
			}
		} catch (NumberFormatException e2) {
			t3.setText("Please insert integers only");

		} catch (ArithmeticException e2) {
			t3.setText("Can't divide by zero");
		}

	}
}

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Simple objSimple = new Simple();

	}

}
