package module7.practicing.bank.account;

public class TestTax {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount(131, 77777);
        currentAccount.depositFunds(1000);

        LifeInsurance lifeInsurance = new LifeInsurance();

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.register(currentAccount);
        taxCalculator.register(lifeInsurance);

        System.out.println(taxCalculator.getTotalTax());
    }
}
