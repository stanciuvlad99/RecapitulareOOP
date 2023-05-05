package models;

import app.Eticheta;
import app.Linie;
import app.Punct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtichetaTest {

    @Test
    public void testToString() {
        Punct punct = new Punct(1, 3);
        Punct punct1 = new Punct(3, 2);
        Punct punct3 = new Punct(1,4);
        Punct punct4 = new Punct(3,4);

        Linie linie = new Linie(punct,punct1);
        Linie linie1 = new Linie(punct3, punct4);

        String text="My name is Eticheta";

        Eticheta eticheta = new Eticheta(linie,linie1,text);
        System.out.println(eticheta);
    }

    @Test
    public void duplicate(){
        Punct p1 = new Punct(1, 3);
        Punct p2 = new Punct(3, 2);
        Punct p3 = new Punct(1,4);
        Punct p4 = new Punct(3,4);

        Linie linie = new Linie(p1,p2);
        Linie linie1 = new Linie(p3, p4);

        String text="hello";

        Eticheta eticheta = new Eticheta(linie,linie1, text);

        linie.translate(2,3);
        text+="world";

        assertEquals(eticheta,eticheta.duplicate());
    }
}