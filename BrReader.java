// using BufferedReader to read a .txt file 

import java.io.*;
import java.util.Scanner;
public class BrReader
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter file name");
	  String fname = scan.nextLine();
	  
	  File f = new File(fname);
	  if(f.exists())
	  {
		  BufferedReader br = new BufferedReader(new FileReader(f));
		  String st;
		  while((st=br.readLine())!=null)
		  {
			  System.out.println(st);
		  }
	  }
	  else
	  {
		  System.out.println("File not found!");
	  }
  
	}
}