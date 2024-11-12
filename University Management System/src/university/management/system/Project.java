package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {
    Project() {
        setSize(1540,850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 980, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        //New Information
        JMenu newInformation = new JMenu("New Info");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Info");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Info");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //Details
        JMenu details  = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //Leave
        JMenu leave  = new JMenu("Apply For Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //Leave Details
        JMenu leaveDetails  = new JMenu("View Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        
        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.WHITE);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);
        
        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.WHITE);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);
        
        //Exams
        JMenu exam  = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //Update Info
        JMenu updateInfo  = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Info");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Info");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        //Fees
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        //Utility
        JMenu utility = new JMenu("Utilities");
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //About
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem abt = new JMenuItem("About Project");
        abt.setBackground(Color.WHITE);
        abt.addActionListener(this);
        about.add(abt);
        
        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit to Desktop");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        setJMenuBar(mb);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Exit to Desktop")){
            setVisible(false);
        } else if (msg.equals("Calculator")){
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("Notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("New Faculty Info")) {
            new AddTeacher();
        } else if (msg.equals("New Student Info")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Info")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Info")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About Project")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }
    
    public static void main (String[] args){
        new Project();
    }
}
