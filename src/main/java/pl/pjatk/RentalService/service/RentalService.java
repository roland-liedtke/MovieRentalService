package pl.pjatk.RentalService.service;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pjatk.RentalService.exception.BadGatewayException;
import pl.pjatk.RentalService.exception.GatewayTimeoutException;
import pl.pjatk.RentalService.exception.NotFoundException;
import pl.pjatk.RentalService.model.Movie;


@Service
@RequiredArgsConstructor
public class RentalService {

    private final MovieFeignClient client;

    public Movie getMovie(Integer id) {
        try {
            return client.getMovie(id);
        } catch (FeignException.InternalServerError internalServerError) {
            throw new BadGatewayException("");
        }  catch (Exception exception) {
            throw new NotFoundException("Brak filmu");
        }
    }

    public Movie returnMovie(Integer id) {
        return client.updateMovie(id);
    }

}
