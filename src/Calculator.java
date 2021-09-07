import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner weeklyEarnings = new Scanner(System.in);
        double hourlyRate, hoursWorked, answer;
        System.out.println("Enter your hourly rate of pay: ");
        hourlyRate = weeklyEarnings.nextDouble();
        System.out.println("Enter how many hours you worked this week: ");
        hoursWorked = weeklyEarnings.nextDouble();
        answer = hourlyRate * hoursWorked;
        System.out.println(answer);
    }
}
