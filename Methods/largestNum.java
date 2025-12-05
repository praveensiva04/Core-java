public class largestNum {
    public static void main(String[] args) {
        // System.out.println(Check(10, 20, 30));
        if(Check(7, 4, 6))
        {
            System.out.println("a is greater than b and c");
        }
        
    }
    public static boolean Check(int a,int b,int c)
    {
       if(a>b)
       {
        return true;
       }
       else if (a>c) {
        return true;
       }
    //    else if (b>c) {
    //     return true;
    //    }
       else
       {
        return false;
       }
    }
    public static int m2(){
        int a = 10;
        int b = 20;
        return a +b;
    }
    public static void ms()
    {
        System.out.println("CSK");
    
    }
}
