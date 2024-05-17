import javax.sound.sampled.Line;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class EnteringNumbers {

    public static void main(String[] args) throws IOException {

        File file = new File("TextG.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Random random = new Random(100);
        int entNumber;
        for (int i = 0; i < 100; i++) {
            entNumber = random.nextInt(100);
            bufferedWriter.write(String.valueOf(entNumber));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int[] array = new int[1000];
        int i = 0;
        int number = 0;
        int sum = 0;
        int maxNumber = 0;
        int minNumber = 0;
        int counter = 0;

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            int outNumber = Integer.parseInt(line);
            array[i] = outNumber;
            i++;

            sum += outNumber;

            if (outNumber > maxNumber) {
                maxNumber = outNumber;

            }
            if (outNumber < minNumber) {
                minNumber = outNumber;
            }
            if (outNumber % 2 == 0) {
                counter++;
            }
        }
        for (i = 1; i < array.length - 1; i++) {

            if (array[i - 1] < array[i] && array[i] < array[i + 1]) {
                number += 1;
            }
        }
        System.out.println("общая сумма равна " + sum);
        System.out.println("Максимальное значение равно " + maxNumber);
        System.out.println("Минимальное значение равно " + minNumber);
        System.out.println("Количество четных чисел составляет " + counter + " шт");
        System.out.println(Arrays.toString(array));
        System.out.println("Больше соседа слева и меньше соседа справа " + number + " чисел");
    }
}























