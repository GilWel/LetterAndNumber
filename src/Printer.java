import java.util.Arrays;

public class Printer {
    public void printResult(int sum, int maxNumber, int minNumber, int counter, int number, int[] array) {



    System.out.println("общая сумма равна " + sum);
        System.out.println("Максимальное значение равно " + maxNumber);
        System.out.println("Минимальное значение равно " + minNumber);
        System.out.println("Количество четных чисел составляет " + counter + " шт");
        System.out.println(Arrays.toString(array));
        System.out.println("Больше соседа слева и меньше соседа справа " + number + " чисел");
}
}