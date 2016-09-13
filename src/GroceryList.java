/**
 * Created by Julie and Ronni on 25-08-2016.
 */

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> list01 = new ArrayList<>();
    private double total;


    public GroceryList(GroceryItemOrder a, GroceryItemOrder b, GroceryItemOrder c, GroceryItemOrder d, GroceryItemOrder e){
        list01.add(a);
        list01.add(b);
        list01.add(c);
        list01.add(d);
        list01.add(e);
    }


    public double totalCost(){
        total = list01.get(0).getCost() + list01.get(1).getCost() + list01.get(2).getCost() + list01.get(3).getCost()
                + list01.get(4).getCost();
        return total;
    }

    public String toString() {
        return "" + list01.get(0) + "\n" + list01.get(1) + "\n" + list01.get(2) + "\n" + list01.get(3) + "\n"
                + list01.get(4) + "\n\nTotal cost: $" + totalCost();
    }
}