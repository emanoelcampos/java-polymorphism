package module6.interfaces.company.management;

public class TestReference {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setSalary(5000);

        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();
        softwareDeveloper.setSalary(3500);

        Designer designer = new Designer();
        designer.setSalary(2800);

        BonusControl bonusControl = new BonusControl();
        bonusControl.registerEmployee(manager);
        bonusControl.registerEmployee(softwareDeveloper);
        bonusControl.registerEmployee(designer);

        System.out.println(bonusControl.getSumBonus());
    }
}
