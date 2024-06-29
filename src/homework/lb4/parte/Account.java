package homework.lb4.parte;

abstract class Account {
    String accountId;
    double balance;

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }


    abstract String getAccountID();
    abstract double getBalance();
    abstract double computeUpdatedBalance();
}