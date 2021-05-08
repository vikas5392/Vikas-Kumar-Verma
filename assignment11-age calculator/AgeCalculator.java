
import java.time.LocalDate;

import java.util.Scanner;

class Year{ int yearofbirth;
            int monthofbirth;
            int dayofbirth;

   void age(int y,int m,int d){
       LocalDate datetoday =LocalDate.now();
       int yeartoday=datetoday.getYear();
       int ageyear=yeartoday-y;
       int monthtoday=datetoday.getMonthValue();
       int agemonth=monthtoday-m;
       int daytoday=datetoday.getDayOfMonth();
       int ageday=daytoday-d;

       System.out.println("The age is "+ageyear+" years "+agemonth+" months "+ageday+" days.");
   }
}

public class AgeCalculator {

    public static void main(String[] args) {
        Year objectyear=new Year();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter date of birth (dd/mm/yyyy):");
        String dob=input.next();
        objectyear.dayofbirth=Integer.parseInt(dob.substring(0,2));
        objectyear.monthofbirth=Integer.parseInt(dob.substring(3,5));
        objectyear.yearofbirth=Integer.parseInt(dob.substring(6));

        objectyear.age(objectyear.yearofbirth,objectyear.monthofbirth,objectyear.dayofbirth);

    }
}
