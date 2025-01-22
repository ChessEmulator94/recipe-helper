package com.chessemulator94.scraper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Scraper_SpokeTest {

    @Test
    public void testGetDoc() {
        assertTrue(Scraper_Spoke.getDoc("https://www.dirk.nl/") != null);
    }

    @Test
    public void testGetDocAsXml(){
        Webpage testWebpage = new Webpage("https://www.dirk.nl/",
                                "https://www.dirk.nl/sitemap.xml",
                            "https://www.dirk.nl/products-sitemap.xml");
        assertTrue(Scraper_Spoke.getDocAsXml(testWebpage) != null);
    }


}
