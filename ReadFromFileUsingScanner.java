package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.Scanner;
public class ReadFromFileUsingScanner
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    File file =
      new File("D:\\java program\\filehandling\\Datasoft.txt");
    File file1 =
    	      new File("C:\\java program\\Datasoft.txt");
  /*  if(file.exists())
    {
    	file.delete();
    	System.out.println("file sucessfully deleted");
    }*/
     // file.createNewFile();
  // FileInputStream ins = new FileInputStream(file);
  // FileOutputStream outs = new FileOutputStream(file1);
  //  int b;
   // while  ((b=ins.read()) != -1)
   //     outs.write(b);
    
    //}
     // Files.copy(ins,outs);
   // file.renameTo(file1);
    Files.copy(file.toPath(),file1.toPath());
   
  }
}     