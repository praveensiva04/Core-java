package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean ismarried;
    static long population;
     
    public Human(int age, String name, int salary, boolean ismarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.ismarried = ismarried;
        Human.population+=1;
    }

        

}
