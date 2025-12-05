import java.util.Scanner;
public class ArrIntro {
    public static void main(String[] args) {
        // System.out.println("Hello");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers");
        int[] age = new int[5];
        

        for(int i=0;i<=age.length-1;i++){
          
            age[i]=s.nextInt();
        }
        System.out.println(age.toString());
    }
    
}