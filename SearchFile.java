package filehandling;

import java.io.File;

public class SearchFile 
{
	public static void main(String s[])
	{
		try
		{
		File f=new File("D:\\");
		String filename="abc.txt";
		sizeFolder(f,filename);
		}
		catch(Exception ee)
		{
			//System.out.println(ee.getMessage());
			
		}
			
	}
	public static void sizeFolder(File f,String filename)
	{
		try
		{
		 File[] listOfFiles = f.listFiles();
         for (int i = 0; i < listOfFiles.length; i++)
         {
	      if (listOfFiles[i].isFile()) 
	      {
	    	//  System.out.println(listOfFiles[i].getName());
	    	  String str=listOfFiles[i].getName();
	    	  if( str.equals(filename))
	    	  {
	    		  System.out.println("file found at location : "+listOfFiles[i].getAbsolutePath());
	    	  }
	      }
	      else
	      {
	        sizeFolder(listOfFiles[i],filename);
	       }
		}
        }
		catch(NullPointerException e)
		{
			//[System.out.println(e.getMessage());
		}
	}
}

	

