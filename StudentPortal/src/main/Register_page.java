
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register_page {
	public JFrame f;
    public Register_page()
    {
        f=new JFrame();
        JLabel jl=new JLabel(" CREATE YOUR PROFILE ");
        jl.setBounds(130,40,400,100);
        jl.setFont(new java.awt.Font("Tahoma",1,25));
        jl.setForeground(new java.awt.Color(21,21,190));
        JTextField tf1=new JTextField();//name
        tf1.setBounds(130,170,150,20);
        JTextField tf4=new JTextField();//user name
        tf4.setBounds(130,260,150,20);
        JTextField tf2=new JTextField();//contact
        tf2.setBounds(380,210,150,20);
        JTextField tf5=new JTextField();//password
        tf5.setBounds(380,300,150,20);
        JTextField tf3=new JTextField();//email
        tf3.setBounds(130,350,150,20);
        JLabel jl1=new JLabel("Name: ");
        jl1.setBounds(80,168,150,20);
         JLabel jl2=new JLabel("Mail ID: ");
        jl2.setBounds(80,350,150,20);
         JLabel jl3=new JLabel("Contact: ");
        jl3.setBounds(78,258,150,20);
         JLabel jl4=new JLabel("User Name ");
        jl4.setBounds(415,188,150,20);
         JLabel jl5=new JLabel("Password ");
        jl5.setBounds(419,280,150,20);
        JButton jb=new JButton("REGISTER");
        jb.setBounds(225,402,100,50);
         
         jb.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                               
                 Home obj = new Home();
             }
             
         });
        f.add(jb);
        f.add(jl);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(jl1);
        f.add(jl2);
        f.add(jl3);
        f.add(jl4);
        f.add(jl5);
        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.GRAY);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
