package module7.practicing.bank.account;

public class SavingsAccount extends Account {

    public SavingsAccount(int branchNumber, int accountNumber) {
        super(branchNumber, accountNumber);
    }

    @Override
    public void depositFunds(double amount) {
        super.balance += amount;
    }
}
