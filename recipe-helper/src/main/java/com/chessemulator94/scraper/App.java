package com.chessemulator94.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Document doc = getDoc("https://www.dirk.nl/");
        System.out.println(doc.outerHtml());
    }

    public static Document getDoc(String url) {
        
        Document doc = null; 
        try {
            doc = Jsoup.connect(url).get();
        } catch (Exception e) {
            System.out.println(e);
        } 
        return doc;
    }
}
