package swings;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("COMBO BOX");
		frame.setBounds(100, 100, 700, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);

		String str[] = { "A", "B", "C", "D" };
		JComboBox jBox = new JComboBox<>(str);
		jBox.setBounds(100, 100, 70, 30);
		c.add(jBox);
		JButton jb = new JButton("OK");
		jb.setBounds(300, 100, 100, 30);
		c.add(jb);
		JLabel l1 = new JLabel();
		l1.setBounds(100, 300, 100, 30);
		c.add(l1);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textString = (String) jBox.getSelectedItem();
				l1.setText(textString);

			}
		});

		frame.setVisible(true);

	}

}
