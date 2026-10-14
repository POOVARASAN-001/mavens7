package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testValidPrime() {
        App app = new App();
        assertTrue(app.isPrime(7));
        assertTrue(app.isPrime(13));
    }

    @Test
    public void testNotPrime() {
        App app = new App();
        assertFalse(app.isPrime(4));
        assertFalse(app.isPrime(9));
    }

    @Test
    public void testEdgeCases() {
        App app = new App();
        assertFalse(app.isPrime(0));
        assertFalse(app.isPrime(1));
        assertFalse(app.isPrime(-5));
    }
}
