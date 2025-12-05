package StaticExample;
class Test{
        static String name;

        public Test(String name)
        {
            Test.name=name;
        }
    }
public class Innerclass {
   
    public static void main(String[] args) {
        Test t1 = new Test("praveen");
        Test t2 = new Test("Farhan");
        System.out.println(t1.name);
        System.out.println(t2.name);
        // t1.name;
    }
}
