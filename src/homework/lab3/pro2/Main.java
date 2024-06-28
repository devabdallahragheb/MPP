package homework.lab3.pro2;

public class Main {
    public static void main(String[] args) {
        // Create apartments
        Apartment apartment1 = new Apartment(300);
        Apartment apartment2 = new Apartment(200);
        Apartment apartment3 = new Apartment(500);

        // Create buildings
        Building building1 = new Building(23333);
        Building building2 = new Building(78888);

        // Add apartments to buildings
        building1.addApartment(apartment1);
        building1.addApartment(apartment2);
        building2.addApartment(apartment3);

        // Create landlord and add buildings
        Landlord landlord = new Landlord();
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);

        // Calculate total profit
        double totalProfit = landlord.calculateTotalProfit();
        System.out.println("Total Profit: $" + totalProfit);
    }
}
