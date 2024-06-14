package pl.pjatk.RentalService.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class MovieNotFoundException extends ExceptionEvent {

    public MovieNotFoundException(String message) {
        super(message);
    }

    @Override
    public String getErrorMessage() {
        return "Nie znalazłem takiego filmu";
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
