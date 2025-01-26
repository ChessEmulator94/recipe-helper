package com.chessemulator94.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public class Scraper {
    
    static final String CHROME_USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";
    static final String GOOGLE_REFERRER = "http://www.google.com";

    // 
    public static Document getDoc(String url) {
        Document doc = null; 
        try {
            doc = Jsoup.connect(url)
                       .userAgent(CHROME_USER_AGENT)
                       .referrer(GOOGLE_REFERRER)
                       .get();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } 
        return doc;
    }

    // Returns a webpage as plain XML 
    public static Document getDocAsXml(Webpage siteToScrape){
        Document xmlDoc = null;
        try {
            xmlDoc = Jsoup.parse(Scraper.getDoc(siteToScrape.getUrl()).html(), Parser.xmlParser());
        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
        return xmlDoc;

    }




}
