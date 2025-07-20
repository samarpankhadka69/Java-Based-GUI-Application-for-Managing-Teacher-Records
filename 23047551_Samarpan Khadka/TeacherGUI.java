
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


 class TeacherGUI {

    ArrayList<Teacher> TeacherInfo = new ArrayList<>(); 

    public void sam() {

       JFrame jf = new JFrame("TeacherGUI");
       Color back = Color.decode("#87ab69"); //  color code
       jf.getContentPane().setBackground(back); 
       jf.setSize(1800,1800); 
       jf.setLayout(null);
       JPanel GUIPanel = new JPanel(); 
       GUIPanel.setLayout(null);
       GUIPanel.setBackground(back); 
       GUIPanel.setBounds(1800,950,1800,1800);
        
  JLabel a1 = new JLabel("Teacher GUI");
        a1.setBounds(730, 45, 200, 80);
        a1.setFont(new Font("Baguet Script", Font.BOLD, 20));
        jf.add(a1);
        
        JLabel l1 = new JLabel("ADDING LECTURER");
       l1.setBounds(90,45,150,50); 
       l1.setFont(new Font("Baguet Script", Font.BOLD, 15));
       jf.add(l1);

        JLabel l2 = new JLabel("Teacher Name:");
        l2.setBounds(50, 90, 100, 40);
        jf.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(190, 100, 130, 25);
        jf.add(t2);

        JLabel l3 = new JLabel("Teacher ID:");
        l3.setBounds(50, 140, 100, 40);
        jf.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(190, 140, 130, 25);
        jf.add(t3);
        
        JLabel l8 = new JLabel("Graded Score:");
        l8.setBounds(1070,140,100,40);
        jf.add(l8);
        
        JTextField t8 = new JTextField();
        t8.setBounds(1190,150,120,35);
        jf.add(t8);


        JLabel l4 = new JLabel("Teacher Address:");
        l4.setBounds(1070, 90, 100, 40);
        jf.add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(1200, 100, 130, 25);
        jf.add(t4);

        
        JLabel l5 = new JLabel("Working type:");
        l5.setBounds(50,180,100,40);
        jf.add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(190,190,130,25);
        jf.add(t5);

        JLabel l6 = new JLabel("Employment Status:");
        l6.setBounds(50,260,160,40);
        jf.add(l6);

        JTextField t6 = new JTextField();
        t6.setBounds(190,270,130,25);
        jf.add(t6);


        JLabel l7 = new JLabel("YearsOfExperience:");
        l7.setBounds(1070,190,140,40);
        jf.add(l7);

        JTextField t7 = new JTextField();
        t7.setBounds(1200,200,130,25);
        jf.add(t7);

        JLabel l9 = new JLabel("Department:");
        l9.setBounds(1070,250,80,50);
        jf.add(l9);

        JTextField t9 = new JTextField();
        t9.setBounds(1200,260,160,25);
        jf.add(t9);


         JButton B1 = new JButton("Add to Lecturer");
        B1.setBounds(430,310,180,60);
        jf.add(B1);
        

        JButton B2 = new JButton("Grade Assignment");
        B2.setBounds(800,310,160,60);
        jf.add(B2);

        JButton B8 = new JButton("Clear");
        B8.setBounds(620,380,150,60);
        jf.add(B8);

        JButton B3 = new JButton("Display");
        B3.setBounds(950,380,140,60);
        jf.add(B3); 
        
        JButton B51 = new JButton("change to tutor");
        B51.setBounds(1210,380,180,60);
        jf.add(B51);
        jf.setVisible(true);
        
       B1.addActionListener(new ActionListener() //adding  lecturer action listener
           {
               public void actionPerformed(ActionEvent ae)
               {
                   if (t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t7.getText().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null, "Please fill  in all the fields");
                   } else
                   {
                       try
                       {
                           int tId = Integer.parseInt(t3.getText());
                           int years = Integer.parseInt(t7.getText());

                           Lecturer newLecturer = new Lecturer(
                                   tId,
                                   t2.getText(), 
                                   t4.getText(), 
                                   t5.getText(), 
                                   t6.getText(), 
                                   t9.getText(), 
                                   years         
                               );

                           TeacherInfo.add(newLecturer);
                           JOptionPane.showMessageDialog(null, "Lecturer  is added successfully"); // a message dialog box
                       } catch (NumberFormatException ex) //this is a exception
                       {
                           JOptionPane.showMessageDialog(null, "Invalid input for Teacher ID or Years of Experience", "Error", JOptionPane.ERROR_MESSAGE);
                       } catch (Exception ex)
                       {
                           ex.printStackTrace();
                           JOptionPane.showMessageDialog(null, "An error occurred while adding the lecturer", "Error", JOptionPane.ERROR_MESSAGE);
                       }
                   }
               }
           });

       B3.addActionListener(new ActionListener() //this is a display action listener in lecturer section
           {
               public void actionPerformed(ActionEvent ae)
               {
                   for(Teacher teacher : TeacherInfo)
                   {
                       if(teacher instanceof Lecturer)
                       {
                           Lecturer lecturer = (Lecturer) teacher;
                           lecturer.display();
                           String TeacherName = t2.getText();
                           String TeacherID = t3.getText();
                           String Address = t4.getText();     
                           String WorkingType = t5.getText();
                           String EmploymentStatus = t6.getText();
                           String YearsOfExperience = t7.getText();
                           String Department = t9.getText();
                           String Message = "Teacher Name:" + TeacherName + "\n" + "Teacher ID:" + TeacherID + "\n" + "Address:" + Address + "\n" +
                               " Working Type:" + WorkingType + "\n" + "EmploymentStatus:" + EmploymentStatus + "\n" + "YearsOfExperience:" + YearsOfExperience + "\n"
                               + "Department:" + "\n";

                           JOptionPane.showMessageDialog(null, Message, "Your input successfull.", JOptionPane.INFORMATION_MESSAGE);
                           JOptionPane.showMessageDialog(null,"Added  Lecturer Successfully"); // messsage dialog box

                       }
                   }
               }
           });

       B2.addActionListener(new ActionListener()// this is a grade assignment action listener function of button
           {
               public void actionPerformed(ActionEvent ae)
               {
                   // this is a variables assignmentScore and studentDepartment
                   int assignmentScore;
                   String department = t9.getText(); //this is a department is entered in a JTextField

                   try
                   {
                       assignmentScore = Integer.parseInt(t8.getText()); // this is a assignment score from the JTextField
                   } catch (NumberFormatException ex)
                   {
                       JOptionPane.showMessageDialog(null, "Invalid input for assignment score.", "Error", JOptionPane.ERROR_MESSAGE);
                       return; // if the assignment score is not a valid integer
                   }

                   // this is a yearsOfExperience is defined and parsed
                   int yearsOfExperience;

                   try {
                       yearsOfExperience = Integer.parseInt(t7.getText()); // this is a years of experience from the JTextField
                   } catch (NumberFormatException ex) {
                       JOptionPane.showMessageDialog(null, "Invalid input for years of experience.", "Error", JOptionPane.ERROR_MESSAGE);
                       return; // if the years of experience is not a valid integer
                   }

                   //this is a Check grading conditions
                   if (yearsOfExperience >= 5 && !department.isEmpty())
                   {
                       char gradedScore;
                       if (assignmentScore >= 90)
                       {
                           gradedScore = 'A';
                       } else if (assignmentScore >= 80)
                       {
                           gradedScore = 'B';
                       } else if (assignmentScore >= 60)
                       {
                           gradedScore = 'C';
                       } else if (assignmentScore >= 40)
                       {
                           gradedScore = 'D';
                       } else
                       {
                           gradedScore = 'E';
                       }

                       //this is a Display the graded score in a dialog box
                       JOptionPane.showMessageDialog(null, "Graded Assignment : " + gradedScore, "Graded Assignment", JOptionPane.INFORMATION_MESSAGE);
                   } else
                   {
                       //this is a Display error message if grading conditions are not met
                       JOptionPane.showMessageDialog(null, "Lecturer does not meet criteria for grading.", "Error", JOptionPane.ERROR_MESSAGE);
                   }
               }
           });

       B8.addActionListener(new ActionListener()//this is a clear action listener which is clear all jtextfield
           {
               public void actionPerformed(ActionEvent ae)
               {
                   t2.setText("");
                   t3.setText("");
                   t4.setText("");
                   t5.setText("");
                   t6.setText("");
                   t7.setText("");
                   t8.setText("");
                   t9.setText("");
                   JOptionPane.showMessageDialog(null,"Cleared!"); //this is a joptionpane which is show message dialog box
               }
           });
           
B51.addActionListener(new ActionListener()
 {
            public void actionPerformed(ActionEvent sth) {
               TeacherGUI hi=new TeacherGUI();
               hi.m();
            }
        });

           
        }
        
        //calling tutorclass
        public void m() {
            
        JFrame jf = new JFrame ("tutor record");
       Color back = Color.decode("#87ab69"); //  color code
       jf.getContentPane().setBackground(back); 
       jf.setSize(1800,1800); 
       jf.setLayout(null);
       jf.setVisible (true);


        JLabel l10 = new JLabel("ADDING TUTOR");
       l10.setBounds(15,15,250,100); 
       l10.setFont(new Font("ADLaM Display", Font.BOLD, 25));
        jf.add(l10);
        
      JLabel l11 = new JLabel("Teacher Name:");
        l11.setBounds(50, 90, 100, 40);
        jf.add(l11);

        JTextField t11 = new JTextField();
        t11.setBounds(190, 100, 130, 25);
        jf.add(t11);
             
       JLabel l12 = new JLabel("Teacher ID:");
       l12.setBounds(50,140,100,40);
       jf.add(l12);
       JTextField t12 = new JTextField();
       t12.setBounds(190,140,130,25);
        jf.add(t12);

       JLabel l13 = new JLabel("Address:");
       l13.setBounds(1070,90,100,40);
        jf.add(l13);
       JTextField t13 = new JTextField();
       t13.setBounds(1200,100,130,25);
        jf.add(t13);
       JLabel l14 = new JLabel("Working Type:");
       l14.setBounds(1070,140,100,40);
        jf.add(l14);
       JTextField t14 = new JTextField();
       t14.setBounds(1200,150,130,25);
        jf.add(t14);
       JLabel l15 = new JLabel("Employment Status:");
       l15.setBounds(50,180,130,35);
        jf.add(l15);
       JTextField t15 = new JTextField();
        t15.setBounds(190,190,130,25);
       jf.add(t15);
       JLabel l16 = new JLabel("Working Hours:");
       l16.setBounds(50,260,140,40);
        jf.add(l16);
       JTextField t16 = new JTextField();
       t16.setBounds(190,270,130,25);
        jf.add(t16);
       JLabel l17 = new JLabel("Salary:");
       l17.setBounds(1070,190,140,40);
        jf.add(l17);
       JTextField t17 = new JTextField();
       t17.setBounds(1200,200,130,25);
        jf.add(t17);
       JLabel l18 = new JLabel("Specialization:");
       l18.setBounds(1070,250,140,40);
        jf.add(l18);
       JTextField t18 = new JTextField();
       t18.setBounds(1200,260,130,25);
        jf.add(t18);
       JLabel l19 = new JLabel("Academic qualification:");
       l19.setBounds(50,310,140,40);
        jf.add(l19);
       JTextField t19 = new JTextField();
       t19.setBounds(190,310,130,25);
        jf.add(t19);
       JLabel l20 = new JLabel("Performance Index:");
       l20.setBounds(1070,310,140,40);
        jf.add(l20);
       JTextField t20 = new JTextField();
       t20.setBounds(1200,320,130,25);
        jf.add(t20);
        
        JButton B4 = new JButton("Clear"); 
       B4.setBounds(430,350,160,60);
       jf.add(B4);

       JButton B5 = new JButton("Display");
       B5.setBounds(710,350,160,60);
        jf.add(B5);
        
       JButton B6 = new JButton("Set Salary");
       B6.setBounds(1020,350,160,60);
        jf.add(B6);
        
       JButton B7 = new JButton("Remove Tutor");
       B7.setBounds(480,480,160,60);
        jf.add(B7);
        
       JButton B9 = new JButton("Add Tutor");
       B9.setBounds(900,480,160,60);
       jf.add(B9);
       
       JButton B10 = new JButton("Change to lecturer");
       B10.setBounds(1200,480,160,60);
       jf.add(B10);
        

B10.addActionListener(new ActionListener()
 {
            public void actionPerformed(ActionEvent sth) {
               TeacherGUI hi=new TeacherGUI();
               hi.sam();
            }
        });
       B5.addActionListener(new ActionListener() 
           {
               public void actionPerformed(ActionEvent ae)
               {
                   for (Teacher teacher : TeacherInfo)
                   {
                       if (teacher instanceof Tutor)
                       {
                           Tutor tutor = (Tutor) teacher;
                           tutor.display();

                           
                           String TeacherName = tutor.getTeacherName();
                           String TeacherID = Integer.toString(tutor.getTeacherId());
                           String Address = tutor.getAddress();
                           String WorkingType = tutor.getWorkingType();
                           String EmploymentStatus = tutor.getEmploymentStatus();
                           String WorkingHours = Integer.toString(tutor.getWorkingHours());
                           int Salary = (int) Double.parseDouble(t17.getText());
                           String Specialization = t18.getText();
                           String Academicqualification = t19.getText();
                           double PerformanceIndex = Double.parseDouble(t20.getText());

                           
                           String message = "Teacher Name: "+TeacherName +"\n"+
                               "Teacher ID: "+TeacherID +"\n"+
                               "Address: "+Address +"\n"+
                               "Working Type: "+WorkingType +"\n" +
                               "Employment Status: "+EmploymentStatus +"\n"+
                               "Working Hours: "+WorkingHours+"\n"+
                               "Salary: " + Salary+"\n"+
                               "Specialization: "+Specialization+"\n"+
                               "Academic Qualification: "+Academicqualification+"\n"+
                               "Performance Index: "+PerformanceIndex +"\n";

                           // Display message
                           JOptionPane.showMessageDialog(null, message, "Tutor Information successfull", JOptionPane.INFORMATION_MESSAGE);
                       }
                   }
               }
           });

       B6.addActionListener(new ActionListener() 
           {
               public void actionPerformed(ActionEvent ae)
               {
                   try {
                       int teacherIdToSetSalary = Integer.parseInt(t12.getText());
                       int newSalary = Integer.parseInt(JOptionPane.showInputDialog("Enter new salary:"));
                       int newPerformanceIndex = Integer.parseInt(JOptionPane.showInputDialog("Enter new salary:"));

                       for (Teacher teacher : TeacherInfo)
                       {
                           if (teacher instanceof Tutor && teacher.getTeacherId() == teacherIdToSetSalary)
                           {
                               Tutor tutorToSetSalary = (Tutor) teacher;
                               tutorToSetSalary.setSalary(newSalary, newPerformanceIndex);
                               JOptionPane.showMessageDialog(null, "Salary  is updated successfully.");
                               return;
                           }
                       }

                       JOptionPane.showMessageDialog(null, "Tutor ID not found: " + teacherIdToSetSalary);
                   } catch (NumberFormatException e) {
                       JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number for teacher ID.");
                   }
               }
           });


       B9.addActionListener(new ActionListener() 
           {
               public void actionPerformed(ActionEvent ae)
               {
                   if (t12.getText().isEmpty() || t11.getText().isEmpty() || t13.getText().isEmpty() ||
                   t14.getText().isEmpty() || t15.getText().isEmpty() || t16.getText().isEmpty() ||
                   t17.getText().isEmpty() || t18.getText().isEmpty() || t19.getText().isEmpty() ||
                   t20.getText().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null, "Please Fill all the fields");
                   } else
                   {

                       int Id = Integer.parseInt(t12.getText());
                       int salary = Integer.parseInt(t17.getText());
                       int workingHours = Integer.parseInt(t16.getText());
                       String employmentStatus = t15.getText();
                       int performanceIndex = Integer.parseInt(t20.getText());

                       Tutor newTutor = new Tutor(Id, t11.getText(), t13.getText(), t14.getText(),
                               t15.getText(), workingHours, salary, t18.getText(), t19.getText(), performanceIndex);

                       TeacherInfo.add(newTutor);

                       JOptionPane.showMessageDialog(null, "Tutor added Successfully");


                   }
               }
           });

       B4.addActionListener(new ActionListener()
           {
               public void actionPerformed(ActionEvent ae)
               {
                   t11.setText("");
                   t12.setText("");
                   t13.setText("");
                   t14.setText("");
                   t15.setText("");
                   t16.setText("");
                   t17.setText("");
                   t18.setText("");
                   t19.setText("");
                   t20.setText("");
               }
           });

       B7.addActionListener(new ActionListener() 
           {
               public void actionPerformed(ActionEvent ae)
               {
                   try {
                       
                       int teacherIdToRemove = Integer.parseInt(t12.getText());

                       
                       for (Teacher teacher : TeacherInfo)
                       {
                           if (teacher instanceof Tutor && teacher.getTeacherId() == teacherIdToRemove)
                           {
                              
                               Tutor tutorToRemove = (Tutor) teacher; 
                               TeacherInfo.remove(tutorToRemove);

                               
                               JOptionPane.showMessageDialog(null, teacherIdToRemove + "Removed tutor has been successfully.");

                               return; 
                           }
                       }

                      
                       JOptionPane.showMessageDialog(null, "Tutor ID was not found: " + teacherIdToRemove);
                   } catch (NumberFormatException e) {
                       JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number for teacher ID to remove.");
                   }
               }
           });
        }
        public static void main(String[] args) {
        TeacherGUI tGUI = new TeacherGUI();
        tGUI.sam();

       
   }
}