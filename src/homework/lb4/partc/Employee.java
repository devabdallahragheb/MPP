package homework.lb4.partc;

public abstract class Employee {
    private String empId;

    // Constructor
    public Employee(String empId) {
        this.empId = empId;
    }

    // Abstract method to calculate gross pay
    public abstract double calcGrossPay(int month, int year);

    // Concrete method to calculate compensation
    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);

        double fica = 0.23 * grossPay;
        double state = 0.05 * grossPay;
        double local = 0.01 * grossPay;
        double medicare = 0.03 * grossPay;
        double socialSecurity = 0.075 * grossPay;

        double netPay = grossPay - (fica + state + local + medicare + socialSecurity);

        return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity, netPay);
    }

   public void print(){
        System.out.println(empId);
    }
}