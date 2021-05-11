// created a mini login form which displays username and password on console

package swings;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class Login extends JFrame implements ActionListener {
	Container c;
	JLabel l1, l2;
	JTextField t1;
	JPasswordField pass;
	JButton bt1;

	public Login() {
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
		bt1.setBounds(15, 80, 80, 25);
		c.add(bt1);
		bt1.addActionListener(this);

	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("UserName :" + t1.getText());
		System.out.println("Password :" + pass.getText());

	}
}

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login f = new Login();
		f.setTitle("Action Java");
		f.setBounds(400, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("C:\\Users\\arpit\\OneDrive\\Pictures\\Saved Pictures\\my_pic.jpg");
		f.setIconImage(icon.getImage());
		f.setVisible(true);
	}

}
