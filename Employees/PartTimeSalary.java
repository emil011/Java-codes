import java.math.BigDecimal;
import java.math.RoundingMode;

public class PartTimeSalary extends Employee {
    private BigDecimal salary;

    public PartTimeSalary(String name, String surname, BigDecimal salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public BigDecimal SalaryCount() {
        return salary.divide(BigDecimal.valueOf(2),2, RoundingMode.FLOOR);
    }
}
