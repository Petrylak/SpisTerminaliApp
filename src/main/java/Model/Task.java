package Model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Task {
    private String companyName, orderNumber, additionalInfo;

    private LocalDate productionDate;



}
