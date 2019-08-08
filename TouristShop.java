import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double totalPrice =0;
        int productCount = 0;
        while (!command.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCount++;

            if (productCount % 3 == 0) {
                productPrice = productPrice / 2;
            }
            totalPrice += productPrice;

            if (totalPrice > budget) {
                double neededMoney = totalPrice - budget;
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", neededMoney);
                break;
            }

            command = scanner.nextLine();
        }
        if (command.equals("Stop"))
            System.out.printf("You bought %d products for %.2f leva.", productCount, totalPrice);

    }
}

