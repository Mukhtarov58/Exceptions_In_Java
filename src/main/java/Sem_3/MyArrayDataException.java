package Sem_3;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int i, int j) {
        super("В ячёйке ["+i+"]["+j+"]");
    }
}
