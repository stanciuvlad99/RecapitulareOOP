package models;

import app.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DesenTest {

    @Test
    void translateX() {
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 5);
        Punct p3 = new Punct(2, 5);
        Punct p4 = new Punct(4, 5);
        Punct p5 = new Punct(2, 4);
        Punct p6 = new Punct(7, 5);
        Punct p7 = new Punct(6, 7);
        Punct p8 = new Punct(2, 9);
        Punct p9 = new Punct(3, 8);

        Linie linie1 = new Linie(p1, p2);
        Linie linie2 = new Linie(p3, p4);
        Linie linie3 = new Linie(p5, p6);
        Linie linie4 = new Linie(p7, p8);

        String text = "Sunt o eticheta";

        Dreptunghi dreptunghi = new Dreptunghi(linie1, linie2);
        Eticheta eticheta = new Eticheta(linie3, linie4, text);
        Cerc cerc = new Cerc(p9, 8);

        p1.translateX(1);
        p2.translateX(2);
        p3.translateX(3);
        p4.translateX(4);
        p5.translateX(5);
        p6.translateX(6);
        p7.translateX(7);
        p8.translateX(8);
        p9.translateX(9);

        ArrayList<Figura>figuras = new ArrayList<>();
        figuras.add(dreptunghi);
        figuras.add(eticheta);
        figuras.add(cerc);

        assertEquals(2,linie1.getP1().getX());
        assertEquals(5,linie1.getP2().getX());
        assertEquals(5,linie2.getP1().getX());
        assertEquals(8,linie2.getP2().getX());
        assertEquals(7,linie3.getP1().getX());
        assertEquals(13,linie3.getP2().getX());
        assertEquals(13,linie4.getP1().getX());
        assertEquals(10,linie4.getP2().getX());
        assertEquals(12,p9.getX());

    }

    @Test
    void translateY() {
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 5);
        Punct p3 = new Punct(2, 5);
        Punct p4 = new Punct(4, 5);
        Punct p5 = new Punct(2, 4);
        Punct p6 = new Punct(7, 5);
        Punct p7 = new Punct(6, 7);
        Punct p8 = new Punct(2, 9);
        Punct p9 = new Punct(3, 8);

        Linie linie1 = new Linie(p1, p2);
        Linie linie2 = new Linie(p3, p4);
        Linie linie3 = new Linie(p5, p6);
        Linie linie4 = new Linie(p7, p8);

        String text = "Sunt o eticheta";

        Dreptunghi dreptunghi = new Dreptunghi(linie1, linie2);
        Eticheta eticheta = new Eticheta(linie3, linie4, text);
        Cerc cerc = new Cerc(p9, 8);

        p1.translateY(1);
        p2.translateY(2);
        p3.translateY(3);
        p4.translateY(4);
        p5.translateY(5);
        p6.translateY(6);
        p7.translateY(7);
        p8.translateY(8);
        p9.translateY(9);

        ArrayList<Figura>figuras = new ArrayList<>();
        figuras.add(dreptunghi);
        figuras.add(eticheta);
        figuras.add(cerc);

        assertEquals(3,linie1.getP1().getY());
        assertEquals(7,linie1.getP2().getY());
        assertEquals(8,linie2.getP1().getY());
        assertEquals(9,linie2.getP2().getY());
        assertEquals(9,linie3.getP1().getY());
        assertEquals(11,linie3.getP2().getY());
        assertEquals(14,linie4.getP1().getY());
        assertEquals(17,linie4.getP2().getY());
        assertEquals(17,p9.getY());
    }

    @Test
    void translate() {
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 5);
        Punct p3 = new Punct(2, 5);
        Punct p4 = new Punct(4, 5);
        Punct p5 = new Punct(2, 4);
        Punct p6 = new Punct(7, 5);
        Punct p7 = new Punct(6, 7);
        Punct p8 = new Punct(2, 9);
        Punct p9 = new Punct(3, 8);

        Linie linie1 = new Linie(p1, p2);
        Linie linie2 = new Linie(p3, p4);
        Linie linie3 = new Linie(p5, p6);
        Linie linie4 = new Linie(p7, p8);

        String text = "Sunt o eticheta";

        Dreptunghi dreptunghi = new Dreptunghi(linie1, linie2);
        Eticheta eticheta = new Eticheta(linie3, linie4, text);
        Cerc cerc = new Cerc(p9, 8);

        p1.translate(1,1);
        p2.translate(2,2);
        p3.translate(3,3);
        p4.translate(4,4);
        p5.translate(5,5);
        p6.translate(6,6);
        p7.translate(7,7);
        p8.translate(8,8);
        p9.translate(9,9);

        ArrayList<Figura>figuras = new ArrayList<>();
        figuras.add(dreptunghi);
        figuras.add(eticheta);
        figuras.add(cerc);

        assertEquals(2,linie1.getP1().getX());
        assertEquals(5,linie1.getP2().getX());
        assertEquals(5,linie2.getP1().getX());
        assertEquals(8,linie2.getP2().getX());
        assertEquals(7,linie3.getP1().getX());
        assertEquals(13,linie3.getP2().getX());
        assertEquals(13,linie4.getP1().getX());
        assertEquals(10,linie4.getP2().getX());
        assertEquals(12,p9.getX());
        assertEquals(3,linie1.getP1().getY());
        assertEquals(7,linie1.getP2().getY());
        assertEquals(8,linie2.getP1().getY());
        assertEquals(9,linie2.getP2().getY());
        assertEquals(9,linie3.getP1().getY());
        assertEquals(11,linie3.getP2().getY());
        assertEquals(14,linie4.getP1().getY());
        assertEquals(17,linie4.getP2().getY());
        assertEquals(17,p9.getY());
    }

    @Test
    void duplicate() {
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 5);
        Punct p3 = new Punct(2, 5);
        Punct p4 = new Punct(4, 5);
        Punct p5 = new Punct(2, 4);
        Punct p6 = new Punct(7, 5);
        Punct p7 = new Punct(6, 7);
        Punct p8 = new Punct(2, 9);
        Punct p9 = new Punct(3, 8);

        Linie linie1 = new Linie(p1, p2);
        Linie linie2 = new Linie(p3, p4);
        Linie linie3 = new Linie(p5, p6);
        Linie linie4 = new Linie(p7, p8);

        String text = "Sunt o eticheta";

        Dreptunghi dreptunghi = new Dreptunghi(linie3, linie2);
        Eticheta eticheta = new Eticheta(linie3, linie4, text);
        Cerc cerc = new Cerc(p9, 8);

        p1.translate(1,1);
        p2.translate(2,2);
        p3.translate(3,3);
        p4.translate(4,4);
        p5.translate(5,5);
        p6.translate(6,6);
        p7.translate(7,7);
        p8.translate(8,8);
        p9.translate(9,9);

        ArrayList<Figura>figuras = new ArrayList<>();
        figuras.add(dreptunghi);
        figuras.add(eticheta);
        figuras.add(cerc);

        ArrayList<Figura> duplicate = new ArrayList<>();
        for (int i = 0; i < figuras.size(); i++){
            duplicate.add(figuras.get(i).duplicate());
        }
        assertEquals(figuras,duplicate);
    }
}