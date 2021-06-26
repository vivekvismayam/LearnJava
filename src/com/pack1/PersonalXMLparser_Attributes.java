package com.pack1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PersonalXMLparser_Attributes {
	
	public static void ReadXML_Attributes() {
	System.out.println("Start parser for attributes");
	
	try {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc=builder.parse("C:\\Users\\Vivek\\Desktop\\LearnJava\\UtilityConfig.xml");
		NodeList nl1=doc.getElementsByTagName("Settings");
		//System.out.println(nl1.getLength());

		for(int i=0;i<nl1.getLength();i++) {
			Node n1 =nl1.item(i);
			if(n1.getNodeType()==Node.ELEMENT_NODE) {
			Element ele1=(Element) n1;
			NodeList nl2=ele1.getChildNodes();
			for(int j=0;j<nl2.getLength();j++) {
				Node n2 =nl2.item(j);
				if(n2.getNodeType()==Node.ELEMENT_NODE) {
					Element ele2=(Element) n2;
					System.out.println(ele2.getAttribute("PARAONE"));
					System.out.println(ele2.getAttribute("PARATWO"));
					System.out.println(ele2.getAttribute("PARATWO"));
					System.out.println(ele2.getAttribute("PARATHREE"));
					
				}
				
			}
			}
		}
	}  
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	System.out.println("end");
	}
}
}
