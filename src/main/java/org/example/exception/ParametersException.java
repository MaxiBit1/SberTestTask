package org.example.exception;

/**
 * Класс непроверяемого исключения при неправильном параметре
 */
public class ParametersException extends RuntimeException{
    public ParametersException(String message) {
        super(message);
    }
}
