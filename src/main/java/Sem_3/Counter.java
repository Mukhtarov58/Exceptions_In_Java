package Sem_3;

import java.io.Closeable;
import java.io.IOException;

public class Counter implements Closeable {
    private Integer value = 0;


    public void add() throws IOException {
        try {
            value++;
        } catch (NullPointerException e) {
            throw new IOException();
        }
    }

    @Override
    public void close() throws IOException {
        value = null;
    }
}
