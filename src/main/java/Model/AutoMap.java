package Model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AutoMap {
    private String license, licenseVersion;
    private LocalDate registrationDate;

}
