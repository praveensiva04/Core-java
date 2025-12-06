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
        System.out.println(Test.name);
        System.out.println(Test.name);
        // t1.name;
    }
}
