public class SalariedEmployee extends Employee {
    private double s;
    public SalariedEmployee(int id,String n,double tr,double s) {
        super(id,n,tr);
        this.s = s;
    }
    public void setSalary(double s) {
        this.s = s;
    }
    public double getSalary() {
        return this.s;
    }
    public String toString() {
        return super.toString()+" salary = "+CalculateSalary();
    }
    public double CalculateSalary() {
        return s - (s*super.gettaxRate());
    }
}
