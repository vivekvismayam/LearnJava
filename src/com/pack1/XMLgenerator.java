package com.pack1;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLgenerator {
	public static void main(String[] args) {
		System.out.println("Start of generator");

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder= factory.newDocumentBuilder();
			Document doc=builder.newDocument();
			//Creating elements
			Element ele1=doc.createElement("Element1"); //root element
			Element ele2=doc.createElement("Element2");	//main element inside root element 1
			Element ele3=doc.createElement("Element3");	//element under element 2
			Element ele4=doc.createElement("Element4");	//element under element 2
			Element ele5=doc.createElement("Element5");	//element under element 2
			Element ele6=doc.createElement("Element6"); //element under element 2
			

			//Creating text element to include under ele3,4,5 and 6
			Text T3=doc.createTextNode("Text3");
			Text T4=doc.createTextNode("Text4");
			Text T5=doc.createTextNode("Text5");
			Text T6=doc.createTextNode("Text6");
			
			//Adding Text elements under ele3,4,ad 5
			ele3.appendChild(T3);
			ele4.appendChild(T4);
			ele5.appendChild(T5);
			ele6.appendChild(T6);
			
			// Setting multiple attribute value for ele1
			ele3.setAttribute("Attr1", "1");
			ele3.setAttribute("Attr2", "1");
			ele3.setAttribute("Attr3", "1");
			ele3.setAttribute("Attr4", "1");
			
			//Adding elements in hierarchy order
			ele2.appendChild(ele3); //adding element to main ele ele2
			ele2.appendChild(ele4);
			ele2.appendChild(ele5);
			ele2.appendChild(ele6);
			
			ele1.appendChild(ele2); //adding ele2 to root ele ele1
			
			//Adding root element to document
			doc.appendChild(ele1);
			
			Transformer t=TransformerFactory.newInstance().newTransformer();
			t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("C:\\Users\\Vivek\\Desktop\\LearnJava\\generated.txt")));
			System.out.println("XML File Generated");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("end of generator");
	}
}
