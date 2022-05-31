package beadando.fio;

import beadando.business.GetterFunctionName;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Fio <T>{
    
    public static final String xmlFilePath = "mentes.xml";
    
    public void mentes(T entity){
        Class clazz = entity.getClass();
        Class superclazz = clazz.getSuperclass();
        try{
            File f = new File(xmlFilePath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(f);
            Element tag = xml.createElement("tag");
            Field[] tuls = clazz.getDeclaredFields();
            System.out.println(Arrays.toString(tuls));
            for(Field tul : tuls){
                if(tul.getAnnotation(GetterFunctionName.class) != null){
                    String gfn = tul.getAnnotation(GetterFunctionName.class).name();
                    //előállítani a getter metódust:
                    Method gm = clazz.getMethod(gfn);
                    //Meghívni az entityre a method-ot:
                    String ertek = gm.invoke(entity).toString();
                    String valtozoNev = tul.getName();
                    Element elem = xml.createElement(valtozoNev);
                    elem.setTextContent(ertek);
                    tag.appendChild(elem);
                }
            }
            
            Field[] tuls2 = superclazz.getDeclaredFields();
            for(Field tul2 : tuls2){
                if(tul2.getAnnotation(GetterFunctionName.class) != null){
                    String gfn = tul2.getAnnotation(GetterFunctionName.class).name();
                    //előállítani a getter metódust:
                    Method gm = clazz.getMethod(gfn);
                    //Meghívni az entityre a method-ot:
                    String ertek = gm.invoke(entity).toString();
                    String valtozoNev = tul2.getName();
                    Element elem = xml.createElement(valtozoNev);
                    elem.setTextContent(ertek);
                    tag.appendChild(elem);
                }
            }
           
            tag.setAttribute("class", clazz.getSimpleName());
            xml.getFirstChild().appendChild(tag);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource s = new DOMSource(xml);
            StreamResult r = new StreamResult(f);
            t.transform(s, r);
        }
        catch(Exception ex){
            System.out.println("Hiba: " + ex.toString());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        
    }
    
}
