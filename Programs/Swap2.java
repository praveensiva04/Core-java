public class Swap2 {
    public static void main(String[] args) {
        int a = 2321;
        int b = 5678;
        System.out.println("Before Swapping a: "+a+" b: "+b);
        System.out.println(swap(a,b));

    }
    public static String swap(int a, int b)
    {
        int temp= a;
        a=b;
        b=temp;
        return "After Swapping a: "+a+" b: "+b;
    }
}
