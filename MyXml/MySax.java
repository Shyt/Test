package MyXml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MySax {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XMLStreamException {

       /* version java 1
        DefaultHandler handler = new DefaultHandler(){
            @Override
            public void startElement(String url, String  localName, String qName, Attributes attributes) throws SAXException{
                String name = attributes.getValue("name");
                if(name != null && !name.isEmpty()){
                    System.out.println(name);
                } // Выввод все аттрибутов
            }

            @Override
            public void characters (char[] ch, int start, int length) throws SAXException{
               String str = "";
               for(int i = 0; i < length; i++){
                   str += ch[start + i];
               }
                System.out.println(str); // вывод текста
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("src/MyXml/prop.xml"), handler);
        */

       //version java 6
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = factory.createXMLStreamReader(new FileInputStream("src/MyXml/prop.xml"));
        while (parser.hasNext()){
            int event = parser.next();
            if(event == XMLStreamConstants.START_ELEMENT){
                System.out.println(parser.getLocalName());
            }
            if(event == XMLStreamConstants.CHARACTERS){
                System.out.println(parser.getText());
            }
        }
    }
}
