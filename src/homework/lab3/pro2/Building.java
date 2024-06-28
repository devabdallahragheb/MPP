package homework.lab3.pro2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartments;

    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public double calculateProfit() {
        double totalRent = 0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }
}
