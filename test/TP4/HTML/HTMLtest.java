package TP4.HTML;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by Toto on 02-Sep-16.
 */
public class HTMLtest {
    public static void main(String[] args){
        Body body = new Body();
        Head head = new Head();
        html html = new html(head, body);
        Element title = new Element("title");
        HtmlString titleContent = new HtmlString("Page Title");
        title.addElement(titleContent);
        html.getHead().addElement(title);
        Element heading = new Element("h1", "style=\"text-align: center;\"");
        HtmlString headingContent = new HtmlString("Alto titulo");
        heading.addElement(headingContent);
        html.getBody().addElement(heading);
        List list = new List();
        HtmlString string1 = new HtmlString("Ariel");
        HtmlString string2 = new HtmlString("es");
        HtmlString string3 = new HtmlString("un");
        Link link = new Link("http://i1.kym-cdn.com/photos/images/facebook/000/920/672/c21.jpg");
        link.addElement(new HtmlString("puto"));
        list.addElement(string1);
        list.addElement(string2);
        list.addElement(string3);
        list.addElement(link);
        html.getBody().addElement(list);

        File htmlcode = new File("F:\\Documentos Tomás\\Google Drive\\Universidad\\Introducción a la Programación 2\\Programación 2\\test\\TP4\\HTML\\htmlcode.html");
        if(htmlcode.exists())
            System.out.println("Ya ta");
        else{
            try {
                htmlcode.createNewFile();
                FileWriter fileWriter = new FileWriter(htmlcode);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(html.toString());
                bufferedWriter.close();
                System.out.println("oh yeah baby a triple");
            }
            catch (Exception e){

            }
        }
    }
}
