/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */

package com.VehicleServiceStation.util;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




public class DBConnXML extends DBConnProperty {
	
	/**
	 * getQueryByID() METHOD READS THE QueryXML.xml FILE AND RETRIEVE QUERIES
	 * BY USING QUERY IDs
	 * @param id
	 * 
	 * @return 
	 * 
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * 
	 */
	
	public static String getQueryByID( String id ) throws SAXException, IOException, ParserConfigurationException {
		
		
		NodeList nodeList;
		Element element = null;
		
		nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(System.getProperty("catalina.base") + 
				"\\wtpwebapps\\echannelling\\WEB-INF\\QueryXML.xml" )).getElementsByTagName(QueryConstants.TAG_NAME);
		
		
		/**
		 * EXTRACT THE NODE FROM THE NODE LIST
		 */
		
		for( int length = 0; length < nodeList.getLength(); length++ )
		{
			element = (Element) nodeList.item(length);
			
			if( element.getAttribute(QueryConstants.GET_ID).equals(id))
				break;
		}
		
		/**
		 * RETURN QUERIES
		 */
		return element.getTextContent().trim();
		
	}

}
