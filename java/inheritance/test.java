class A
{
    void show()
    {
        System.out.println("this is class A");
    }

}


class B extends A
{

    void show()
    {
        System.out.println("This is  class B");
        super.show();
    }
    
}


class test
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
    } 

}