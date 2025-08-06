import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.print("Enter molecule: ");
            String molecule = kb.nextLine();

            if (molecule.isEmpty()) {
                break;
            }

            ArrayList<Element> elements = Decoder.returnElements(molecule);
            System.out.println("Molar mass of " + molecule + ": " + returnMolarMass(elements) + "\n");
        }

    }

    private static double returnMolarMass(ArrayList<Element> elements) throws FileNotFoundException {
        double totalMass = 0;

        for (Element i : elements) {
            totalMass += i.getMass();
        }

        return totalMass;
    }
}