package pl.pjatk.RentalService.model;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    @Schema(description = "Movie Identifier - Integer ", example = "1")
    private Integer id;

    @Schema(description = "Movie Name - String ", example = "Titanic")
    private String name;

    @Schema(description = "Movie Category - CategoryEnum ", example = "Drama")
    private Category category;

    @Schema(description = "Movie Availability ", example = "true")
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
