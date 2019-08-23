package fileinputoutputstream;

import java.io.*;

public class CopyByFileReaderWriter {
	public static void main(String args[]) throws IOException{
	
	FileReader in=new FileReader(new File("input.txt"));
	FileWriter out=new FileWriter(new File("output.txt"));
	BufferedReader inputStream=new BufferedReader(in);
	PrintWriter outputStream=new PrintWriter(out);
	String l;
	while((l=inputStream.readLine())!=null) {
		System.out.println(l);
		outputStream.println(l);
	}
	in.close();
	out.close();
	
}
}
