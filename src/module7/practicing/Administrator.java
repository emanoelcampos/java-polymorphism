package module7.practicing;

public class Administrator extends Employee implements Authenticated {

    AuthenticatedUtil authenticator;

    public Administrator() {
        this.authenticator = new AuthenticatedUtil();
        System.out.println("instancia de authenticator criada");
    }

    @Override
    public double getBonus() {
        return 50;
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
