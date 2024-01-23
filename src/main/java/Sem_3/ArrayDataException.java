package Sem_3;

public class ArrayDataException extends NullPointerException{
    public ArrayDataException() {
        super("Обращение к пустому элементу");
    }
}
