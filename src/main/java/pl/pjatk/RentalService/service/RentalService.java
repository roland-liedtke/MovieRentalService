package pl.pjatk.RentalService.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.exception.MovieNotFoundException;
import pl.pjatk.RentalService.model.Movie;

@Service
@RequiredArgsConstructor
public class RentalService {

    private final MovieFeignClient client;

    public Movie getMovie(Integer id) {
        try {
            return client.getMovie(id);
        } catch (Exception exception) {
            throw new MovieNotFoundException("Brak filmu");
        }
    }

    public Movie returnMovie(Integer id) {
        return client.updateMovie(id);
    }

}
