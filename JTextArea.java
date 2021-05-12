// For writing a paragraph


package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyTextArea {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.decode("#e69e57"));
		JTextArea textArea = new JTextArea();
		textArea.setBounds(100, 100, 400, 200);
		c.add(textArea);
		textArea.setText("I am a competetive programmer");
		textArea.setFont(new Font("Arial", Font.BOLD, 14));
		textArea.setLineWrap(true);
		frame.setVisible(true);

	}

}
