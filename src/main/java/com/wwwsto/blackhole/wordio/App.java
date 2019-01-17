package com.wwwsto.blackhole.wordio;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.xmlbeans.XmlException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, OpenXML4JException, XmlException
    {
    	APIimp imp = new APIimp();
        System.out.println( "Hello World!" );
        System.out.println(imp.extractText("src/main/resources/论文修改.docx"));
    }
}
