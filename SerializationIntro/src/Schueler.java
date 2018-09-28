
import java.time.LocalDate;


public class Schueler {
    private String name;
    private LocalDate brithday;
    
    public Schueler(String name, LocalDate brithday) {
        this.name = name;
        this.brithday = brithday;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getBrithday() {
        return brithday;
    }

}
