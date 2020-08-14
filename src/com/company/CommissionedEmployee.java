public class CommissionedEmployee extends Employee {
    private double s;
    private double cr;
    public CommissionedEmployee(int id,String n,double tr,double s,double cr) {
        super(id,n,tr);
        this.s = s;
        this.cr = cr;
    }
    public void setSales(double s) {
        this.s = s;
    }
    public double getSales() {
        return this.s;
    }
    public void setCommisionrate(double cr) {
        this.cr = cr;
    }
    public double getCommisionrate() {
        return this.cr;
    }
    public String toString() {
        return super.toString()+" Sales =  "+getSales()+" Commision Rate = "+getCommisionrate()+" Salary = "+CalculateSalary();
    }
    public double CalculateSalary() {
        double grosspay = s * cr;
        double tax = grosspay * super.gettaxRate();
        return grosspay - tax;
    }
}
