
import java.time.LocalDate;


public class Schueler {
    private String name;
    private LocalDate birthday;
    
    public Schueler(String name, LocalDate brithday) {
        this.name = name;
        this.birthday = brithday;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
