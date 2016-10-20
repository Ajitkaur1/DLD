

import java.security.*;  
   import javax.crypto.*;  
   import javax.crypto.spec.*;  
   import java.io.*;  
  
    public class EncryptTest {  
    
    public EncryptTest(int option,String key2,String text){
   
   	try{
    		String seq="q&we*rt1234yu(iop)56%78#90as^df=g-h_jkl;'zxc|vbnm,./";
    		
    		String encryption="";
    		String decryption="";
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	
    	if(option==1)
    {
    	//System.out.println("Enter the text");
    	String enc=text;
    	
    	enc=enc.toLowerCase();
    	System.out.println(enc);
    //	enc=enc.replaceAll("?","ques");
    	enc=enc.replaceAll(" ","~");
    	enc=enc.replaceAll("\n","endline");
    	
    	
    	System.out.println(enc);
    	
    	System.out.println("Enter the key:");
    	String key=key2;
    	
    	String temp="";
    	
    	for(int i=(enc.length()-1);i>=0;i--)
    	{
    		temp=temp+enc.charAt(i);
    		
    	}	
    	
    	enc=temp;
    	
    	int len=key.length();
    	int j=0;
    		try{
    	for(int i=0;i<enc.length();i++)
    	{
    		if(j<key.length())
    		{
    	// System.out.print("Value:"+enc.charAt(i)+"("+(int)enc.charAt(i)+")"+"  key;"+key.charAt(j)+"("+(int)key.charAt(j)+")"+" =");	
    	
    	
    		int n=(int)enc.charAt(i)+(int)key.charAt(j); 	
    		//System.out.print(n+" after mod: ");
    		j++;
    		n=n%52;
    		//System.out.print(n+"\n\n");
    		encryption=encryption+seq.charAt(n);
    			
    		}	
    		else{
    			j=0;
    		//	System.out.print("Value:"+enc.charAt(i)+"("+(int)enc.charAt(i)+")"+"  key;"+key.charAt(j)+"("+(int)key.charAt(j)+")"+" =");	
    	       int n=(int)enc.charAt(i)+(int)key.charAt(j); 	
    		//System.out.print(n+" after mod: ");
    		j++;	
    		n=n%52;
    		//System.out.print(n+"\n\n");
    		encryption=encryption+seq.charAt(n);
    		}
    		
    	}	
    	
    	System.out.println("\n\n\nEncryption:"+encryption);
    	FileWriter wr=new FileWriter("mydata.enc");
    	wr.write(encryption+"");
    	wr.close();
    	
    }catch(Exception er){System.out.println(er);}
    	
    }
    	// Decryption 
    	
    	else{
    	
    	 int j=0;
    	  
    	System.out.println("Decryption text:");
    	encryption=text;  
    	  
    	System.out.println("\n\n Enter Decryption key");
    	String key=key2;
    	  
    	for(int i=0;i<encryption.length();i++)
    	{
    		
    		if(j<key.length() )
    		{
    		//System.out.println("Value:"+enc.charAt(i)+"  key;"+key.charAt(j)+" =");	
    		
    		int c=0;
    		//System.out.println(seq.length());
    		for(int z=0;z<seq.length();z++)
    		{
    		 if(encryption.charAt(i)==(seq.charAt(z))){ c=z; }	
    		}
    			
    		int n=((int)key.charAt(j)) ; 	
    		j++;
    		//System.out.println("c="+c);
    		
    		for(int g=41;g<46;g++)
    		{
    			//System.out.println("n:"+n+" + g:"+g+" ="+ (n+g));
    			if((( (n+g) )%52) ==c){  decryption=decryption+(char) g;  }
    			
    		}
    		
    		for(int g=94;g<140;g++)
    		{
    			//System.out.println("n:"+n+" + g:"+g+" ="+ (n+g));
    			if((( (n+g) )%52) ==c){ if(encryption.charAt(i)!='.') decryption=decryption+(char) g;  }
    			
    		}
    		
    		
    			
    		
    		}	
    		else{
    			j=0;
    				int c=0;
    		for(int z=0;z<seq.length();z++)
    		{
    		 if(encryption.charAt(i)==(seq.charAt(z))){ c=z; }	
    		}
    	    int n=((int)key.charAt(j)) ; 	
    		j++;
    		//System.out.println("c="+c);
    		
    		
    		for(int g=41;g<46;g++)
    		{
    			//System.out.println("n:"+n+" + g:"+g+" ="+ (n+g));
    			if((( (n+g) )%52) ==c){ decryption=decryption+(char) g;  }
    			
    		}
    		
    		
    		for(int g=94;g<140;g++)
    		{
    			
    			if( ( ( (n+g)  )%52 ) ==c){  if(encryption.charAt(i)!='.')  decryption=decryption+ (char) g; }
    			
    		}
    		
    		
    		}
    		
    	}	
    	
    
    		decryption=decryption.replaceAll("endline","\n");
    		decryption=decryption.replaceAll("ques","?");
    		decryption=decryption.replaceAll("b.",".");
    		
    			decryption=decryption.replaceAll("-","");
    	decryption=decryption.replaceAll("~"," ");

    
    	String temp2="";
    	for(int n=decryption.length()-1;n>=0;n--)
    	{
    		
    	temp2=temp2+decryption.charAt(n);	
    	}
    	decryption=temp2;
    	decryption=decryption.replaceAll("endline","\n");
    			
    	System.out.println("Decryption:"+decryption);
    	decryption=decryption.replaceAll("b.",".");
    		
    	decryption=decryption.replaceAll("-","");
    	decryption=decryption.replaceAll("~"," ");



    	FileWriter wr=new FileWriter("mydata.dec");
    	wr.write(decryption+"");
    	wr.close();
    	
    }
    	//for(int o=94;o<140;o++) { System.out.println((char)o+" "); }
    	
    	 }catch(Exception e){}
    	 
    
    	 
    }
    

 		public static void main(String[] args) throws Exception {
    	
			new EncryptTest(1,"Hello","dscdfedfefefefef \n\n ?");    
		
		}  
}  
