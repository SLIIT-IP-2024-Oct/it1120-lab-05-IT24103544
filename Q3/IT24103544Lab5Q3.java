import java.util.Scanner;

public class IT24103544Lab5Q3 {

    public static final int disone = 10; 
    public static final int distwo = 20; 
    public static final int roompd = 48000; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startDate, endDate, reservedDate, discountRate;
        double total;

        System.out.println("Enter Start Date (1-31): ");
        startDate = input.nextInt();
        System.out.println("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31.");
            return;
        }
        if (startDate > endDate) {
            System.out.println("Error: Start date must be less than or equal to End date.");
            return;
        }

        reservedDate = endDate - startDate + 1;

        if (reservedDate < 3) {
            discountRate = 0;
        } else if (reservedDate >= 3 && reservedDate < 5) {
            discountRate = disone;
        } else {
            discountRate = distwo;
        }

        total = (roompd * reservedDate) - ((roompd * reservedDate * discountRate) / 100.0);

        System.out.println("Room charge per day: " + roompd);
        System.out.println("Number of days reserved: " + reservedDate);
        System.out.println("Discount rate applied: " + discountRate + "%");
        System.out.println("Total amount to be paid: " + total);

        input.close();
    }
}
