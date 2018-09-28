
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class SchuelerBL extends AbstractListModel {
    
    private ArrayList<Schueler> klasse = new ArrayList<>();

    public void add(Schueler s) {
        klasse.add(s);
    }
    
    public void save(File f) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        for (Schueler s : klasse) {
            bw.write(s.getName());
            bw.write(";");
            bw.write(s.getBirthday().toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
    public void load() {
        
    }
    
    @Override
    public int getSize() {
        return klasse.size();
    }

    @Override
    public Object getElementAt(int index) {
        return klasse.get(index);
    }
    
}
