package app;

public class Eticheta extends Dreptunghi {

     private String text;

     public Eticheta(Linie l1, Linie l2, String text){
         super(l1,l2);
         this.text=text;
     }

     public String getText(){
          return text;
     }

     public void setText(String text){
          this.text=text;
     }

     @Override
     public boolean equals(Object object){
          Eticheta e = (Eticheta) object;
          return this.text.equals(e.text);
     }

     @Override
     public String toString(){
          String text="Sunt o eticheta"+ "\n";
          text+=this.text+"\n";
          text+="Linia 1 este formata din cele doua puncte p1 si p2 "+ super.getL1()+"\n";
          text+="Linia 2 este formata din cele doua puncte p1 si p2 "+ super.getL2()+"\n";
          return text;
     }

     @Override
     public void afisare(){
          System.out.println(this);
     }

     @Override
     public Eticheta duplicate(){
          return new Eticheta(this.getL1(),this.getL2(),text);
     }

}
