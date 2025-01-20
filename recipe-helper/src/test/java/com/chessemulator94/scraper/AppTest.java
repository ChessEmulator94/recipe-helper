package com.chessemulator94.scraper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testApp() {
        App app = new App();
        assertTrue(app != null);
    }

    @Test
    public void testGetDoc() {
        assertTrue(App.getDoc("https://quotes.toscrape.com/") != null);
    }


}
