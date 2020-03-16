/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.sql.* ;


public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JButton button7;
    private JLabel label1;
    private JLabel label10;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label2;
    private JLabel label20;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JList list1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPasswordField passwordfield1;
    private JPasswordField passwordfield2;
    private JPasswordField passwordfield3;
    private JPasswordField passwordfield4;
    private JPasswordField passwordfield5;
    private JTextArea textarea2;
    private JTextField textfield1;
    private JTextField textfield10;
    private JTextField textfield11;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    
    private Customer customer;
    private CustomerList customerList;
    private ArrayList<Journey> journey;

    //Constructor 
    public GUI_project(){

        this.setTitle("GUI_project");
        this.setSize(483,401);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(483,401));
        contentPane.setBackground(new Color(192,192,192));
        
        try{            
            journey = LoadJourneys.createJourneyList();
        }catch(Exception e){
            label3.setText("Invalid Input!");
        }
        
        try{
            customerList = LoadCustomers.createCustomerList();
        }catch(Exception e){
            label3.setText("Invalid Input!");
        }

        button1 = new JButton();
        button1.setBounds(85,299,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Sign Up");
        button1.setVisible(true);
        
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                secondPanel();
              }
          });
          
        button2 = new JButton();
        button2.setBounds(293,299,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Log in");
        button2.setVisible(true);
        
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                logIn(evt);
              }
          });

        button3 = new JButton();
        button3.setBounds(181,303,90,35);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Sign up");
        button3.setVisible(true);
        
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                 signUp(evt);
              }
          });

        button4 = new JButton();
        button4.setBounds(239,342,90,35);
        button4.setBackground(new Color(214,217,223));
        button4.setForeground(new Color(0,0,0));
        button4.setEnabled(true);
        button4.setFont(new Font("sansserif",0,12));
        button4.setText("Book");
        button4.setVisible(true);
        
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                 book(evt);
              }
          });

        button6 = new JButton();
        button6.setBounds(362,342,90,35);
        button6.setBackground(new Color(214,217,223));
        button6.setForeground(new Color(0,0,0));
        button6.setEnabled(true);
        button6.setFont(new Font("sansserif",0,12));
        button6.setText("Profile");
        button6.setVisible(true);
        
        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                 moveToProfile(evt);
              }
          });

        button7 = new JButton();
        button7.setBounds(176,321,90,35);
        button7.setBackground(new Color(214,217,223));
        button7.setForeground(new Color(0,0,0));
        button7.setEnabled(true);
        button7.setFont(new Font("sansserif",0,12));
        button7.setText("UPDATE");
        button7.setVisible(true);
        
        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                 moveToProfile(evt);
              }
          });

        label1 = new JLabel();
        label1.setBounds(80,132,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,18));
        label1.setText("Username:");
        label1.setVisible(true);

        label10 = new JLabel();
        label10.setBounds(130,5,199,48);
        label10.setBackground(new Color(214,217,223));
        label10.setForeground(new Color(0,0,0));
        label10.setEnabled(true);
        label10.setFont(new Font("SansSerif",0,30));
        label10.setText("Booking Page");
        label10.setVisible(true);

        label16 = new JLabel();
        label16.setBounds(13,82,131,32);
        label16.setBackground(new Color(214,217,223));
        label16.setForeground(new Color(0,0,0));
        label16.setEnabled(true);
        label16.setFont(new Font("sansserif",0,12));
        label16.setText("Journey List");
        label16.setVisible(true);

        label17 = new JLabel();
        label17.setBounds(238,60,90,35);
        label17.setBackground(new Color(214,217,223));
        label17.setForeground(new Color(0,0,0));
        label17.setEnabled(true);
        label17.setFont(new Font("sansserif",0,12));
        label17.setText("Journey Detail");
        label17.setVisible(true);

        label18 = new JLabel();
        label18.setBounds(113,41,236,34);
        label18.setBackground(new Color(214,217,223));
        label18.setForeground(new Color(0,0,0));
        label18.setEnabled(true);
        label18.setFont(new Font("SansSerif",0,30));
        label18.setText("Change Profile");
        label18.setVisible(true);

        label19 = new JLabel();
        label19.setBounds(50,125,180,25);
        label19.setBackground(new Color(214,217,223));
        label19.setForeground(new Color(0,0,0));
        label19.setEnabled(true);
        label19.setFont(new Font("SansSerif",0,18));
        label19.setText("Change firstname:");
        label19.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(80,189,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("SansSerif",0,18));
        label2.setText("Password:");
        label2.setVisible(true);

        label20 = new JLabel();
        label20.setBounds(50,167,159,36);
        label20.setBackground(new Color(214,217,223));
        label20.setForeground(new Color(0,0,0));
        label20.setEnabled(true);
        label20.setFont(new Font("SansSerif",0,18));
        label20.setText("Change surname:");
        label20.setVisible(true);

        label22 = new JLabel();
        label22.setBounds(50,262,152,27);
        label22.setBackground(new Color(214,217,223));
        label22.setForeground(new Color(0,0,0));
        label22.setEnabled(true);
        label22.setFont(new Font("SansSerif",0,18));
        label22.setText("Change password:");
        label22.setVisible(true);

        label23 = new JLabel();
        label23.setBounds(50,216,169,32);
        label23.setBackground(new Color(214,217,223));
        label23.setForeground(new Color(0,0,0));
        label23.setEnabled(true);
        label23.setFont(new Font("SansSerif",0,18));
        label23.setText("Old password:");
        label23.setVisible(true);

        label24 = new JLabel();
        label24.setBounds(15,52,90,35);
        label24.setBackground(new Color(214,217,223));
        label24.setForeground(new Color(0,0,0));
        label24.setEnabled(true);
        label24.setFont(new Font("sansserif",0,12));
        label24.setText("");
        label24.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(128,61,226,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("SansSerif",0,30));
        label3.setText("Ticket Machine");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(25,69,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("SansSerif",0,18));
        label4.setText("Firstname:");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(237,68,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("SansSerif",0,18));
        label5.setText("Surname:");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(25,181,90,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,18));
        label6.setText("Password:");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(25,232,162,29);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("SansSerif",0,18));
        label7.setText("Confirm Password: ");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(180,6,158,41);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("SansSerif",0,30));
        label8.setText("Sign up");
        label8.setVisible(true);

        label9 = new JLabel();
        label9.setBounds(25,120,90,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("SansSerif",0,18));
        label9.setText("Username:");
        label9.setVisible(true);

        list1 = new JList(journey.toArray());
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.setVisibleRowCount(10);
        list1.setBackground(new Color(255,255,255));
        list1.setForeground(new Color(0,0,0));
        list1.setEnabled(true);
        list1.setFont(new Font("sansserif",0,12));
        
        list1.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                  selectJourney(e);
              }
          });
          
        JScrollPane listScrollPane = new JScrollPane(list1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        listScrollPane.setBounds(13,110,192,271);
        listScrollPane.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(1,5,497,393);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        panel2 = new JPanel(null);
        panel2.setBorder(BorderFactory.createEtchedBorder(1));
        panel2.setBounds(5,5,494,392);
        panel2.setBackground(new Color(214,217,223));
        panel2.setForeground(new Color(0,0,0));
        panel2.setEnabled(true);
        panel2.setFont(new Font("sansserif",0,12));
        panel2.setVisible(false);

        panel3 = new JPanel(null);
        panel3.setBorder(BorderFactory.createEtchedBorder(1));
        panel3.setBounds(5,5,474,395);
        panel3.setBackground(new Color(214,217,223));
        panel3.setForeground(new Color(0,0,0));
        panel3.setEnabled(true);
        panel3.setFont(new Font("sansserif",0,12));
        panel3.setVisible(false);

        panel4 = new JPanel(null);
        panel4.setBorder(BorderFactory.createEtchedBorder(1));
        panel4.setBounds(5,1,461,395);
        panel4.setBackground(new Color(214,217,223));
        panel4.setForeground(new Color(0,0,0));
        panel4.setEnabled(true);
        panel4.setFont(new Font("sansserif",0,12));
        panel4.setVisible(false);

        passwordfield1 = new JPasswordField();
        passwordfield1.setBounds(270,187,128,34);
        passwordfield1.setBackground(new Color(214,217,223));
        passwordfield1.setForeground(new Color(0,0,0));
        passwordfield1.setEnabled(true);
        passwordfield1.setFont(new Font("sansserif",0,12));
        passwordfield1.setVisible(true);

        passwordfield2 = new JPasswordField();
        passwordfield2.setBounds(334,181,90,35);
        passwordfield2.setBackground(new Color(214,217,223));
        passwordfield2.setForeground(new Color(0,0,0));
        passwordfield2.setEnabled(true);
        passwordfield2.setFont(new Font("sansserif",0,12));
        passwordfield2.setVisible(true);

        passwordfield3 = new JPasswordField();
        passwordfield3.setBounds(334,232,90,35);
        passwordfield3.setBackground(new Color(214,217,223));
        passwordfield3.setForeground(new Color(0,0,0));
        passwordfield3.setEnabled(true);
        passwordfield3.setFont(new Font("sansserif",0,12));
        passwordfield3.setVisible(true);

        passwordfield4 = new JPasswordField();
        passwordfield4.setBounds(305,262,90,35);
        passwordfield4.setBackground(new Color(214,217,223));
        passwordfield4.setForeground(new Color(0,0,0));
        passwordfield4.setEnabled(true);
        passwordfield4.setFont(new Font("sansserif",0,12));
        passwordfield4.setVisible(true);

        passwordfield5 = new JPasswordField();
        passwordfield5.setBounds(305,216,90,35);
        passwordfield5.setBackground(new Color(214,217,223));
        passwordfield5.setForeground(new Color(0,0,0));
        passwordfield5.setEnabled(true);
        passwordfield5.setFont(new Font("sansserif",0,12));
        passwordfield5.setVisible(true);

        textarea2 = new JTextArea();
        textarea2.setBounds(238,86,216,225);
        textarea2.setBackground(new Color(255,255,255));
        textarea2.setForeground(new Color(0,0,0));
        textarea2.setEnabled(true);
        textarea2.setFont(new Font("sansserif",0,12));
        textarea2.setText("");
        textarea2.setBorder(BorderFactory.createBevelBorder(1));
        textarea2.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(270,132,128,34);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield10 = new JTextField();
        textfield10.setBounds(305,125,90,35);
        textfield10.setBackground(new Color(255,255,255));
        textfield10.setForeground(new Color(0,0,0));
        textfield10.setEnabled(true);
        textfield10.setFont(new Font("sansserif",0,12));
        textfield10.setText("");
        textfield10.setVisible(true);

        textfield11 = new JTextField();
        textfield11.setBounds(305,167,90,35);
        textfield11.setBackground(new Color(255,255,255));
        textfield11.setForeground(new Color(0,0,0));
        textfield11.setEnabled(true);
        textfield11.setFont(new Font("sansserif",0,12));
        textfield11.setText("");
        textfield11.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(131,121,90,35);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);

        textfield3 = new JTextField();
        textfield3.setBounds(334,69,90,35);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("sansserif",0,12));
        textfield3.setText("");
        textfield3.setVisible(true);

        textfield4 = new JTextField();
        textfield4.setBounds(131,69,90,35);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("sansserif",0,12));
        textfield4.setText("");
        textfield4.setVisible(true);

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(button3);
        panel3.add(button4);
        panel3.add(button6);
        panel4.add(button7);
        panel1.add(label1);
        panel3.add(label10);
        panel3.add(label16);
        panel3.add(label17);
        panel4.add(label18);
        panel4.add(label19);
        panel1.add(label2);
        panel4.add(label20);
        panel4.add(label22);
        panel4.add(label23);
        panel3.add(label24);
        panel1.add(label3);
        panel2.add(label4);
        panel2.add(label5);
        panel2.add(label6);
        panel2.add(label7);
        panel2.add(label8);
        panel2.add(label9);
        panel3.add(listScrollPane);
        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);
        contentPane.add(panel4);
        panel1.add(passwordfield1);
        panel2.add(passwordfield2);
        panel2.add(passwordfield3);
        panel4.add(passwordfield4);
        panel4.add(passwordfield5);
        panel3.add(textarea2);
        panel1.add(textfield1);
        panel4.add(textfield10);
        panel4.add(textfield11);
        panel2.add(textfield2);
        panel2.add(textfield3);
        panel2.add(textfield4);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }
    
    public void clearPanel1(){
        textfield1.setText(" ");
        passwordfield1.setText(" ");
       }
       
    public void clearPanel2(){
        textfield2.setText(" ");
        textfield3.setText(" "); 
        textfield4.setText(" ");
        passwordfield2.setText(" ");
        passwordfield3.setText(" ");
       }
    
    public void clearPanel3(){
        textarea2.setText(" ");
       }
    
    public void clearPanel4(){
        textfield10.setText(" ");
        textfield11.setText(" ");
        passwordfield4.setText(" ");
        passwordfield5.setText(" ");
       }
       
    public void firstPanel(){
        clearPanel1();
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
       }
    
    public void secondPanel(){
        clearPanel2();
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
       }
    
    public void thirdPanel(){
        clearPanel3();
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);
        panel4.setVisible(false);
       }
    
    public void fourthPanel(){
        clearPanel4();
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
       }

    public void logIn(ActionEvent evt){
        String username = textfield1.getText();
        String password = String.valueOf(passwordfield1.getPassword());
        if(customerList.login_check(username,password).equals(null)){
                label3.setText("Invalid Input!");
           }else{
                customer = customerList.login_check(username,password); 
                thirdPanel();
           }
       }

   public void signUp(ActionEvent evt){
       
            String firstname = textfield2.getText();
            String surname = textfield3.getText();
            String username = textfield4.getText();
            String password = String.valueOf(passwordfield2.getPassword());
            String cpassword = String.valueOf(passwordfield3.getPassword());
            
            if(cpassword!=password){
                label8.setText("Password does not match!");
            }else{
                 firstPanel();
            }
            
            customer = new Customer(firstname,surname,username,password);
            
            customerList.registrate(customer);
            
            try{
                LoadCustomers.addCustomer(firstname,surname,username,password);
            }catch(Exception e){
                label8.setText("Does not exist.");
            }

        }
        
   public void selectJourney(ListSelectionEvent e){
            textarea2.setText("");
            Journey choosenJourney = journey.get(list1.getSelectedIndex());
            textarea2.append("Available Seats:" + choosenJourney.getAvailableSeat()+"\n");
            textarea2.append("Price:" + choosenJourney.getPrice()+"\n");
            textarea2.append("Date:" + choosenJourney.getDate()+"\n");
            textarea2.append("Duration:" + choosenJourney.getDuration()+"\n");
            textarea2.append("Depature:" + choosenJourney.getFrom()+"\n");
            textarea2.append("Destination:" + choosenJourney.getTo()+"\n");
            }
            
        public void book(ActionEvent evt){
            textarea2.setText("");
            
            Journey choosenJourney = journey.get(list1.getSelectedIndex());
            
            textarea2.append("Now you've booked" + choosenJourney.getID()+"\n");
            textarea2.append("From" + choosenJourney.getFrom()+ "to" + choosenJourney.getTo() + "\n");
               
        }
        
        public void moveToProfile(ActionEvent evt){
            fourthPanel();
        }
        
        public void updateProfile(ActionEvent evt){
            String newfirstname = textfield10.getText();
            String newsurname = textfield11.getText();
            String oldpassword = String.valueOf(passwordfield4.getPassword());
            String newpassword = String.valueOf(passwordfield5.getPassword());
        
            customer.changePassword(newpassword);
            customer.changeFirstname(newfirstname);
            customer.changeSurname(newsurname);
            
            firstPanel();
        }
        
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project();
            }
        });
    }

}