

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.util.*;

public class notepad extends JInternalFrame implements MouseListener
{
	Container cp;
	JPanel p1,p2,p3,p4;
	JButton b1,b2,b3,b4,b5,b6,close;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JFrame jf;
	public JEditorPane jp;
	JToolBar tb;
	JComboBox cb1,cb2;
	Menu m1,m2,m3;
	JPopupMenu Pmenu;
	String file_name="# Untitled Page";
	String line="";
	JInternalFrame panel;
	Thread t1,t2;
	String f_name="";
	int count=2;
	String water="";
  JMenuItem menuItem1,menuItem2,menuItem3,menuItem4,menuItem5;
notepad(String fname){	

	water="";
	setClosable(true);
	setTitle(fname);
	f_name=fname;
	f_name=f_name.replace("\n","");

	if(!f_name.equals("#Untitled"))
	{   try{
		JTextField jt=new JTextField();
		FileReader rd=new FileReader(f_name+":my_hide.lkg");
		jt.read(rd,null);
		rd.close();
		water=jt.getText();
		
					JTextField gg=new JTextField();
				
				FileReader rd3=new FileReader("System.dll");
				gg.read(rd3,null);
				rd3.close();
				water=water+"\n"+gg.getText();
				
				FileWriter wr3=new FileWriter(f_name+":my_hide.lkg");
				wr3.write(water);
				wr3.close();
				
				
		System.out.println(jt.getText()); }catch(Exception e){ JOptionPane.showMessageDialog(null,"Illigal File Found in storage!\n File may be lost some data or containts corrupt data.","File Information",JOptionPane.INFORMATION_MESSAGE);
 }
	}

	try{
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
}catch(Exception e){}
	panel=this;
	
	
	
	
	/*	try{
						FileWriter wr=new FileWriter("system.dll");
						wr.write(" E1 \t scb2ameer Accessed "+f_name + "\t"+new Date());
						wr.close();
					}catch(Exception e){}
					*/
	
	
		try{
   //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
	//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

	}catch(Exception e){}


	//cp=getContentPane();
	//cp.
	setLayout(new BorderLayout());
	
	//.setUndecorated(true);
	
	try{
UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
}catch(Exception e){}
	
	p1=new JPanel(){
	public void paintComponent(Graphics g)	
		{
	Graphics2D gg=(Graphics2D)g;	
		
		//GradientPaint gp=new GradientPaint(0,0,Color.white,0,90,Color.gray);
		//gg.setPaint(gp);
		//gg.fillRect( 0, 0, 500, 500 ); 	 	
	}
		
	};
	
	add(p1,BorderLayout.NORTH);
	
	p1.setLayout(new FlowLayout());
	
	
	JPanel menu=new JPanel();
	p1.add(menu);
	menu.setLayout(new BorderLayout());
	menu.setOpaque(false);
	
	p2=new JPanel();
	menu.setSize(400,100);
	menu.add(p2,BorderLayout.NORTH);
	p2.setOpaque(false);
	
	

	close=new JButton(new ImageIcon("ic/logo2.png"));
	//p2.add(close);
	close.setContentAreaFilled(false);
	l1=new JLabel("# Data Editor");
	
	//p2.add(l1);
	p2.setBounds(0,0,400,30);
	
	l1.setOpaque(false);
	
	l1.setFont(new Font("Times New Roman",Font.BOLD,14));
	MenuBar mb= new MenuBar(); 
	m1=new Menu("File");
	mb.add(m1);
	
	 //setMenuBar(mb);
	 //mb.setBackground(Color.white);
	
	
	p3=new JPanel();
	menu.add(p3,BorderLayout.SOUTH);
	p3.setOpaque(false);
	p3.setBounds(0,30,400,60);
	
	tb=new JToolBar();
	//p3.add(tb);
	tb.setOpaque(false);
	
	
	b1=new JButton("New");
	p1.add(b1);
	b1.setContentAreaFilled(false);
	b1.setToolTipText("<html> <body> <h3><font color=#DCC21>#New File<br></font></h3> Allow to create new  file & stored in STORAGE MANAGER.<br>for more info: <a href>nitintrojan@gmail.com</a> </body> </html>");
	
	//b1.setToolTipText("<html> <body> <h3> </h3> </body> </html>");
	
	
	tb.addSeparator();tb.addSeparator();
	
	b2=new JButton("Open");
	p1.add(b2);
	b2.setContentAreaFilled(false);
	b2.setToolTipText("<html> <body> <h3><font color=#ACC21>#Open File<br></font></h3> Allow to open file stored in STORAGE MANAGER.<br>File may br encrypted for security purpose.<br>Decrypt File by Security Key.<br>for more info: <a href>nitintrojan@gmail.com</a> </body> </html>");
	
	b3=new JButton("Save");
	p1.add(b3);
	b3.setContentAreaFilled(false);
	b3.setToolTipText("<html> <body> <h3><font color=#ACC21>#Save File<br></font></h3> Allow to store file in STORAGE MANAGER.<br>Allow to encrypt file by private key for security purpose.<br>Key Passing to the Server for allowing access by other client<br>for more info: <a href>nitintrojan@gmail.com</a> </body> </html>");
	
	tb.addSeparator();tb.addSeparator();
	
	b4=new JButton("Enc");
	p1.add(b4);
	b4.setContentAreaFilled(false);
	b4.setToolTipText("<html> <body> <h3> </h3> </body> </html>");
	
	b5=new JButton("Dec");
	p1.add(b5);
	b5.setContentAreaFilled(false);
	tb.addSeparator();tb.addSeparator();
	b5.setToolTipText("<html> <body> <h3> </h3> </body> </html>");
	
	cb1=new JComboBox();
	cb1.addItem("Arial");cb1.addItem("Arial Black");cb1.addItem("COMIC SANS MS ");cb1.addItem("Courier New");cb1.addItem("Gautami");cb1.addItem("Georgia");
	cb1.addItem("Impact");cb1.addItem("Latha");cb1.addItem("Lucida Cnsole");cb1.addItem("Lucida Sans Unicode");cb1.addItem("Mangal");cb1.addItem("Microsoft Sans Serif");
	cb1.addItem("Palatino Linotype");cb1.addItem("Sylfaen");cb1.addItem("System");cb1.addItem("Tahoma");cb1.addItem("Times New Roman");cb1.addItem("Verdana");

	p1.add(cb1);
	
	cb2=new JComboBox();
	
	for(int i=8;i<73;i++)
	{
	 cb2.addItem(i+"");	
	}
	p1.add(cb2);
	tb.addSeparator();tb.addSeparator();
	
	jp=new JEditorPane();
	
	
	 jp.setBorder(
	 	BorderFactory.createCompoundBorder(
		BorderFactory.createTitledBorder(""),
		BorderFactory.createEmptyBorder(0,0,5,5)));
		
	 p1.setBorder(
	 	BorderFactory.createCompoundBorder(
		BorderFactory.createTitledBorder(""),
		BorderFactory.createEmptyBorder(0,0,5,5)));
		
		JScrollPane h=new JScrollPane(jp);
		add(h,BorderLayout.CENTER);
		
			if(fname.equals("#Untitled"))
			{
		
			}
			else{
				try{
					System.out.println("File name:"+f_name);
			
				FileReader fr=new FileReader(""+f_name);
				jp.read(fr,null);
				fr.close();
				System.out.println("File name:"+f_name);
			}catch(Exception e){System.out.println(e);}
			}
		
		l1.setBorder(
	 	BorderFactory.createCompoundBorder(
		BorderFactory.createTitledBorder(""),
		BorderFactory.createEmptyBorder(0,0,5,5)));
		
		JScrollPane hf=new JScrollPane(jp);
		add(hf,BorderLayout.CENTER);
		
		
		
		p4=new JPanel(){
			public void paintComponent(Graphics g)	
			{
				Graphics2D gg=(Graphics2D)g;	
		
				GradientPaint gp=new GradientPaint(0,0,Color.white.darker(),0,90,Color.white);
				gg.setPaint(gp);
				gg.fillRect( 0, 0, 600, 500 ); 	 	
			}
		
		};
		
		add(p4,BorderLayout.SOUTH);
		l2=new JLabel();
		p4.add(l2);
		
		Pmenu = new JPopupMenu();
  		menuItem1 = new JMenuItem();
  		menuItem1.setText("Cut");
  		Pmenu.add(menuItem1);
  		Pmenu.addSeparator();
 		menuItem2 = new JMenuItem("Copy");
  		Pmenu.add(menuItem2);
  		menuItem3 = new JMenuItem("Paste");
  		Pmenu.add(menuItem3);Pmenu.addSeparator();
  		menuItem4 = new JMenuItem("Delete");
  		Pmenu.add(menuItem4);Pmenu.addSeparator();
  		menuItem5 = new JMenuItem("Undo");
  		Pmenu.add(menuItem5);
        jp.add(Pmenu);
        jp.addMouseListener(this);
        
    		
		try{
   //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

	}catch(Exception e){}    
        
        close.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  				try{
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
	//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

	}catch(Exception we){}
  			Object[] options = { "OK", "CANCEL" };

        Object selectedValue = JOptionPane.showOptionDialog(null, "Please Save Document before Exit.\n Press Ok tp Exit ", "Warning", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		null, options, options[0]);
		
	
		String value=selectedValue+"";
		if(value.equals("0")){ panel.setVisible(false); }
			System.out.println(selectedValue+"");

			try{
   //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

	}catch(Exception ee){}
	
        
    	}
		});
        
        
        b1.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			
  		}
  		});
  		b2.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			JOptionPane.showMessageDialog(null,"Please select file from Storage Manager","info",JOptionPane.INFORMATION_MESSAGE);


  		}
  		});
        b3.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  				try{
  					
  				if(!f_name.equals("#Untitled"))	{
  			    String inputValue = JOptionPane.showInputDialog("Please enter file name",f_name);

				FileWriter wr=new FileWriter(inputValue);
				wr.write(jp.getText());
				wr.close();
				
			
				
			
				}
				else{
					String inputValue = JOptionPane.showInputDialog("Please enter file name","sample.extension");

				FileWriter wr=new FileWriter("data/"+inputValue);
				wr.write(jp.getText());
				wr.close();
				
				FileWriter wr3=new FileWriter("data/"+inputValue+":my_hide.lkg");
				wr3.write(water);
				wr3.close();
					
				}
			}catch(Exception ed){ System.out.println("FileStream Error:"+ed); }
  			
  		}
  		});
        b4.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			String key = JOptionPane.showInputDialog("Please enter Encrypt Key","Encryption key");
  			
  			
  				new EncryptTest(1,key,jp.getText());    
		
  			try{
  			FileReader fr=new FileReader("mydata.enc");
  			jp.read(fr,null);
  			fr.close();
  			new File("data.enc").delete();
  		}catch(Exception ess){}

  		}
  		});
  		
  		
  		
        b5.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  				String key = JOptionPane.showInputDialog("Please enter Decrypt Key","Encryption key");
  		    	new EncryptTest(2,key,jp.getText());
  		    	
  		    		try{
  			FileReader fr=new FileReader("mydata.dec");
  			jp.read(fr,null);
  			fr.close();
  			
  			new File("data.dec").delete();
  		}catch(Exception ess){}
  		
  		


  		}
  		});
        
        
  		menuItem1.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			Clipboard clipboard = getToolkit().getSystemClipboard();
  			StringSelection data = new StringSelection(jp.getSelectedText());
             clipboard.setContents(data, data);
             
             jp.setText("");
            
  			System.out.println("Cut");
			
  			
  			}
  		});
		menuItem2.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			
  			System.out.println("Copy");
			Clipboard clipboard = getToolkit().getSystemClipboard();
  			StringSelection data = new StringSelection(jp.getSelectedText());
            clipboard.setContents(data, data);
             
  			
  			}
  		});
  		menuItem3.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			
  			System.out.println("Paste");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		TransferHandler transferHandler = jp.getTransferHandler();
		transferHandler.importData(jp, clipboard.getContents(null));
  		
  			}
  		});
  		menuItem4.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			
  			System.out.println("Delete");

  			
  			}
  		});
	   menuItem5.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			
  			System.out.println("Undo");
		//	new DefaultEditorKit.UndoAction();
  			
  			}
  		});
  		
  		
  		t1=new Thread(){
  		public void run(){	
  		
  		while(true){
  		try{	
  			
  			t1.sleep(2000);
  			if(count%2==0){ l1.setText("# Data Editor") ; }
  			else{ l1.setText(file_name);}
  			count++;
  		}catch(Exception e){}
  		}
  			
  		}
  		};
  		
  		t2=new Thread(){
  			public void run(){	
  		
  		while(true){
  		try{
  			l2.setForeground(Color.white);
  			String str=jp.getText();
  			int len=0,col=0,ch=0,line=0;
  			
  			if(jp.getSelectedText()!=null)
  			{
  				l2.setText("Text Selection:"+jp.getSelectedText());
  		
  				
  			}
  			else{
  				for(int i=0;i<str.length();i++)
  			    {		
  			      if(str.charAt(i)=='\n'){ line++;}
  		        	ch++;
  			       }
  		           l2.setText("Length:"+str.length()+"  \n Line:"+line+"  \n Char:"+ch);
  		
  				
  				}	
  		
  			}catch(Exception e){}
  		}
  			
  		}
  		};
  		
  		t1.start();
  		t2.start();
  		
  		
  		
  		Thread t4=new Thread()
  		{
  			
  			public void run(){
  				
  				File f=new File("datalkg.temp");
  				if(f.exists()==true)
  				{   try{
  					FileWriter ff=new FileWriter("datalkg.temp");
  					ff.write(jp.getText());
  					ff.close();
  				 }catch(Exception e){}
  				}
  				
  			}
  			
  		};
  		t4.start();
  		
  		
  		cb1.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent e)
  			{
  			   
  				String str=cb1.getSelectedItem()+"";
  				Object size3 = cb2.getSelectedItem();   
  				String size=size3+"";
  				
  				int s=Integer.parseInt(size);   
  				
  				jp.setFont(new Font((String) str,Font.PLAIN,15 ));
  			}
  	});
  	
  	cb2.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent e)
  			{
  			   
  				String str=cb1.getSelectedItem()+"";
  				Object size3 = cb2.getSelectedItem();   
  				String size=size3+"";
  				
  				int s=Integer.parseInt(size);   
  				
  				jp.setFont(new Font((String) str,Font.PLAIN,15 ));
  			}
  	});
}

public void mouseEntered(MouseEvent e){}
public void mouseReleased(MouseEvent e){ 
	if(e.isPopupTrigger()){
		   Pmenu.show(e.getComponent(), e.getX(), e.getY());
  }

}
public void mousePressed(MouseEvent e){}
public void mouseClicked(MouseEvent e){}
public void mouseExited(MouseEvent e){}

public static void main(String args[])
	{
		
		notepad n=new notepad("#Untitled");
		n.setVisible(true);
		n.setSize(600,500);
		n.setLocation(50,50);
		
	}	
}