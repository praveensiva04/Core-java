public class Math {
    public static void main(String[] args) {
        
        System.out.println("Area of Rectangle: "+rectArea(5.0,3.0));
        System.out.println("Area of Circle: "+circleArea(4.0));
        System.out.println("Area of Square: "+squareArea(6.0));
        System.out.println("Area of Triangle: "+triangleArea(4.0,5.0));
    }
    public static double rectArea(double length,double brea)
    {
        return (length * brea);
    }
    public static double circleArea(double radius)
    {
        return (3.14 * radius * radius);

    }
    public static double squareArea(double side)
    {
        return (side * side);
    }
    public static double triangleArea(double base,double height)
    {
        return (0.5 * base * height);
    }
        
}
