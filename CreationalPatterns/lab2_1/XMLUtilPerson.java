package lab2_1;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtilPerson {
	public static String getSexName()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;                            
            doc = builder.parse(new File("config.xml")); 
        
            //获取包含性别名称的文本节点
            NodeList nl = doc.getElementsByTagName("sexName");
            Node classNode=nl.item(0).getFirstChild();
            String sexName=classNode.getNodeValue().trim();
            return sexName;
        }   
        catch(Exception e)
        {
        	e.printStackTrace();
        	return null;
        }
    }
}
