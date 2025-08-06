import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Element {
    private String name;
    private int quantity;
    private double mass;

    public Element(String name, int quantity) throws FileNotFoundException {
        this.name = name;
        this.quantity = quantity;

        // read file and find element, multiply by quantity

        File file = new File("src/molarMasses.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String x = scanner.nextLine();
            if (this.name.equals(x.substring(0, this.name.length()))) {
                this.mass = Double.parseDouble(x.substring(this.name.length()).trim());
            }
        }

    }

    public Element(String name) {
        this.name = name;
        quantity = 1;
    }

    public double getMass() {
        return mass;
    }

    
}
