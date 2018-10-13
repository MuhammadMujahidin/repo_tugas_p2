package Tugas_PBO2_p2;

import java.awt.event.*;
import javax.swing.*;

public class Bioskop extends JFrame
{
 JLabel lbltitle=new JLabel("TIKET BIOSKOP DUTA MALL BANJARMASIN");
 JLabel lblfilm=new JLabel("Film");
 JTextField txfilm=new JTextField(20);
 JLabel lbltime=new JLabel("Time");
 JRadioButton time1=new JRadioButton("15:15");
 JRadioButton time2=new JRadioButton("17:15"); 
 JRadioButton time3=new JRadioButton("19:15");
 JRadioButton time4=new JRadioButton("21:15");
 JRadioButton time5=new JRadioButton("23:15");
 ButtonGroup gruptime=new ButtonGroup(); 
 JLabel lbldate=new JLabel("Date");
 JTextField txdate=new JTextField(50);
 JButton tblprocess=new JButton("Process");
 JLabel lblrow=new JLabel("Row");
 JCheckBox A=new JCheckBox("A");
 JCheckBox B=new JCheckBox("B");
 JCheckBox C=new JCheckBox("C"); 
 JCheckBox D=new JCheckBox("D");
 JCheckBox E=new JCheckBox("E");
 JCheckBox F=new JCheckBox("F");
 JCheckBox G=new JCheckBox("G");
 JCheckBox H=new JCheckBox("H"); 
 JLabel lblseat=new JLabel("Seat");
 JTextField txseat=new JTextField(20);
 JLabel lblout=new JLabel("Output");
 JTextArea out=new JTextArea();
 Bioskop()
 {
 setTitle("Tiket Bioskop");
 setLocation(300,100);
 setSize(500,350);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void komponenVisual()
 {
 getContentPane().setLayout(null);
 getContentPane().add(lbltitle);
 lbltitle.setBounds(130,1,250,30);
 
 getContentPane().add(lblfilm);
 lblfilm.setBounds(10,30,70,20);
 getContentPane().add(txfilm);
 txfilm.setBounds(100,30,150,20);
 
 getContentPane().add(lbltime);
 lbltime.setBounds(10,50,70,20);
 getContentPane().add(time1);
 time1.setBounds(100,50,70,20);
 getContentPane().add(time2);
 time2.setBounds(170,50,70,20);
 getContentPane().add(time3);
 time3.setBounds(240,50,70,20);
 getContentPane().add(time4);
 time4.setBounds(100,70,70,20);
 getContentPane().add(time5);
 time5.setBounds(170,70,70,20);
 gruptime.add(time1);
 gruptime.add(time2);
 gruptime.add(time3); 
 gruptime.add(time4);
 gruptime.add(time5); 
 
 getContentPane().add(lbldate);
 lbldate.setBounds(10,90,70,20);
 getContentPane().add(txdate);
 txdate.setBounds(100,90,100,20);
 
 getContentPane().add(lblrow);
 lblrow.setBounds(10,110,100,20);
 getContentPane().add(A);
 A.setBounds(100,110,50,20);
 getContentPane().add(B);
 B.setBounds(150,110,50,20);
 getContentPane().add(C);
 C.setBounds(200,110,50,20);
 getContentPane().add(D);
 D.setBounds(250,110,50,20);
 getContentPane().add(E);
 E.setBounds(300,110,50,20);
 getContentPane().add(F);
 F.setBounds(350,110,50,20);
 getContentPane().add(G);
 G.setBounds(400,110,50,20);
 getContentPane().add(H);
 H.setBounds(450,110,50,20); 
 
 getContentPane().add(lblseat);
 lblseat.setBounds(10,130,100,20);
 getContentPane().add(txseat);
 txseat.setBounds(100,130,50,20);
 
 getContentPane().add(lblout);
 lblout.setBounds(10,190,70,20);
 getContentPane().add(out);
 out.setBounds(10,210,420,100); 
 
 getContentPane().add(tblprocess);
 tblprocess.setBounds(30,170,100,20);
 setVisible(true);
 }
 void AksiReaksi()
 {
 tblprocess.addActionListener((ActionEvent e) -> {
    
     out.append(txfilm.getText()+"\n");
     
     if(time1.isSelected()==true)
     {
         out.append(time1.getText()+"\n");
     }
     if(time2.isSelected()==true)
     {
         out.append(time2.getText()+"\n");
     }
     if(time3.isSelected()==true)
     {
         out.append(time3.getText()+"\n");
     }
     if(time4.isSelected()==true)
     {
         out.append(time4.getText()+"\n");
     }
     if(time5.isSelected()==true)
     {
         out.append(time5.getText()+"\n");
     }
     
     out.append(txdate.getText()+"\n");
     
     if(A.isSelected()==true)
     {
         out.append(A.getText()+"\n");
     }
     if(B.isSelected()==true)
     {
         out.append(B.getText()+"\n");
     }
     if(C.isSelected()==true)
     {
         out.append(C.getText()+"\n");
     }
     if(D.isSelected()==true)
     {
         out.append(D.getText()+"\n");
     }
     if(E.isSelected()==true)
     {
         out.append(E.getText()+"\n");
     }
     if(F.isSelected()==true)
     {
         out.append(F.getText()+"\n");
     } 
     if(G.isSelected()==true)
     {
         out.append(G.getText()+"\n");
     }
     if(H.isSelected()==true)
     {
         out.append(H.getText()+"\n");
     }
     
     out.append(txseat.getText()+"\n");
 }
 );
 }
 public static void main(String args[])
 { 
 Bioskop ap=new Bioskop();
 ap.komponenVisual();
 ap.AksiReaksi();
 }    

}

