package project;
  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;
import java.io.*;

public class shop extends JFrame implements ActionListener{
    JButton bPixel,bIphone,bSamsung,Buy,Cancel;
    JTextArea screen;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15;
    JLabel lab,Price;
    String x;
public shop(){
    ButtonGroup bg=new ButtonGroup();  

    Font Fname = new Font("Times New Roman",Font.BOLD,40);
    Font Fbutton = new Font("Times New Roman",Font.ROMAN_BASELINE,15);
    Font Fname1 = new Font("Times New Roman",Font.BOLD,23);
    Font Fdetail = new Font("Times New Roman",Font.ROMAN_BASELINE,20);
    Font Fprice = new Font("Times New Roman",Font.BOLD,15);
    JLabel Mname = new JLabel("SPECIFICATIONS");
    JLabel name = new JLabel("Digital House");
    lab = new JLabel("");
    Price = new JLabel("");
    bPixel = new JButton("Pixel");
    bIphone = new JButton("Iphone");
    bSamsung = new JButton("Samsung");
    Buy = new JButton("Buy");
    Cancel = new JButton("Close");
    screen = new JTextArea();
    r1=new JRadioButton("Pixel 7");    
    r2=new JRadioButton("Pixel 6"); 
    r3=new JRadioButton("Pixel 5"); 
    r4=new JRadioButton("Pixel 4"); 
    r5=new JRadioButton("Pixel 3"); 
    r6=new JRadioButton("I phone 14");    
    r7=new JRadioButton("I phone 13"); 
    r8=new JRadioButton("I phone 12"); 
    r9=new JRadioButton("I phone 11"); 
    r10=new JRadioButton("I phone x"); 
    r11=new JRadioButton("Galaxy S10");    
    r12=new JRadioButton("Galaxy S9"); 
    r13=new JRadioButton("Galaxy J5"); 
    r14=new JRadioButton("Galaxy J2"); 
    r15=new JRadioButton("Galaxy A53"); 
    
    name.setBackground(Color.LIGHT_GRAY);
    Mname.setBackground(Color.LIGHT_GRAY);
    
    name.setBounds(180, 30, 400, 50);
    bPixel.setBounds(50,100,100,30);
    bIphone.setBounds(250,100,100,30);
    bSamsung.setBounds(450,100,100,30);
    Buy.setBounds(300,510,100,30);
    Cancel.setBounds(50,510,100,30);
    Price.setBounds(420,500,140,30);
    Mname.setBounds(50, 290, 300, 30);
    screen.setBounds(50, 320, 350, 180);
    lab.setBounds(410, 320, 150, 170);
    r1.setBounds(50,130,100,30);    
    r2.setBounds(50,160,100,30);
    r3.setBounds(50,190,100,30);   
    r4.setBounds(50,220,100,30);   
    r5.setBounds(50,250,100,30);      
    r6.setBounds(250,130,100,30);    
    r7.setBounds(250,160,100,30);
    r8.setBounds(250,190,100,30);   
    r9.setBounds(250,220,100,30);   
    r10.setBounds(250,250,100,30);      
    r11.setBounds(450,130,100,30);    
    r12.setBounds(450,160,100,30);
    r13.setBounds(450,190,100,30);   
    r14.setBounds(450,220,100,30);   
    r15.setBounds(450,250,100,30);      
    
    name.setFont(Fname);
    bPixel.setFont(Fbutton);
    bIphone.setFont(Fbutton);
    bSamsung.setFont(Fbutton);
    Buy.setFont(Fbutton);
    Cancel.setFont(Fbutton);
    Price.setFont(Fprice);
    Mname.setFont(Fname1);
    screen.setFont(Fdetail);

    add(name);
    add(bPixel);
    add(bIphone);
    add(bSamsung);
    add(Buy);
    add(Cancel);
    add(Price);
    add(Mname);
    add(screen);
    add(lab);
    add(r1);
    add(r2);
    add(r3);
    add(r4);
    add(r5);   
    add(r6);
    add(r7); 
    add(r8);
    add(r9);
    add(r10); 
    add(r11);
    add(r12); 
    add(r13);
    add(r14);
    add(r15); 
    
    bg.add(r1);
    bg.add(r2); 
    bg.add(r3);
    bg.add(r4);
    bg.add(r5);   
    bg.add(r6);
    bg.add(r7); 
    bg.add(r8);
    bg.add(r9);
    bg.add(r10); 
    bg.add(r11);
    bg.add(r12); 
    bg.add(r13);
    bg.add(r14);
    bg.add(r15); 

    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);
    r4.addActionListener(this);
    r5.addActionListener(this);
    r6.addActionListener(this);
    r7.addActionListener(this);
    r8.addActionListener(this);
    r9.addActionListener(this);
    r10.addActionListener(this);
    r11.addActionListener(this);
    r12.addActionListener(this);
    r13.addActionListener(this);
    r14.addActionListener(this);
    r15.addActionListener(this);
    
    setSize(600,600);
    setLayout(null);
    setTitle("Mobile Shop");
    setVisible(true);
 
    
    Buy.addActionListener(new ActionListener (){
         public void actionPerformed(ActionEvent e){
            setVisible(false);
            NewClass  info = new NewClass();
            
            if(r1.isSelected()){NewClass.f9.setText(x);}
            if(r2.isSelected()){NewClass.f9.setText(x);}
            if(r3.isSelected()){NewClass.f9.setText(x);}
            if(r4.isSelected()){NewClass.f9.setText(x);}
            if(r5.isSelected()){NewClass.f9.setText(x);}
            if(r6.isSelected()){NewClass.f9.setText(x);}
            if(r7.isSelected()){NewClass.f9.setText(x);}
            if(r8.isSelected()){NewClass.f9.setText(x);}
            if(r9.isSelected()){NewClass.f9.setText(x);}
            if(r10.isSelected()){NewClass.f9.setText(x);}
            if(r11.isSelected()){NewClass.f9.setText(x);}
            if(r12.isSelected()){NewClass.f9.setText(x);}
            if(r13.isSelected()){NewClass.f9.setText(x);}
            if(r14.isSelected()){NewClass.f9.setText(x);}
            if(r15.isSelected()){NewClass.f9.setText(x);}}});
    
    Cancel.addActionListener(new ActionListener (){public void actionPerformed(ActionEvent e){System.exit(0);}});
    addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){dispose();}});
 }
   
public void actionPerformed(ActionEvent e) {   
if(r1.isSelected()){    
    screen.setText("\n               Ram                      4GB\n"
    +"               Memory                128GB\n"
    +"               Battery                  3000mAh\n"
    +"               Front Camera   \t4MP\n"
    +"               Main Camera   \t8MP \n");
    ImageIcon Pimage7 = new ImageIcon("D:\\pixel7.jpg");
    lab.setIcon(Pimage7);
    x = "     210,000/- PKR";
    Price.setText(x);}

if(r2.isSelected()){    
    screen.setText("\n               Ram                      6GB\n"
    +"               Memory                128GB\n"
    +"               Battery                  3500mAh\n"
    +"               Front Camera   \t6MP\n"
    +"               Main Camera   \t108MP \n");
    ImageIcon pimage6 = new ImageIcon("D:\\pixel6.jpg");
    lab.setIcon(pimage6);
    x = "     170,000/- PKR";
    Price.setText(x);}

if(r3.isSelected()){    
    screen.setText("\n               Ram                      8GB\n"
    +"               Memory                256GB\n"
    +"               Battery                  3500mAh\n"
    +"               Front Camera   \t8MP\n"
    +"               Main Camera   \t12MP \n");
    ImageIcon pimage5 = new ImageIcon("D:\\pixel5.jpg");
    lab.setIcon(pimage5);
    x="     150,000/- PKR";
    Price.setText(x);} 

if(r4.isSelected()){    
    screen.setText("\n               Ram                      10GB\n"
    +"               Memory                256GB\n"
    +"               Battery                  4000mAh\n"
    +"               Front Camera   \t8MP\n"
    +"               Main Camera   \t12MP \n");
    ImageIcon pimage4 = new ImageIcon("D:\\Pixel4.jpg");
    lab.setIcon(pimage4);
    x= "     150,000/- PKR";
    Price.setText(x);}

if(r5.isSelected()){    
    screen.setText("\n               Ram                      12GB\n"
    +"               Memory                512GB\n"
    +"               Battery                  4500mAh\n"
    +"               Front Camera   \t12MP\n"
    +"               Main Camera   \t16MP \n");
    ImageIcon pimage3 = new ImageIcon("D:\\pixel 3.jpg");
    lab.setIcon(pimage3);  
    x="     105,000/- PKR";
    Price.setText(x);}

if(r6.isSelected()){    
    screen.setText("\n               Ram                      2GB\n"
    +"               Memory                64GB\n"
    +"               Battery                  2500mAh\n"
    +"               Front Camera   \t4MP\n"
    +"               Main Camera   \t6MP \n");
    ImageIcon Iimage1 = new ImageIcon("D:\\iphone14.jpg");
    lab.setIcon(Iimage1);
    x="     350,000/- PKR";
    Price.setText(x);}

if(r7.isSelected()){    
    screen.setText("\n               Ram                      4GB\n"
    +"               Memory                64GB\n"
    +"               Battery                  3000mAh\n"
    +"               Front Camera   \t6MP\n"
    +"               Main Camera   \t8MP \n");
    ImageIcon Iimage2 = new ImageIcon("D:\\iphone13.jpg");
    lab.setIcon(Iimage2);
    x="     270,000/- PKR";
    Price.setText(x);}

if(r8.isSelected()){    
    screen.setText("\n               Ram                      6GB\n"
    +"               Memory                128GB\n"
    +"               Battery                  3500mAh\n"
    +"               Front Camera   \t8MP\n"
    +"               Main Camera   \t12MP \n");
    ImageIcon Iimage3 = new ImageIcon("D:\\iphone12.jpg");
    lab.setIcon(Iimage3);
    x="     210,000/- PKR";
    Price.setText(x);} 

if(r9.isSelected()){    
    screen.setText("\n               Ram                      8GB\n"
    +"               Memory                256GB\n"
    +"               Battery                  4000mAh\n"
    +"               Front Camera   \t12MP\n"
    +"               Main Camera   \t16MP \n");
    ImageIcon Iimage4 = new ImageIcon("D:\\iphone11.jpg");
    lab.setIcon(Iimage4);
    x="     170,000/- PKR";
    Price.setText(x);} 

if(r10.isSelected()){    
    screen.setText("\n               Ram                      6GB\n"
    +"               Memory                512GB\n"
    +"               Battery                  4000mAh\n"
    +"               Front Camera   \t8MP\n"
    +"               Main Camera   \t12MP \n");
    ImageIcon Iimage5 = new ImageIcon("D:\\iphoneX.jpg");
    lab.setIcon(Iimage5);
    x="     130,000/- PKR";
    Price.setText(x);} 

if(r11.isSelected()){    
    screen.setText("\n               Ram                      2GB\n"
    +"               Memory                16\n"
    +"               Battery                  2500mAh\n"
    +"               Front Camera   \t4MP\n"
    +"               Main Camera   \t6MP \n");
   ImageIcon Simage1 = new ImageIcon("D:\\galaxy s10.jpg");
    lab.setIcon(Simage1);
    x="     220,000/- PKR";
    Price.setText(x);}

if(r12.isSelected()){    
    screen.setText("\n               Ram                      4GB\n"
    +"               Memory                32GB\n"
    +"               Battery                  3000mAh\n"
    +"               Front Camera   \t6MP\n"
    +"               Main Camera   \t8MP \n");
    ImageIcon Simage2 = new ImageIcon("D:\\galaxy s9.jpg");
    lab.setIcon(Simage2);
    x="     160,000/- PKR";
    Price.setText(x);}

if(r13.isSelected()){    
    screen.setText("\n               Ram                      4GB\n"
    +"               Memory                64GB\n"
    +"               Battery                  3000mAh\n"
    +"               Front Camera   \t4MP\n"
    +"               Main Camera   \t6MP \n");
    ImageIcon Simage3 = new ImageIcon("D:\\galaxy j5.jpg");
    lab.setIcon(Simage3);
    x="     21,000/- PKR";
    Price.setText(x);} 

if(r14.isSelected()){    
    screen.setText("\n               Ram                      6GB\n"
    +"               Memory                256GB\n"
    +"               Battery                  3500mAh\n"
    +"               Front Camera   \t8MP\n"
    +"               Main Camera   \t12MP \n");
    ImageIcon Simage4 = new ImageIcon("D:\\galaxyj2.jpg");
    lab.setIcon(Simage4);
    x="     10,000/- PKR";
    Price.setText(x);} 

if(r15.isSelected()){    
    screen.setText("\n               Ram                      8GB\n"
    +"               Memory                512GB\n"
    +"               Battery                  5000mAh\n"
    +"               Front Camera   \t12MP\n"
    +"               Main Camera   \t16MP \n");
    ImageIcon Simage5 = new ImageIcon("D:\\galaxy a53.jpg");
    lab.setIcon(Simage5);
    x="     35,000/- PKR";
    Price.setText(x);} 

if(e.getSource()==Cancel){screen.setText(" ");}}
    
public static void main(String[] args) {
shop obj = new shop();}
}
