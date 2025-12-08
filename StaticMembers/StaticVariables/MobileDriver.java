package StaticMembers.StaticVariables;
class Mobile
{
    static String Brand;
    static String model;
    static double price;

}
public class MobileDriver {
    public static void main(String[] args) {
        //Static variables is initialized by help of class name.
        Mobile.Brand="Xiaomi";
        Mobile.model="12 Pro";
        Mobile.price=45000.00;
        //Access static variables by help of class name.
        System.out.println("Brand: "+Mobile.Brand);
        System.out.println("Model: "+Mobile.model);
        System.out.println("Price: "+Mobile.price);
    }
}

