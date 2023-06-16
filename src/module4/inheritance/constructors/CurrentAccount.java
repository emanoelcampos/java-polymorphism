package module4.inheritance.constructors;

public class CurrentAccount extends Account{

    public CurrentAccount(int branchNumber, int accountNumber) {
        super(branchNumber, accountNumber);
    }

    @Override
    public boolean withdrawFunds(double amount) {
        //double withdrawFundsWithTax = amount + 0.2;
        amount += 0.2;
        return super.withdrawFunds(amount);
    }
}
