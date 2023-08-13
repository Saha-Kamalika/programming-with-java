package com.files;
import java.io.IOException;
import java.io.FileOutputStream;

public class output {
	public static void main(String[] args) throws IOException{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\kamal\\eclipse-workspace\\FileHandling\\src\\com\\files\\myfile.txt",true);
		String s="SRIJIT";
		char c[]=s.toCharArray();
		int len=s.length();
		for(int i=0;i<len;i++) {
			fout.write(c[i]);
		}
		fout.close();
		System.out.println("Successfully written into the file");
	}
}
