 


//Importing all the necessary utilities from Java Library
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

//Creating the main class INGNepal
public class INGNepal {
    //Declaring the variables for the frame
    JFrame Frame1;
    
    //Declaring all the necessary variables for the textfield for Full Time Staff
    private JTextField lbl1Vacancy;
    private JTextField lbl1Designation;
    private JTextField lbl1JobType;
    private JTextField lbl1Salary;
    private JTextField lbl1WorkingHour;
    
    private JTextField lbl2Vacancy;
    private JTextField lbl2StaffName;
    private JTextField lbl2JoiningDate;
    private JTextField lbl2Qualification;
    private JTextField lbl2AppointedBy;
    
    //Declaring all the necessary varibales for textfield for Part Time Staff
    private JTextField lbl3Vacancy;
    private JTextField lbl3Designation;
    private JTextField lbl3JobType;
    private JTextField lbl3WorkingHour;
    private JTextField lbl3WagesPerHour;
    private JTextField lbl3Shift;
    
    private JTextField lbl4Vacancy;
    private JTextField lbl4StaffName;
    private JTextField lbl4JoiningDate;
    private JTextField lbl4Qualification;
    private JTextField lbl4AppointedBy;
    
    private JTextField lbl5VacancyNumber;
    
    //Declaring all the necessary variables for buttons
    private JButton bt1AddVacancyFTS;
    private JButton bt2AddVacancyPTS;
    private JButton bt3AppointFTS;
    private JButton bt4AppointPTS;                                                                                                          
    private JButton bt5Terminate;
    private JButton bt6Display;
    private JButton bt7Clear;
    private JButton bt8Clear;
    
    //Creating an ArrayList for storing objects
    List<StaffHire> StaffList = new ArrayList<StaffHire>();
    
    //Creating the main method
    public INGNepal() {
        initializeFrame();
        initializeBody();
    }
        
    //Initializing new frame    
    public void initializeFrame() {
        Frame1 = new JFrame("INGNepal");
        Frame1.setBounds(40,40,1000,650);
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame1.setResizable(true);
        Frame1.setLayout(null);
        Frame1.getContentPane().setLayout(null);
    }
    
    public void initializeBody() {
        //Adding Vacancy for Full Time Staff and initializing labels
        
        JLabel lbl1FT = new JLabel("Add Vacancy for Full Time Staff Hire");
        lbl1FT.setBounds(100,5,250,30);
        Frame1.add(lbl1FT);
        
        JLabel lbl1VacancyNo = new JLabel("Vacancy Number :");
        lbl1VacancyNo.setBounds(12,30,130,30);
        Frame1.add(lbl1VacancyNo);
            
        JLabel lbl1Designation1 = new JLabel("Designation :");
        lbl1Designation1.setBounds(12,60,130,30);
        Frame1.add(lbl1Designation1);
            
        JLabel lbl1JobType1 = new JLabel("JobType :");
        lbl1JobType1.setBounds(12,90,120,30);
        Frame1.add(lbl1JobType1);
        
        JLabel lbl1Salary1 = new JLabel("Salary :");
        lbl1Salary1.setBounds(12,150,120,30);
        Frame1.add(lbl1Salary1);
        
        JLabel lbl1WorkingHour1 = new JLabel("WorkingHour :");
        lbl1WorkingHour1.setBounds(12,120,120,30);
        Frame1.add(lbl1WorkingHour1);
        
        //Initializing TextFields For Full Time Staff Hire
        
        JTextField lbl1Vacancy = new JTextField();
        lbl1Vacancy.setBounds(130,30,200,25);
        Frame1.add(lbl1Vacancy);
        
        JTextField lbl1Designation = new JTextField();
        lbl1Designation.setBounds(130,60,200,25);
        Frame1.add(lbl1Designation);
        
        JTextField lbl1JobType = new JTextField();
        lbl1JobType.setBounds(130,90,200,25);
        Frame1.add(lbl1JobType);
        
        JTextField lbl1Salary = new JTextField();
        lbl1Salary.setBounds(130,120,200,25);
        Frame1.add(lbl1Salary);
        
        JTextField lbl1WorkingHour = new JTextField();
        lbl1WorkingHour.setBounds(130,150,200,25);
        Frame1.add(lbl1WorkingHour);
        
        //Initializing Buttons for Full Time Staff Hire
        JButton bt1AddVacancyFTS = new JButton("Add");
        bt1AddVacancyFTS.setBounds(200,180,120,40);
        Frame1.add(bt1AddVacancyFTS);
        bt1AddVacancyFTS.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                //Storing the given values from text fields in new variables
                int a,b,c;
                String VacancyNumber = lbl1Vacancy.getText();
                String Designation = lbl1Designation.getText();
                String JobType = lbl1JobType.getText();
                String Salary = lbl1Salary.getText();
                String WorkingHour = lbl1WorkingHour.getText();
                
                if(VacancyNumber.equals("") ||Designation.equals("") ||JobType.equals("") ||Salary.equals("") ||WorkingHour.equals("")) {
                    JOptionPane.showMessageDialog(Frame1, "Please fill all the respective fields before adding", "Error", 0);
                } else {
                try{
                      a = Integer.parseInt(VacancyNumber);
                } catch(NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(Frame1, "Please insert the valid data in Vacancy Number.", "Invalid",0);
                        return;} 
                try{
                      b = Integer.parseInt(Salary);
                     }catch(NumberFormatException nfe) {
                         JOptionPane.showMessageDialog(Frame1, "Please insert the valid data in Salary.", "Invalid",0);
                         return;} 
                try{
                      c = Integer.parseInt(WorkingHour);
                    } catch(NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(Frame1, "Please insert the valid data in Working Hour", "Invalid",0);
                        return;}
                         
               FullTimeStaffHire FTSH = new FullTimeStaffHire(a,Designation,JobType,b,c);
               StaffList.add(FTSH);
               JOptionPane.showMessageDialog(Frame1, "The Full TIme Staff Hire is successfully added.", "Success!",1);
               JOptionPane.showMessageDialog(Frame1, "The Vacancy Number: "+a+"\n" +"Designation: "+Designation + "\n" + "Job Type: " + JobType+"\n" +"Salary: "+ b +"\n" + "Working Hours: " +c, "Details", 1);
               
           } 
       };
    });
    
    //Appointing for Full Time Staff Hire and Initializing labels
    
    JLabel lbl2HeaderFT = new JLabel("Appoint For Full Time Staff Hire");
    lbl2HeaderFT.setBounds(100,275,250,20);
    Frame1.add(lbl2HeaderFT);
    
    JLabel lbl2Vacancy1 = new JLabel("Vacancy Number: ");
    lbl2Vacancy1.setBounds(12,300,120,30);
    Frame1.add(lbl2Vacancy1);
    
    JLabel lbl2StaffName1 = new JLabel("Staff Name: ");
    lbl2StaffName1.setBounds(12,330,120,30);
    Frame1.add(lbl2StaffName1);
    
    JLabel lbl2JoiningDate1 = new JLabel("Joining Date: ");
    lbl2JoiningDate1.setBounds(12,360,120,30);
    Frame1.add(lbl2JoiningDate1);
    
    JLabel lbl2Qualification1 = new JLabel("Qualification: ");
    lbl2Qualification1.setBounds(12,390,120,30);
    Frame1.add(lbl2Qualification1);
    
    JLabel lbl2AppointedBy1 = new JLabel("Appointed By: ");
    lbl2AppointedBy1.setBounds(12,420,120,30);
    Frame1.add(lbl2AppointedBy1);
    
    //Initializing Text Fields
    
    JTextField lbl2Vacancy = new JTextField();
    lbl2Vacancy.setBounds(130,300,200,25);
    Frame1.add(lbl2Vacancy);
    
    JTextField lbl2StaffName = new JTextField();
    lbl2StaffName.setBounds(130,330,200,25);
    Frame1.add(lbl2StaffName);
    
    JTextField lbl2JoiningDate = new JTextField();
    lbl2JoiningDate.setBounds(130,360,200,25);
    Frame1.add(lbl2JoiningDate);
    
    JTextField lbl2Qualification = new JTextField();
    lbl2Qualification.setBounds(130,390,200,25);
    Frame1.add(lbl2Qualification);
    
    JTextField lbl2AppointedBy = new JTextField();
    lbl2AppointedBy.setBounds(130,420,200,25);
    Frame1.add(lbl2AppointedBy);
    
    //Initializing Buttons
    JButton bt3AppointFTS = new JButton("Appoint");
    bt3AppointFTS.setBounds(12,460,120,40);
    Frame1.add(bt3AppointFTS);
    bt3AppointFTS.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int a,i;
            String VacancyNumber = lbl2Vacancy.getText();
            String StaffName = lbl2StaffName.getText();
            String JoiningDate = lbl2JoiningDate.getText();
            String Qualification = lbl2Qualification.getText();
            String AppointedBy = lbl2AppointedBy.getText();
            
            if(VacancyNumber.trim().equals("") || StaffName.equals("") || JoiningDate.trim().equals("") || Qualification.trim().equals("") || AppointedBy.trim().equals("")){      
            JOptionPane.showMessageDialog(Frame1, "Please fill all the fields before appointing", "Error",0);
            } else{
                try{
                    a = Integer.parseInt(VacancyNumber);
                }
                catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(Frame1,"The inserted data format is invalid.","Invalid",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(i =0; i < StaffList.size(); i++){ 
                   StaffHire AS = StaffList.get(i); 
                    if(AS instanceof FullTimeStaffHire){ 
                   FullTimeStaffHire fTSH = (FullTimeStaffHire) AS; 
                   if(fTSH.getVacancyNumber() == a) { 
              fTSH.fullTimeStaff(StaffName,JoiningDate,Qualification,AppointedBy) ; 
              JOptionPane.showMessageDialog(Frame1,"The Full Time Staff is successfully appointed.","Success",1); 
              JOptionPane.showMessageDialog(Frame1," Vacancy Number: "+ VacancyNumber+"\n"+" Staff Name: "+ StaffName +"\n"+" Joining Date: " + JoiningDate +"\n"+" Qualification: " + Qualification +"\n"+" Appointed By: " + AppointedBy, "Details", 1); 
             break; 
                }else{ 
               JOptionPane.showMessageDialog(Frame1,"The Vacancy Number is not found","Invalid",0);
             }
            }
          }
         }
       };
    });
    JButton bt6Display = new JButton("Display All");
    bt6Display.setBounds(200,550,120,40);
    Frame1.add(bt6Display);
    bt6Display.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent ae) {
            boolean joined = false;
            for(StaffHire AS : StaffList){
                if(AS instanceof FullTimeStaffHire){
                    FullTimeStaffHire fTSH = (FullTimeStaffHire) AS;
                    joined = true;
                    fTSH.display();
                }
            }
        };
    });
    
    JButton bt7Clear = new JButton("Clear");
    bt7Clear.setBounds(200,460,120,40);
    Frame1.add(bt7Clear);
    bt7Clear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            lbl1Vacancy.setText(null);
            lbl1Designation.setText(null);
            lbl1JobType.setText(null);
            lbl1Salary.setText(null);
            lbl1WorkingHour.setText(null);
            
            lbl2Vacancy.setText(null);
            lbl2StaffName.setText(null);  
            lbl2JoiningDate.setText(null);
            lbl2Qualification.setText(null);
            lbl2AppointedBy.setText(null);
        };
    });
    
    //Adding vacancy for Part Time Staff
    //Initializing labels for Part Time Staff
    
    JLabel lbl3Header1 = new JLabel("Add Vacnacy For Part Time Staff Hire");
    lbl3Header1.setBounds(650,5,250,30);
    Frame1.add(lbl3Header1);
    
    JLabel lbl3Vacancy3= new JLabel("Vacancy Number: ");
    lbl3Vacancy3.setBounds(600,30,120,30);
    Frame1.add(lbl3Vacancy3);
    
    JLabel lbl3Designation3 = new JLabel("Designation: ");
    lbl3Designation3.setBounds(600,60,120,30);
    Frame1.add(lbl3Designation3);
    
    JLabel lbl3JobType3 = new JLabel("Job Type: ");
    lbl3JobType3.setBounds(600,90,120,30);
    Frame1.add(lbl3JobType3);
    
    JLabel lbl3WorkingHour3 = new JLabel("Working Hour: ");
    lbl3WorkingHour3.setBounds(600,120,120,30);
    Frame1.add(lbl3WorkingHour3);
    
    JLabel lbl3WagesPerHour3 = new JLabel("Wages Per Hour: ");
    lbl3WagesPerHour3.setBounds(600,150,120,30);
    Frame1.add(lbl3WagesPerHour3);
    
    JLabel lbl3Shift1 = new JLabel("Shift: ");
    lbl3Shift1.setBounds(600,180,120,30);
    Frame1.add(lbl3Shift1);
    
    //Initializing Text Fields
    JTextField lbl3Vacancy = new JTextField();
    lbl3Vacancy.setBounds(720,30,200,25);
    Frame1.add(lbl3Vacancy);
    
    JTextField lbl3Designation = new JTextField();
    lbl3Designation.setBounds(720,60,200,25);
    Frame1.add(lbl3Designation);
    
    JTextField lbl3JobType = new JTextField();
    lbl3JobType.setBounds(720,90,200,25);
    Frame1.add(lbl3JobType);
    
    JTextField lbl3WorkingHour = new JTextField();
    lbl3WorkingHour.setBounds(720,120,200,25);
    Frame1.add(lbl3WorkingHour);
    
    JTextField lbl3WagesPerHour = new JTextField();
    lbl3WagesPerHour.setBounds(720,150,200,25);
    Frame1.add(lbl3WagesPerHour);
    
    JTextField lbl3Shift = new JTextField();
    lbl3Shift.setBounds(720,180,200,25);
    Frame1.add(lbl3Shift);
    
    //Initializing Buttons for adding Part Time Staff Hire
    JButton bt2AddVacancyPTS = new JButton("Add");
    bt2AddVacancyPTS.setBounds(780,210,120,40);
    Frame1.add(bt2AddVacancyPTS);
    bt2AddVacancyPTS.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            String VacancyNumber = lbl3Vacancy.getText();
            String Designation = lbl3Designation.getText();
            String JobType = lbl3JobType.getText();
            String WorkingHour = lbl3WorkingHour.getText();
            String WagesPerHour = lbl3WagesPerHour.getText();
            String Shifts = lbl3Shift.getText();
            
            if(VacancyNumber.equals("") || Designation.equals("") ||JobType.equals("") || WorkingHour.equals("") || WagesPerHour.equals("") || Shifts.equals("")) {
            JOptionPane.showMessageDialog(Frame1, "Please fill all the respective fields before Adding", "Error", 0);  
        } else{
            try{
                int Vacancy = Integer.parseInt(VacancyNumber);
                int Workinghour = Integer.parseInt(WorkingHour);
                int WagesPerhour = Integer.parseInt(WagesPerHour);
                 
                PartTimeStaffHire PartTimeStaffHire = new PartTimeStaffHire(Vacancy,Designation,JobType,Workinghour, WagesPerhour,Shifts);
                 
                StaffList.add(PartTimeStaffHire);
                                                                                          
                JOptionPane.showMessageDialog(Frame1,"The Part Time Staff Hire is successfully added.","Success!",1);
            } catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(Frame1, "Please insert the valid data.", "Error", 0);
            }
            JOptionPane.showMessageDialog(Frame1," Vacancy Number: "+ VacancyNumber+"\n" + " Designation: " + Designation +"\n"+ " Job Type: " + JobType +"\n"+ " Working Hours: " + WorkingHour + "\n"+" Wages Per Hour: " + WagesPerHour +"\n"+ " Shifts: " + Shifts, "Details", 1);    
        }
       };
    });

    //Appointing the Part Time Staff Hire
    //Initializing labels for the Part Time Staff Hire

    JLabel lbl4Head = new JLabel("Appoint for Part Time Staff Hire");
    lbl4Head.setBounds(650,275,250,30);
    Frame1.add(lbl4Head);

    JLabel lbl4Vacancy4 = new JLabel("Vacancy Number: ");
    lbl4Vacancy4.setBounds(600,300,120,30);
    Frame1.add(lbl4Vacancy4);

    JLabel lbl4StaffName4 = new JLabel("Staff Name: ");
    lbl4StaffName4.setBounds(600,330,120,30);
    Frame1.add(lbl4StaffName4);

    JLabel lbl4JoiningDate4 = new JLabel("Joining Date: ");
    lbl4JoiningDate4.setBounds(600,360,120,30);
    Frame1.add(lbl4JoiningDate4);

    JLabel lbl4Qualification4 = new JLabel("Qualification: ");
    lbl4Qualification4.setBounds(600,390,120,30);
    Frame1.add(lbl4Qualification4);

    JLabel lbl4AppointedBy4 = new JLabel("Appointed By: ");
    lbl4AppointedBy4.setBounds(600,420,120,30);
    Frame1.add(lbl4AppointedBy4);

    JLabel lbl5Vacancy5 = new JLabel("Vacancy Number: ");
    lbl5Vacancy5.setBounds(600,520,120,40);
    Frame1.add(lbl5Vacancy5);

    //Initializing Text Fields for appointing Part Time StaffHire

    JTextField lbl4Vacancy = new JTextField();
    lbl4Vacancy.setBounds(720,300,200,25);
    Frame1.add(lbl4Vacancy);

    JTextField lbl4StaffName = new JTextField();
    lbl4StaffName.setBounds(720,330,200,25);
    Frame1.add(lbl4StaffName);

    JTextField lbl4JoiningDate = new JTextField();
    lbl4JoiningDate.setBounds(720,360,200,25);
    Frame1.add(lbl4JoiningDate);

    JTextField lbl4Qualification = new JTextField();
    lbl4Qualification.setBounds(720,390,200,25);
    Frame1.add(lbl4Qualification);

    JTextField lbl4AppointedBy = new JTextField();
    lbl4AppointedBy.setBounds(720,420,200,25);
    Frame1.add(lbl4AppointedBy);

    JTextField lbl5Vacancy = new JTextField();
    lbl5Vacancy.setBounds(720,530,200,25);
    Frame1.add(lbl5Vacancy);

    //Initializing Buttons for appointing Part Time Staff Hire

    JButton bt4AppointPTS = new JButton("Appoint");
    bt4AppointPTS.setBounds(600,460,120,40);
    Frame1.add(bt4AppointPTS);
    bt4AppointPTS.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    int f, i;
                                                
    String VacancyNumber = lbl4Vacancy.getText();                                            
    String StaffName = lbl4StaffName.getText();                                            
    String JoiningDate = lbl4JoiningDate.getText();                                            
    String Qualification = lbl4Qualification.getText();                                            
    String AppointedBy = lbl4AppointedBy.getText();
                                                
                                                
    if(VacancyNumber.trim().equals("") || StaffName.equals("") || JoiningDate.trim().equals("") || Qualification.trim().equals("") || AppointedBy.trim().equals("")){
       JOptionPane.showMessageDialog(Frame1, "Please Fill all the fields before Appointing", "Error", 0);                                                
     } else {          
       try {
               f = Integer.parseInt(VacancyNumber);
           } catch(NumberFormatException nfe) {
               JOptionPane.showMessageDialog(Frame1, "Please Enter the correct value in Vacancy Number", "Error", 0);
               return;
            }
       boolean found = false;
       for(i = 0; i < StaffList.size(); i++){ 
        StaffHire AS = StaffList.get(i); 
        if(AS instanceof PartTimeStaffHire){ 
               PartTimeStaffHire partTimeStafHire = (PartTimeStaffHire) AS; 
        if(partTimeStafHire.getVacancyNumber() == f) { 
        partTimeStafHire.partTimeStaff(StaffName,JoiningDate,Qualification,AppointedBy); 
        JOptionPane.showMessageDialog(Frame1,"The Part Time Staff Hire is successfully appointed","Success",1);
        JOptionPane.showMessageDialog(Frame1," Vacancy Number: "+ VacancyNumber+"\n"+" Staff Name: "+ StaffName +"\n"+" Joining Date: " + JoiningDate +"\n"+" Qualification: " + Qualification +"\n"+" Appointed By: " + AppointedBy, "Details", 1);
        found = true;
         } else{
            JOptionPane.showMessageDialog(Frame1, "The Vacancy Number does not exist.", " Error" ,0);
         }
         }
        }
       }
     };
    });

    JButton bt8Clear = new JButton("Clear");
    bt8Clear.setBounds(800,460,120,40);
    Frame1.add(bt8Clear);
    bt8Clear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
        lbl3Vacancy.setText(null);
        lbl3Designation.setText(null);
        lbl3JobType.setText(null);
        lbl3WorkingHour.setText(null);
        lbl3WagesPerHour.setText(null);
        lbl3Shift.setText(null);
        
        lbl4Vacancy.setText(null);
        lbl4StaffName.setText(null);
        lbl4Qualification.setText(null);
        lbl4JoiningDate.setText(null);
        lbl4AppointedBy.setText(null);
        }
    });

    //Terminate Part Time Staff
    JButton bt5Terminate = new JButton("Terminate");
    bt5Terminate.setBounds(750,560,120,40);
    Frame1.add(bt5Terminate);
    bt5Terminate.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae){
       int ok; 
       String Vacancy = JOptionPane.showInputDialog(Frame1,"Enter the vacancy number","Terminate",3); 
       try{ 
        if(Vacancy.trim().equals("")){ 
         JOptionPane.showMessageDialog(Frame1,"Enter the Vacancy Number","Terminate",3); 
         return; 
        } 
       } 
       catch(NullPointerException npe){ 
         return; 
       } 
       try{ 
          ok=Integer.parseInt(Vacancy); 
          }catch(NumberFormatException nfe){
          JOptionPane.showMessageDialog(Frame1,"Please enter the correct number","Error",0); 
          return; 
       } 
       boolean join= false; 
       for(StaffHire AS: StaffList){ 
         if(AS instanceof PartTimeStaffHire){ 
           PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire)AS; 
           if(AS.getVacancyNumber()==ok){ 
            join= true; 
            partTimeStaffHire.terminate(); 
            StaffList.remove(AS); 
            JOptionPane.showMessageDialog(Frame1,"The Staff is terminated sucessfully","Terminated",1); 
            break; 
           } 
         } 
       } 
       if(join==false){ 
         JOptionPane.showMessageDialog(Frame1,"The Vacancy Number is not found","Error",0); 
       } 
     } 
    }); 
 }
   
                                    
   public static void main(String[]args){
        new INGNepal().Frame1.setVisible(true);
    }
}