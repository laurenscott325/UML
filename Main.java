public class Main {

    private static final String DATA_FILE = "school_data.ser";
    private SchoolManagementSystem system;

    public Main() {
        system = DataPersistence.loadSystemState(DATA_FILE);
        if (system == null) {
            system = new SchoolManagementSystem(); 
        }
    }

    public void run() {
        MenuSystem menuSystem = new MenuSystem(system);
        menuSystem.showLoginMenu();
        
        DataPersistence.saveSystemState(system, DATA_FILE);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
