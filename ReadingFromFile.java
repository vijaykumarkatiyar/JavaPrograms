package filehandling;
//Java Program to illustrate reading from
//FileReader using FileReader
import java.io.*;
public class ReadingFromFile
{
public static void main(String[] args) throws Exception
{
 // pass the path to the file as a parameter
 FileReader fr = new FileReader("D:\\java program\\filehandling\\abc.txt");
 int i;
 while ((i=fr.read()) != -1)
   System.out.print((char) i);
 fr.close();
}
}