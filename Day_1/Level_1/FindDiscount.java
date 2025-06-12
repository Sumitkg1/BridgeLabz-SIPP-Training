package Day_1.Level_1;
public class FindDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountercent = 10;

        int discount = (fee * discountercent) / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
