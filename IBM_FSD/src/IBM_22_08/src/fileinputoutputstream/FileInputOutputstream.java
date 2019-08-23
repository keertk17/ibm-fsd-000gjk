package fileinputoutputstream;

import java.io.*;

public class FileInputOutputstream {
	
	public static void main(String args[]) throws IOException
	{
		//FileInputStream in=new FileInputStream(new File("input.txt"));
		//FileOutputStream out =new FileOutputStream(new File("output.txt"));
		FileReader in=new FileReader(new File("input.txt"));
		FileWriter out=new FileWriter(new File("output.txt"));
		
		int c;
		while((c=in.read())!=-1) {
			System.out.println((char)c);
			out.write(c);
		}
		in.close();
		out.close();
	}
}
