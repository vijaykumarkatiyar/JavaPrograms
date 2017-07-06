package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest 
{
public static void main(String s[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	// System.out.println("Enter dirpath:");
    // String dirpath=br.readLine();
    // System.out.println("Enter the dirname");
    // String dname=br.readLine();
    // File f = new File(dirpath, dname);
     File file = new File("D:\\java program\\TEST\\abc.txt");
     BufferedReader br1 = new BufferedReader(new FileReader(file));
    
     if(file.exists())
     {
    	// f.delete();
    	 //System.out.println("file deleted sucessfully");
    	 System.out.println("you want to read the file type R for read and W for write the file");
    	 String choice=br.readLine();
    	 if(choice.toUpperCase().equals("R"))
    	 {
    		 System.out.println("READING STARTED");
    		  String st;
    		  while ((st = br1.readLine()) != null)
    		  {
    		   System.out.println(st);
    		  }
    		  System.out.println("READING sucessfully DONE");
    	 }
    	 else if (choice.toUpperCase().equals("W")) 
    	 {
    		 FileOutputStream fout=new FileOutputStream(file);
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
    			 System.out.println("writing sucessfully DONE");
    	 }
    	 
     }
     else
     {
    	 file.createNewFile();
    	 System.out.println("new file created sucessfully");
     }
    }
}
