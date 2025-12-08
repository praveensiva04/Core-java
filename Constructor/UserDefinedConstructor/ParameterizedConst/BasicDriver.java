package Constructor.UserDefinedConstructor.ParameterizedConst;
class Basic
{
    int x;
    Basic(int a)
    {
        x=a;
        //attribute value=parameter value
        System.out.println("Value of x :"+x);
    }
}
public class BasicDriver {
    public static void main(String[] args) {
        Basic b=new Basic(55);
    }
}
