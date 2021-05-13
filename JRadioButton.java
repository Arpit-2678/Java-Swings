

package swings;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Radio Button");
		Container c = frame.getContentPane();
		c.setLayout(null);
		// c.setBackground(Color.gray);
		JLabel l1 = new JLabel("Sex");
		l1.setBounds(0, 30, 100, 30);
		Font font = new Font("Arial", Font.BOLD, 20);
		l1.setFont(font);
		c.add(l1);

		JRadioButton bt1 = new JRadioButton("Male");
		bt1.setBounds(120, 30, 100, 30);
		c.add(bt1);
		JRadioButton bt11 = new JRadioButton("Female");
		bt11.setBounds(260, 30, 100, 30);
		c.add(bt11);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(bt1);
		buttonGroup.add(bt11);

		JLabel l11 = new JLabel("Category");
		l11.setBounds(0, 80, 100, 30);
		Font font1 = new Font("Arial", Font.BOLD, 20);
		l11.setFont(font1);
		c.add(l11);
		JRadioButton bt2 = new JRadioButton("General");
		bt2.setBounds(120, 80, 100, 30);
		c.add(bt2);
		JRadioButton bt3 = new JRadioButton("SC");
		bt3.setBounds(260, 80, 100, 30);
		c.add(bt3);

		JRadioButton bt4 = new JRadioButton("ST");
		bt4.setBounds(400, 80, 100, 30);
		c.add(bt4);
		JRadioButton bt5 = new JRadioButton("OBC");
		bt5.setBounds(540, 80, 100, 30);
		c.add(bt5);

		ButtonGroup btGroup = new ButtonGroup();
		btGroup.add(bt2);
		btGroup.add(bt3);
		btGroup.add(bt4);
		btGroup.add(bt5);

		frame.setVisible(true);

	}

}
