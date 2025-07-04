abstract class FoodItem {
    private String itemFoodname;
    private double price;
    private int quantity;

    public FoodItem(String Foodname, double price, int qty) {
        this.itemFoodname = Foodname;
        this.price = price;
        this.quantity = qty;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemFoodname + " - Qty: " + quantity);
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String Foodname, double price, int qty) {
        super(Foodname, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50;
    }

    public double applyDiscount() {
        return 30;
    }

    public String getDiscountDetails() {
        return "Flat ₹30 Off";
    }
}
