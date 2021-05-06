
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number:");
        float number1=input.nextFloat();

        System.out.println("Enter second number:");
        float number2=input.nextFloat();

        float sum= number1 + number2 ;
        float subtract=number1-number2;
        float multiplication=number1 * number2;
        float division=number1/number2;

        System.out.println("The sum of "+number1+" and "+number2+" is "+sum);
        System.out.println("The subtraction of "+number1+" and "+number2+" is "+subtract);
        System.out.println("The multiplication of "+number1+" and "+number2+" is "+multiplication);
        System.out.println("The division of "+number1+" and "+number2+" is "+division);
    }
}

