package networking;
import java.net.*;
public class Client {

	public static void main(String[] args)
	{
		 try
		 {
			 System.out.println("client started");
			 System.out.println("sending the request to server");
			 Socket sk=new Socket("localhost",1600);
			 System.out.println("connection established");
			 sk.close();
			 System.out.println("client close");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
