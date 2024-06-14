package pl.pjatk.RentalService.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import pl.pjatk.RentalService.model.Movie;

@FeignClient(name = "MovieAPI", url = "http://localhost:8080")
public interface MovieFeignClient {
    @GetMapping("/movies/{id}")
    Movie getMovie(@PathVariable Integer id);

    @PutMapping("/moviesSetAvailable/{id}")
    Movie updateMovie(@PathVariable Integer id);
}
