package networking;
import java.net.*;
public class Server {

	public static void main(String[] args) 
	{
	 try
	 
	 {
		 System.out.println("server started");
		 ServerSocket ss=new ServerSocket(1600);
		 System.out.println("waiting for client");
		 Socket sk=ss.accept();
		 System.out.println("client connected");
		 ss.close();
		 sk.close();
		 System.out.println("server closed");
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }

	}

}
