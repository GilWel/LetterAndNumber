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
        for (int i = 0; i <100; i++) {
            entNumber = random.nextInt(100);
            bufferedWriter.write(String.valueOf(entNumber));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int[] array = new int[100];
        int i = 0;

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            int outNumber = Integer.parseInt(line);
            array[i] = outNumber;
            i++;
        }
            Calculator calculator = new Calculator(array);
            int resultSum = calculator.calculateSum();
            int resultMaxNumber=calculator.calculateMaxNumber();
            int resultMinNumber=calculator.calculateMinNumber();
            int resultEven = calculator.calculateEven();
            int resultCompareValue = calculator.compareValue();


        Printer printer=new Printer();
        printer.printResult(resultSum,resultMaxNumber,resultMinNumber,resultEven,resultCompareValue,array);

    }
}























