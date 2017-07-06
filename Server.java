import java.net.*;
import java.io.*;
 
public class Server
{
public static void main(String args[]) throws Exception
{
System.out.println("server started");
ServerSocket ss=new ServerSocket(1600);
System.out.println("waiting for client to connect");
Socket sk=ss.accept();
System.out.println("client connected");
BufferedReader cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
PrintStream cout=new PrintStream(sk.getOutputStream());
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
String s;
while (  true )
{
s=cin.readLine();
if (s.equalsIgnoreCase("END"))
{
cout.println("BYE");
break;
}
System. out.print("Client : "+s+"\n");
System.out.print("Server : ");
s=stdin.readLine();
cout.println(s);
}
ss.close();
sk.close();
cin.close();
cout.close();
stdin.close();
}
}