package com.chessemulator94.scraper;

import java.util.List;
import org.jsoup.nodes.Element;

public class Webpage {
    
    // Parameters
        // e.g can be found by googling "site:dirk.nl filetype:xml"
    private String BASE_SITE_MAP;
    private String PRODUCTS_SITE_MAP;
    private String URL;
    private List<Element> domElements;

    // Default Constructor
    public Webpage(){
        this.BASE_SITE_MAP = "";
        this.PRODUCTS_SITE_MAP = "";
        this.URL = "";          
    }

    // Constructor
    public Webpage(String URL){
        this.URL = URL;
        this.BASE_SITE_MAP = "";
        this.PRODUCTS_SITE_MAP = "";
    }

    // Constructor   
    public Webpage(String URL, String BASE_SITE_MAP, String PRODUCTS_SITE_MAP){ 
        this.URL = URL;
        this.BASE_SITE_MAP = BASE_SITE_MAP;
        this.PRODUCTS_SITE_MAP = PRODUCTS_SITE_MAP;
    }

    // Getters and Setters
    public void setBaseSiteMap(String BASE_SITE_MAP){
        this.BASE_SITE_MAP = BASE_SITE_MAP;
    }
    public void setProductSiteMap(String PRODUCTS_SITE_MAP){
        this.PRODUCTS_SITE_MAP = PRODUCTS_SITE_MAP;
    }
    public void setUrl(String URL){
        this.URL = URL;
    }
    public String getBaseSiteMap(){
        return BASE_SITE_MAP;
    }      
    public String getProductSiteMap(){
        return PRODUCTS_SITE_MAP;
    }   
    public String getUrl(){
        return URL;
    }   

}
