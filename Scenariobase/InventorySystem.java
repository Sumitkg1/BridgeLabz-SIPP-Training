	import java.util.*;
	
	// Generic Inventory Item class
	class InventoryItem<T> {
	    private T product;
	    private int quantityInStock;
	    private double pricePerUnit;
	
	    public InventoryItem(T product, int quantityInStock, double pricePerUnit) {
	        this.product = product;
	        this.quantityInStock = quantityInStock;
	        this.pricePerUnit = pricePerUnit;
	    }
	
	    public T getProduct() {
	        return product;
	    }
	
	    public int getQuantityInStock() {
	        return quantityInStock;
	    }
	
	    public double getPricePerUnit() {
	        return pricePerUnit;
	    }
	
	    public double getTotalValue() {
	        return quantityInStock * pricePerUnit;
	    }
	
	    @Override
	    public String toString() {
	        return product.toString() + "  Qty: " + quantityInStock + " ->  Price: " + pricePerUnit;
	    }
	}
	
	// Inventory Manager class
	class Inventory<T> {
	    private List<InventoryItem<T>> items;
	
	    public Inventory() {
	        items = new ArrayList<>();
	    }
	
	    // Add item to inventory
	    public void addItem(T product, int quantity, double price) {
	        InventoryItem<T> newItem = new InventoryItem<>(product, quantity, price);
	        items.add(newItem);  
	    }
	
	    // Remove item by index (preserves order and duplicates)
	    public boolean removeItem(int index) {
	        if (index >= 0 && index < items.size()) {
	            items.remove(index);
	            return true;
	        }
	        return false;
	    }
	
	    // Show all items
	    public void displayItems() {
	        if (items.isEmpty()) {	
	            System.out.println("Inventory is empty.");
	            return;
	        }
	        System.out.println("Inventory Items:");
	        for (int i = 0; i < items.size(); i++) {
	            System.out.println(" "+ items.get(i));
	        }
	    }
	
	    // Calculate total inventory value
	    public double calculateTotalInventoryValue() {
	        double total = 0;
	        for (InventoryItem<T> item : items) {
	            total += item.getTotalValue();
	        }
	        return total;
	    }
	}
	
	// Product class for Grocery
	class GroceryProduct {
	    private String productName;
	
	    public GroceryProduct(String name) {
	        this.productName = name;
	    }
	
	    @Override
	    public String toString() {
	        return productName;
	    }
	}
	
	// Product class for Electronics
	class ElectronicsProduct {
	    private String modelName;
	
	    public ElectronicsProduct(String name) {
	        this.modelName = name;
	    }
	
	    @Override
	    public String toString() {
	        return modelName;
	    }
	}
	
	// Driver Class
	public class InventorySystem {
	    public static void main(String[] args) {
	        // Grocery Inventory
	        Inventory<GroceryProduct> groceryInventory = new Inventory<>();
	        groceryInventory.addItem(new GroceryProduct("Apple"), 50, 2.0);
	        groceryInventory.addItem(new GroceryProduct("Banana"), 100, 1.0);
	        groceryInventory.addItem(new GroceryProduct("Apple"), 20, 3);  // Duplicate allowed
	
	        groceryInventory.displayItems();
	        System.out.println("Total Grocery Inventory Value: " + groceryInventory.calculateTotalInventoryValue());
	
	        System.out.println();
	
	        // Electronics Inventory
	        Inventory<ElectronicsProduct> electronicsInventory = new Inventory<>();
	        electronicsInventory.addItem(new ElectronicsProduct("TV Samsung"), 5, 25000);
	        electronicsInventory.addItem(new ElectronicsProduct("Sony Headphones"), 10, 3000);
	        electronicsInventory.addItem(new ElectronicsProduct("Boat Headphones"), 1, 5000);
	
	        electronicsInventory.displayItems();
	        System.out.println("Total Electronics Inventory Value: " + electronicsInventory.calculateTotalInventoryValue());
	    }
	}
