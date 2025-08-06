import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Decoder {
    public static ArrayList<Element> returnElements(String molecule) throws FileNotFoundException {
        ArrayList<Element> elements = new ArrayList<>();

        while (!molecule.isEmpty()) {
            String name = "";
            String quantity = "";

            while (!molecule.isEmpty() && !isNumeric(molecule.substring(0, 1))) {
                name += molecule.substring(0, 1);
                molecule = molecule.substring(1);
            }

            while (!molecule.isEmpty() && isNumeric(molecule.substring(0, 1))) {
                quantity += molecule.substring(0, 1);
                molecule = molecule.substring(1);
            }

            int qty = quantity.isEmpty() ? 1 : Integer.parseInt(quantity);

            elements.add(new Element(name, qty));
        }

        return elements;
    }

    private static boolean isNumeric(String x) {

        // try statement and return true if no error occurs

        try {
            Integer.parseInt(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
