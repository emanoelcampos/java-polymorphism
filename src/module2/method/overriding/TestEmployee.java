package module2.method.overriding;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emanoel = new Employee();
        emanoel.setName("Emanoel Campos");
        emanoel.setSalary(5400.0);

        double bonus = emanoel.getBonus();

        System.out.println(emanoel.getName());
        System.out.println(bonus);

    }
}
