import java.util.Scanner;
class cts

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = {"a","a","a","b","b","c","a","a","a"};
        int count_a = 0;
        int count_b = 0;
        int count_c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == "a") {
                count_a+=1;
                System.out.print(a[i]);
            }
            else if (a[i]=="b") {
                count_b+=1;
                count_a=0;
                System.out.print(a[i]);
            }
            else if (a[i]=="c") {
                count_c+=1;
                System.out.print(a[i]);
            }


        }
    }
}