public class test {
    public static void main(String[] args) {
        Float f=new Float("3.3");
        int a=f.intValue();
        double b=f.doubleValue();//"3.3";
        byte x=f.byteValue();
        System.out.println(a+b+x);
    }
}
