package module1.inheritance.introduction;

public class Manager extends Employee {

    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    /*
    public double getBonus(){
        return this.salary;
    }
     */

    public boolean authenticate(int password) {
        //return this.password == password;
        if(this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}
