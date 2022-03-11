package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseOperation {

	public static void main(String[] args) throws Exception{
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		System.out.println("Enter the id");
//		int id = Integer.parseInt(br.readLine());
//		System.out.println("your name is "+name);
//		System.out.println("id is "+id);
		
		// file copy 
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		int ch;
		while((ch=br.read()) != -1) {		// -1 EOF 
			bw.write(ch);
		}
		bw.flush();
		fr.close();
		fw.close();
		System.out.println("File copied...");
	}

}
