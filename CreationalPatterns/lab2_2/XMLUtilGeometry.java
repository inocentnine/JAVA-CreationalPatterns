package lab2_2;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilGeometry {
	public static String getGeometryName()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;                            
            doc = builder.parse(new File("config.xml")); 
        
            //获取包含性别名称的文本节点
            NodeList nl = doc.getElementsByTagName("geometryName");
            Node classNode=nl.item(0).getFirstChild();
            String geometryName=classNode.getNodeValue().trim();
            return geometryName;
        }   
        catch(Exception e)
        {
        	e.printStackTrace();
        	return null;
        }
    }
}
