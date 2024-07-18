import java.util.Scanner;
class person
{
    String name;
    person()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    void show()
        {
            System.out.println("in person");
        }
    
}
class student extends person
{
    String sex;
    student()
    {
        Scanner sc = new Scanner(System.in);
        sex = sc.nextLine();
    }
    void show()
    {
        System.out.println("in student");
        super.show();
    }
}

class prog
{
    public static void main(String args[])
    {
        student s1 = new student();
        s1.show();

    } 
}