package NonStaticMembers.NonStaticVariable;
class Product
{
    String product;
    double price;

}
public  class ShopDriver
{
    public static void main(String[] args) {
        Product m1=new Product();
        m1.product="Apple";
        m1.price=120000;
        System.out.println("product: "+m1.product);
        System.out.println("product Price: "+m1.price);
        System.out.println("--------------");
        Product m2=new Product();
        m2.product="Samsung";
        m2.price=80000;
        System.out.println("product Brand: "+m2.product);
        System.out.println("product Price: "+m2.price);

    }
}
