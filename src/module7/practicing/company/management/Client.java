package module7.practicing.company.management;

public class Client implements Authenticated {

    AuthenticatedUtil authenticator;

    public Client() {
         this.authenticator = new AuthenticatedUtil();
        System.out.println("instancia de authenticator criada");
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }
}
