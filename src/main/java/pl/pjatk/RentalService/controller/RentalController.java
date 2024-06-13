package pl.pjatk.RentalService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.RentalService.model.Movie;
import pl.pjatk.RentalService.service.RentalService;


@RestController
public class RentalController {

    private RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/movies/{id}/available")
    public ResponseEntity<Movie> returnMovie(@PathVariable Integer id) {
        return ResponseEntity.ok(rentalService.returnMovie(id));
    }
}
