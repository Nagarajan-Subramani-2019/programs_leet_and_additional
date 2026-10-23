public class shopApp {


    public static void main(String[] args) {
        System.out.println("Hi");
        double tax=0.2;
        Clothing item1=new Clothing();
        Clothing item2=new Clothing();

        item1.setDescription("Blue jacket");
        item1.setPrice(20.9);
        item1.setSize("L");

        item2.setDescription("Orange T shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        print(item1);
        print(item2);

        double Total=0.0;
        //calculateTotal(item2,tax);

        Total=item1.getPrice()+tax;
        Total=2*(item2.getPrice()+tax+Total);

        System.out.println("Grand Total is "+Total);

    }

    public static void print (Clothing item)
    {
        System.out.println(item.getDescription()+" ,"+ item.getSize()+" ,"+(item.getPrice()));

    }

    public static void calculateTotal(Clothing item,double tax,double total) {
        total= item.getPrice()+tax+total;
    }
}
