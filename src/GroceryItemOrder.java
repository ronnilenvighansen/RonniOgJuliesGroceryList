/**
 * Created by Julie and Ronni on 28-08-2016.
 */

public class GroceryItemOrder {
    private String name = "";
    private int quantity = 1;
    private double pricePUnit = 0.0;
    private double totalCost = 0.0;

    public GroceryItemOrder(){
        name = "";
        quantity = 0;
        pricePUnit = 0.0;
    }

    public GroceryItemOrder(String inputName, int inputQuantity, double inputPricePUnit){
        name = inputName;
        quantity = inputQuantity;
        pricePUnit = inputPricePUnit;
    }

    public double getCost(){
        totalCost = pricePUnit * quantity;
        return totalCost;
    }

    public void setInputName(String setInputName){
        name = setInputName;
    }

    public void setQuantity (int setQuantity){
        quantity = setQuantity;
    }

    public void setPricePUnit(double setPricePUnit){
        pricePUnit = setPricePUnit;
    }

    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity + ", Price pr. Unit: $" + pricePUnit + ", Total cost: "
                + getCost() + "$";
    }
}
