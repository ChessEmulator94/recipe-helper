package com.chessemulator94.scraper;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class Webpage {
    
    // Parameters
        // e.g can be found by googling "site:dirk.nl filetype:xml"
    private String URL;
    private String SITE_MAP;
    private List<Element> domElements;
    private Document XML_STRUCTURE;

    // Default Constructor
    public Webpage(){
        this.SITE_MAP = "";
        this.URL = "";          
    }

    // Constructor
    public Webpage(String URL){
        this.URL = URL;
        this.SITE_MAP = "";
    }

    // Constructor with sitemap  
    public Webpage(String URL, String SITE_MAP){ 
        this.URL = URL;
        this.SITE_MAP = SITE_MAP;
    }

    // Getters and Setters
    public void setSiteMap(String SITE_MAP){
        this.SITE_MAP = SITE_MAP;
    }
    public void setUrl(String URL){
        this.URL = URL;
        }
    public String getSiteMap(){
        return SITE_MAP;
    }      
    public String getUrl(){
        return URL;
    }  
    
    //
    public void generateXmlStructure(){
        this.XML_STRUCTURE = Jsoup.parse(Scraper.getDoc(this.getSiteMap()).html(), Parser.xmlParser());
    }

    //
    public void generateDomTree(){

    }

}
