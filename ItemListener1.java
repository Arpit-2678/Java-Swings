// About basic use of ItemListener


package swings;

import java.awt.Container;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MYframe2 extends JFrame implements java.awt.event.ItemListener {
	JComboBox jc;
	JTextArea jt;

	public MYframe2() {
		// TODO Auto-generated constructor stub
		Container c = getContentPane();
		c.setLayout(null);
		String[] str = { "A", "B", "C", "D" };
		jc = new JComboBox(str);
		jc.setBounds(50, 50, 100, 30);
		c.add(jc);
		jt = new JTextArea();
		jt.setBounds(200, 50, 100, 100);
		c.add(jt);
		jc.addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String res = jc.getSelectedItem().toString();
		jt.setText(res);

	}

}

public class ItemListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MYframe2 it = new MYframe2();
		it.setTitle("Item Listner");
		it.setBounds(100, 100, 400, 400);
		it.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		it.setVisible(true);

	}

}
