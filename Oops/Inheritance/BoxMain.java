package Inheritance;

// import javax.swing.Box;

public class BoxMain {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.h+" "+b1.l+" "+b1.w);
        Box b2=new Box(5);
         System.out.println(b2.h+" "+b2.l+" "+b2.w);
        Box b3=new Box(1.4, 2.4, 2.4); 
        System.out.println(b3.h+" "+b3.l+" "+b3.w);
        Box b4 = new Box(b3); 
        System.out.println(b4.h+" "+b4.l+" "+b4.w);

        System.out.println("--------------------------");

        BoxWeight w1 = new BoxWeight();
        System.out.println(w1.h+" "+w1.l+" "+w1.w+" "+w1.weight);

        System.out.println("--------------------------");

        BoxWeight w2 = new BoxWeight(2,3,4,5);
        System.out.println(w2.h+" "+w2.l+" "+w2.w+" "+w2.weight);

        System.out.println("--------------------------");

        BoxWeight w3 = new BoxWeight(7,6,5,4,3);
        System.out.println(w3.h+" "+w3.l+" "+w3.w+" "+w3.weight+" "+w3.b);

    }
}
