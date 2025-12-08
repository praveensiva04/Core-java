package StaticMembers.StaticInitializer;
class Alpha
{
    static 
    {
        System.out.println("Rule is a rule");
    }
    static String name ="John Wick";
    static public void Killerrate()
    {
        System.out.println("Killer Rate is 100%");
    }
}
public class AlphaTable
{
    static 
    {
        System.out.println("Alpha name: "+Alpha.name);
        Alpha.Killerrate();
    }
    public static void main(String[] args) {
        
    }



}