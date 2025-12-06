public class Magic {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 1; i <= 2000; i++) {
            if (isMagic(i)) {
                System.out.println("Magic Number: " + i);
            }
        }
    }
    public static boolean isMagic(int n) {
        int temp=n;
        while(temp>9){
            int sum=0;

             while(temp>0)
            {
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            temp=sum;
        }
        return temp==1;
    }
}
