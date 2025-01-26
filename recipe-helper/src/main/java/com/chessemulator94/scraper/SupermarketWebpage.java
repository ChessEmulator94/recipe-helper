package com.chessemulator94.scraper;

// ProductPage extends Webpage and stores website information related to all products of a webpage 
public class ProductPage extends Webpage {
    
    private String PRODUCTS_SITE_MAP;

    // Default constructor
    public ProductPage(){
        this.setUrl("");
        this.setSiteMap("");
        this.setProductSiteMap("");
    }

    // Constructor
    public ProductPage(String URL, String SITE_MAP, String PRODUCTS_SITE_MAP){ 
        this.setUrl(URL);
        this.setSiteMap(SITE_MAP);
        this.setProductSiteMap(PRODUCTS_SITE_MAP);
    }

    public void setProductSiteMap(String PRODUCTS_SITE_MAP){
        this.PRODUCTS_SITE_MAP = PRODUCTS_SITE_MAP;
    }

    public String getProductSiteMap(){
        return this.PRODUCTS_SITE_MAP;
    } 

}
