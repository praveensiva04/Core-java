class Bus{
    String name;
    String from;
    String to;

    Bus(String name,String from,String to)
    {
        this.name=name;
        this.from=from;
        this.to=to;
    }
    public void bus1()
    {
        System.out.println("Bus name: "+ name +"\n From : "+ from +"\n To : "+ to);
    }
}
class Busdriver{
    public static void main(String[] args)
    {
        Bus b1=new Bus("Smt Transports","Pattukotai","Thanjavur");
        Bus b2=new Bus("Baby Transports","Pattukotai","Thanjavur");
        Bus b3=new Bus("Raahath Transports","Pattukotai","Thanjavur");
        b1.bus1();
        b2.bus1();
        b3.bus1();
    }
}