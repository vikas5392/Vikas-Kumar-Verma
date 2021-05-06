
import java.util.Scanner;
class Employee {
    private int yearofservice;
    private float salary;

    public void setYearofservice(int y){
        yearofservice=y;
    }
    public int getYearofservice(){
        return yearofservice;
    }
    public void setSalary(float s){
        salary=s;
    }
    public float getSalary(){
        return salary;
    }
    public void bonus(float x){
        float b=((float)5/(float)100)*x;
        System.out.println("Bonus:"+b);
    }
    public void bonus(){
        System.out.println("Bonus:0");
    }
}
public class BonusCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year of service: ");
        int year = input.nextInt();

        System.out.println("Enter salary:");
        float sal = input.nextFloat();

        Employee employee1 = new Employee();
        employee1.setYearofservice(year);
        employee1.setSalary(sal);
        System.out.println("Year of Service:"+employee1.getYearofservice());
        System.out.println("Salary:"+employee1.getSalary());

        if (employee1.getYearofservice() <= 5)
            employee1.bonus();
         else
            employee1.bonus(employee1.getSalary());

    }
}
