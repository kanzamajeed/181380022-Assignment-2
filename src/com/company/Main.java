public class Main {
    public static void main(String[] args) {
        Employee[] e = new Employee[6];
        SalariedEmployee se1 = new SalariedEmployee(101,"ali",2055.02,895.06);
        SalariedEmployee se2 = new SalariedEmployee(102,"afzal",752.55,125.70);
        HourlyEmployee he1 = new HourlyEmployee(103,"fahad",89.96,2.0,78.0);
        HourlyEmployee he2 = new HourlyEmployee(104,"ali",785.78,122.0,589.0);
        CommissionedEmployee ce1 = new CommissionedEmployee(105,"afzal",83.0,7.0,9.0);
        CommissionedEmployee ce2 = new CommissionedEmployee(105,"fahad",7.0,7846.0,78.0);
        e[0] = se1;
        e[1] = se2;
        e[2] = he1;
        e[3] = he2;
        e[4] = ce1;
        e[5] = ce2;
        for(int j=0;j<e.length;j++)
        {
            System.out.println(e[j].CalculateSalary());
        }

    }
}