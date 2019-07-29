import java.math.BigDecimal;

public class Employee {
    protected String name;
    protected String surname;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public BigDecimal SalaryCount() {
        return BigDecimal.ZERO;
    }
}
