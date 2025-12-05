public class Calci {

    public static void main(String[] args) {
        add(10, 20);
        sub(30, 15);
        mul(5, 4);
        div(40, 8);
        mod(10, 3);
    }
    public static void add(int a,int b){
        int sum = a+b;
        System.out.println("Addition: "+sum);
    }
    public static void sub(int a,int b){
        int sub = a-b;
        System.out.println("Subtraction: "+sub);
    }
    public static void mul(int a,int b){
        int mul = a*b;
        System.out.println("Multiplication: "+mul);
    }
    public static void div(int a,int b){
        int div = a/b;
        System.out.println("Division: "+div);
    }
    public static void mod(int a,int b){
        int mod = a%b;
        System.out.println("Modulus: "+mod);
    }

    
}
