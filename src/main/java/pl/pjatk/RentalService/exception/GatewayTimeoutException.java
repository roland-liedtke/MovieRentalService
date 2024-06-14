package pl.pjatk.RentalService.exception;

import org.springframework.http.HttpStatus;

public class GatewayTimeoutException extends ExceptionEvent{
    public GatewayTimeoutException(String message) {
        super(message);
    }

    @Override
    public String getErrorMessage() {
        return "504 Gateway Timeout - przekroczenie limitu czasu oczekiwania na odpowiedź serwera";
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.GATEWAY_TIMEOUT;
    }
}
