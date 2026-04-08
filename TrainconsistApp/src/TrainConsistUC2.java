import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // ADD (Create)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("\nAfter Adding Bogies:");
        System.out.println(bogies);

        // REMOVE
        bogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(bogies);

        // CHECK existence
        boolean exists = bogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);

        System.out.println("\nSystem ready for further operations.");
    }
}
