package networking;
import java.net.*;
import java.io.*;
public class Client1 {

	public static void main(String[] args)
	{
		 try
		 {
			 System.out.println("client started");
			 System.out.println("sending the request to server");
			 Socket sk=new Socket("localhost",1600);
			 System.out.println("connection established");
			 DataInputStream din=new DataInputStream(sk.getInputStream());
			 DataOutputStream  dout=new DataOutputStream(sk.getOutputStream());
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("START CHAT TO TERMINATE THE CHAT WRITE HALT");
			 while(true)
			 {
				 String str=br.readLine();
				 dout.writeUTF(str);
				 dout.flush();
				 String msg=din.readUTF();
				 System.out.println("SERVER : "+msg);
				 if(str.equals("halt"))
				 {
					 break;
				 }
				 
			 }
			 sk.close();
			 System.out.println("client close");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 

	}

}
