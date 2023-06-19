package module7.practicing.bank.account;

public class TestAccounts {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(113,771377);
        currentAccount.depositFunds(100.0);

        SavingsAccount savingsAccount = new SavingsAccount(171, 137713);
        savingsAccount.depositFunds(200.0);

        currentAccount.transferFunds(savingsAccount, 50.0);

        System.out.println("CC balance: " + currentAccount.getBalance());
        System.out.println("SC balance: " + savingsAccount.getBalance());
    }
}
