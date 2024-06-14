package pl.pjatk.RentalService.exception;

import org.springframework.http.HttpStatus;

public class BadGatewayException extends ExceptionEvent{
    public BadGatewayException(String message) {
        super(message);
    }

    @Override
    public String getErrorMessage() {
        return "Błąd 502 Bad Gateway";
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_GATEWAY;
    }
}
