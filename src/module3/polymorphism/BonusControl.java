package module3.polymorphism;

public class BonusControl {

    private double sumBonus;

    public double getSumBonus() {
        return sumBonus;
    }

    public void registerEmployee(Employee employee){
        double bonus = employee.getBonus();
        this.sumBonus += bonus;
    }
}
