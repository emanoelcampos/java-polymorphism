package module6.interfaces.company.management;

public class Client implements Authenticated{

    private int password;

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
