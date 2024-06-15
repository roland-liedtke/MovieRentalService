package pl.pjatk.RentalService.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ExceptionEvent {

    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public String getErrorMessage() {
        return "404 Nie znalazłem takiego filmu";
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
