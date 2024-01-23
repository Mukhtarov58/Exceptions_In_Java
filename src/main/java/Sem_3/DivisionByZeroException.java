package Sem_3;

public class DivisionByZeroException  extends ArithmeticException{
    public DivisionByZeroException() {
        super("Деление на ноль недоступно");
    }
}
