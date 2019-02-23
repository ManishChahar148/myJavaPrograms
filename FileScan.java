// reading a file with Scanner
import java.util.Scanner;
import java.io.*;
class FileScan
{
public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter file name");
	  String fname = scan.nextLine();
	  
	  File f = new File(fname);
	  if(f.exists()&&f.isFile()==true)
	  {
		  Scanner s = new Scanner(f);
		while(s.hasNextLine())
			System.out.println(s.nextLine());
	  }
	  else
	  {
		  System.out.println("File not  found!");
	  }
}
}