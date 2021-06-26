package com.pack1;

import java.util.*;

public class Inputfromuser {
	public static String GetInputString() {
		System.out.print("enter String");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		return str;
	}
	public static int GetInputInt() {
		System.out.print("enter a number: ");
		Scanner sc =new Scanner(System.in);
		int num=0;
		try{
			num=sc.nextInt();
		}
		catch(InputMismatchException e) {
				System.out.println("Entered value is not a number.This will be processed as Zero");
				////PersonalLogManager.WriteLogFile(e.toString());//if need log message
			}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("Invalid entry.This will be processed as Zero. Error : "+e.fillInStackTrace());
			//PersonalLogManager.WriteLogFile(e.toString());//if need log message
		}
		finally {return num;}
		//System.out.print("\n ");
		
	}
}
