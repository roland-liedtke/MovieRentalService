package pl.pjatk.RentalService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.model.Movie;

@Service
public class RentalService {

    private RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Integer id) {
        return restTemplate.getForObject("http://localhost:8080/movies/" + id, Movie.class);
    }

    public Movie returnMovie(Integer id) {
        restTemplate.put("http://localhost:8080/moviesSetAvailable/" + id, null);
        return getMovie(id);
    }

}
