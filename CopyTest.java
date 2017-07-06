package filehandling;

import java.io.BufferedReader;
import java.io.File;
 import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class CopyTest {

	public static void main(String s[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//File SourceFile =new File("D:\\java program\\filehandling\\Datasoft.txt");
		System.out.println("Enter source directory path:");
        String sourcedirpath=br.readLine();
        System.out.println("Enter the source filename");
        String filename=br.readLine();
	    System.out.println("Enter destination dirpath:");
        String dirpath=br.readLine();
        
        File destinationFolder = new File(dirpath);
        File destination = new File(dirpath,filename);
        File SourceFile1 =new File(sourcedirpath,filename);
	    if(destinationFolder.exists())
	    { 
	    	System.out.println("folder exist");
	    	if(destination.exists())
	    	{
	    		System.out.println("we have to replace file");
	    		destination.delete();
	    		System.out.println("file deleted");
	    		System.out.println("copying started");
	    		Files.copy(SourceFile1.toPath(),destination.toPath());
	    		 System.out.println("copying done");
	    		
	    	}
	    	else
	    	{
	    		 System.out.println("copying started");
	    		Files.copy(SourceFile1.toPath(),destination.toPath());
	    		 System.out.println("copying done");
	    	}
	    }
	    else
	    {
	    	 System.out.println("folder does not exist started");
	    	 System.out.println("creating the path/folders for you");
			 destinationFolder.mkdirs();
    		 //destination.createNewFile();
			 System.out.println("copying started");
			Files.copy(SourceFile1.toPath(),destination.toPath());
			 System.out.println("copying done");
	    }
	}
}
	 