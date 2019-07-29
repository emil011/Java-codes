import java.math.BigDecimal;

public class VoenSalary extends Employee {

    private BigDecimal Total;

    public VoenSalary(String name, String surname, BigDecimal Total) {
        super(name, surname);
        this.Total = Total;
    }

    @Override
    public BigDecimal SalaryCount() {
        return Total;
    }
}
