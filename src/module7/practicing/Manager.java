package module7.practicing;

public class Manager extends Employee implements Authenticated {

    AuthenticatedUtil authenticator;

    public Manager() {
        this.authenticator = new AuthenticatedUtil();
        System.out.println("instancia de authenticator criada");
    }

    @Override
    public double getBonus(){
        return super.getSalary();
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
