public class PriceCalculation {
    public static void main(String[] args) {
        // Given prices
        int laptopPrice = 85000;  // Price of the laptop in tk
        int mousePrice = 2500;    // Price of the gaming mouse in tk

        // Calculate total cost without discount
        int totalCost = laptopPrice + mousePrice;

        // Calculate the discount (15%)
        double discount = totalCost * 0.15;

        // Final price after applying the discount
        double finalPrice = totalCost - discount;

        // Print the final price
        System.out.println("Total cost after 15% discount: " + finalPrice + " tk");
    }
}

