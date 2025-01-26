package com.chessemulator94.scraper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScraperTest {

    @Test
    public void testGetDoc() {
        assertTrue(Scraper.getDoc("https://www.dirk.nl/") != null);
    }

    @Test
    public void testGetDocAsXml(){
        Webpage testWebpage = new Webpage("https://www.dirk.nl/",
                                "https://www.dirk.nl/sitemap.xml",
                            "https://www.dirk.nl/products-sitemap.xml");
        assertTrue(Scraper.getDocAsXml(testWebpage) != null);
    }


}
