package com.chessemulator94.scraper;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Element;;

public class App 
{
    public static void main( String[] args )
    {

        Webpage dirkWebpage = new Webpage("https://www.dirk.nl/boodschappen");
        dirkWebpage.setProductSiteMap("https://www.dirk.nl/products-sitemap.xml");

        Document xmlDoc = Jsoup.parse(Scraper.getDoc(dirkWebpage.getProductSiteMap()).html(), Parser.xmlParser());
        
        List<Element> allElements = xmlDoc.getElementsByTag("loc");

        for (Element singleElement : allElements){
            System.out.println(singleElement.text());
            System.out.println();
        }



    }


}
