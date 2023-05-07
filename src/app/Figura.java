package app;

public interface Figura {


    void afisare();


    void translateX(int x);


    void translateY(int y);


    void translate(int x, int y);


    Figura duplicate();
}
