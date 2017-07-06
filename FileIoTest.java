package filehandling;
import java.io.*;
public class FileIoTest 
{
	public static void main(String s[]) throws IOException
	{
		File f=new File("Datasoft.txt");
		FileOutputStream fout=new FileOutputStream(f);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("enter the text hit enter to terminate");
			String str=br.readLine();
			if(str.length()==0)
			{
				break;
			}
			byte b[]=str.getBytes();
			fout.write(b);
			fout.flush();
			
		}
		fout.close();
		
	}
}
