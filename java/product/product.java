
class item
{
    String pname;
    int price;
    item(String s, int p)
    {
        pname = s;
        price = p;
    }
    void show()
    {
        System.out.println("Product Name : " + pname);
        System.out.println("Price: "+price);

    }
}


class product
{
    public static void main(String args[])
    {
        item p1 = new item("pen",20);
        item p2 = new item("pencil",10);
        item p3 = new item("paper",1);
        if(p1.price < p2.price && p1.price < p3.price)
            p1.show();
        if(p2.price < p1.price && p2.price < p3.price)
            p2.show();
        if(p3.price < p1.price && p3.price < p2.price)
            p3.show();
        
    }
}