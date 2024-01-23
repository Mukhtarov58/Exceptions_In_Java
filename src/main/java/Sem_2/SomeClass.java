package Sem_2;

import java.io.*;

public class SomeClass {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asd", "sdf"};
            String strings1 = strings[1];
            test();
            float a = 1.f / 0.f;
            inputStream = new FileInputStream("1");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (StackOverflowError error) {
            System.out.println("asdfasdf");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        reader.close();

    }
}