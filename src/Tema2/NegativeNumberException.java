package Tema2;

import java.util.Scanner;

public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
