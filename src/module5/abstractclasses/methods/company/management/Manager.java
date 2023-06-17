package module5.abstractclasses.methods.company.management;

public class Manager extends Employee {

    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBonus(){
        System.out.println("bonificação do gerente");
        return super.getSalary();
    }

    public boolean authenticate(int password) {
        //return this.password == password;
        if(this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}
