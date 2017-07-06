/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

try {
	    		 System.out.println("file exist");
	    		   FileInputStream ins = new FileInputStream(SourceFile);
	    		   FileOutputStream outs = new FileOutputStream(destination);
	    		   int b;
	    		    while  ((b=ins.read()) != -1)
	    		        outs.write(b);
			} catch (IOException e) {
				 
				e.printStackTrace();
			} 	
	    }
	    else
	    {
	    	try {
	    		 System.out.println("file does not exist");
	    		 System.out.println("creating the path/folders for you");
				 createDestination.mkdirs();
	    		 //destination.createNewFile();
				 System.out.println("copying started");
				Files.copy(SourceFile.toPath(),destination.toPath());
				 System.out.println("copying done");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();*/