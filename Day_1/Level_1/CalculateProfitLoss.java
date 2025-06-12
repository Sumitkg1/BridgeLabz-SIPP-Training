package Day_1.Level_1;
import java.util.Scanner;
public class CalculateProfitLoss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the item: ");
        double costPrice = sc.nextInt();
        double sellingPrice = sc.nextInt();

        if(sellingPrice > costPrice){
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        }
        else if(sellingPrice < costPrice){
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        }
        else {
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
