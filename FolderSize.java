package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FolderSize {
	static int files=0;
	static int folder=0;
	public static void main(String s[])
	{
		 
	        try 
	        {  
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter dirpath:");
	        String dirpath=br.readLine();
	        System.out.println("Enter the filename");
		    String filename=br.readLine();
		    File f=new File(dirpath,filename);
		    long name=sizeFolder(f);
		    System.out.println("files count = "+files);
	        System.out.println("folder count = "+folder);
		   // long length=folderSize(f);
		    System.out.println("length ="+name);
		    System.out.println("length in gb ="+name/(1024*1024*1024)+"Giga Byte");
		     
			} 
	        catch (IOException e) 
	        {
				e.printStackTrace();
			}
	}
	public static long folderSize(File f)
	{
		long length=0;
		for(File file:f.listFiles())
			if(file.isFile())
			{
				length=length+f.length();
			}
			else
			{
				length=length+folderSize(file);
			}
		return length;
		
	}
	public static long sizeFolder(File f)
	{
		long length=0;
		File[] listOfFiles = f.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
          if (listOfFiles[i].isFile()) {
            System.out.println("File " + listOfFiles[i].getName());
            length=length+listOfFiles[i].length();
            files=files+1;
          } 
          else
          {
            System.out.println("Directory " + listOfFiles[i].getName());
            length=length+sizeFolder(listOfFiles[i]);
            folder=folder+1;
            
          }
        }
		return length;
		
	}

}
