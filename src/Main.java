public class Main {
    public static void main(String[] args)
    {
        int itemPrice = 13; // simulated user input value
        double SALES_TAX = .05;
        double taxPrice = itemPrice * SALES_TAX;
        double totalPrice = taxPrice + itemPrice;
        System.out.println("The sales tax on your $" + itemPrice + " item is $" + taxPrice + ", making your total $" +totalPrice);
    }
}