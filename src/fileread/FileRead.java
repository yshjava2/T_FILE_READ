package fileread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileRead 
{	
	static String data = null;
	
	public static void main(String[] args) throws IOException
	{			
		FileReader f = new FileReader("D://test.txt");		
				
		BufferedReader buff = new BufferedReader(f); 
 			
		data = buff.readLine();			
	
		System.out.println(data);	
	}
}
