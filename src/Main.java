import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Calculate fuel for a trip");
        System.out.println("2. Calculate car fuel average");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Enter distance (km):");
            double distance = scanner.nextDouble();

            System.out.println("Enter car fuel average (km/l):");
            double fuelAverage = scanner.nextDouble();

            System.out.println("Enter fuel price (per liter):");
            double fuelPrice = scanner.nextDouble();

            double fuelUsed = distance / fuelAverage;
            double totalCost = fuelUsed * fuelPrice;

            System.out.println("Fuel used: " + fuelUsed + " liters");
            System.out.println("Total cost: " + totalCost + " units");
        } else if (option == 2) {
            System.out.println("Enter total distance traveled (km):");
            double totalDistance = scanner.nextDouble();

            System.out.println("Enter total fuel consumed (liters):");
            double totalFuel = scanner.nextDouble();

            double fuelAverage = totalDistance / totalFuel;

            System.out.println("Car fuel average: " + fuelAverage + " km/l");
        } else {
            System.out.println("Invalid option. Please select 1 or 2.");
        }
    }
    }