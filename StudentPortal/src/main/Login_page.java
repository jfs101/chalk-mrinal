
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_page {
	public JFrame jf;
    public Login_page()
    {
       jf=new JFrame();
        JTextField textfield1=new JTextField();
        textfield1.setBounds(150,180,200,30);
        
        JLabel jl=new JLabel("Book Management System");
        jl.setBounds(65,-50, 400, 300);
        jl.setFont(new java.awt.Font("Tahoma",1,25));
        jl.setForeground(new java.awt.Color(0,0,204));
        JPasswordField textfield2=new JPasswordField();
        textfield2.setBounds(150,270,200,30);
        
        JButton b1=new JButton("login");
        b1.setBounds(195,400,100,50);
        
        JLabel jl1=new JLabel("User ID :");
        jl1.setBounds(90,153,80,80);
        
        JLabel jl2=new JLabel("PASSWORD :");
        jl2.setBounds(70,245,80,80);
        
         b1.addActionListener(new ActionListener()
         {
                public void actionPerformed(ActionEvent e)
                {
                    
                    String user = textfield1.getText();
                    String password = textfield2.getText();
                    if(user.compareTo("user")==0)
                    {
                        if(password.compareTo("user")==0)
                        {
                            Home obj = new Home();
                        }
                    }
                        
                                       
                }
               
         });
         
        jf.add(jl2);
        jf.add(jl1);
        jf.add(b1);
        
        jf.add(jl);
        jf.add(textfield2);
        jf.add(textfield1);
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}
