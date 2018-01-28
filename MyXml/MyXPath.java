package MyXml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class MyXPath {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/MyXml/prop.xml"));

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        System.out.println(xPath.evaluate("/project/component", document)); //первый
        System.out.println(xPath.evaluate("count(/project/component)", document)); //3 tags component
        NodeList list = (NodeList)xPath.evaluate("/project/component", document, XPathConstants.NODESET); //list node
        Node node = (Node)xPath.evaluate("/project/component", document, XPathConstants.NODE); //one node
        int count = ((Number)xPath.evaluate("/project/component", document, XPathConstants.NUMBER)).intValue();

    }
}
