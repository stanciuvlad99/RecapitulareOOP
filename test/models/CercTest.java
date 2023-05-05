package models;

import app.Punct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CercTest {

    @Test
    void translateX() {
        Punct centru = new Punct(3, 4);
        centru.translateX(3);

        assertEquals(6, centru.getX());
    }

    @Test
    void translateY() {
        Punct centru = new Punct(1, 5);
        centru.translateY(5);

        assertEquals(10, centru.getY());
    }

    @Test
    void translate() {
        Punct centru = new Punct(3,6);
        centru.translate(2,6);

        assertEquals(5,centru.getX());
        assertEquals(12, centru.getY());
    }

    @Test
    void duplicate() {
        Punct centru = new Punct(2,4);
        centru.translate(1,2);

        assertEquals(centru,centru.duplicate());
    }
}