
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class SchuelerBL extends AbstractListModel {
    
    private ArrayList<Schueler> klasse = new ArrayList<>();

    public void add(Schueler s) {
        klasse.add(s);
    }
    
    public void save(File f) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        
        for (Schueler s : klasse) {
            oos.writeObject(s);
        }
        oos.flush();
        oos.close();
    }
    
    public void load(File f) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader(f));
//        
//        String line;
//        
//        while((line = br.readLine()) != null) {
//            String[] attr = line.split(";");
//            this.add(new Schueler(attr[0], LocalDate.parse(attr[0], DateTimeFormatter.ISO_DATE)));
//        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        
        Object o;
        
        try {
            while ((o = ois.readObject()) != null) {
                klasse.add((Schueler) o);
            }
        } catch (IOException ioExc) {
            //
        }
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
