package models;

import app.Linie;
import app.Punct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {


    @Test
    public void testTranslateX() {

        Punct p1 = new Punct(1, 3);
        Punct p2 = new Punct(3, 5);

        Linie linie = new Linie(p1, p2);

        linie.translateX(1);

        assertEquals(linie.getP1().getX(), 2);
        assertEquals(linie.getP2().getX(), 4);
    }

    @Test
    public void testTranslateY() {
        Punct p1 = new Punct(1, 3);
        Punct p2 = new Punct(3, 5);

        Linie linie = new Linie(p1, p2);

        linie.translateY(1);

        assertEquals(4, linie.getP1().getY());
        assertEquals(6, linie.getP2().getY());
    }

    @Test
    public void translate() {
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 4);

        Linie linie = new Linie(p1, p2);

        linie.translate(2, 3);

        assertEquals(3, linie.getP1().getX());
        assertEquals(5, linie.getP2().getX());
        assertEquals(5, linie.getP1().getY());
        assertEquals(7, linie.getP2().getY());

    }

    @Test
    public void duplicate() {
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 4);

        Punct p3 = new Punct(5,6);
        Punct p4 = new Punct(7,8);

        Linie linie = new Linie(p1,p2);
        Linie linie1=new Linie(p3,p4);

        linie.translate(4,4);

        linie.duplicate();
        assertEquals(linie1,linie.duplicate());
    }

}