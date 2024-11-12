package university.management.system;

import javax.swing.*;
import java.awt.*;


public class About extends JFrame {
    JButton cancel;
    About(){
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.ORANGE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,20,300,200);
        add(image);
        
        JLabel heading = new JLabel("<html>PROJECT<br/>MADE BY</html>");
        heading.setBounds(70,20,500,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        
        JLabel name = new JLabel("Deepkumar Das");
        name.setBounds(70,220,550,40);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);
        
        JLabel rname = new JLabel("Roll No : 10333");
        rname.setBounds(70,280,550,40);
        rname.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(rname);
        
        
        
        setLayout(null);
        setVisible(true);
    }
    
    
    
    public static void main (String[] args){
        new About();
    }
} 