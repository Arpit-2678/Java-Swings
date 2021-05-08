// Creating a password text box

package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyPassword {

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
		// obj.setResizable(false);
		c.setLayout(null);
		JLabel label = new JLabel("Username");
		label.setBounds(0, 0, 100, 30);
		c.add(label);
		JTextField text = new JTextField();
		text.setBounds(65, 5, 100, 20);
		c.add(text);
		JLabel label2 = new JLabel("Password");
		label2.setBounds(0, 40, 100, 30);
		c.add(label2);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(65, 45, 100, 20);
		c.add(pass);
		pass.setText("Aj@2678@");
		pass.setFont(new Font("Arial", Font.PLAIN, 14));
		pass.setEchoChar('*');
		pass.setEchoChar((char) 0);

	}

}
