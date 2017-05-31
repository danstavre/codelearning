public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Dana");

        Operations classInstance = new Operations();
        int a = classInstance.sum(15,52);
        System.out.println(a);
        int b = classInstance.substraction(14,12);
        System.out.println(b);
        int c = classInstance.multiply(5,2);
        System.out.println(c);
        int d = classInstance.modulus(5,4);
        System.out.println(d);
        float s = classInstance.division(10,4);
        System.out.println(s);
        int t = classInstance.increment(20);
        System.out.println(t);
        boolean r = classInstance.equality(230,230);
        System.out.println(r);

        OperationsWithArray operationsWithArray = new OperationsWithArray();
        int[] myTestArray = {4, 5,3,6,7,4,3,2,6,7,6,3,-3,-4,-6,3};
        int maxElement = operationsWithArray.findMaxElementInArray(myTestArray);
        System.out.println("Max Element");
        System.out.println(maxElement);

        int minElement = operationsWithArray.findMinElementInArray(myTestArray);
        System.out.println("Min Element");
        System.out.println(minElement);


    }


}
