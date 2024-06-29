package homework.lb4.parte;

public class SavingsAccount extends Account {
    double interestRate;
String accId;
    double balance;

    public SavingsAccount(String accId, double balance, double interestRate) {
        super(accId, balance);
        this.accId=accId;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    String getAccountID() {
        return accId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}