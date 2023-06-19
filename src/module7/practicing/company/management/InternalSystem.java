package module7.practicing.company.management;

public class InternalSystem {

    private int password = 7777;

    public void authenticate(Authenticated authenticated) {

        boolean authenticate = authenticated.authenticate(this.password);

        if(authenticate) {
            System.out.println("Can log into the system.");
        } else {
            System.out.println("Wrong password! Can not log into the system.");
        }
    }

}
