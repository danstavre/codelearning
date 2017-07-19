import java.util.ArrayList;
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
        int[] myTestArray = {4, 5,3,6,7,4,3,2,6,7,6,3,3};
        int maxElement = operationsWithArray.findMaxElementInArray(myTestArray);
        System.out.println("Max Element");
        System.out.println(maxElement);

        int minElement = operationsWithArray.findMinElementInArray(myTestArray);
        System.out.println("Min Element");
        System.out.println(minElement);

        System.out.println ("Binary Search");
        System.out.println(Binary.number(2, Binary.arr, 0, 7));

        GreenCircle greenCircle = new GreenCircle();
        YellowCircle yellowCircle = new YellowCircle();

        System.out.println(greenCircle.getColor());
        System.out.println(greenCircle.rad);
        System.out.println(yellowCircle.getColor());
        System.out.println(yellowCircle.rad);
        System.out.println(yellowCircle.getSquare(yellowCircle.rad));
        System.out.println(greenCircle.getSquare(greenCircle.rad));
        System.out.println(greenCircle.getSquare(6, 5));
        // ArrayList
        CatsList catsName= new CatsList();
        for (String name : catsName.cats) {
            System.out.println(name);
        }
        catsName.setDogs();
        for (String dogsName : catsName.dogs){
            System.out.println(dogsName);
        }
    }

}
