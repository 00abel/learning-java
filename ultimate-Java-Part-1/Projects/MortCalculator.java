import java.text.NumberFormat;
import java.util.Scanner;
import java.math.MathContext;

public class MortCalculator {

    public static void main(String[] args) {

        // helper constants
        final double MONTHS_IN_A_YEAR = 12;
        final double PERCENT = 100;

        // get user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principle: ");
        double p = scan.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double r = scan.nextDouble();
        System.out.print("Enter period in years: ");
        int n = scan.nextInt();


        // calculate the Mortgage
        double rate = r/PERCENT/ MONTHS_IN_A_YEAR;
        double period = n * MONTHS_IN_A_YEAR;

        double result = p * (rate * Math.pow(rate + 1, period)) / (Math.pow(1 + rate, period) -1);

        //format the Mortgage result
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println(mortgageFormatted);






    }
}
