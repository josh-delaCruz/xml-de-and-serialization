
package reader;

import java.io.IOException;

public class App {

    
    public static void main(String[] args) throws IOException{
       /*
       Root c1 = new Root(2018,3,"IA"); //Root di Test
       
       Aula a1 = new Aula("14CE",20);
       Studenti s1 = new Studenti(2003, "Bianchi", "Tommaso");
       Studenti s2 = new Studenti(2004, "Hu", "Tommaso");
       
       Root c2 = new Root(2018, a1, 3, "AI");
       
       
       
       XMLHelper xml1 = new XMLHelper(c2);
       
        System.out.println(xml1.SerializeXML_Into_String());
        xml1.SerializeXML_File();
        */
       
       XMLHelper xml2 = new XMLHelper();
       
        xml2.Deserialize_From_File();
        
        
    }
    
}
