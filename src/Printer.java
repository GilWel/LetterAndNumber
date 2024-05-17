import java.lang.reflect.Array;
import java.util.Arrays;

public class Printer {
    public void printResult() {


        int sum = 0;
        int maxNumber =0;
        int minNumber = 0;
        int counter = 0;
        int number = 0;
        String array = String.valueOf(0);

        System.out.println("общая сумма равна " + sum);
        System.out.println("Максимальное значение равно " + maxNumber);
        System.out.println("Минимальное значение равно " + minNumber);
        System.out.println("Количество четных чисел составляет " + counter + " шт");
        System.out.println(Arrays.toString(array.toCharArray()));
        System.out.println("Больше соседа слева и меньше соседа справа " + number + " чисел");

    }
}