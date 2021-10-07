package com.company.customexception;

public class MassiveIsEmptyException extends Exception{
    public MassiveIsEmptyException() {
    }

    public MassiveIsEmptyException(String message) {
        super(message);
    }

    public MassiveIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MassiveIsEmptyException(Throwable cause) {
        super(cause);
    }
}
