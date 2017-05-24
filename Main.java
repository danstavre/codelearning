public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Dana");
        Operations classinstance = new Operations();
        int a = classinstance.sum(15,52);
        System.out.println(a);
        int b = classinstance.substraction(14,12);
        System.out.println(b);
        int c = classinstance.multiply(5,2);
        System.out.println(c);
        int d = classinstance.modulus(5,4);
        System.out.println(d);
        float s = classinstance.division(10,4);
        System.out.println(s);
        int t = classinstance.increment(20);
        System.out.println(t);
        boolean r = classinstance.equality(230,230);
        System.out.println(r);
    }


}
