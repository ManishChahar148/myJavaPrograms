// Program to get different properties of a file.

import java.io.File;
import java.util.Scanner;
class FileProperty
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter file name");
	  String fname = scan.nextLine();
	  
	  File f = new File(fname);
	  
	    System.out.println("Name : "+ f.getName());
		 System.out.println("Path : " + f.getPath());
		  System.out.println("Absolute Path : "+ f.getAbsolutePath());
		   System.out.println("Parent : "+ f.getParent());
		   System.out.println("exist : "+ f.exists());
		   if(f.exists())
		   {
			    System.out.println("Readable : "+ f.canRead());
				System.out.println("Writable : "+ f.canWrite());
				System.out.println("Executable : "+ f.canExecute());
				System.out.println("file : "+ f.isFile());
				System.out.println("Directory : "+ f.isDirectory());
				System.out.println("Size : "+ f.length()+" Bytes");
				
		   }
	}
}