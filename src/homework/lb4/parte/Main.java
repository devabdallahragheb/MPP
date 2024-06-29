package homework.lb4.parte;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checking1 = new CheckingAccount("A1", 555, 333);
        SavingsAccount savings1 = new SavingsAccount("s1", 6666, 0.07777);

        Employee emp1 = new Employee(Arrays.asList(checking1, savings1));

        CheckingAccount checking2 = new CheckingAccount("c2", 34444, 444);
        SavingsAccount savings2 = new SavingsAccount("s2", 44444, 0.444);

        Employee emp2 = new Employee(Arrays.asList(checking2, savings2));

        List<Employee> employees = Arrays.asList(emp1, emp2);

        double totalUpdatedBalance = Admin.computeUpdatedBalanceSum(employees);

        System.out.println("Total Updated Balance: " + totalUpdatedBalance);
    }
}