package networking;

import java.net.*;
public class NetTest {

	public static void main(String[] args) 
	{
		try{  
			InetAddress ip=InetAddress.getLocalHost();  
			  
			System.out.println("Host Name: "+ip.getHostName());  
			System.out.println("IP Address: "+ip.getHostAddress());  
			}
		catch(Exception e)
		    {
				System.out.println(e);
		    }  
		 
	}

}
