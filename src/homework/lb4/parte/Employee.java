package homework.lb4.parte;

import java.util.List;

public class Employee {
    String name;
    List<Account> accounts;

    public Employee(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}