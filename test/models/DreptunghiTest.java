package models;

import app.Linie;
import app.Punct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DreptunghiTest {

    @Test
    public void translateX() {
        Punct p1 = new Punct(1,2);
        Punct p2 = new Punct(3,4);
        Punct p3 = new Punct(5,6);
        Punct p4 = new Punct(7,8);

        Linie linie = new Linie(p1,p2);
        Linie linie1 = new Linie(p3,p4);
        linie.translateX(2);
        linie1.translateX(3);

        assertEquals(3,linie.getP1().getX());
        assertEquals(5,linie.getP2().getX());
        assertEquals(8,linie1.getP1().getX());
        assertEquals(10,linie1.getP2().getX());
    }

    @Test
    void translateY() {
        Punct p1 = new Punct(1,2);
        Punct p2 = new Punct(3,4);
        Punct p3 = new Punct(1,2);
        Punct p4 = new Punct(3,4);

        Linie linie = new Linie(p1,p2);
        Linie linie1 = new Linie(p3,p4);

        linie.translateY(2);
        linie1.translateY(2);

        assertEquals(linie,linie1);
    }

    @Test
    void translate() {
        Punct p1 = new Punct(1,2);
        Punct p2 = new Punct(3,4);
        Punct p3 = new Punct(1,2);
        Punct p4 = new Punct(3,4);

        Linie linie = new Linie(p1,p2);
        Linie linie1 = new Linie(p3,p4);

        linie.translate(2,3);
        linie1.translate(2,3);

        assertEquals(linie,linie1);
    }

    @Test
    void duplicate() {
        Punct p1 = new Punct(1,2);
        Punct p2 = new Punct(3,4);
        Punct p3 = new Punct(1,2);
        Punct p4 = new Punct(3,4);

        Linie linie = new Linie(p1,p2);
        Linie linie1 = new Linie(p3,p4);

        linie.translate(2,3);
        linie1.translate(4,5);

        assertEquals(linie,linie.duplicate());
        assertEquals(linie1,linie1.duplicate());
    }
}