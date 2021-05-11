// To give meaning to our JButton object


package swings;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {
	Container c;
	JLabel l1, l2;
	JTextField t1;
	JPasswordField pass;
	JButton bt1, bt2;

	public MyFrame() {
		c = this.getContentPane();
		c.setLayout(null);
		l1 = new JLabel("Username");
		l1.setBounds(0, 0, 100, 30);
		c.add(l1);
		t1 = new JTextField();
		t1.setBounds(65, 5, 100, 20);
		c.add(t1);
		l2 = new JLabel("Password");
		l2.setBounds(0, 40, 100, 30);
		c.add(l2);
		pass = new JPasswordField();
		pass.setBounds(65, 45, 100, 20);
		// pass.setText("------");
		c.add(pass);
		// pass.setFont(new Font("Arial", Font.PLAIN, 14));
		pass.setEchoChar('*');
		bt1 = new JButton("Login");
		bt2 = new JButton("Sign Up");
		bt1.setBounds(15, 80, 80, 25);
		bt2.setBounds(100, 80, 80, 25);
		c.add(bt1);
		c.add(bt2);
		bt1.addActionListener(this);
		bt2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt1) {
			c.setBackground(Color.decode("#8183cc"));
		} else {
			c.setBackground(Color.GRAY);
		}

	}
}

public class ActionDemo {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setTitle("Action Java");
		f.setBounds(400, 100, 500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("C:\\Users\\arpit\\OneDrive\\Pictures\\Saved Pictures\\my_pic.jpg");
		f.setIconImage(icon.getImage());

	}

}
