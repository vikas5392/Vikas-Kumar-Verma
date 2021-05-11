
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Age{
    String dob;
    void ageFinder() {

                LocalDate localdateofbirth=LocalDate.parse(dob);
                LocalDate todaysdate=LocalDate.now();

        int years=Period.between(localdateofbirth,todaysdate).getYears();
        int months=Period.between(localdateofbirth,todaysdate).getMonths();
        int days=Period.between(localdateofbirth,todaysdate).getDays();

        System.out.println("Your age is "+years+ " years "+months+ " months "+ days+" days.");
    }
}

public class AgeCalculator {

    public static void main(String[] args) {
        Age object=new Age();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your date of birth(yyyy-mm-dd)");
        object.dob=input.next();
        object.ageFinder();
    }
}
