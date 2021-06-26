package com.pack1;

public class Copypaste {
	public static void copy() {
		String arr[]= {"Test1","Test2","Test3","Test4","Test5","Test6"};
	for(String a:arr) {
	PersonalLogManager.WriteLogFile(a);

	//for(int i=0;i<=100;i++) {PersonalFileManager.WriteToFile(file1, "test");}
	
		//PersonalFileManager.EncryptToFile(file1, "message");
		//PersonalFileManager.ReadFile(file1);
		//PersonalFileManager.DecryptFile(file1);
		//PersonalSendMail.SendMail();
	
	//Pause
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}
}
}