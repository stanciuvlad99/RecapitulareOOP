package app;

public class Dreptunghi implements Figura{

    private Linie l1;
    private Linie l2;


    public Dreptunghi(Linie l1, Linie l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public Linie getL1(){
        return l1;
    }

    public void setP1(){
        this.l1 = l1;
    }

    public Linie getL2(){
        return l2;
    }

    public void setP2(){
        this.l2 = l2;
    }

    @Override
    public boolean equals(Object object){
        Dreptunghi d=(Dreptunghi) object;
        return this.l1.equals(d.l1)&&this.l2.equals(d.l2);
    }

    @Override
    public String toString(){
        String text="Sunt un dreptunghi" + "\n";
        text+="Linia 1 este formata din cele doua puncte p1 si p2 " + l1 +"\n";
        text+="Linia 2 este formata din cele doua puncte p1 si p2 " + l2 + "\n";
        return text;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.l1.translateX(x);
        this.l2.translateX(x);
    }

    @Override
    public void translateY(int y){
        this.l1.translateY(y);
        this.l2.translateY(y);
    }

    @Override
    public void translate(int x, int y){
        this.l1.translateX(x);
        this.l2.translateX(x);
        this.l1.translateY(y);
        this.l2.translateY(y);
    }

    @Override
    public Dreptunghi duplicate(){
        return new Dreptunghi(this.l1,this.l2);
    }

}
