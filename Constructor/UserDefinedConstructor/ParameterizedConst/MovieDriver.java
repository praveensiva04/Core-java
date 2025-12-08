package Constructor.UserDefinedConstructor.ParameterizedConst;
class Movie
{
    static String Story;
    String name;
    String hero;
    double rating;
    double Collection;
    Movie()
    {
        System.out.println("--------Welcome to LCU---------");
    }
    Movie(String n,String m,double r,double c)
    {
        name=n;
        hero=m;
        rating=r;
        Collection=c;
    }
}

public class MovieDriver {
    public static void main(String[] args) {
        Movie.Story="Action";
        new Movie();
        Movie m1=new Movie("kaithi","Karthi",4.5,1000000);
        System.out.println(" Movie Name :"+m1.name+"\n Hero Name :"+m1.hero+"\n Rating :"+m1.rating+"\n Collection :"+m1.Collection);
        System.out.println("-------------------");
        Movie m2=new Movie("Leo","Vijay",4.8,5000000);
        System.out.println(" Movie Name :"+m2.name+"\n Hero Name :"+m2.hero+"\n Rating :"+m2.rating+"\n Collection :"+m2.Collection);
    }
}
