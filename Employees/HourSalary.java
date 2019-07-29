import java.math.BigDecimal;

public class HourSalary extends Employee{

    private BigDecimal hourprice;
    private int hourcount;



    public HourSalary(String name, String surname, BigDecimal hourprice, int hourcount) {
        super(name,surname);
        this.hourprice = hourprice;
        this.hourcount =  hourcount;
    }

    @Override
    public BigDecimal SalaryCount() {
        return hourprice.multiply(BigDecimal.valueOf(hourcount));
    }
}
