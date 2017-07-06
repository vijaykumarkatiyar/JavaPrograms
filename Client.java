import java.net.*;
import java.io.*;
public class Client
{
public static void main(String args[]) throws Exception
{
System.out.println("client started");
Socket sk=new Socket("localhost",1600);
System.out.println("client connected tothe server");
BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
PrintStream sout=new PrintStream(sk.getOutputStream());
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
String s;
while (true)
{
System.out.print("Client : ");
s=stdin.readLine();
sout.println(s);
s=sin.readLine();
System.out.print("Server : "+s+"\n");
if (s.equalsIgnoreCase("Halt") )
    break;
}
sk.close();
sin.close();
sout.close();
stdin.close();
}
}