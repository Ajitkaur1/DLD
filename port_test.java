
package port_test;
import java.io.*;
import java.net.*;
import java.util.*;

class port_test
{

public static void main(String args[])
{
	
    Thread t[]=new Thread[1000];
	
	int l=0,i=1;
	System.out.println("Port No \t Status \t Time");
	System.out.println("************************************************************");
	while(true)
	{
	for(i=1;i< 600 ;i++)
	{
						final int z=l;
						final int q=i;
						t[i]=new Thread()
						{
						public void run(){
							
						
						for(int j=z;j<q*100;j++){
						try{
							
						String host="";	
						InetAddress hostAddress=InetAddress.getByName(host);
						Socket s=new Socket("127.0.0.1",j);
						System.out.println(""+j+"\t Working \t"+new Date());
						
						}catch(Exception e){ System.out.println(""+j+" \t Ideal \t"+new Date());}
						}
						}
							
						};
						
						
						l=l+100;
						t[i].start();
	
	
	
	}
}

}
}