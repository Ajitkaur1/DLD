

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.net.*;
import java.text.*;
import javax.sound.sampled.*;
import javax.swing.text.*; 
import javax.swing.text.html.*;
import java.awt.image.*;
import javax.imageio.*;


 public class Main extends JFrame implements MouseListener
{
Image img;
Container cp;
JButton b1,b2,b3,b4,b5,b6,b7,b8,comm;
ImageIcon i1,i2,i3,i4;
JPanel jpx,p1,p2,p3,p4,p5;
JLabel l1,l2; 
JComboBox cbb,cbb2,cbb3;
JLabel z1,z2,z3,z4,z5,z6,z7,z8,z9,z10;
MenuBar mb;
Menu file;
int visi=0;
MenuItem file1;
 JComboBox comb ;
 JCheckBox cc1,cc2,cc3;
 String fflag="";
public JInternalFrame jf1,jf2,jf3,jf4,jf5,jf6,his,ser;
JFrame jframe;
JLabel info,Main_l;
JTextField it1,it2,it3,it4,save_t1;
JPasswordField ip1,ip2,ip3,ip4;
JTabbedPane tb;
JButton up,down;
JPanel jp,jpx2;
int i_ver=0,j_ver=3;
Socket save_s;
 int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
 int h1=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
 JEditorPane a[]=new JEditorPane[10000];
 int count=0,b_count=0; 
 JEditorPane ehelp;
 JButton ib31,ib32,ib33,ib34,ib35;
 JButton b[]=new JButton[10000];
 JPanel jhelp;
 JButton bhelp,ll2;
 JLabel lhelp1,lhelp2;
int button_j=0,xx=0;
int h_count=1,thr2_first=0;
int p2_change=0,move=0,send_data=0,get=0; 
	String html="<html> <body> <h3>Welcome to Data Leakage Client</h3><center>>Ajitkaur saini <br>>Mrughesh verekar<br>>Pravin Rane<br><a href=example.com>saini11k@uwindsor.ca</center>";
 JButton save_b1,save_b2,save_b3;
JLabel time;
JInternalFrame save_jff,jjvv;
PrintWriter pwx;
BufferedReader brx;
Thread thr2,thr3,thr4,thr5,dete;
JInternalFrame comm_f;
JLabel com_l1,com_l2,com_l3,com_l4,com_l5,com_l6;
JButton com_b1,com_b2,com_b3,com_b4,com_b5;
JTextField com_t1,com_t2,com_t3,com_t4,com_t5;
String exp_file=""; 
JList chat_list;
DefaultListModel dl;
JPanel chat_p;
JTextArea chat_a,ser_a1,ser_a2;
JButton chat_b;
JLabel chat_l;
String temp_name="";
public String  server_ip="";
public String server_p1="192.168.43.5";

JInternalFrame newjf;
JTextArea newjta,newjta2,his_t;
JScrollPane newjsp,newjsp2,newjsp3;
JTextField newt,newt1;
ServerSocket newsersock,newsersock1;
Socket newsock,newsock1;
DataInputStream newins,newins1;
PrintStream newout,newout1;
Thread newthread,newthread1;
int newport=0,newport1=0;
String newline="";
FileWriter fwr;
BufferedWriter bfwr;
JButton newbt,newbt1;
JInternalFrame newinf;
JTextPane newtxp;
FileDialog newjfd;
String newdirs,newfils;
String fna="";
JPanel newj;
JViewport jvp;
public Main()
{
	
	setResizable(false);
cp=getContentPane();
try{

UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception w){}
Color cc=new Color(0xD7D5D5);




jframe=this;
jframe.setUndecorated(true);

//setMaximumSize(1380,900);
//jframe.setMinimizable(false);
//jframe.setMaximizable(false);

mb=new MenuBar();
setMenuBar(mb);
file=new Menu("File");
mb.add(file);

file1=new MenuItem("File!");
file.add(file1);


p1=new JPanel();
p1.setLayout(null);
p1.setBounds(0,0,1400,900);
cp.add(p1);

p2=new JPanel();
p2.setLayout(null);
p2.setBounds(10,30,130,600);
p1.add(p2);
p2.setOpaque(false);

jhelp= new JPanel();
jhelp.setBounds(970,400,500,300);
p1.add(jhelp);
jhelp.setOpaque(false);
jhelp.setLayout(null);


bhelp=new JButton(new ImageIcon("i/l8.png"));
bhelp.setBounds(0,0,70,300);
jhelp.add(bhelp); 
bhelp.setContentAreaFilled(false);


Main_l=new JLabel("");
Main_l.setBounds(350,150,350,50);
p1.add(Main_l);
Main_l.setFont(new Font("Sanserif",Font.PLAIN,35));
Main_l.setForeground(Color.white);


p2.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,5,5)));

/*
Main_l.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,5,5)));


Main_l.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,15,15)));

*/

jhelp.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,5,5)));


bhelp.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,5,5)));


info=new JLabel("information loading...");
info.setBounds(600,30,250,30);
info.setFont(new Font("Colonna MT",Font.BOLD,16));
Color c=new Color(0x1ffff);
info.setForeground(cc);
p1.add(info);
info.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,10,10)));


lhelp1=new JLabel(new ImageIcon("i/PC_Fox_wit_1180x200.gif"));
lhelp1.setBounds(70,100,160,250);
jhelp.add(lhelp1);
lhelp1.setOpaque(false);



ehelp=new JEditorPane();
ehelp.setContentType("text/html");
ehelp.setBounds(170,10,200,130);
jhelp.add(ehelp);
ehelp.setOpaque(false);
ehelp.setText(html);
ehelp.setForeground(new Color(0x818181));
ehelp.setFont(new Font("Sanserif",Font.PLAIN,12));
ehelp.setForeground(new Color(0x818181));
ehelp.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,5,8)));



time=new JLabel();
time.setBounds(1180,30,200,50);
p1.add(time);
time.setForeground(Color.white);
time.setFont(new Font("DIGIFACEWIDE",Font.BOLD,18));
time.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,10,10)));



ll2=new JButton("     User");
ll2.setBounds(0,0,130,50);
p2.add(ll2);

ll2.setForeground(Color.white);
ll2.setFont(new Font("Arial",Font.BOLD,16));
ll2.setOpaque(false);
ll2.setContentAreaFilled(false);
ll2.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,5,8)));

l1=new JLabel(new ImageIcon("i/1 (4).jpg"));
l1.setBounds(0,0,1400,900);








// history
 try{
 	UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
 
 }catch(Exception d){}

 his=new JInternalFrame("Access History");
 his.setSize(500,400);
 his.setLocation(200,150);
 his.setLayout(new GridLayout(0,1));
 //his.setVisible(true);
 his.setClosable(true);
 p1.add(his);
 
 
 his_t=new JTextArea();
 his_t.setForeground(Color.blue);
 JScrollPane hj=new JScrollPane(his_t);
 his.add(hj);
 his_t.setEditable(false);
 
 
 
 
 
 
 
 // Search 
 ser=new JInternalFrame("WaterMark Search");
 ser.setSize(500,400);
 ser.setLocation(200,150);
 ser.setLayout(new BorderLayout());
 //his.setVisible(true);
 ser.setClosable(true);
 p1.add(ser);
 
 JButton ser_b1=new JButton("Open File");
 ser.add(ser_b1,BorderLayout.NORTH);
 
 ser_a1=new JTextArea();
 JScrollPane gh=new JScrollPane(ser_a1);
 ser.add(gh,BorderLayout.CENTER);
 ser_a1.setForeground(Color.blue);
 ser_a1.setEditable(false);
 
 
 ser_b1.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)	
 {
 	try{
 		
 		FileDialog fd=new FileDialog(new JFrame(),"Select File");
 		fd.setVisible(true);
 		
 		String dir=fd.getDirectory();
 		String name=fd.getFile();
 		
 		
 		FileReader rd=new FileReader(dir+name+":my_hide.lkg");
 		ser_a1.read(rd,null);
 		rd.close();
 		
 		
 	}catch(Exception ed){ ser_a1.setText("No WaterMark Found in File!!!");  System.out.println(ed);}
 }
 	
 });
 
// ser.setVisible(true);
 
 
 //End search
 
try{

UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception g){System.out.println(g);}

// End of history





// Start of panel 2 buttons2

z1=new JLabel("User Login");
z1.setBounds(35,95,100,20);
z1.setForeground(Color.white);
p2.add(z1);


 b1=new JButton(new ImageIcon("i/Login_0248x48.png"));
//b1.setToolTipText("<html> <title> <head><h3>Login Button</h3><br></head></title> <Body> To Open Login form.<br> Eshtablesh Connection with server.<br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

b1.setBorderPainted(false);
b1.setBounds(0,10,128,128);
p2.add(b1);
b1.setOpaque(false);
b1.setContentAreaFilled(false);
b1.setRolloverIcon(new ImageIcon("i/Login-02.png"));




z2=new JLabel("Open Window");
z2.setBounds(30,190,100,20);
z2.setForeground(Color.white);
p2.add(z2);


b2=new JButton(new ImageIcon("i/numeric_field_down_12848x48.png"));
b2.setBorderPainted(false);

//
b2.setBounds(0,105,128,128);
p2.add(b2);
b2.setOpaque(false);
b2.setContentAreaFilled(false);
b2.setRolloverIcon(new ImageIcon("i/numeric_field_down_128.png"));



z3=new JLabel("File Storage");
z3.setBounds(30,285,100,20);
z3.setForeground(Color.white);
p2.add(z3);


b3=new JButton(new ImageIcon("i/folder_web_upload48x48.png"));
b3.setBorderPainted(false);
b3.setBounds(0,200,128,128);

p2.add(b3);
b3.setOpaque(false);
b3.setContentAreaFilled(false);
b3.setRolloverIcon(new ImageIcon("i/folder_web_upload.png"));




z4=new JLabel("Exit");
z4.setBounds(55,385,100,20);
z4.setForeground(Color.white);
p2.add(z4);


b4=new JButton(new ImageIcon("i/exit_248x48.png"));
b4.setBorderPainted(false);
b4.setBounds(0,295,128,128);
//
p2.add(b4);
b4.setOpaque(false);
b4.setContentAreaFilled(false);
b4.setRolloverIcon(new ImageIcon("i/exit-2.png"));



//End of p2 buttons1



// Start of panel 2 buttons2



z5=new JLabel("New search");
z5.setBounds(35,95,100,20);
z5.setForeground(Color.white);
p2.add(z5);


 b5=new JButton(new ImageIcon("i/rsz_search.png"));

b5.setBorderPainted(false);
b5.setBounds(0,10,128,128);
p2.add(b5);
b5.setOpaque(false);
b5.setContentAreaFilled(false);
b5.setRolloverIcon(new ImageIcon("i/search.png"));




z6=new JLabel("Server Files");
z6.setBounds(45,190,100,20);
z6.setForeground(Color.white);
p2.add(z6);


b6=new JButton(new ImageIcon("i/rsz_folder_black_web_upload.png"));
b6.setBorderPainted(false);

b6.setBounds(0,105,128,128);
p2.add(b6);
b6.setOpaque(false);
b6.setContentAreaFilled(false);
b6.setRolloverIcon(new ImageIcon("i/folder_black_web_upload.png"));



z7=new JLabel("History");
z7.setBounds(45,285,100,20);
z7.setForeground(Color.white);
p2.add(z7);


b7=new JButton(new ImageIcon("i/folder_history48x48.png"));
b7.setBorderPainted(false);
b7.setBounds(0,200,128,128);
//
p2.add(b7);

b7.setOpaque(false);
b7.setContentAreaFilled(false);
b7.setRolloverIcon(new ImageIcon("i/folder_history.png"));




z8=new JLabel("Setting");
z8.setBounds(40,380,100,20);
z8.setForeground(Color.white);
p2.add(z8);

				
b8=new JButton(new ImageIcon("i/apple_festival_app_settings48x48.png"));
b8.setBorderPainted(false);
b8.setBounds(0,295,128,128);

p2.add(b8);
b8.setOpaque(false);
b8.setContentAreaFilled(false);
b8.setRolloverIcon(new ImageIcon("i/apple_festival_app_settings.png"));




z9=new JLabel("Communicate");
z9.setBounds(40,490,100,20);
z9.setForeground(Color.white);
p2.add(z9);


comm=new JButton(new ImageIcon("i/rsz_chat.jpg"));
comm.setBorderPainted(false);
comm.setBounds(0,390,128,128);
p2.add(comm);




comm.setOpaque(false);
comm.setContentAreaFilled(false);
comm.setRolloverIcon(new ImageIcon("i/chat.jpeg"));



z5.setVisible(false);b5.setVisible(false);
z6.setVisible(false);b6.setVisible(false);
z7.setVisible(false);b7.setVisible(false);
z8.setVisible(false);b8.setVisible(false);
z9.setVisible(false);comm.setVisible(false);



//End of p2 buttons2


up=new JButton(new ImageIcon("i/up.png"));
up.setBounds(0,550,130,30);
//up.setToolTipText("<html> <title> <head><h3>Upper Arrow </h3><br></head></title> <Body> To Show Previous Option of User</body>");
up.setContentAreaFilled(false);
p2.add(up);


down=new JButton(new ImageIcon("i/down.png"));
down.setContentAreaFilled(false);
//down.setToolTipText("<html> <title> <head><h3>Down Arrow</h3><br></head></title> <Body> To Show Next Option of User</body>");
down.setBounds(-5,570,130,25);
p2.add(down);

try{
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
jf2=new JInternalFrame("#editor");
//jf2.setBounds(140,30,710,610);
//jf2.setVisible(true);
p1.add(jf2);
jf2.setMaximizable(true);

jf2.setLayout(null);
tb=new JTabbedPane();
tb.setBounds(0,0,690,580);
jf2.add(tb);

jp=new JPanel(null,true);
jp.setLayout(null);
jp.setBounds(0,0,690,580);

//tb.addTab("New",jp);


// Storage


							jf3=new JInternalFrame( "#Storage Manager");
							BorderLayout bbr=new BorderLayout();
							jf3.setClosable(true);
							jf3.setMaximizable(true);
							jf3.setLayout(bbr);
							jf3.setSize(900,600);
							jf3.setLocation(250,150);
							jf3.setVisible(false);
							p1.add(jf3);

							JToolBar ttb=new JToolBar();
							jf3.add(ttb,BorderLayout.NORTH);
							
							
							ib31=new JButton("Refresh");
							ttb.add(ib31);
							
							ttb.addSeparator();
							ib32=new JButton("Lock Storage");
							ttb.add(ib32);
							ttb.addSeparator();
								ib33=new JButton("delete");
							ttb.add(ib33);
							ttb.addSeparator();
								ib34=new JButton("import");
							ttb.add(ib34);
							ttb.addSeparator();
								ib35=new JButton("Export");
							ttb.add(ib35);
							
							jpx=new JPanel();
						     jpx.setBounds(0,0,900,600);
							jpx.setLayout(new GridLayout(i_ver,j_ver));
							jpx2=new JPanel();
							jpx2.setLayout(null);
							jpx2.add(jpx);
							
								JScrollPane jsp3=new JScrollPane(jpx2,v,h);
						
								jf3.add(jsp3,BorderLayout.CENTER);
			
			
			 
			 
			           //    FileList Frame
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           
			           // End of File List Frame
			           
			           
			           
			           
			           
			           
			           
			           
			
								
						//	b[b_count]=new JButton();
						//	jpx.add(b[b_count]);	
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception g){System.out.println(g);}

/*
up.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,10,10)));
down.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,10,10)));
*/

ehelp.setBackground(Color.yellow);




	ib31.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
				try{
					
						jf3.setVisible(false);	
						URL url=this.getClass().getClassLoader().getResource("Audio Clip/button-15.wav");
									AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
									Clip clip=AudioSystem.getClip();
									clip.open(audioIn);
									clip.start();
									
					//jf3.setBounds(140,30,700,600);
					jf3.setVisible(true);
 					
 					File f=new File("data/help.txt");
 					File f2= new File(f.getParent()+"");
 					//System.out.println(f);
 					File list[]=f2.listFiles();	
 					
 				 	jpx.removeAll();		
 				 			
 				 			
					for(button_j=0;button_j<list.length;button_j++)
					{
						//System.out.println(list[button_j]);
						b[button_j]=new JButton("\n"+list[button_j]+"",new ImageIcon("i/text48x48.png"));
						Color c=new Color(100,160,100);
						b[button_j].setBorderPainted(false);
						b[button_j].setForeground(c);
						b[button_j].setSize(150,50);	
						b[button_j].setActionCommand(button_j+"");  
						b[button_j].setContentAreaFilled(false);
						b[button_j].setRolloverIcon(new ImageIcon("i/text.png"));	
						jpx.add(b[button_j]);
						 temp_name=list[button_j]+"";
						System.out.println(temp_name);
								b[button_j].addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
								{
									try{
										
										for(int k=0;k<button_j;k++)
										{
										if(e.getSource()==b[k])	{
											try{
												UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
												}catch(Exception we){}
											notepad n=new notepad(b[k].getText()+"");
											System.out.println(k+".Button "+b[k].getText());
											jf3.setVisible(false);
		     							n.setVisible(true);
									     n.setSize(600,500);
									     n.setLocation(300,50);
									     l1.add(n);
											
										}
										 
										}
										
									}catch(Exception es){}
									
									
								}
							});
						}	

					}catch(Exception es){info.setText("File Storage Error:"+es); }

 		}
		});



ib33.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
    	File f=new File("data/'.'");
	    String fd2=f.getParent();
		File f2=new File(fd2); 
		
		Object[] possibleValues = f2.list();
		Object selectedValue = JOptionPane.showInputDialog(null,

        "Select File", "Delete File option",

        JOptionPane.INFORMATION_MESSAGE, null,

        possibleValues, possibleValues[0]);
        
        	try{
        File fq=new File("Data/"+selectedValue);
        fq.delete();
        	info.setText(" File Deleted..."+selectedValue);
          		
          		
          		try{
          			
          			    jpx.removeAll();
          				jf3.setVisible(true);
 						
          		
 					File fd=new File("data/help.txt");
 					File fd22= new File(fd.getParent()+"");
 					//System.out.println(f);
 					File list[]=fd22.listFiles();	
 					
 				 			
 				 			
 				 			
					for(button_j=0;button_j<list.length;button_j++)
					{
						//System.out.println(list[button_j]);
						b[button_j]=new JButton("\n"+list[button_j]+"",new ImageIcon("i/text48x48.png"));
						Color c=new Color(100,160,100);
						b[button_j].setBorderPainted(false);
						b[button_j].setForeground(c);
						b[button_j].setSize(150,50);	
						b[button_j].setActionCommand(button_j+"");  
						b[button_j].setContentAreaFilled(false);
						b[button_j].setRolloverIcon(new ImageIcon("i/text.png"));	
						jpx.add(b[button_j]);
						 temp_name=list[button_j]+"";
						System.out.println(temp_name);
								b[button_j].addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
								{
									try{
										
										for(int k=0;k<button_j;k++)
										{
										if(e.getSource()==b[k])	{
											try{
												UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
												}catch(Exception ww){}
											notepad n=new notepad(b[k].getText()+"");
											System.out.println(k+".Button "+b[k].getText());
											jf3.setVisible(false);
		     							n.setVisible(true);
									     n.setSize(600,500);
									     n.setLocation(300,50);
									     l1.add(n);
											
										}
										 
										}
										
									}catch(Exception es){}
									
									
								}
							});
						}	

					}catch(Exception ef){System.out.println("Error:"+ef);}

        }catch(Exception ff){}
		        

		
	}
	
});


ib34.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		
		get=1;
		info.setText("File Importing...");
		
	}
	
});
ib35.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		File f=new File("data/'.'");
	    String fd2=f.getParent();
		File f2=new File(fd2); 
		
	try{	UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");}catch(Exception re){}

				
		Object[] possibleValues = f2.list();
		Object selectedValue = JOptionPane.showInputDialog(null,

        "Select File", "Export File option",

        JOptionPane.INFORMATION_MESSAGE, null,

        possibleValues, possibleValues[0]);
        
         exp_file=(String)selectedValue;
        System.out.println("Data expotred...");
        send_data=1;
        
        System.out.println("send make 1 start...");
		  		
		
try{

UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception w){}

        
       
		
	}
	
});







// Start of Comm


try{
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");}catch(Exception e){}



newjf=new JInternalFrame("Chat with Server");
		newjf.setLayout(null);
  		newjf.setBounds(700,100,300,300);
  		
  		p1.add(newjf);

newjta=new JTextArea();
newjta.setBounds(0,0,294,245);
newjf.add(newjta);

newjsp=new JScrollPane(newjta,v,h1);
newjsp.setBounds(0,0,294,245);
newjf.add(newjsp);





newt=new JTextField();
newt.setBounds(0,245,294,35);
newjf.add(newt);


newjta2=new JTextArea();
newjta2.setBounds(1700,500,300,245);
p1.add(newjta2);
  		
newjsp2=new JScrollPane(newjta2,v,h1);
newjsp2.setBounds(1700,500,300,245);
p1.add(newjsp2);
 		


newinf=new JInternalFrame("File");

newinf.setBounds(200,100,500,500);
newinf.setLayout(null);
newinf.setClosable(true);
newinf.setMaximizable(true);

p1.add(newinf);

//newinf.setVisible(true);





	try{
		  	img = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("trans.png"), "trans.png"));
		 }  
        catch(Exception e){}
        JViewport jvp = new JViewport()  
        {  
           public void paintComponent(Graphics g)  
           {  
             super.paintComponent(g);  
             if(img != null) g.drawImage(img, 0,0,this.getWidth(),this.getHeight(),this);  
            }  
        };


newtxp=new JTextPane();
newtxp.setContentType("txt/html");
newtxp.setOpaque(false);
newtxp.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
newtxp.setBounds(0,0,450,450);

newjsp3=new JScrollPane(newtxp);
newjsp3.setViewport(jvp);
newjsp3.setViewportView(newtxp);
newjsp3.setBounds(0,0,450,400);




newj=new JPanel();
newj.setVisible(true);
newj.setLayout(null);
newj.setBounds(0,60,450,450);
newinf.add(newj);
newj.add(newjsp3);


newbt=new JButton("Open");
newbt.setBounds(5,5,100,20);
newinf.add(newbt);


newt1=new JTextField();
newt1.setBounds(110,5,200,20);
newinf.add(newt1);


cbb=new JComboBox();
cbb.setBounds(10,30,150,20);
newinf.add(cbb);

cbb.addItem("Arial");cbb.addItem("Arial Black");cbb.addItem("COMIC SANS MS ");cbb.addItem("Courier New");cbb.addItem("Gautami");cbb.addItem("Georgia");
	cbb.addItem("Impact");cbb.addItem("Latha");cbb.addItem("Lucida Cnsole");cbb.addItem("Lucida Sans Unicode");cbb.addItem("Mangal");cbb.addItem("Microsoft Sans Serif");
	cbb.addItem("Palatino Linotype");cbb.addItem("Sylfaen");cbb.addItem("System");cbb.addItem("Tahoma");cbb.addItem("Times New Roman");cbb.addItem("Verdana");


cbb2=new JComboBox();
cbb2.setBounds(170,30,60,20);
newinf.add(cbb2);


for(int i=8;i<98;i++)
{
	cbb2.addItem(i);
}


cbb.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent er)
	{
		try{
			Object font=cbb.getSelectedItem();
			Object font2=cbb2.getSelectedItem();
			String str=font2+"";
			int size=Integer.parseInt(str);
		//	int size=Integer.parseInt(sizee);
			newtxp.setFont(new Font(font+"",Font.PLAIN,size));
			
		}catch(Exception e){}
		
	}
});

cbb2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent er)
	{
		try{
			try{
			Object font=cbb.getSelectedItem();
			Object font2=cbb2.getSelectedItem();
			String str=font2+"";
			int size=Integer.parseInt(str);
		//	int size=Integer.parseInt(sizee);
			newtxp.setFont(new Font(font+"",Font.PLAIN,size));
			
		}catch(Exception e){}
	
		}catch(Exception e){}
		
	}
});


newbt.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent er)
	{
		
		/*
		try
		{
			//	Runtime rt=Runtime.getRuntime();
			//	Process p=rt.exec("cmd /c notepad");
	
			
			
			newjfd=new FileDialog(new JFrame(),"Select");
			newjfd.setVisible(true);
			newdirs=newjfd.getDirectory();
			newfils=newjfd.getFile();
				
			newt1.setText(newdirs+newfils)	;
						
			
			newtxp.setText("");
							
			HTMLEditorKit kit=new HTMLEditorKit();
			HTMLDocument doc=new HTMLDocument();
			
			
			try{
				
				newtxp.setEditorKit(kit);
				newtxp.setDocument(doc);
				
				
				DataInputStream ins=new DataInputStream(new FileInputStream(newdirs+newfils));
				BufferedReader brs=new BufferedReader(new InputStreamReader(ins));
				String lins="";
				
				int filelen=newfils.length();
				
			//	int filekey=Integer.parseInt(filenames.charAt(filelen-1)+"");
				
				int deckey=(filelen+newport)%9;
				
				
				while((lins=brs.readLine())!=null)
				{
					
					String dat="";
				
				lins=brs.readLine();
				
			for(int i=0;i<lins.length();i++)
			{
				
					if(deckey==0)
					{
						deckey=1;
						}
				dat=dat+((char)((int)lins.charAt(i)+deckey));
				//System.out.println(stre.charAt(i)+"is decrypted as::"+(char)((int)stre.charAt(i)-3));
				}
			
					
					
					
					
					if(lins==null)
					{
						break;
						}
					
					kit.insertHTML(doc, doc.getLength(), dat+"\n", 0, 0, null);
					}
				
				
				}catch(Exception we){}
						
		
								
							
			}catch(Exception qw){}*/
			
			
			
			
				HTMLEditorKit kit=new HTMLEditorKit();
				HTMLDocument doc=new HTMLDocument();
				
				try{
					newtxp.setEditorKit(kit);
    				newtxp.setDocument(doc);
    	
				
					
				FileDialog fde=new FileDialog(new JFrame(),"Select");
				fde.setVisible(true);
				String fdir=fde.getDirectory();
				 fna=fde.getFile();
				
					newt1.setText(fdir+fna)	;
					
					JTextField jt=new JTextField();
					FileReader wr=new FileReader("History.log");	
					jt.read(wr,null);
					wr.close();
					
					FileWriter wr2=new FileWriter("History.log");
					wr2.write(jt.getText()+"\r\n"+newt1.getText() +"\t"+new Date());
					wr2.close();
					
		
					Thread filthread=new Thread()
			{
				public void run()
				{
					try
					{
						
						Socket qaw=new Socket(server_ip,1011);
						
						PrintStream outq=new PrintStream(qaw.getOutputStream());
						
						outq.println("E"+newport);
						outq.println(it1.getText());
						outq.println(fna);
					
						Date dates=new Date();
						
						SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy h:mm:ss a");
						String datenow=sdf.format(dates);
			
						
						
						outq.println(datenow);
						outq.println(qaw);
					
						
						}catch(Exception qwe){JOptionPane.showMessageDialog(null,qwe);}
					
					
					}
				
				};
				
				
				filthread.start();	
			
				
			
		//	newtxp.setText("");
		
				
				
				
				int filelen=fna.length();
				
				int filekey=Integer.parseInt(fna.charAt(filelen-1)+"");
				
				int deckey=(filelen+newport)%9;
				
				System.out.println("file names is:"+fna+" length is "+filelen+" key is "+filekey);
				
				FileInputStream fstream=new FileInputStream(fdir+fna);
				
				DataInputStream in=new DataInputStream(fstream);
				BufferedReader br=new BufferedReader(new InputStreamReader(in));
				String stre="";
				String ndat="";
				newtxp.setText("");
				while(stre!=null)
				{
					
					
				//	System.out.println("Original data:"+strLine);
			String dat="";
			stre=br.readLine();
			for(int i=0;i<stre.length();i++)
			{
				
				//System.out.println(stre.charAt(i)+"is encrypted as"+(char)((int)stre.charAt(i)+3));
				
				if(deckey==0)
				{
					deckey=1;
					}
				dat=dat+((char)((int)stre.charAt(i)+deckey));
				//System.out.println(stre.charAt(i)+"is decrypted as::"+(char)((int)stre.charAt(i)-3));
				}
			
			
			//	jta6.append(dat+"\n");
				//jta6.setText(dat);
				if(stre==null)
				{break;}
			kit.insertHTML(doc, doc.getLength(), dat+"\n", 0, 0, null);
			
					
					
							
					}
				
			
			
			
				
				
				
				
			
				
				
				
			}catch(Exception ae1){}

			
			
		
		}
	
	});




newt.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent re)
	{
	//	newport=Integer.parseInt(it2.getText().charAt(1)+"");
	//	newport1=100+newport;
		
	//		newjta.append("socket port "+newport+"\nServerSocket port"+newport1);
	
	if(newt.getText().equals(""))
 				{}
 				else
 				{
 					newjta.append("<"+it2.getText()+">"+newt.getText()+"\n");
 					newout1.println("<"+it2.getText()+">"+newt.getText());
 					newout1.flush();
 					newt.setText("");
 					}

	
	
		}
	});


comm_f=new JInternalFrame("Communication Server Setting");
comm_f.setVisible(true);
comm_f.setSize(450,400);
comm_f.setClosable(true);
comm_f.setLocation(300,300);
comm_f.setLayout(new GridLayout(0,1,20,20));
p1.add(comm_f);


JPanel com_p1=new JPanel();
com_p1.setLayout(null);
comm_f.add(com_p1);

com_l1=new JLabel("Communication Port:");
com_l1.setBounds(10,10,100,30);
com_p1.add(com_l1);

com_t1=new JTextField("Enter Port");
com_t1.setFont(new Font("Sanserif",Font.ITALIC,12));
com_t1.setBounds(100,10,180,30);
com_p1.add(com_t1);


com_l2=new JLabel("Valid Key:");

com_l2.setBounds(10,40,100,30);
com_p1.add(com_l2);

ip2=new JPasswordField();
//comm_t1.setFont(new Font("Sanserif",Font.ITALIC,12));
ip2.setBounds(100,40,180,30);
com_p1.add(ip2);
 
com_l3=new JLabel("Your IP:");
com_l3.setBounds(10,70,100,30);
com_p1.add(com_l3);

com_t2=new JTextField("eg:127.0.0.1");
com_t2.setFont(new Font("Sanserif",Font.ITALIC,12));
com_t2.setBounds(100,70,180,30);
com_p1.add(com_t2);


JTextArea a11=new JTextArea();
a11.setBounds(10,100,400,230);
com_p1.add(a11);

a11.setText("This  panel is used to \n Emport and Export File.\n Server Retrived the file and \n allow to all client download who have valid key.\n Befor start distributing File \n please fill up all settings.");
a11.setForeground(Color.red);
com_b1=new JButton("Create!");
com_b1.setBounds(40,140,100,30);
//com_p1.add(com_b1);

com_b2=new JButton("Join!");
com_b2.setBounds(190,140,100,30);
//com_p1.add(com_b2);


a11.setEditable(false);

a11.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder("Help"),
BorderFactory.createEmptyBorder(0,0,10,10)));



com_p1.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,10,10)));



ser_a1.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder("#WaterMark Content"),
BorderFactory.createEmptyBorder(0,0,10,10)));







			
		

		

		com_b1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{

			try{

				
					Socket ss=new Socket(server_ip,1213);
				
			
			   	PrintWriter pw=new PrintWriter(new OutputStreamWriter(ss.getOutputStream()));
				BufferedReader br=new BufferedReader(new InputStreamReader(ss.getInputStream()));
				



				}catch(Exception aew){ info.setText(" No server found Exception..."); JOptionPane.showMessageDialog(null,aew,"System Error",JOptionPane.ERROR_MESSAGE); }



			}
			});
			
			
			
		com_b2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{

			try{

				Socket ss=new Socket(server_ip,1214);
				
			
		   	    PrintWriter pw=new PrintWriter(new OutputStreamWriter(ss.getOutputStream()));
				BufferedReader br=new BufferedReader(new InputStreamReader(ss.getInputStream()));
		


				}catch(Exception aew){ info.setText(" No server found Exception..."); JOptionPane.showMessageDialog(null,aew,"System Error",JOptionPane.ERROR_MESSAGE); }



			}
			});









try{
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception g){System.out.println(g);}




// End of Comm





//  Logon 

try{
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");}catch(Exception e){}
jf1=new JInternalFrame( "Login");
jf1.setLayout(null);
jf1.setSize(300,230);
jf1.setLocation(300,230);
jf1.setVisible(false);
p1.add(jf1);

jf1.setClosable(true);
jf1.setMaximizable(true);

JLabel l11=new JLabel("User Name");
l11.setBounds(10,20,100,30);
jf1.add(l11);


it1=new JTextField();
it1.setBounds(90,20,130,30);
jf1.add(it1);



JLabel l2=new JLabel("Password");
l2.setBounds(10,70,100,30);
jf1.add(l2);

ip1=new JPasswordField();
ip1.setBounds(90,70,130,30);
jf1.add(ip1);

JLabel l3=new JLabel("User ID");
l3.setBounds(10,120,100,30);
jf1.add(l3);

it2=new JTextField();
it2.setBounds(90,120,130,30);
jf1.add(it2);




JButton ib1=new JButton("Login");
ib1.setBounds(10,160,100,30);
jf1.add(ib1);


JButton ib2=new JButton("cancel");
ib2.setBounds(120,160,100,30);
jf1.add(ib2);

try{
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception g){System.out.println(g);}

//Login




//chat Panel


try{
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");}catch(Exception e){}


chat_p=new JPanel();
chat_p.setLayout(null);
chat_p.setSize(300,500);
chat_p.setLocation(350,300);
p1.add(chat_p);
chat_p.setVisible(false);

chat_l=new JLabel("# CoMM");
chat_l.setBackground(new Color(0x818181f));
chat_l.setBounds(0,0,300,30);
//chat_p.add(chat_l);

chat_l.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,2,2)));


dl=new DefaultListModel();
chat_list=new JList(dl);
JScrollPane j2p=new JScrollPane(chat_list,v,h);
j2p.setBounds(0,30,300,370);
chat_p.add(j2p);

dl.addElement("<html><body><img src=86107033817765456721.png><center><h3><font color=0x818181f>Welcometo #CoMM </font></h3></center></body></html>");
dl.addElement("<html><body><font color=red>Now you connecting with Server...</font></body></html>");

j2p.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,2,2)));

//chat_list.setEditable()


chat_a=new JTextArea();
JScrollPane j3p=new JScrollPane(chat_a,v,h);
chat_a.setBounds(0,400,300,80);
chat_p.add(chat_a);
chat_p.setOpaque(false);
chat_a.setFont(new Font("Sanserif",Font.ITALIC,12));

chat_a.setBorder(
BorderFactory.createCompoundBorder(
BorderFactory.createTitledBorder(""),
BorderFactory.createEmptyBorder(0,0,2,2)));

chat_b=new JButton("Send");
chat_b.setBounds(0,480,300,20);
chat_p.add(chat_b);


		chat_b.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{

			try{

		   	Socket ss=new Socket(server_ip,1212);
				
			
		   	PrintWriter pw=new PrintWriter(new OutputStreamWriter(ss.getOutputStream()));
				BufferedReader br=new BufferedReader(new InputStreamReader(ss.getInputStream()));
		
				String msg="<html><body><font face=Arial color=red><b>"+it1.getText()+":</b></font><br>"+chat_a.getText()+"</body></html>";	
				dl.addElement(msg);
				chat_a.setText("");
				
				pw.write(msg+"\r\n");
				pw.flush();
				
				pw.close();
				ss.close();
				

				}catch(Exception aew){ info.setText(" No server found Exception..."); JOptionPane.showMessageDialog(null,aew,"System Error",JOptionPane.ERROR_MESSAGE); }



			}
			});
			


try{
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception g){System.out.println(g);}


// End of chat Panel



















		ib1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{

			try{

				info.setText(" Trying to connect with server...");
				
				Socket se=new Socket(server_ip,1999);
				
				PrintWriter pw=new PrintWriter(new OutputStreamWriter(se.getOutputStream()));
				BufferedReader br=new BufferedReader(new InputStreamReader(se.getInputStream()));
		
		//		String ser=br.readLine();
		
				//ta1.setText("Eshtablish Connection...");
				//pw.flush();
		
				pw.write(it1.getText()+"\r\n");
				pw.flush();
				System.out.println("USERNAM SEND");
				pw.write(it2.getText()+"\r\n");
				pw.flush();
		
				System.out.println("id send");
				pw.write(ip1.getText()+"\r\n");
				pw.flush();
				System.out.println("password send");

		
				String server_command=br.readLine();
				System.out.println("Server_command"+server_command);
				if(server_command.equals("Y"))
				{
					info.setText("Server Syncronized...");
					String his=br.readLine();
					System.out.println(his);
					ehelp.setText("<html><body><h3>Recent Login History</h3><br>"+his+"</body></html>");
				JOptionPane.showMessageDialog(null,"Welcome!! \n Connectimg with server","Login Error",JOptionPane.INFORMATION_MESSAGE);
					//wait(10000);
					//Thread t2=new Thråad(){public void run(){}}; t2.sleep(600);
					//Main_l.setText("");
					jf1.setVisible(false);
					//newjf.setVisible(true);
					//newinf.setVisible(true);
					newport=Integer.parseInt(it2.getText().charAt(1)+"");
					newport1=100+newport;
					
					newthread.start();
					newthread1.start();
					
					try{
						FileWriter wr=new FileWriter("system.dll");
						wr.write(it2.getText()+"\t"+it1.getText()+ "Accessed");
						wr.close();
					}catch(Exception e3){}
					
					
					
					try
			{	
		File origionalImage = new File("trans.png");

		
		BufferedImage bufferedImage = ImageIO.read(origionalImage);
		
		
		Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(bufferedImage, 0, 0, null);
        g2d.setPaint(new Color(0xD8E6F3));
        g2d.setFont(new Font("Times new Roman", Font.BOLD, 25));
        String s = "E"+newport;
        FontMetrics fm = g2d.getFontMetrics();
        //int x = bufferedImage.getWidth() - fm.stringWidth(s) - 5;
        //int y = fm.getHeight();
        g2d.drawString(s, 20, 20);
       	g2d.drawString(s,400,20) ;
       	g2d.drawString(s,800,20) ;
       	
       	g2d.drawString(s, 20, 100);
       	g2d.drawString(s,400,100) ;
       	g2d.drawString(s,800,100) ;
       	
       	g2d.drawString(s, 20, 200);
       	g2d.drawString(s,400,200) ;
       	g2d.drawString(s,800,200) ;
       	
       	
       	g2d.drawString(s, 20, 280);
       	g2d.drawString(s,400,280) ;
       	g2d.drawString(s,800,280) ;
        g2d.dispose();
        File myPngImage = new File("Client.png");
        ImageIO.write(bufferedImage, "png", myPngImage);   
       
		
		
		
		
		
		
			}
			catch(Exception qe)
			{
				System.out.println("Image Load Exception:"+qe);
				}
		
		
		
		
		newj.removeAll();
		
		
		try{
		  	img = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("Client.png"), "Client.png"));
		 }  
        catch(Exception er){}
        JViewport jvp = new JViewport()  
        {  
           public void paintComponent(Graphics g)  
           {  
             super.paintComponent(g);  
             if(img != null) g.drawImage(img, 0,0,this.getWidth(),this.getHeight(),this);  
            }  
        };


newtxp=new JTextPane();
newtxp.setContentType("txt/html");
newtxp.setOpaque(false);
newtxp.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
newtxp.setBounds(0,0,450,450);

newjsp3=new JScrollPane(newtxp);
newjsp3.setViewport(jvp);
newjsp3.setViewportView(newtxp);
newjsp3.setBounds(0,0,450,400);


		
	
    	
    	newj.add(newjsp3);
		
		newj.revalidate();
		
	
		
		
	
					
					
					
		
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalid Authentication","Login Error",JOptionPane.ERROR_MESSAGE);
					}	
		
			}catch(Exception aew){ info.setText(" No server found Exception..."); JOptionPane.showMessageDialog(null,aew,"System Error",JOptionPane.ERROR_MESSAGE); }



			}
			});

			
		
				comm_f.setVisible(false);	
				ib2.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				it1.setText("");ip1.setText("");
				}
				});
				try{
					UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");}catch(Exception e){}

				
				// Save AS
				
				   save_jff=new JInternalFrame("Save As");
				 //save_jff.setUndecorated(true);
				 
				 //save_jff.setBackground(new Color(0.2f,0.0f,0.0f,0.0f));
				 
				 	
				 
				 save_jff.setVisible(false);
				 save_jff.setSize(400,160); save_jff.setLocation(330,200);
				 
				 save_jff.setLayout(new GridLayout(0,1,10,10));
				 p1.add(save_jff);
				 
				  										 jjvv=new JInternalFrame("Acess");
													    jjvv.setVisible(false);
													    jjvv.setLayout(new GridLayout(0,1,10,10));
													    jjvv.setSize(200,150);
													    p1.add(jjvv);
				 
				try{
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					}catch(Exception g){System.out.println(g);}
 
				
				b6.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				
											  
											  
											 
		newjf.setVisible(true);
		newinf.setVisible(true);
		 
											  
											  
											  
											  
					 


				
				}
				});




//



ll2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println("Clicked");
try{
	
	p2_change=1;
	
	}catch(Exception es){System.out.println(es); }

		}
		});
	




b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println("Clicked");
try{
					
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

	jf1.setVisible(true);



									URL url=this.getClass().getClassLoader().getResource("Audio Clip/button-15.wav");
									AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
									Clip clip=AudioSystem.getClip();
									clip.open(audioIn);
									clip.start();
									
								
								
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");








//

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");


		}catch(Exception es){System.out.println(es); }

		}
		});


		b2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		try{		
				                    URL url=this.getClass().getClassLoader().getResource("Audio Clip/button-15.wav");
									AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
									Clip clip=AudioSystem.getClip();
									clip.open(audioIn);
									clip.start(); }catch(Exception ee){}
				try{
					UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
					}catch(Exception wre){}					
		     notepad n=new notepad("#Untitled");
		     n.setVisible(true);
		     n.setSize(600,500);
		     n.setLocation(300,50);
		     l1.add(n);
			// jf2.setBounds(140,30,700,600);
			//jf2.setVisible(true);
 		}
		});


		b3.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
				try{
						URL url=this.getClass().getClassLoader().getResource("Audio Clip/button-15.wav");
									AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
									Clip clip=AudioSystem.getClip();
									clip.open(audioIn);
									clip.start();
									
					//jf3.setBounds(140,30,700,600);
					jf3.setVisible(true);
 					
 					File f=new File("data/help.txt");
 					File f2= new File(f.getParent()+"");
 					//System.out.println(f);
 					File list[]=f2.listFiles();	
 					
 				 	jpx.removeAll();		
 				 			
 				 			
					for(button_j=0;button_j<list.length;button_j++)
					{
						//System.out.println(list[button_j]);
						b[button_j]=new JButton("\n"+list[button_j]+"",new ImageIcon("i/text48x48.png"));
						Color c=new Color(100,160,100);
						b[button_j].setBorderPainted(false);
						b[button_j].setForeground(c);
						b[button_j].setSize(150,50);	
						b[button_j].setActionCommand(button_j+"");  
						b[button_j].setContentAreaFilled(false);
						b[button_j].setRolloverIcon(new ImageIcon("i/text.png"));	
						jpx.add(b[button_j]);
						 temp_name=list[button_j]+"";
						System.out.println(temp_name);
								b[button_j].addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
								{
									try{
										
										for(int k=0;k<button_j;k++)
										{
										if(e.getSource()==b[k])	{
											try{
												UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
												}catch(Exception were){}
											notepad n=new notepad(b[k].getText()+"");
											System.out.println(k+".Button "+b[k].getText());
											jf3.setVisible(false);
		     							n.setVisible(true);
									     n.setSize(600,500);
									     n.setLocation(300,50);
									     l1.add(n);
											
										}
										 
										}
										
									}catch(Exception es){}
									
									
								}
							});
						}	

					}catch(Exception es){info.setText("File Storage Error:"+es); }

 		}
		});


		bhelp.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
		try{
			URL url=this.getClass().getClassLoader().getResource("Audio Clip/button-15.wav");
									AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
									Clip clip=AudioSystem.getClip();
									clip.open(audioIn);
		
                                        if(thr2_first==0)		
			                         	{thr2.start(); thr2_first=1;}
			                         	else{ thr2.run();}
			                         	
			                         	
		}catch(Exception aew){ System.out.println("Connection Error:"+aew); }
		}



		});







		b5.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
		try{
			
			URL url=this.getClass().getClassLoader().getResource("Audio Clip/button-15.wav");
									AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
									Clip clip=AudioSystem.getClip();
									clip.open(audioIn);
									clip.start();
		
									ser.setVisible(true);
		
		}catch(Exception aew){ System.out.println("Connection Error:"+aew); }
		}



		});


	
				

		up.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			try{
				
			
			z5.setVisible(false);    b5.setVisible(false);
			z6.setVisible(false);b6.setVisible(false);
			z7.setVisible(false);b7.setVisible(false);
			z8.setVisible(false);b8.setVisible(false);
			z9.setVisible(false);comm.setVisible(false);
			
			z1.setVisible(true); Thread.sleep(100); b1.setVisible(true); 
			z2.setVisible(true);b2.setVisible(true);
			z3.setVisible(true);b3.setVisible(true);
			z4.setVisible(true);b4.setVisible(true);
			
	
			up.setEnabled(false); down.setEnabled(true);
		  }catch(Exception r){}
		}
		});

		
		comm.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		    //if(visi==1){
			//chat_p.setVisible(true); visi=0;} else{chat_p.setVisible(true); visi=1;}
			client c=new client(); 
			c.setVisible(true);
			c.setSize(600,400);
			c.setLocation(180,90);
			l1.add(c);
		}
		
	});

		down.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			
		
			z1.setVisible(false);b1.setVisible(false);
			z2.setVisible(false);b2.setVisible(false);
			z3.setVisible(false);b3.setVisible(false);
			z4.setVisible(false);b4.setVisible(false);

			z5.setVisible(true);b5.setVisible(true);
			z6.setVisible(true);b6.setVisible(true);
			z7.setVisible(true);b7.setVisible(true);
			z8.setVisible(true);b8.setVisible(true);
			z9.setVisible(true);comm.setVisible(true);	
	
			up.setEnabled(true); down.setEnabled(false);

		}
		});
		
		b4.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			
			System.exit(1);
			try
			{
			newsock.close();
			newins.close();
		}catch(Exception qwe){}
		}
	});




		  Thread export_file_thread=new Thread()
		  {
		  	
		  	public void run(){
		  	
		  	while(true){
		  	try{
		  		
		  		if(send_data==1){
		  		info.setText("File Exporting started...");
          		System.out.println("data export start...");
		  		Socket s=new Socket(server_ip,9999);
		  		System.out.println("data export start...server connected...");
		  		
		  		PrintWriter pwxx=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
				BufferedReader  brxx=new BufferedReader(new InputStreamReader(s.getInputStream()));
			    
			    pwxx.write(com_t1.getText()+"\r\n");
			    pwxx.flush();
			    
			    
			    pwxx.write(ip2.getText()+"\r\n");
			    pwxx.flush();
			    
			    pwxx.write(exp_file+"\r\n");
			    pwxx.flush();
			    
			    JTextField jt=new JTextField();
			    FileReader r=new FileReader("data/"+exp_file);
			    jt.read(r,null);
			    r.close();
			    
			    String data=jt.getText();
			    data=data.replaceAll("\n","end_line");
			    
			    System.out.println(data);
			    
			    pwxx.write(data+"\r\n");
			    pwxx.flush();
			    
			    JTextField jt2=new JTextField();
			    try{
			    FileReader r2=new FileReader("data/"+exp_file+":my_hide.lkg");
			    jt2.read(r2,null);
			    r2.close();
			    }catch(Exception e){ send_data=0; JOptionPane.showMessageDialog(null,"Invalid Data Handling \n Chutiya mt bna software ko ye teri wali file nhi hai!:D","File Error",JOptionPane.ERROR_MESSAGE); }
			   
			    String data2=jt2.getText();
			    
			    data2=data2.replaceAll("\n","end_line");
			    
			    
			    System.out.println(data2);
			    
			    pwxx.write(data2+"\r\n");
			    pwxx.flush();
			    
			    info.setText("Data Expotrted sucessfully...");
			    
			    s.close();
			    send_data=0;											
		  	}
		  
		  	}catch(Exception e){System.out.println("Error occur while exporting data.."+e); }
		  }	
		  }
		  };


		  export_file_thread.start();




          Thread import_file=new Thread()
          {
          	public void run(){
          		while(true){
          		try{
          			
          			
          			if( (!com_t1.getText().equals("Enter Port")) && get==1){
          				
          			info.setText("File Importing started...");
          			System.out.println("File importing..");
          			Socket s=new Socket(server_ip,Integer.parseInt(com_t1.getText()));
          				System.out.println("File importing server connecting..");
          			PrintWriter pwx=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
				    BufferedReader  brx=new BufferedReader(new InputStreamReader(s.getInputStream()));
			         
			         pwx.write(ip2.getText()+"\r\n");
			         pwx.flush();
			         System.out.println("password Send...");
			         
			         
			    	String ans=brx.readLine();
			    	
			    	if(ans.equals("y")){
			        String filename=brx.readLine();
			         System.out.println("Filename."+filename);
			         
			         
			        String file_data=brx.readLine();
			        System.out.println("Filedata."+file_data);
			         
			        String file_water=brx.readLine();
			        System.out.println("WaterMark."+file_water);
			         
			        FileWriter wr=new FileWriter(filename);
			        wr.write(file_data);
			        wr.close();
			        
			        FileWriter wre=new FileWriter(filename+":my_hide.lkg");
			        wre.write(file_water);
			        wre.close();
			       }
			       else{
			       	
			       }
			        get=0;
			        
			    
          		}
          		
          		
          		
          		}catch(Exception e){ info.setText("Error occur while importing data..."); }
          	}
          		
          }
          
          };
          
          import_file.start();
          

			chat_a.addFocusListener(new FocusListener() {
    		public void focusGained(FocusEvent e) {
    			try{
				
				String my_txt=chat_a.getText();
				System.out.println(my_txt);
				
				if(my_txt.equals("File()"))
				{
					System.out.println("My File()");
					
				}
				else if(my_txt.equals("Exit()"))
				{
					System.out.println("My Exit()");
				}	
				else{
					System.out.println("Txt_Changer()");
				}

				}catch(Exception aew){ info.setText(" No server found Exception..."); JOptionPane.showMessageDialog(null,aew,"System Error",JOptionPane.ERROR_MESSAGE); }



    			
    			
    			
    			}
    		public void focusLost(FocusEvent e) {
        		try{
				
				String txte=chat_a.getText();
				System.out.println("2"+txte);
				
				if(txte.equals("File()"))
				{
					System.out.println("My File()");
					
				}
				else if(txte.equals("My Exit()"))
				{
					System.out.println("Exit()");
				}	
				else{
					System.out.println("Txt_Changer()");
				}

				}catch(Exception aew){ info.setText(" No server found Exception..."); JOptionPane.showMessageDialog(null,aew,"System Error",JOptionPane.ERROR_MESSAGE); }

	
        
            		}

			});



		// Thread 
		
		
		Thread thr1=new Thread()
		{
		public void run()
		{
			while(true)
			{
			try{
			Date d=new Date();
			time.setText(d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds());
			
			}catch(Exception e){}
		}
			}	
		};	
		
		
		
		Thread ty=new Thread()
		{
			public void run(){
			
			while(true){
			
			for(int i=1;i<10;i++){
				info.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
				
				p2.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
				try{ Thread t=this; t.sleep(250); }catch(Exception e){}
				
			}
			
			for(int i=10;i>1;i--){
				info.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
				
				p2.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
				try{ Thread t=this; t.sleep(250); }catch(Exception e){}
				
			}
				
				
			}
			
			
		}
		};
		ty.start();
		
		
		
		thr3=new Thread()
		{
		public void run()
		{
			while(true)
			{
			try{
				
				Socket se=new Socket(server_ip,999);
				
				PrintWriter pw=new PrintWriter(new OutputStreamWriter(se.getOutputStream()));
				BufferedReader br=new BufferedReader(new InputStreamReader(se.getInputStream()));
		
				
				
					}catch(Exception e){}
		}
			}	
		};	
		
		
		
		dete=new Thread()
		{
		public  void run()
		{
			try{
				
			File f=new File("wallpaper/Tulips.jpg");
			String f2=f.getParent();
			System.out.println("directory"+f2);
			File vv=new File(f2);
			String list1[]=vv.list();
			int count6162=0;
			while(true)
			{
				
				
				l1.setIcon(new ImageIcon("wallpaper/abstract-hd-wallpapers-1080p-3.jpg"));
				System.out.println("Icon"+list1[count6162]);
				try{Thread.sleep(10000); }catch(Exception e){}
				if(count6162!= (list1.length-1))
				{ count6162++; }
				else{ count6162=0; }
				
				
				
			}
			}catch(Exception ew){System.out.println("Ithech Error aala:"+ew);}	
				
		}
			
		};
		
		dete.start();
		
		
		
		thr2=new Thread()
		{
			
		public void run()	
			{
				System.out.println("Thread thr2 started...");
			try{						
			if(h_count%2==0)
			{
			
				bhelp.setIcon(new ImageIcon("i/l8.png"));
					h_count++;
				
				for(int i=0;i<310;i++)
				{
					
					//1310
				jhelp.setLocation(1180-i,400);
			//	try{ thr2.sleep(5);}catch(Exception er){System.out.println("Thread thr2 error:"+er);} 	
				
			    }
			    
			
				
			}
			else{
				
				for(int i=0;i<310;i++)
				{
				//1000
				jhelp.setLocation(970+i,400);
			//	try{ thr2.sleep(5);}catch(Exception er){System.out.println("Thread thr2 error:"+er);} 	
				
				
			
				
				}
					h_count++;
				
				bhelp.setIcon(new ImageIcon("i/r8.png"));
				
			    }		
				System.out.println(xx);
				
				}catch(Exception er){ System.out.println(er);}	
				System.out.println("Thread thr2 Ended...");
				//thr2.suspend();
				
		}
			
			
		};	
		
			
			thr1.start();
			
			
  		
  		
  		newthread=new Thread()
  		{
  			public void run()
  			{
  				try
  				{
  					System.out.println("Port no :"+newport);
  					
  					newsock=new Socket(server_ip,newport);
  					newins=new DataInputStream(newsock.getInputStream());
 					newout=new PrintStream(newsock.getOutputStream());
 					
 					String subs="";
 				String subss="";
 					
 					
 					while(true)
 					{
 						newline=newins.readLine();
 					
 					
 						int len=newline.length();
 					
 					
 						
 						
 						if(newline.startsWith("$$$$FILE$$$$ "))
 						{
 					
 						subs=newline.substring(13);
 						
 							}
 							
 							else if(newline.startsWith("$$$$DATA$$$$ "))
 							{
 								
 							
 							newjta2.append(newline.substring(13)+"\r\n");
 						try
 						{
 					
 							}catch(Exception er){}
 								}
 								
 							else if(newline.startsWith("$$$$ENDS$$$$ "))
 							{
 							int reply=	JOptionPane.showConfirmDialog(null,"recieve file from server","no",JOptionPane.YES_NO_OPTION);
 								
 								
 								if(reply==JOptionPane.YES_OPTION)
 								{
 									
 									
 										
 										
 												try
											{ 
	
			
											FileWriter w=new FileWriter("Received\\"+subs);
												BufferedWriter fileout=new BufferedWriter(w);
			
											fileout.write(newjta2.getText());
											fileout.close();
		
												}catch(Exception re1)
												{
											System.out.println("68"+re1);
												}
 							
 									
 									}
 								else
 								{
 									System.out.println("No pressed");
 									}
 								
 								}	
 							
 						else
 						{
 						
 							newjta.append(newline+"\r\n");
 							}	
 					
 						}
 					
  				
  					
  					}
  					catch(Exception rt){}
  				
  				}
  			
  			};
  			
  			
  			Thread his_thread=new Thread(){
  				public void run(){
  					try{
  						for(;;){
  						FileReader wr3=new FileReader("History.log");
  						his_t.read(wr3,null);
  						wr3.close();
  						
  						Thread tt=this;
  						tt.sleep(1000);
  					}
  					}catch(Exception e){}
  					
  			}
  			};
  			
  			his_thread.start();
  			
  			newthread1=new Thread()
 		{
 			public void run()
 			{
 				try
 				{
 					newsock1=new Socket(server_ip,newport1);
 					System.out.println("waiting for client..");
 			//		while(true)
 			//		{
 			//		newsock1=newsersock.accept();
 					System.out.println("Client connected..");
 					
 					 newins1=new DataInputStream(newsock1.getInputStream());
 					 newout1=new PrintStream(newsock1.getOutputStream());
 					
 			//	}
 					}
 					
 				catch(Exception qe)	
 				{
 					
 					}
 				
 				}
 			};//newthread1.start();	
  		
  		
  		
		
		l1.addMouseListener(this);
		p1.addMouseListener(this);
		ll2.addMouseListener(this);
		
		
			b1.addMouseListener(this);
		    b2.addMouseListener(this);b5.addMouseListener(this);
		    b3.addMouseListener(this);b6.addMouseListener(this);
		    b4.addMouseListener(this);b7.addMouseListener(this);
		    b8.addMouseListener(this);up.addMouseListener(this);
		    down.addMouseListener(this); 
		//End of Thread
p1.add(l1);


    b8.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent e){
    		comm_f.setVisible(true);
    		
    	}
    	
    });


	 b7.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent e){
    		his.setVisible(true);
    		
    	}
    	
    });



JLabel ll=new JLabel(new ImageIcon("i/i1200x1000.png"));
ll.setBounds(0,0,1000,1000);
jpx2.add(ll);

 
}

public void mouseEntered(MouseEvent e){ 




if(e.getSource()==b1){ 
 ehelp.setForeground(new Color(0x818181));
 ehelp.setText("<html> <title> <head><h3>Login Button</h3><br></head></title> <Body> To Open Login form.<br> Eshtablesh Connection with server.<br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

}

if(e.getSource()==b2){ 
  ehelp.setForeground(new Color(0x818181));

 ehelp.setText("<html> <title> <head><h3>Open Button</h3><br></head></title> <Body> To Open new Tab.<br> You open Simple or Encrypted tab.<br> Simple tab for open simple file without any key.<br>Encrypted tab for open crypted file using key.<br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

}
if(e.getSource()==b3){ 
  ehelp.setForeground(new Color(0x818181));

 ehelp.setText("<html> <title> <head><h3>Publish</h3><br></head></title> <Body> To publish yours data.<br> You share your data with server or with your friend.<br> <a href=www.gmail.com>konvictsam@gmail.com</a></body>");

}
if(e.getSource()==b4){ 
 ehelp.setForeground(new Color(0x818181));

 ehelp.setText("<html> <title> <head><h3>Exit Button</h3><br></head></title> <Body> To Exit from System.<br><br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

}
if(e.getSource()==b5){ 
 ehelp.setForeground(new Color(0x818181));

ehelp.setText("<html> <title> <head><h3>New Tab Button</h3><br></head></title> <Body> To Open Login form.<br> Eshtablesh Connection with server.<br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

}
if(e.getSource()==b6){ 
 ehelp.setForeground(new Color(0x818181));

 ehelp.setText("<html> <title> <head><h3>Save Button</h3><br></head></title> <Body> To Open new Tab.<br> You open Simple or Encrypted tab.<br> Simple tab for open simple file without any key.<br>Encrypted tab for open crypted file using key.<br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

 }
if(e.getSource()==b7){ 
 ehelp.setForeground(new Color(0x818181));

ehelp.setText("<html> <title> <head><h3>History</h3><br></head></title> <Body> To publish yours data.<br> You share your data with server or with your friend.<br> <a href=www.gmail.com>konvictsam@gmail.com</a></body>");

}
if(e.getSource()==b8){ 
 ehelp.setForeground(new Color(0x818181));

ehelp.setText("<html> <title> <head><h3>Setting Button</h3><br></head></title> <Body> To Exit from System.<br><br><a href=www.gmail.com>konvictsam@gmail.com</a></body>");

 
}
if(e.getSource()==up){ 
 ehelp.setForeground(new Color(0x818181));

 ehelp.setText("<html> <title> <head><h3>Upper Arrow </h3><br></head></title> <Body> To Show Previous Option of User</body>");
		
}
if(e.getSource()==down){ 
 ehelp.setForeground(new Color(0x818181));

 	ehelp.setText("<html> <title> <head><h3>Down Arrow</h3><br></head></title> <Body> To Show Next Option of User</body>");

}



}
public void mouseExited(MouseEvent e){}
public void mouseClicked(MouseEvent e){   

    if(p2_change==1)
    {
    move=move+1;;	
	}
	if( move==2)
	{
	 int x=e.getX();
	 System.out.println(x);	
	 p2.setLocation(x,30);	
	 move=0;
	 p2_change=0;
	}	
		

}
public void mouseReleased(MouseEvent e){}
public void mousePressed(MouseEvent e){}


public static void main(String args[])
{
  demo d= new demo();d.setVisible(true);
	d.setSize(593,445);
	d.setLocation(200,100);
	try{Thread.sleep(1000);}catch(Exception e){}
	d.setVisible(false);
	Main m=new Main();
	m.setVisible(true);
	m.setSize(1400,1000);
	m.setLocation(0,-20);
	
}

}
 
