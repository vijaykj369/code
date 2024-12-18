//creating a simple gui calculator
//importing swing and event modules
import javax.swing.*;
import java.awt.event.*;

//class Calcnew implements Actionlistener interface
public class Calcnew implements ActionListener {
    
   //declaring object reference for JFrame JTextField and JButton classes

    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bclr;
    static double a=0,b=0,result=0;
    static int operator=0;//used in switch case
    
    //constructor for Calcnew class
    Calcnew(){
       //creating objects and giving identification names  for each
        f=new JFrame("CALCULATOR");
        t=new JTextField();//display area of calculator
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");//button for equals
        bclr=new JButton("DELETE");//button for clear or delete

      //setting bounds for each components
        t.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        bclr.setBounds(110,380,100,40);

       //adding all the components to the frame
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bclr);

        //setting up the frame design
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        //telling the compiler which are all the buttons are performing action
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);

    }
    //method for what action should be performed
    public void actionPerformed(ActionEvent e){
           
            if(e.getSource()==b1)   //getsource method returns the object of a specific button when you click
               t.setText(t.getText().concat("1"));//gettext method returns what is there in the textfield curently
            if(e.getSource()==b2)                  
               t.setText(t.getText().concat("2"));//settext sets the display
            if(e.getSource()==b3)
               t.setText(t.getText().concat("3")); 
            if(e.getSource()==b4)
               t.setText(t.getText().concat("4"));
            if(e.getSource()==b5)
               t.setText(t.getText().concat("5"));
            if(e.getSource()==b6)
               t.setText(t.getText().concat("6"));
            if(e.getSource()==b7)
               t.setText(t.getText().concat("7"));
            if(e.getSource()==b8)
               t.setText(t.getText().concat("8"));
            if(e.getSource()==b9)
               t.setText(t.getText().concat("9"));
            if(e.getSource()==b0)
               t.setText(t.getText().concat("0"));

        if(e.getSource()==badd){
            a=Double.parseDouble(t.getText());//parse method converts string to numbers
               operator=1;
               t.setText("");
        }
        if(e.getSource()==bsub){
             a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==bmul){
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(e.getSource()==bdec)
           t.setText(t.getText().concat("."));



        if(e.getSource()==beq){
          Double b=Double.parseDouble(t.getText());
            switch(operator){
                case 1:result=a+b;
                       break;
                case 2:result=a-b;
                       break;
                case 3:result=a*b;
                       break;
                case 4:result=a/b;
                       break;
                default:result=0;
            }
            t.setText(""+result);
     }
     if(e.getSource()==bclr)
        t.setText("");
    
    }
    public static void main(String[]args){
        new Calcnew();//calling the Calcnew class constructor
        //this we execute only code within the constructor

        //the actionperformed method will get triggerd when we click the buttons or when we perform the actions
    }

    
}
