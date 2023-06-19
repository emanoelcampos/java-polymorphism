package module7.practicing.company.management;

public interface Authenticated {

    void setPassword(int password);

    boolean authenticate(int password);

}
