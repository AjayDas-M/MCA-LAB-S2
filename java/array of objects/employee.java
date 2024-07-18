import java.util.Scanner;
class employeeobject
{
    int empid;
    String empname;
    employeeobject()
    {
        Scanner sc = new Scanner(System.in);
        
        empname = sc.nextLine();
        empid = sc.nextInt();
        
    }

    void show()
    {
        System.out.println("id : "+empid);
        System.out.println("Name : "+empname);
    }
}


class employee
{
    public static void main(String a[])
    {
        int i;
        int arr[] =new int[5];
        employeeobject em[] = new employeeobject[2];
        for(i=0; i<2; i++)
            em[i] = new employeeobject();
        
        for(i=0; i<2; i++)
            em[i].show(); 
    }
    
}