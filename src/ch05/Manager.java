package ch05;

public class Manager extends Empolyee{
    private double bonus;

    @Override//覆盖
    public double getSalary() {
        return getSalary()+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
