package swings;

import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyCheckButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Checkboxes");
		Container c = frame.getContentPane();
		c.setLayout(null);
		JCheckBox j1 = new JCheckBox("C++");
		JCheckBox j2 = new JCheckBox("Python");
		JCheckBox j3 = new JCheckBox("Java");
		JCheckBox j4 = new JCheckBox("Rust");
		JLabel l1 = new JLabel("Select your favorite language");
		l1.setBounds(150, 30, 200, 120);
		c.add(l1);

		j1.setBounds(190, 100, 100, 30);
		j2.setBounds(190, 120, 100, 30);
		j3.setBounds(190, 140, 100, 30);
		j4.setBounds(190, 160, 100, 30);
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);
		frame.setVisible(true);

	}

}
