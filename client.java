

import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
import java.io.*;
import java.util.*;



class client extends JFrame
{

JFrame jf;
JPanel jp,jp2,jp3,jp4;
JTextArea a1,a2,a3;

JList l1,l2;
DefaultListModel d1,d2;

JTextField txt,t2,t3,t4;

JButton b1,b2,b3,b4,b5;
JSlider j1;
String server_ip="127.0.0.1";


client()
{
	
	try{

UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception w){}


	jf=this;
	jf.setLayout(new BorderLayout());
	jf.setUndecorated(true);
	jf.setBackground(new Color(0.0f,0.0f,0.0f,0.5f));
	
	jp=new JPanel();
    jf.add(jp,BorderLayout.WEST);
	jp.setLayout(new GridLayout(0,1));
	
	jp.setOpaque(false);

	d1=new DefaultListModel();
	l1=new JList(d1);	
	
	JScrollPane s=new JScrollPane(l1); 
	jp.add(s,BorderLayout.CENTER);
	
	d1.addElement("Welcome                        :                                              :");
	
	l1.setOpaque(true);
		l1.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	l1.setForeground(Color.red);
	
	
		l1.setBorder(
	BorderFactory.createCompoundBorder(
	BorderFactory.createTitledBorder("conversation"),
	BorderFactory.createEmptyBorder(10,10,25,25)));
	l1.setBorder(BorderFactory.createLineBorder(Color.white));
	

	jp2=new JPanel();
	jp2.setLayout(new BorderLayout());
	jf.add(jp2,BorderLayout.SOUTH);
	
	jp2.setOpaque(false);
	

	
	a2=new JTextArea();
	JScrollPane s2=new JScrollPane(a2); 
	jp2.add(s2,BorderLayout.CENTER);
	
	a2.setOpaque(true);
		a2.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	a2.setForeground(Color.white);
	
	a2.setBorder(
	BorderFactory.createCompoundBorder(
	BorderFactory.createTitledBorder("Message"),
	BorderFactory.createEmptyBorder(10,10,25,25)));
	a2.setBorder(BorderFactory.createLineBorder(Color.white));
	
	
	b1=new JButton("Send");
	b1.setForeground(Color.white);
	jp2.add(b1,BorderLayout.SOUTH);
	
	
	JPanel pp=new JPanel();
	pp.setOpaque(false); 
	pp.setLayout(new BorderLayout());
	

	
	jp3=new JPanel(null);
	jp3.setOpaque(false);
	jp3.setMinimumSize(getSize());
	jp3.setLayout(new GridLayout(0,1));
	//  jp3.setLayout(new FlowLayout());
	jf.add(pp,BorderLayout.EAST);
	
	pp.add(jp3,BorderLayout.EAST);
	
	txt=new JTextField(10);
	txt.setBounds(10,10,100,30);
	txt.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	txt.setForeground(Color.orange);
	txt.setOpaque(true);
	txt.setText("Your Name");
	
	txt.setBorder(
	BorderFactory.createCompoundBorder(
	BorderFactory.createTitledBorder("Port No."),
	BorderFactory.createEmptyBorder(03,03,5,5)));
	jp3.add(txt);
	txt.setBorder(BorderFactory.createLineBorder(Color.white));
	
	
	t2=new JTextField(10);
	t2.setBounds(10,40,100,30);
	t2.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	t2.setForeground(Color.orange);
	t2.setOpaque(true);
	
	t2.setText("#Name");
	
	t2.setBorder(
	BorderFactory.createCompoundBorder(
	BorderFactory.createTitledBorder("Client."),
	BorderFactory.createEmptyBorder(05,05,5,5)));
	t2.setBorder(BorderFactory.createLineBorder(Color.white));
	
	jp3.add(t2);
	
	
	t3=new JTextField(10);
	t3.setBounds(10,10,100,30);
	t3.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	t3.setForeground(Color.orange);
	t3.setOpaque(true);
	
	t3.setText("127.0.0.1");
	
	t3.setBorder(
	BorderFactory.createCompoundBorder(
	BorderFactory.createTitledBorder("Key."),
	BorderFactory.createEmptyBorder(05,05,5,5)));
	t3.setBorder(BorderFactory.createLineBorder(Color.white));
	
	jp3.add(t3);
	

	
	b3=new JButton("Xhngkey");
	jp3.add(b3);
		b3.setForeground(Color.white);
	b4=new JButton("#Hide");
	jp3.add(b4);
		b4.setForeground(Color.white);
	
	b5=new JButton("#Private");
	jp3.add(b5);
		b5.setForeground(Color.white);
	
	
	j1=new JSlider(1,9);
	jp3.add(j1);
	j1.setValue(2);
	
	
	a3=new JTextArea();
	a3.setText("Please enter your \n name before messaging \n start...");
	JScrollPane jj=new JScrollPane(a3);
	jp3.add(jj,BorderLayout.SOUTH);
	
	a3.setOpaque(true);
	a3.setEditable(false);
	a3.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	a3.setForeground(Color.green);
	
	
	JPanel  bb=new JPanel();
	jf.add(bb,BorderLayout.CENTER);
	bb.setLayout(new FlowLayout());
	
	d2=new DefaultListModel();
	l2=new JList(d2);
	JScrollPane px=new JScrollPane(l2);
	pp.add(px,BorderLayout.CENTER);
	d2.addElement("#Client_List           :");
	
	
		
	l2.setOpaque(true);
		l2.setBackground(new Color(0.0f,0.0f,0.0f,0.2f));
	l2.setForeground(Color.magenta);
	
	j1.setPaintLabels(true);
	

	
	jp3.setBorder(
	BorderFactory.createCompoundBorder(
	BorderFactory.createTitledBorder("Setting"),
	BorderFactory.createEmptyBorder(10,10,25,25)));
	jp3.setBorder(BorderFactory.createLineBorder(Color.white));
	
	
	
	//Thread 
	
	
	txt.addActionListener(new ActionListener(){
	 public void actionPerformed(ActionEvent e){	
		
	try{
	server_ip=t3.getText();
		
	Socket sd=new Socket(server_ip,1110);
	PrintWriter pw=new PrintWriter(new OutputStreamWriter(sd.getOutputStream()));
	BufferedReader br=new BufferedReader(new InputStreamReader(sd.getInputStream()));
	
	pw.write(txt.getText()+"\r\n"); pw.flush();
	
	int c=Integer.parseInt(br.readLine());
	
	for(int i=0;i<c;i++)
			{
			d1.addElement("<html>	<body>"+br.readLine()+"	</body></html>");	
			}
			
			
	sd.close();		
			
	
	}catch(Exception et){System.out.println(et); }
}
	});
	//End Thread
	
	
	// ActionListener
	b5.addActionListener(new ActionListener()
	{
		
		public void actionPerformed(ActionEvent e)
		{
			try{
	 	Object obj=	l2.getSelectedValue();	
	 	System.out.println(obj+"");
	 	if(obj==null)
	 	{
	 		JOptionPane.showMessageDialog(null, "Please select client from list", "alert", JOptionPane.ERROR_MESSAGE);
			
	 	}
	 	else{
		String ipmsg = JOptionPane.showInputDialog("Please enter message");
		    
		    try{
		    Socket s=new Socket(server_ip,1115);
		
			PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			pw.write(obj+"\r\n"); pw.flush();
			pw.write(txt.getText()+"\r\n"); pw.flush();
			pw.write(ipmsg+"\r\n"); pw.flush();
			
			
			String verify=br.readLine();
			d1.addElement("<html> <body> <font color=yellow>"+verify+"</font></body></html>");
			
			
			
			s.close();
			
			}catch(Exception esd){}
		
		}
		
		}catch(Exception es){JOptionPane.showMessageDialog(null, "Please select client from list", "alert", JOptionPane.ERROR_MESSAGE);}
	}
	});
	
	
	b4.addActionListener(new ActionListener()
	{
		
		public void actionPerformed(ActionEvent e)
		{
		jf.setVisible(false);	
		}});

	b1.addActionListener(new ActionListener()
	{
		
		public void actionPerformed(ActionEvent e)
		{
		
		
		try{
		
		
			Socket s=new Socket(server_ip,1111);
			PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		    String str=a2.getText();
		    str=str.replaceAll("\n","<br>");
			
		    pw.write("<font color=white>"+txt.getText()+": </font>"+str);
			pw.flush();
			s.close();
			
			
		}catch(Exception ef){}	
		}
		
	});
	
	
	
	
	Thread list=new Thread(){
	public void run(){
	
	for(;;){
					try{ ServerSocket m=new ServerSocket(1113); 
				
				
				for(;;){
					Socket s=m.accept();
					
					PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
					BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
					d2.	removeAllElements();
				d2.addElement("#Client_List           :");
	
	
				
					int count=Integer.parseInt(br.readLine());
				
					for(int y=0;y<count;y++)
					{
						d2.addElement(br.readLine());	
						
					}
				
					}	
					}catch(Exception e){System.out.println("Error in main:"+e); }
	
	}
	}
	};
	list.start();

	
	Thread t1=new Thread()
	{
	public void run(){	
	
	for(;;){
	for(int i=1;i<9;i++){
	b1.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
	b5.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
	b3.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
	b4.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*i));
	 try{Thread ty=this; ty.sleep(30);}catch(Exception ee){} 
	}
	
	
	for(int j=9;j>0;j--){
	b1.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*j));
		b5.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*j));
	b3.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*j));
	b4.setBackground(new Color(0.0f,0.0f,0.0f,0.1f*j));
	try{Thread ty=this; ty.sleep(30);}catch(Exception ee){} 
	}
	
	}
	}
	};
	t1.start();
	
	
	
	
	
	
	
	
	
	
Thread main=new Thread(){
public void run(){	
try{ ServerSocket man=new ServerSocket(1112); 


for(;;){
	Socket s=man.accept();
	
	PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));


	String msg=br.readLine();

	msg="<html>	<body>"+msg+"</body></html>";
	d1.addElement(msg);
	s.close();
	

	}	
	}catch(Exception e){System.out.println("Error in main:"+e); }
}
};
main.start();

	
	
	



Thread private_msg=new Thread()
{
	public void run(){
	try{
	ServerSocket ss=new ServerSocket(1116);	
	for(;;)
	{
		
	Socket sd=ss.accept();
	PrintWriter pwx=new PrintWriter(new OutputStreamWriter(sd.getOutputStream()));
	BufferedReader brx=new BufferedReader(new InputStreamReader(sd.getInputStream()));

	String msg=brx.readLine();
	d1.addElement(msg);
	sd.close();
		
	}
	
}catch(Exception er){}
}	
};

private_msg.start();
	
	
	
	//End
	
	
	
	
	
	
	
	
	
}



public static void main(String a[])
{
	
client c=new client();
 c.setVisible(true);
 c.setSize(600,430);
 c.setLocation(160,100);
 
 
 
 
 
	
}

}