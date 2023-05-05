package app;

import java.util.ArrayList;

public class Desen extends Figura{


    private ArrayList<Figura> figuras;


    public Desen(ArrayList<Figura>figuraArrayLis){

        this.figuras=figuraArrayLis;
    }

    public boolean equals(Object object){
//        Desen d = (Desen) object;
//        return this.figuras.equals(d.figuras);
        return false;
    }

    @Override
    public String toString(){
        String text="\n";
        for (int i=0; i<figuras.size();i++){
            text+=figuras+"\n";
        }
        return text;
    }

    @Override
    public void afisare() {
        for (int i=0; i<figuras.size(); i++){
            System.out.println(figuras.get(i).toString());
        }
    }

    @Override
    public void translateX(int x) {

    }

    @Override
    public void translateY(int y) {

    }

    @Override
    public void translate(int x, int y) {

    }

    @Override
    public Figura duplicate() {
        return null;
    }
}
