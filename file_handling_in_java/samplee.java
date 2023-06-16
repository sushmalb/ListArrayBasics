import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class samplee {
    private static final DateTimeFormatter DATE_FORMATTER = null;

    // Method to write order data to CSV file
    public static void writeOrderData(String[] orderData) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("restaurant.csv"))) {
            String line = String.join(",", orderData);
            wr.write(line);
            wr.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to read order data from CSV file
    public static void/List<String[]> readOrderData() {}

    // Method to calculate total sales
    public static double calculateTotalSales(List<String[]> orderDataList) {
    }

    // Method to search for orders by customer name
    public static void searchOrdersByCustomerName(List<String[]> orderDataList) {
    }

    // Method to find online orders on a particular date
    public static void findOnlineOrdersByDate(List<String[]> orderDataList) {
    }

    // Method to find the waiter who handled the maximum number of customers

    public static String findMaxCustomerWaiter(List<String[]> orderDataList) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------- Restaurant System Menu -----------");
            System.out.println("1. Place an Order");
            System.out.println("2. Calculate Total Sales for the Day");
            System.out.println("3. Search Orders by Customer Name");
            System.out.println("4. Find Online Orders on a Date");
            System.out.println("5. Find Waiter Handling Maximum Customers");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            List<String[]> orderDataList = readOrderData();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter waiter name: ");
                    String waiterName = scanner.nextLine();

                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();

                    System.out.print("Enter sales amount: ");
                    double salesAmount = scanner.nextDouble();

                    System.out.print("Enter order mode (online/offline): ");
                    String orderMode = scanner.next();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter tip amount: ");
                    double tipAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    String[] orderData = {
                            waiterName,
                            customerName,
                            itemName,
                            orderMode,
                            String.valueOf(salesAmount),
                            LocalDate.now().format(DATE_FORMATTER),
                            String.valueOf(tipAmount)
                    };
                    writeOrderData(orderData);
                    break;

                case 2:
                    double totalSales = calculateTotalSales(orderDataList);
                    System.out.println("Total sales for the day: $" + totalSales);
                    break;

                case 3:
                    searchOrdersByCustomerName(orderDataList);
                    break;

                case 4:
                    findOnlineOrdersByDate(orderDataList);
                    break;

                case 5:
                    String maxCustomerWaiter = findMaxCustomerWaiter(orderDataList);
                    System.out.println("Waiter who handled the maximum number of customers: " + maxCustomerWaiter);
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

}