// creating a simple menu bar


package swings;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Bar");
		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem i1 = new JMenuItem("New");
		JMenuItem i2 = new JMenuItem("Open");
		JMenuItem i3 = new JMenuItem("Save");

		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menuBar.add(menu);

		JMenu menu2 = new JMenu("Edit");

		JMenuItem i4 = new JMenuItem("Undo");
		JMenuItem i5 = new JMenuItem("Redo");

		menu2.add(i4);
		menu2.add(i5);

		menuBar.add(menu2);
		JMenu menu3 = new JMenu("More");
		JMenuItem i6 = new JMenuItem("Reviews");
		JMenuItem i7 = new JMenuItem("Rate Us");
		menu3.add(i6);
		menu3.add(i7);
		menu2.add(menu3);

		frame.setJMenuBar(menuBar);
		frame.setVisible(true);

	}

}
