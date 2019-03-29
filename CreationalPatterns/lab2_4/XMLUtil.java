package lab2_4;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean() throws Exception {
        //创建DOM文档对象
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dFactory.newDocumentBuilder();
        Document doc;
        doc = builder.parse(new File("config.xml"));

        //获取包含性别名称的文本节点
        NodeList nl = doc.getElementsByTagName("databaseType");
        Node databaseTypeNode = nl.item(0).getFirstChild();
        String databaseType = databaseTypeNode.getNodeValue().trim();

        //通过类名生成实例对象并将其返回
        Class c = Class.forName("lab2_4."+databaseType);
        Object obj = c.newInstance();
        return obj;
    }
}
