import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataPersistence {

    public static SchoolManagementSystem loadSystemState(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("No existing data found. Starting with a new system.");
            return new SchoolManagementSystem(); 
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (SchoolManagementSystem) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new SchoolManagementSystem(); 
        }
    }

    public static void saveSystemState(SchoolManagementSystem system, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(system);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
