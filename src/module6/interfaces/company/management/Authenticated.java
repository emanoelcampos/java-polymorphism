package module6.interfaces.company.management;

public interface Authenticated {

    void setPassword(int password);

    boolean authenticate(int password);

}
