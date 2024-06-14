package pl.pjatk.RentalService.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private Integer id;
    private String name;
    private Category category;
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
