package app;

public class Cerc extends Figura{

    private Punct punct;

    private int raza;

    public Cerc(Punct punct, int raza){
        this.punct=punct;
        this.raza=raza;
    }

    public Punct getPunct(){
        return punct;
    }

    public void setPunct(Punct punct){
        this.punct=punct;
    }

    public int getRaza(){
        return raza;
    }

    public void setRaza(int raza){
        this.raza=raza;
    }

    @Override
    public String toString(){
        String text="Sunt un cerc "+"\n";
        text+="Centrul este format din intersectia axelor x si y " + punct + "\n";
        text+="Raza are " + raza + " ecm"+"\n";
        return text;
    }

    @Override
    public boolean equals(Object object){
        Cerc c=(Cerc) object;
        return this.punct.equals(c.punct) && this.raza==(c.raza);
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.punct.translateX(x);
    }

    @Override
    public void translateY(int y){
        this.punct.translateY(y);
    }

    @Override
    public void translate(int x, int y){
        this.punct.translateX(x);
        this.punct.translateY(y);
    }

    @Override
    public Cerc duplicate(){
        return new Cerc(this.punct,this.raza);
    }
}
