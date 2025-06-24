import java.util.*;
public class Item{
  private String itemCode;
  private String itemName;
  private int price;
  public Item(String itemCode,String itemName,int price){
    this.itemCode=itemCode;
    this.itemName=itemName;
    this.price=price;
  }
  public void displayDetails(){
    System.out.println("Item Code is:- "+itemCode);
    System.out.println("Item Name is:- "+itemName);
    System.out.println("Item price:- "+price);
  }
  public int totalCost(int quantity){
    return price*quantity;
  }
  public static void main(String[] args){
    String itemName="Laptop";
    String itemCode="50000";
    int price=200;
    Item item =new Item(itemCode,itemName,price);
    int totalCost=item.totalCost(2);
    System.out.print("Total cost of "+itemName+"is:- "+totalCost);
  }
}