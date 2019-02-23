// renaming and  moving a file from  one directory to another

import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

class FileMove
{
public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter Source file name");
	  String sname = scan.nextLine();
	  
	   System.out.println("Enter Dest. Directory and file name");
	  String dname = scan.nextLine();
	  
	  File f = new File(sname);
	  if(f.exists()&&f.isFile()==true)
	  {
		Path temp = Files.move(
								Paths.get(sname),Paths.get(dname)
							);
		if(temp != null)
			System.out.println("File renamed and moved successfully.");
		else{
			System.out.println("Unable to move file");
		}
	  }
	  else
	  {
		  System.out.println("File not  found!");
	  }
}
}