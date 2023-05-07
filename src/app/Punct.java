package app;

public class Punct implements Figura {

    private int x;
    private int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object object){

        Punct p=(Punct) object;

        return this.y ==p.y && this.x==p.x;
    }

    @Override
    public String toString() {
        String text = "\n";
        text += "x= " + x + "\n";
        text += "y= " + y + "\n";
        return text;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.x +=x;
    }

    @Override
    public void translateY(int y){
        this.y +=y;
    }

    @Override
    public void translate(int x, int y){
        this.x +=x;
        this.y +=y;
    }

    @Override
    public Punct duplicate(){
        return new Punct(this.x,this.y);
    }


}
