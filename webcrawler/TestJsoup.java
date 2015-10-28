/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.moguntia.webcrawler;

/**
 *
 * @author CryKnight
 */

import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestJsoup {
  private TestJsoup() {}

  public static String extractText(Reader reader) throws IOException {
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(reader);
    String line;
    /*
    while ( (line=br.readLine()) != null) {
      sb.append(line);
        System.out.println(Jsoup.parse(line.toString()).text());
    }*/
    String html="http://www.sjsu.edu/";
    Document doc = Jsoup.connect(html).get();
      System.out.println(doc.select("title, h1, h2, h3, h4, h5, span, p").text());
    //doc.select("title");
    //Elements data=
    /*
    String textOnly = Jsoup.parse(sb.toString()).text();
            */
    return null;
        
  }

  public final static void main(String[] args) throws Exception{
    FileReader reader = new FileReader
          ("San Jose State University - Powering Silicon Valley _ San Jose State University.html");
    TestJsoup.extractText(reader);
  }
}