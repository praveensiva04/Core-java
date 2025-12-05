abstract class Appliance{
    abstract void turnon();
    void plugin()
    {
        System.out.println("Plugged in");
    }
}
class Fan extends Appliance{
    // @override
    void turnon()
    {
        System.out.println("Fan is On");
    }
}
class Tv extends Appliance
{
    void turnon()
    {
        System.out.println("Tv is On");
    }
}
public class Abst{
    public static void main(String[] args)
    {
        // Vehicle v=new Bike(); error
       Appliance app=new Fan();
       Appliance ap=new Tv();
       app.turnon();
       app.plugin();
       ap.turnon();
       ap.plugin();

    }
}