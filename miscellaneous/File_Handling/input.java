package com.files;
import java.io.FileInputStream;
import java.io.IOException;
public class input {
	public static void main(String[] args) throws IOException{
		FileInputStream fin=new FileInputStream("C:\\\\Users\\\\kamal\\\\eclipse-workspace\\\\FileHandling\\\\src\\\\com\\\\files\\\\myfile.txt");
		int i;
		do {
			i=fin.read();
			if(i!=-1) System.out.print((char)i);
		}while(i!=-1);
		System.out.println();
		fin.close();
	}
}
