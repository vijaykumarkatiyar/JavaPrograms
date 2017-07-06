import java.net.*;
public class Client {

	public static void main(String[] args)
	{
		 try
		 {
			 System.out.println("client started");
			 System.out.println("sending the request to server");
			 Socket sk=new Socket("localhost",1500);
			 System.out.println("connection established");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
