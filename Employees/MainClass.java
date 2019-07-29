import java.math.BigDecimal;

public class MainClass {

    public static void main(String[] args) {


        Employee emp1 = new MonthSalary("John","Wick", new BigDecimal(3000));

        System.out.println("Name: " + emp1.name +" Surname: " + emp1.surname + " Salary: " + emp1.SalaryCount());

        Employee emp2 = new MonthSalary("Mark","Mask",new BigDecimal(4500) );

        System.out.println("Name: " + emp2.name +" Surname: " +emp2.surname + " Salary " + emp2.SalaryCount());

        Employee emp3 = new ProjectSalary("Donald","Lack",new BigDecimal(24),new BigDecimal(100000));

        System.out.println("Name: " +emp3.name +" Surname " +emp3.surname + " Salary " + emp3.SalaryCount());

        Employee emp4 = new VoenSalary("Cain","Jones",new BigDecimal(6500));

        System.out.println("Name: " +emp4.name +" Surname " + emp4.surname + " Salary " + emp4.SalaryCount());

        Employee emp5 = new PartTimeSalary("Frank","Lips",new BigDecimal(5533));

        System.out.println("Name " +emp5.name +" Surname " + emp5.surname + " Salary " + emp5.SalaryCount());


    }
}
