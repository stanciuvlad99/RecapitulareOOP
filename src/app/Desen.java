package app;

import java.util.ArrayList;

public class Desen implements Figura {


    private ArrayList<Figura> figuras;


    public Desen(ArrayList<Figura> figuraArrayLis) {

        this.figuras = figuraArrayLis;
    }


    @Override
    public String toString() {
        String text = "\n";
        for (int i = 0; i < figuras.size(); i++) {
            text += figuras + "\n";
        }
        return text;
    }

    @Override
    public void afisare() {
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i).toString());
        }
    }

    @Override
    public void translateX(int x) {
        for (int i = 0; i < figuras.size(); i++) {
            this.figuras.get(i).translateX(x);
        }
    }

    @Override
    public void translateY(int y) {
        for (int i = 0; i < figuras.size(); i++) {
            this.figuras.get(i).translateY(y);
        }
    }

    @Override
    public void translate(int x, int y) {
        for (int i = 0; i < figuras.size(); i++) {
            this.figuras.get(i).translate(x, y);
        }
    }

    @Override
    public Desen duplicate() {
        return new Desen(this.figuras);
    }
}
