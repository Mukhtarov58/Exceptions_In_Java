package Sem_2;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
public class Sem_2 {

    public static void main(String[] args) throws IOException {
        /*
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, Bкоторый хотите записать значение");
        try {
            int index = scanner.nextInt();
            if(index >= 0 && index < arr.length)
                arr[index] = 1;
        } catch (InputMismatchException e) {
            System.out.println("Указан индекс за пределами массива");
        }
         */

        /*
        String[][] arr = {
                {"12", "33", "54", "678", "32", "86"},
                {null, "sad", "ddd", "sdsa", "sad", "sde"},
                {"a", null, "ddd", "sdsa", "sad", "sde"},
                {"a", "sad", "ddd"},
                {"a", "sad", "ddd", "sdsa", "sad", "sde"}
        };

        System.out.println(sum2d(null));
         */


        anilizeAndWrite(readerFile());

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;

        if(arr == null){
            throw new RuntimeException("Array is Null!");
        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length < 5){
                throw new RuntimeException("Small");
            }

            for (int j = 0; j < 5; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e){
                    System.out.println("NullPointerException");
                }
            }
        }

        return sum;
    }

    public static Map<String, String> readerFile() throws IOException {
        FileReader fileReader = new FileReader("file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<String, String> values = new HashMap<>();

        while(true){
            String temp = bufferedReader.readLine();
            if(temp == null){
                break;
            }
            String[] tempKeyVal = temp.split("=");
            values.put(tempKeyVal[0], tempKeyVal[1]);
        }

        fileReader.close();

        return values;
    }

    public static void anilizeAndWrite(Map<String, String> values) throws IOException {

        values.forEach((key, value) -> {
            if(value.equals("?"))
                values.put(key, Integer.toString(key.length()));
        });

        /*
        for (String key:values.keySet()) {
            String value = values.get(key);
            if(value.equals("?"))
                values.put(key, Integer.toString(key.length()));
        }
         */

        for (String item : values.values()) {
            Integer.parseInt(item);
        }

        FileWriter fw = new FileWriter("file.txt");

        values.forEach((key, value) -> {
            try {
                fw.write(key + "=" + value + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        fw.close();
    }

}