import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Julie and Ronni on 25-08-2016.
 */

public class Run{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src\\groceries.txt"));

        GroceryItemOrder gio01 = new GroceryItemOrder();
        GroceryItemOrder gio02 = new GroceryItemOrder();
        GroceryItemOrder gio03 = new GroceryItemOrder();
        GroceryItemOrder gio04 = new GroceryItemOrder();
        GroceryItemOrder gio05 = new GroceryItemOrder();

        int count = 1;
        while(input.hasNextLine()) {
            String name = input.next();
            int quantity = input.nextInt();
            double cost = input.nextDouble();

            if (count == 1) {
                addFromTxtFile(gio01, name, quantity, cost);
            }
            else if (count == 2) {
                addFromTxtFile(gio02, name, quantity, cost);
            }
            else if (count == 3) {
                addFromTxtFile(gio03, name, quantity, cost);
            }
            else if (count == 4) {
                addFromTxtFile(gio04, name, quantity, cost);
            }
            else if (count == 5) {
                addFromTxtFile(gio05, name, quantity, cost);
            }
            count++;
        }

        GroceryList gl01 = new GroceryList(gio01, gio02, gio03, gio04, gio05);

        System.out.println(gl01);
    }

    public static void addFromTxtFile (GroceryItemOrder order, String a, int b, double c){
        order.setInputName(a);
        order.setQuantity(b);
        order.setPricePUnit(c);
    }
}
