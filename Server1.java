package networking;
import java.net.*;
import java.io.*;
public class Server1 {

	public static void main(String[] args)
	{
		 try
		 
		 {
			 System.out.println("server started");
			 ServerSocket ss=new ServerSocket(1600);
			 System.out.println("waiting for client");
			 Socket sk=ss.accept();
			 System.out.println("client connected");
			 DataInputStream din=new DataInputStream(sk.getInputStream());
			 DataOutputStream  dout=new DataOutputStream(sk.getOutputStream());
			 while(true)
			 {
				 String msg=din.readUTF();
				 System.out.println("Client : "+msg);
				 msg=msg.toUpperCase();
				 dout.writeUTF(msg);
				 dout.flush();
				 if(msg.equals("halt"))
				 {
					break;
					 
				 }
			  }
			 System.out.println("server closed");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }

		}

	}


