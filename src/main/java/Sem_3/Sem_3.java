package Sem_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sem_3 {
    public static void main(String[] args) throws IOException, MyArraySizeException, MyArrayDataException {
//        Counter counter = new Counter();
//        counter.close();
//        counter.add();
//        try (Counter counter1 = new Counter()) {
//
////            doSomething();
//        } catch (IOException e) {
//            System.out.println("Поймали исключение");
//        }
//try {
//    int result = 10/0;
//    System.out.println(result);
//}catch (ArithmeticException e){
//    throw new DivisionByZeroException();
//}

//        try{
//            String[] arr = {"sdfs", null , "sdfs"};
//            System.out.println(arr[1].split("\n"));
//        }catch (NullPointerException e){
//            throw new ArrayDataException();
//        }

//        try {
//            FileReader file = new FileReader("a.txt");
//            file.read();
//        }catch (FileNotFoundException e){
//            throw new MyFileNotFoundExceprion();
//        }

        String[][] strings = {
                {"5", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "1"}
        };
        System.out.println(task4(strings));
    }


    public static void doSomething() throws IOException {
        throw new IOException("");
    }

    public static int task4(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null){
            throw new NullPointerException("Не инициализирован массив");
        }
        int sum = 0;
        if (array.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
