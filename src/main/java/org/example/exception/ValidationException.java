package org.example.exception;

/**
 * Класс непроверяемого исключения при неправильной валидации
 */
public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
