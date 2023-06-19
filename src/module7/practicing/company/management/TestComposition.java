package module7.practicing.company.management;

public class TestComposition {

    public static void main(String[] args) {

        Client client = new Client();
        client.setPassword(7777);

        //Administrator administrator = new Administrator();
        //administrator.setPassword(1313);

        //Manager manager = new Manager();
        //manager.setPassword(7777);

        InternalSystem internalSystem = new InternalSystem();
        internalSystem.authenticate(client);
    }
}
