public abstract class Employee {
    private int id;
    private String n;
    private double tr;
    public Employee() {

    }
    public Employee(int id, String n, double tr) {
        this.id = id;
        this.n = n;
        this.tr = tr;
    }
    public void setid(int id) {
        this.id = id;
    }
    public int getid() {
        return this.id;
    }
    public void setName(String n) {
        this.n = n;
    }
    public String getName() {
        return this.n;
    }
    public void settexRate(double tr) {
        this.tr = tr;
    }
    public double gettaxRate() {
        return this.tr;
    }
    public abstract double CalculateSalary();
    public String toString() {
        return "id = "+getid()+" Name = "+getName()+" Tax Rate = "+gettaxRate();
    }
}
