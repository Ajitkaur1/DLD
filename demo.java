

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


class demo extends JFrame
{

Container cp;

demo(){
	setUndecorated(true);
	cp=getContentPane();
	
	
	
		try{
   //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");


	

	//System.out.println("Container loaded");

	cp.setLayout(null); 
	//JFrame f=this;
	JLabel l1=new JLabel(new ImageIcon("splash.jpg"));
	l1.setBounds(0,0,593,445);
	cp.add(l1);
	l1.setVisible(true);
	//System.out.println("Image loaded");
	
	//
	}catch(Exception e){System.out.println(e);}
}


 
	


public static void main(String args[])
{
	
}
}