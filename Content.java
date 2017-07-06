package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
 
//Displaying the contents of a directory
class Content
{
    public static void main(String[] args) throws IOException {
        //enter the path and dirname from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Enter dirpath:");
        String dirpath=br.readLine();
        System.out.println("Enter the dirname");
        String dname=br.readLine();
 
        //create File object with dirpath and dname
        File f = new File(dirpath, dname);
 
       // File folder = new File("your/path");
        File[] listOfFiles = f.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
              if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
              } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
              }
            }
    }
}