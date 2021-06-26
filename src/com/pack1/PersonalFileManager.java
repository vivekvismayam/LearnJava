package com.pack1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Arrays;

public class PersonalFileManager {
	//Method 1: save a passed message to passed file
	public static void WriteToFile(File filename,String message)  {
		//File logfile=new File("C:\\Users\\Vivek\\Desktop\\Log.txt");
		try {
			
			PrintWriter writer = new PrintWriter(new FileOutputStream(filename, true));
			writer.println(message); 
			writer.close(); 
			System.out.println("File Write Success : "+message);
		} 
		catch (Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Exiting file writer method");
		}	
	}
	//Method 2: print all messages from passed file
	public static void ReadFile(File filename)  {
		//File file1=new File("C:\\Users\\Vivek\\Desktop\\Log.txt");
		System.out.println("Reading File : "+filename);
		try {
			Scanner reader = new Scanner(filename);
			
			for(int i=1;reader.hasNext();i++) {
				System.out.println("Reading line number "+i+" : "+reader.nextLine());
			}
			reader.close();
		System.out.println("File read Success!!!");	
		} 
		catch (Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Exiting file reader method");
			
		}
	}
	
	//Method 3: Encrypt and save to file
	public static void EncryptToFile(File filename,String message)  {
		//File logfile=new File("C:\\Users\\Vivek\\Desktop\\Log.txt");
		try {
			byte[] ascii = message.getBytes(StandardCharsets.US_ASCII);
			String asciiString = Arrays.toString(ascii);
			System.out.println("Encrypted: "+asciiString.substring(1,(asciiString.length()-1)));
			PrintWriter writer = new PrintWriter(new FileOutputStream(filename, true));
			writer.println(asciiString.substring(1,(asciiString.length()-1))); 
			writer.close(); 
			System.out.println("File Encrypt Success : "+message);
		} 
		catch (Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Exiting file writer method");
		}	
	}
	public static void DecryptFile(File filename)  {
		System.out.println("Decrypt File Method| Decrypting : "+filename);
		try {
			Scanner reader = new Scanner(filename);
			
			for(int i=1;reader.hasNext();i++) {
				String asciimessage=reader.nextLine();
				String[] arrOfStr = asciimessage.split(" ");
				int j=0;
				String line="";
				for(String letter:arrOfStr) {
					if(j==arrOfStr.length-1) {
						//System.out.println(letter);
						int asciinum=Integer.parseInt(letter); //Convert char to int
						char alphaletter=(char)asciinum; //Convert int to corresonding letter
						//System.out.println(alphaletter);
						line=line+alphaletter;
						
					}else {
						//System.out.println(letter.substring(0,letter.length()-1));
						int asciinum=Integer.parseInt(letter.substring(0,letter.length()-1));
						char alphaletter=(char)asciinum;
						//System.out.println(alphaletter);
						line=line+alphaletter;
						}
					j++;
					}
					
				System.out.println("Reading line number "+i+" : "+line);
				}
			reader.close();
			System.out.println("File Decrypt Success!!!");	
		} 
		catch (Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Exiting file decryptor method");
			
		}
	}
}
