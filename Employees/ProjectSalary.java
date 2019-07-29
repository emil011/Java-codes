import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProjectSalary extends Employee {
    private BigDecimal term;
    private BigDecimal budget;

    public ProjectSalary(String name, String surname, BigDecimal term, BigDecimal budget) {
        super(name,surname);
        this.term = term;
        this.budget = budget;
    }

    @Override
    public BigDecimal SalaryCount() {
        return budget.divide(term,2, RoundingMode.FLOOR);
    }

}
