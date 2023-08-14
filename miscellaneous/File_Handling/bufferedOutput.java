package com.files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class bufferedOutput {
	public static void main(String[] args) throws IOException{
		FileWriter f=new FileWriter("C:\\\\Users\\\\kamal\\\\eclipse-workspace\\\\FileHandling\\\\src\\\\com\\\\files\\\\myfile.txt",true);
		BufferedWriter b=new BufferedWriter(f);
		b.write("Kamalika");
		b.close();
	}
}
