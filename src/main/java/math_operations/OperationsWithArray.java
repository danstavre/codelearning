package main.java.math_operations;

public class OperationsWithArray {

    public int findMaxElementInArray(int[] testData) {
        int maxElement = testData[0];
        for (int indexInArray = 1; indexInArray < testData.length; indexInArray++) {
            int currentElementForIndex = testData[indexInArray];
            if (maxElement < currentElementForIndex) {
                maxElement = currentElementForIndex;
            }
        }

        return maxElement;
    }

        public int findMinElementInArray (int[] testData) {
        int minElement = testData[0];
        for (int IndexInArray = 1; IndexInArray<testData.length; IndexInArray++) {
             int currentElementForIndex = testData[IndexInArray];
             if (minElement > currentElementForIndex) {
                 minElement = currentElementForIndex;
             }
        }

            return minElement;
        }

}
