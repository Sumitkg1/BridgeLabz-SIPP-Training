 abstract class Product {
    private String productId, productname;
    private double price;

    public Product(String id, String productname, double price) {
        this.productId = id;
        this.productname = productname;
        this.price = price;
    }

    public abstract double calculateDiscount();
    public double getPrice() {
        return price;
    }
    public String getproductname() {
        return productname;
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String productname, double price) {
        super(id, productname, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "GST 18%";
    }
}
