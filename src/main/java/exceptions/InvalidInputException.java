package exceptions;

import exceptions.BlawgException;

public class InvalidInputException extends BlawgException {
    public InvalidInputException() {

        super();
    }

    public InvalidInputException(String message) {

        super(message);
    }
}
