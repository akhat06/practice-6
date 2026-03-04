import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TravelBookingContext context = new TravelBookingContext();

        System.out.println("Choose transport: 1-Plane 2-Train 3-Bus");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> context.setStrategy(new PlaneStrategy());
            case 2 -> context.setStrategy(new TrainStrategy());
            case 3 -> context.setStrategy(new BusStrategy());
            default -> throw new IllegalArgumentException("Invalid transport type");
        }

        TravelRequest request = new TravelRequest(
                1000, 2, "BUSINESS", true, false, true
        );

        double total = context.calculate(request);
        System.out.println("Total cost: " + total);
    }
}
