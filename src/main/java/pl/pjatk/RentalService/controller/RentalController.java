package pl.pjatk.RentalService.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.RentalService.exception.GatewayTimeoutException;
import pl.pjatk.RentalService.model.Movie;
import pl.pjatk.RentalService.service.RentalService;

import java.net.ConnectException;

@RestController
@RequiredArgsConstructor
@Tag(name = "RentalService", description = "Movie Rental Service with documentation")

public class RentalController {

    private final RentalService rentalService;

    @Operation(summary = "Gets movie by id from database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Movie was returned"),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "404 Nie znalazłem takiego filmu", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content),
            @ApiResponse(responseCode = "502", description = "Błąd 502 Bad Gateway", content = @Content),
            @ApiResponse(responseCode = "504", description = "504 Gateway Timeout - przekroczenie limitu czasu oczekiwania na odpowiedź serwera", content = @Content)
    })
    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        return ResponseEntity.ok(rentalService.getMovie(id));
    }



    @Operation(summary = "Set movie available for rental")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Movie was returned"),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "404 Nie znalazłem takiego filmu", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content),
            @ApiResponse(responseCode = "502", description = "Błąd 502 Bad Gateway", content = @Content),
            @ApiResponse(responseCode = "504", description = "504 Gateway Timeout - przekroczenie limitu czasu oczekiwania na odpowiedź serwera", content = @Content)
    })
    @PutMapping("/movies/{id}/available")
    public ResponseEntity<Movie> returnMovie(@PathVariable Integer id) {
        return ResponseEntity.ok(rentalService.returnMovie(id));
    }
}
