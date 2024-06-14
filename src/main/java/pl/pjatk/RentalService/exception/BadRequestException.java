package pl.pjatk.RentalService.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends ExceptionEvent {

    public BadRequestException(String message) {
        super(message);
    }

    @Override
    public String getErrorMessage() {
        return "Nieprawidłowe zapytanie.";
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
