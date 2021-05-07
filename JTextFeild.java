// creating text feild

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myfirstframe;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author arpit
 */
public class MyFirstFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        obj.setSize(500,500);
//        obj.setLocation(150,150);
        obj.setBounds(100,100,500,500);
        obj.setTitle("Aj Terminal");
        ImageIcon icon=new ImageIcon("C:\\Users\\arpit\\OneDrive\\Pictures\\Saved Pictures\\ipl-team-rcb-royal-challengers-bangalore-flag-250x250.jpg");
        obj.setIconImage(icon.getImage());
        Container c=obj.getContentPane();
        c.setBackground(Color.gray);
        //obj.setResizable(false);
        c.setLayout(null);
//        JLabel obj2=new JLabel("Username");
//        JLabel obj3=new JLabel("Password");
//        obj2.setBounds(0,0,100,30);
//        obj3.setBounds(0,30,100,30);
//        Font font=new Font("Jokerman",Font.BOLD,14);
//        obj2.setFont(font);
//        obj3.setFont(font);
//        c.add(obj2);
//        c.add(obj3);
//        JLabel obj4=new JLabel(icon);
//        obj4.setBounds(150, 50, icon.getIconWidth(), icon.getIconHeight());
//        c.add(obj4);
//        
//        JLabel lable=new JLabel("RCB",icon,JLabel.CENTER);
//       // Font font=new Font("Arial",Font.BOLD,60);
//        lable.setFont(font);
//        lable.setBounds(0,100,icon.getIconWidth(),icon.getIconHeight());
//        c.add(lable);

//            
      JTextField t=new JTextField();
      t.setBounds(100, 50, 120, 30);
      c.add(t);
      t.setText("Arpit Dwivedi");
       Font font=new Font("Arial",Font.BOLD,15);
       t.setFont(font);
       t.setForeground(Color.red);
       t.setBackground(Color.black);
       t.setEditable(false);
       
      
      
        
        
    }
    
}
