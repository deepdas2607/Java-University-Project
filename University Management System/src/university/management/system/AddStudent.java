package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfaadhar,tfx, tfemail,tfxii,tfaddress,tfphone,tffname,tfname;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
    JButton submit,cancel;
    
    Random ran = new Random();
    long first3 = Math.abs((ran.nextLong()%9000L)+1000L);
    
    AddStudent(){
        getContentPane().setBackground(Color.GREEN);
        setSize(900,700);
        setLocation(350,50);
        
        
        setLayout(null);
        //HEADING
        JLabel heading = new JLabel("New Student Information");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        //NAME
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        //FATHER NAME
        JLabel lblfname = new JLabel("Father Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        //ROLL NO
        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("serif",Font.BOLD,20));
        add(lblrollno);
        
        labelrollno = new JLabel("10"+first3);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("serif",Font.BOLD,20));
        add(labelrollno);
        //DOB
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
        //ADDRESS
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        //PHONE NO
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(400,250,200,30);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);
       
        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        //EMAIL ID
        JLabel lblemail = new JLabel("Email ID");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        //CLASS 10
        JLabel lblx = new JLabel("Class 10th %");
        lblx.setBounds(400,300,200,30);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);
       
        tfx = new JTextField();
        tfx.setBounds(600,300,150,30);
        add(tfx);
        //CLASS 12
        JLabel lblxii = new JLabel("Class 12th %");
        lblxii.setBounds(50,350,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200,350,150,30);
        add(tfxii);
        //AADHAR
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400,350,200,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600,350,150,30);
        add(tfaadhar);
        //COURSE
        JLabel lblcourse = new JLabel("Select Course");
        lblcourse.setBounds(50,400,200,30);
        lblcourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblcourse);
        
        String courses[] = {"BE","Diploma","ITI","Vocational","B.Voc","BCA","MCA","ME"};
        cbcourse = new JComboBox(courses);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        //BRANCH
        JLabel lblbranch = new JLabel("Select Branch");
        lblbranch.setBounds(400,400,200,30);
        lblbranch.setFont(new Font("serif",Font.BOLD,20));
        add(lblbranch);
        
        String branches[] = {"COMPS BE/ME","AIDS BE/ME","EXTC BE/ME","EX-MNT B.VOC/M.VOC","COMPF B.VOC/M.VOC","NOR BCA/MCA","SPL BCA/MCA"};
        cbbranch = new JComboBox(branches);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        //BUTTON
        submit = new JButton("Submit");
        submit.setBounds(250,550,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD, 16));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450,550,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 16));
        add(cancel);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String emailid = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            
            try{
                String query = "insert into student values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+emailid+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Student Details Entered Sucessfully");
                setVisible(false);
            } catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddStudent();
    }
}
