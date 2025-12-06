public class DisoriumNum {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(Disorium(135))
        {
            System.out.println("Disorium Number");
        }
        else
        {
            System.out.println("Not a Disorium Number");
        }
    }
    public static boolean Disorium(int n)
    {
        int sum = 0;
        int temp=n;
        int temp2=n;
        int count = 0;
        while(temp2>0)
        {
            count++;
            temp2/=10;
        }
        while(temp>0)
        {
            int rem=temp%10;
            int fact=1;
            int i=1;
            while(i<=count)
            {
                fact=fact*rem;
                i++;

            }
            count--;
            temp/=10;
            sum+=fact;
        }
        return sum==n;
    }
}
