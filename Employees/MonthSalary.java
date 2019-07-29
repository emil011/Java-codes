import java.math.BigDecimal;

public class MonthSalary extends Employee {
    private BigDecimal salary;

    public MonthSalary(String name, String surname, BigDecimal salary) {
        super(name,surname);
        this.salary = salary;

    }
    @Override
    public BigDecimal SalaryCount() {
        return salary;
    }
}
