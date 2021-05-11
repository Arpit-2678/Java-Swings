// implementing action listener using anomynous class

package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerUsingAnomynousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		JButton button = new JButton("Click Me");
		button.setBounds(20, 20, 100, 20);
		c.add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.black);

			}
		});

	}

}
