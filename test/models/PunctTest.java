package models;

import app.Punct;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PunctTest {


    @Test
    public void testExemplu() {

        Punct punct = new Punct(1, 2);
        Punct punct1 = new Punct(3, 4);
        Punct punct2 = new Punct(5, 6);
        Punct punct3 = new Punct(7, 8);
        Punct punct4 = new Punct(9, 10);


        System.out.println(punct);

    }

    @Test
    public void testTranslateX() {
        Punct punct = new Punct(10, 99);
        int expected = punct.getX() + 50;
        punct.translateX(50);

        assertEquals(expected, punct.getX());
    }

    @Test
    public void testTranslateY() {
        Punct punct = new Punct(99, 47);
        int expected = punct.getY() + 10;
        punct.translateY(10);

        assertEquals(expected, punct.getY());
    }

    @Test
    public void testTranslate() {
        Punct punct = new Punct(15, 20);
        int expectedX = punct.getX() + 10;
        int expectedY = punct.getY() + 5;
        punct.translate(10, 5);

        assertEquals(expectedX, punct.getX());
        assertEquals(expectedY, punct.getY());
    }

    @Test
    public void testDuplicate() {
        Punct punct = new Punct(10, 20);
        Punct punct1 = new Punct(punct.getX() + 15, punct.getY() + 30);
        punct.translate(15, 30);
        punct.duplicate();


        assertEquals(punct1, punct.duplicate());
    }

   @Test
   public void testEquals(){
        Punct punct1= new Punct(10,15);
        Punct punct2 = new Punct(10,15);

        assertEquals(punct1, punct2);
   }

   @Test
   public void testEquals1(){
       ArrayList<Punct> list = new ArrayList<>();
       Punct punct = new Punct(1, 2);
       Punct punct1 = new Punct(3, 4);
       Punct punct2 = new Punct(5, 6);
       Punct punct3 = new Punct(7, 8);
       Punct punct4 = new Punct(9, 10);

       list.add(punct);
       list.add(punct1);
       list.add(punct2);
       list.add(punct3);
       list.add(punct4);

       assertTrue(list.contains(punct2));
   }




}