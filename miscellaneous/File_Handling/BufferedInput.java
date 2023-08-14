package com.files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedInput {
	public static void main(String[] args) throws IOException{
		int c;
		FileReader f=new FileReader("C:\\\\Users\\\\kamal\\\\eclipse-workspace\\\\FileHandling\\\\src\\\\com\\\\files\\\\myfile.txt");
		BufferedReader b=new BufferedReader(f);
		while((c=b.read())!=-1) {
			System.out.print((char)c);
		}
		String s;
		while((s=b.readLine())!=null) {
			System.out.print(s);
		}
		b.close();
	}
}
