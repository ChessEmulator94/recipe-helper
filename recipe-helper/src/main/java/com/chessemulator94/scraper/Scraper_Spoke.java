package com.chessemulator94.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Scraper_Spoke {
    
    static final String CHROME_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
    static final String GOOGLE_REFERER = "http://www.google.com";

    public static Document getDoc(String url) {
        Document doc = null; 
        try {
            doc = Jsoup.connect(url).userAgent(CHROME_USER_AGENT).referrer(GOOGLE_REFERER).get();
        } catch (Exception e) {
            System.out.println(e);
        } 
        return doc;
    }






}
