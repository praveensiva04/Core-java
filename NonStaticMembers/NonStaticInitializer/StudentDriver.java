package NonStaticMembers.NonStaticInitializer;
class Student 
{
    static String SchoolName;
    static int count;
    int studentId;
    int age;
    String studentName;
    
    public static void SchoolInfo()
    {
        System.out.println("School Name: " + SchoolName);
        System.out.println("Total Students: " + count);
    }
    public void StudentInfo()
    {
        System.out.println("This is a student information system.");
        count++;
        System.out.println("Student Name : "+studentName+"\n Student ID : "+studentId+"\n Age : "+age);
    }
}
public class StudentDriver {
    public static void main(String[] args) {
        Student.SchoolName="Dr JCK School";
        Student s1=new Student();
        s1.studentId=101;
        s1.studentName="Arun";
        s1.age=17;
        s1.StudentInfo();
        Student.SchoolInfo();

        System.out.println("---------------");
        Student s2=new Student();
        s2.studentId=102;
        s2.studentName="Bala";
        s2.age=16;
        s2.StudentInfo();
        Student.SchoolInfo();
    }
}
