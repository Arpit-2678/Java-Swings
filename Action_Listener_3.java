// more on action listener and anomynous class

package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo1 {
	public static void main(String[] args) {
		JFrame obj = new JFrame();
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setBounds(100, 100, 500, 500);
		obj.setTitle("Aj Terminal");
		ImageIcon icon = new ImageIcon(
				"C:\\Users\\arpit\\OneDrive\\Pictures\\Saved Pictures\\ipl-team-rcb-royal-challengers-bangalore-flag-250x250.jpg");
		obj.setIconImage(icon.getImage());
		Container c = obj.getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(null);
		JButton red = new JButton("RED");
		red.setBounds(20, 20, 100, 20);
		c.add(red);
		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.red);
			}
		});
		JButton yellButton = new JButton("YELLOW");
		yellButton.setBounds(140, 20, 100, 20);
		c.add(yellButton);
		yellButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.yellow);
			}
		});
		JButton green = new JButton("GREEN");
		green.setBounds(280, 20, 100, 20);
		c.add(green);
		green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.green);
			}
		});

	}

}
