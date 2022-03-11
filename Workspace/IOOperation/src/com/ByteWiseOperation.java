package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseOperation {

	public static void main(String[] args) throws Exception{
// Source is keyboard and Destination is console 
		
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the text");
//		String name = dis.readLine();
//		ps.println("Your name is "+name);
		// source : keyboard and destination is file 
		
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("abc.txt");
//		System.out.println("Enter the text");
//		int ch;
//		while((ch= dis.read()) != '@') {
//			fos.write(ch);
//			System.out.print(ch);
//		}
//		fos.close();
		
		// copy from one file to another file 
//		FileInputStream fis = new FileInputStream("abc.txt");
//		FileOutputStream fos = new FileOutputStream("demo.txt");
//		int ch;
//		while((ch=fis.read()) != -1) {		// -1 is equal of EOF
//			fos.write(ch);
//		}
//		System.out.println("file copied");
//		fis.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("demo.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read()) != -1) {		// -1 is equal of EOF
			bos.write(ch);
		}
		System.out.println("file copied");
		bos.flush();	// send data from buffere memory to file 
		fis.close();
		fos.close();
	}

}
