public class Calculator {
    private final int[] array;

    public Calculator(int[] array) {

        this.array = array;
    }

    public int calculateSum() {
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int calculateMaxNumber() {
        int i;
        int maxNumber = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int calculateMinNumber() {
        int i;
        int minNumber = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public int calculateEven() {
        int i;
        int counter = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public int compareValue() {
        int i;
        int number = 0;
        for (i = 1; i < array.length - 1; i++) {
            if (array[i - 1] < array[i] && array[i] < array[i + 1]) {
                number += 1;
            }
        }
        return number;
    }

}




