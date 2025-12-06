public class Swap {
    public static void main(String[] args) {
        int a= 243;
        int b= 567;
        System.out.println("Before Swapping a: "+a+" b: "+b);
        System.out.println(swap(a,b));
        
    }
    public static String swap(int a,int b)
    {
        b= a+b; //b=30
        a=b-a; //a=20
        b=b-a; //b=10
        return "after Swapping a: "+a+" b: "+b;
    }
}
