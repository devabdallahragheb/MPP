package homework.lb4.parte;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> employees) {
        double totalBalance = 0.0;

        for (Employee employee : employees) {
            for (Account account : employee.getAccounts()) {
                totalBalance += account.computeUpdatedBalance();
            }
        }

        return totalBalance;
    }
}