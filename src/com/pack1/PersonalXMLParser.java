package com.pack1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PersonalXMLParser {
	public static void ReadXml() {
		System.out.println("Start");
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc=builder.parse("C:\\Users\\Vivek\\Desktop\\LearnJava\\Hotel.xml");
			doc.getDocumentElement().normalize();
			NodeList nodelist1 = doc.getElementsByTagName("breakfast_menu");
			//System.out.println("nodlist1 length" +nodelist1.getLength());
			for(int i=0;i<nodelist1.getLength();i++) {
				Node node1=nodelist1.item(i);
				if(node1.getNodeType()==Node.ELEMENT_NODE) {
					Element ele1=(Element) node1;
					//System.out.println("Item food "+i+" : "+ ele1.getTextContent());
					NodeList nodelist2=ele1.getChildNodes();
					//System.out.println("nodlist2 length" +nodelist2.getLength());
					for(int j=0;j<nodelist2.getLength();j++) {
						Node node2=nodelist2.item(j);
						if(node2.getNodeType()==Node.ELEMENT_NODE) {
							Element ele2=(Element) node2;
						//System.out.println("Item J ="+j+" : "+ele2.getTextContent());
							NodeList nodelist3=ele2.getChildNodes();
							for(int k=0;k<nodelist3.getLength();k++) {
								Node node3=nodelist3.item(k);
								if(node3.getNodeType()==Node.ELEMENT_NODE) {
									Element ele3=(Element)node3;
									System.out.println("Item K= "+i+j+k+" : "+ele3.getTextContent());
									System.out.println(ele3.getTagName()+" : "+ele3.getElementsByTagName(ele3.getTagName()));
								}
							}
							
						
						}
					}
					
					 
				}
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("end");
		}
}
