import java.net.*;
public class Server {

	public static void main(String[] args) 
	{
	 try
	 
	 {
		 System.out.println("server started");
		 ServerSocket ss=new ServerSocket(1500);
		 Socket sk=ss.accept();
		 System.out.println("client connected");
		 ss.close();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }

	}

}
