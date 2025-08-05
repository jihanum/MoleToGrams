import javax.lang.model.util.Elements;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.print("Enter molecule: ");
            String molecule = kb.nextLine();

            ArrayList<Element> elements = Decoder.returnElements(molecule);

            System.out.println("Molar mass of " + molecule + ": " + returnMolarMass(elements) + "\n");
        }

    }

    private static double returnMolarMass(ArrayList<Element> elements) {
        double totalMass = 0;

        for (Element i : elements) {
            totalMass += i.getMass();
        }

        return totalMass;
    }
}