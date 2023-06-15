package module3.polymorphism;

public class SoftwareDeveloper extends Employee {
    public double getBonus() {
        System.out.println("bonificação do SD");
        return super.getBonus() + 100;
    }
}
