package module1.inheritance.introduction;

public class TestManager {

    public static void main(String[] args) {

        Manager emanoel = new Manager();
        emanoel.setName("Emanoel Campos");
        emanoel.setSalary(7400.0);

        System.out.println(emanoel.getName());
        System.out.println(emanoel.getSalary());

        emanoel.setPassword(7733);
        boolean authManager = emanoel.authenticate(emanoel.getPassword());

        System.out.println(authManager);

    }
}
