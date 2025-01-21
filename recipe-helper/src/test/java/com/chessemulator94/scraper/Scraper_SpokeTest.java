package com.chessemulator94.scraper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Scraper_SpokeTest {

    @Test
    public void testGetDoc() {
        assertTrue(Scraper_Spoke.getDoc("https://www.dirk.nl/") != null);
    }


}
