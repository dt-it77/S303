import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class databaseFile {
    //singleton
    public static databaseFile instance;

    private databaseFile(){

    }
    public static databaseFile getInstance() {
        if (instance == null) {
            instance = new databaseFile();
        }
        return instance;
    }
    public void WriteStoreStateToFile(Store object){
        try{
            FileOutputStream fileOut = new FileOutputStream(object.getFlorist()+".txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(object);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Store ReadFromFile(String store){
        try{
			FileInputStream fi = new FileInputStream(store+".txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Store pr1 = (Store) oi.readObject();
			oi.close();
			fi.close();
            return pr1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Boolean ExistDB(String name){
        File f = new File(name+".txt");
        if(f.exists()){
            return true;
        }
        return false;
    }

}
