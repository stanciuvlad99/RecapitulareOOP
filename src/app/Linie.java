package app;

public class Linie extends Figura {


    private Punct p1;

    private Punct p2;


    public Linie(Punct p1, Punct p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punct getP1() {
        return p1;
    }

    public void setP1(Punct p1) {
        this.p1 = p1;
    }

    public Punct getP2() {
        return p2;
    }

    public void setP2() {
        this.p2 = p2;
    }

    @Override
    public boolean equals(Object object) {
        Linie l = (Linie) object;
        return this.p1.equals(l.p1)&&this.p2.equals(l.p2);
    }

    @Override
    public String toString(){
        String text="\n";
        text+="p1 este format din intersectia axelor x si y " + p1 + "\n";
        text+="p2 este format din intersectia axelor x si y " + p2 + "\n";
        return text;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.p1.translateX(x);
        this.p2.translateX(x);
    }

    @Override
    public void translateY(int y){
        this.p1.translateY(y);
        this.p2.translateY(y);
    }

    @Override
    public void translate(int x, int y){
        this.p1.translateY(y);
        this.p2.translateY(y);
        this.p1.translateX(x);
        this.p2.translateX(x);
    }

    @Override
    public Linie duplicate(){
        return new Linie(this.p1,this.p2);
    }


}
