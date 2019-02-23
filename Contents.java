// Program to show the content of a directory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Contents
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter Directory name");
	  String fname = scan.nextLine();
	  
	  File f = new File(fname);
	  if(f.exists())
	  {
		if(f.isFile())
		{
System.out.println("Not a Directory");			
	    }
		else
		{
			String[] arr = f.list();
			int len = arr.length;
			for(int i=0;i<len;i++)
			{
				System.out.println(i+ ". Name : "+arr[i]);
				File f1 = new File(fname,arr[i]);
				if(f1.isFile())
				{
					System.out.println("Type : File" );
				}
				else if(f1.isDirectory()){
					System.out.println("Type : Directory" );
				}
				else{}
			}
		}
	  }
	  else
	  {
		  System.out.println("No such Directory");
	  }
	}
}