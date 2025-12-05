package StaticExample;

public class Main {
    public static void main(String[] args) {
        
        // Human h1=new Human(22, "Praveen", 20000, false);
        // Human h2=new Human(22, "raveen", 22000, false);
        // Human h3=new Human(22, "Paveen", 23000, false);

        // System.out.println(Human.population);
        // System.out.println(h1.name+" "+h2.name+" "+h3.name);
        // greeting();
        fun();
       
    }
    static void fun()
    {
        Main m = new Main();
        m.greeting();
    }

    void greeting()
    {
        System.out.println("Hello Java");
    }
}
