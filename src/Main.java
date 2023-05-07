import app.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//
//        Desen desen = new Desen(new ArrayList<>());

        Punct p1 = new Punct(1,2);
        Punct p2 = new Punct(3,4);
        Punct p3 = new Punct(5,6);
        Punct p4 = new Punct(7,8);
        Punct p5 = new Punct(5,6);
        Punct p6 = new Punct(3,7);
        Punct p7 = new Punct(3,6);
        Punct p8 = new Punct(6,8);
        Punct p9 = new Punct(4,6);

        Linie linie = new Linie(p1,p2);
        Linie linie1 = new Linie(p3,p4);

        Linie linie2 = new Linie(p5,p6);
        Linie linie3 = new Linie(p7,p8);

        Dreptunghi dreptunghi = new Dreptunghi(linie,linie1);

        String text = "Hello world scrie pe mine";

        Eticheta eticheta = new Eticheta(linie2,linie3, text);

        Cerc cerc = new Cerc(p9, 6);

        ArrayList<Figura>figuras = new ArrayList<>();

        figuras.add(dreptunghi);
        figuras.add(eticheta);
        figuras.add(cerc);

//        figuras.add("dasdsa")

        Desen desen = new Desen(figuras);


        desen.afisare();

    }

}