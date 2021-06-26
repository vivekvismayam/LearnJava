package email;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class PersonalSendMail {

   public static void SendMail() { 
	   System.out.println("Sending email");
	   Properties prop=new Properties();
	   
	   prop.put("mail.smtp.auth","true");
	   prop.put("mail.smtp.starttls.enable","true");
	   prop.put("mail.smtp.host","smtp.gmail.com");
	   prop.put("mail.smtp.port","587");
	   
	   final String sender="alternateemailforlearning@gmail.com";
	   final String password="Python123@";
	   Session session=Session.getInstance(prop, new javax.mail.Authenticator() {
		   protected PasswordAuthentication getPasswordAuthentication() {
			   return new PasswordAuthentication(sender,password);
		   }
	   }); 
	   try {
		   Message message=new MimeMessage(session);
		   message=CreateMessage(session, sender, sender);
		   Transport.send(message);
	   }
	   catch (MessagingException e) {
			e.printStackTrace();
	   } 
		  System.out.println("Completed");
	}
   
   public static Message CreateMessage(Session session, String sender,String reciever) {
	   try {
		   Message message=new MimeMessage(session);
		   message.setFrom(new InternetAddress(sender));
		   message.setRecipient(Message.RecipientType.TO,new InternetAddress(reciever));
		   //message.setRecipient(Message.RecipientType.BCC,new InternetAddress("vivekvismayam@gmail.com"));
		   message.setSubject("Test content");
		   String htmlcode="<h1>JAVA</h1><br/><h2><b>Line1</b></h2>";
		  // message.setContent(htmlcode,"text/html");
		   Multipart Content=new MimeMultipart();
		   MimeBodyPart textbody=new MimeBodyPart();
		   textbody.setText("text part");
		   MimeBodyPart htmlbody=new MimeBodyPart();
		   htmlbody.setContent(htmlcode,"text/html");
		   MimeBodyPart fileAttach=new MimeBodyPart();
		 //  fileAttach.attachFile("C:\\Users\\Vivek\\Desktop\\LearnJava\\Log.txt");
		   //Attach these to email content
		   Content.addBodyPart(textbody);
		   Content.addBodyPart(htmlbody);
		  // Content.addBodyPart(fileAttach);
		  message.setContent(Content);
		   return message;
	   } catch (Exception e) {
			e.printStackTrace();
			return null;
		}
   }
}
	
     