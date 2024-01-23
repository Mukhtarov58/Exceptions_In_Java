package Sem_3;

import java.io.FileNotFoundException;

public class MyFileNotFoundExceprion extends FileNotFoundException {
    public MyFileNotFoundExceprion() {
        super("Файл не существует");
    }
}
