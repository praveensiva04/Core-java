public class Parameterized {
    public static void main(String[] args) {
        System.out.println("My Friends: ");
        friendsNames("Elon Musk", "truimp", "Jeff Bezos");
     

    }
    public static void friendsNames(String name1, String name2, String name3) {
        System.out.println(name1);
        String company = CompanyName("OpenAI");
        System.out.println("Company Name: " + company);
        System.out.println(name2);
        System.out.println(name3);
    }
    public static String CompanyName(String name) {
        return name;
    }
}
