package module6.interfaces.company.management;

public class Manager extends Employee implements Authenticated {

    private int password;

    public double getBonus(){
        return super.getSalary();
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
        if(this.password == password) {
            return true;
        } else {
            return false;
        }
    }
}
