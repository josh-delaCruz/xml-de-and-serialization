package reader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class XMLHelper {
    private Root c;
    
    public XMLHelper(Root c){
        this.c = c;
    }
    
    //costruttore vuoto
    public XMLHelper(){}
    
    
    public String SerializeXML_Into_String() throws IOException{
        String xml = "";
        
        XmlMapper xmlMapper = new XmlMapper();
        xml = xmlMapper.writeValueAsString(c);
        
        return xml;
            
    }
    
    public void SerializeXML_File() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("src/main/classe.xml"), this.c);
        File file = new File("classe.xml");
           
    }
    
 /*
    public void DeserializeXML_Into_String() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Root value = xmlMapper.readValue("<root>\n" +
            "   <annoDiInizio></annoDiInizio>\n" +
            "   <aula>\n" +
            "      <nome></nome>\n" +
            "      <numeroDiBanchi></numeroDiBanchi>\n" +
            "   </aula>\n" +
            "   <classe></classe>\n" +
            "   <numeroFinestre></numeroFinestre>\n" +
            "   <specializzazione></specializzazione>\n" +
            "   <studenti>\n" +
            "      <element>\n" +
            "         <annoDiNascita></annoDiNascita>\n" +
            "         <cognome></cognome>\n" +
            "         <nome></nome>\n" +
            "      </element>\n" +
            "      <element>\n" +
            "         <annoDiNascita></annoDiNascita>\n" +
            "         <cognome></cognome>\n" +
            "         <nome></nome>\n" +
            "      </element>\n" +
            "   </studenti>\n" +
            "</root>", Root.class);
    }
*/
   
    public void Deserialize_From_File() throws IOException {
        File file = new File("src/main/resources/classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        Root value = xmlMapper.readValue(xml, Root.class);
    }
    
    private String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
    
    
}
    

