package Recursion;

public class EvenNum {
    public static void main(String[] args) {
        int n=1;
        isEven(n);
        System.out.println("Using EvenPrint Method:"+"\n"+ "-------------------");
        EvenPrint(2,20);
    }
    public static void isEven(int n)
    {
        if(n<=10 )
        {
            if (n%2==0) {
                System.out.println(n + " is Even Number");
            }
            isEven(n+1);
        } 
    }
    public static void EvenPrint(int num,int limit)
    {
        if(num>limit)
        {
            return;
        }
        System.out.println("Even Number :"+num);
        EvenPrint(num+2,limit);
    }
}
