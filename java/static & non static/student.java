import java.util.Scanner;
class student
{
    
    String name;
    void show()
    {
        System.out.println("name :" + name);

    }
    static void vshow()
    {
        System.out.println("This is a static Method");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.name=sc.nextLine();
        s1.show();
        vshow();
    }
    
    
}
