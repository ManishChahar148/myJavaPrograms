// using FileReader to read a .txt file

import java.util.Scanner;
import java.io.*;
class FileRead
{
public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter file name");
	  String fname = scan.nextLine();
	  
	  File f = new File(fname);
	  if(f.exists()&&f.isFile()==true)
	  {
		  FileReader fr = new FileReader(fname);
		  int i;
		  while((i=fr.read())!=-1)
			  System.out.print((char)i);
	  }
	  else
	  {
		  System.out.println("File not  found!");
	  }
}
}