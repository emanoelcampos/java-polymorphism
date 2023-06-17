package module6.interfaces.company.management;

public class TestSystem {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setPassword(7777);

        Administrator administrator = new Administrator();
        administrator.setPassword(3333);

        InternalSystem internalSystem = new InternalSystem();
        internalSystem.authenticate(manager);
        internalSystem.authenticate(administrator);
    }
}
