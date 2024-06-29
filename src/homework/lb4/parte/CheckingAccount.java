package homework.lb4.parte;

public class CheckingAccount extends Account {
    double monthlyFee;
    double balance;
    String accId;
    public CheckingAccount(String accId, double balance, double monthlyFee) {
        super(accId, balance);
        this.monthlyFee = monthlyFee;
        this.balance = balance;
        this.accId = accId;
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
        return balance - monthlyFee;
    }
}