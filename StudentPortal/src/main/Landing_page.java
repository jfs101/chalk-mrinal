
package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Landing_page {
	public JFrame jf;
    public Landing_page()
    {
        jf=new JFrame();
       
        
        JLabel jl=new JLabel("Manage Your E-Book");
        JLabel j2=new JLabel("Here !! ");
        jl.setBounds(100,40, 400, 300);
        j2.setBounds(180,90, 400, 300);
        jl.setFont(new java.awt.Font("Tahoma",1,25));
        jl.setForeground(new java.awt.Color(0,0,204));
        j2.setFont(new java.awt.Font("Tahoma",1,25));
        j2.setForeground(new java.awt.Color(0,0,204));
        
        
        JButton b1=new JButton("login");
        b1.setBounds(95,400,100,50);
        
        JButton b2=new JButton("New User");
        b2.setBounds(290,400,100,50);      
         b1.addActionListener(new ActionListener()
         {
                public void actionPerformed(ActionEvent e)
                {
                   Login_page obj =  new Login_page();                                      
                }
               
         }); 
         b2.addActionListener(new ActionListener()
         {
                public void actionPerformed(ActionEvent e)
                {
                  Register_page obj = new Register_page();                                      
                }
               
         }); 
        
        jf.add(b1);
        jf.add(b2);
        jf.add(jl);
        jf.add(j2);
        
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}
