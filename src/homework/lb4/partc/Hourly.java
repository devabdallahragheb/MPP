package homework.lb4.partc;

public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;

    // Constructor
    public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4; // Assuming 4 weeks per month
    }
}