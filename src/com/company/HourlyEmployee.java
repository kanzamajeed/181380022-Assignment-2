public class HourlyEmployee extends Employee {
    private double h;
    private double hr;
    public HourlyEmployee(int id, String n, double tr,double h,double hr) {
        super(id,n,tr);
        this.h = h;
        this.hr = hr;
    }
    public void setHours(double h) {
        this.h = h;
    }
    public double getHours() {
        return this.h;
    }
    public void setHourlyrate(double hr) {
        this.hr = hr;
    }
    public double getHourlyrate() {
        return this.hr;
    }
    public String toString() {
        return super.toString()+" Hours = "+getHours()+" hourlyrate = "+getHourlyrate()+" Salary = "+CalculateSalary();

    }
    public double CalculateSalary() {
        double grosspay = h * hr;
        double tax = grosspay * super.gettaxRate();
        return grosspay - tax;
    }
}
