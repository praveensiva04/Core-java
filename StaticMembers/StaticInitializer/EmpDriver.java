package StaticMembers.StaticInitializer;
public class EmpDriver
{
    static int empcount;
    static{
        empcount=0;
    }
    static public void empName(String name)
    {
        empcount++;
        System.out.println("Empname : "+name);
    }
    static public void empCount()
    {
        System.out.println("Total Employees : "+empcount);
    }
    public static void main(String[] args) {
        empName("Praveen");
        empName("Abdul");
        empName("John");
        empName("Smith");
        empName("Sabari");
        empCount();
    }
}
