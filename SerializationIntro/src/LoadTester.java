
import java.io.File;
import java.time.LocalDate;


public class LoadTester {
    
    public static void main(String[] args) {
        SchuelerBL bl = new SchuelerBL();
        
        bl.add(new Schueler("Hans", LocalDate.of(2002, 5, 7)));
        bl.add(new Schueler("Grete", LocalDate.of(2001, 3, 1)));
        
        try {
            bl.load(new File("./klasse.csv"));
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
