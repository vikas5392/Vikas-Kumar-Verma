
import java.util.Scanner;

class Choices{
    public void choiceA() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void choiceB(){
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 4- i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) - 1; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

            for(int i=2;i>=1;i--)          //for downward pyramid
            {
                for(int j=1;j<=4-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++)
                {
                    System.out.print("*");
                }System.out.println("");
            }
        }
        public void choiceC(){
            for(int i=4;i>=1;i--)
            {
                for(int j=1;j<=5-i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=(2*i)-1;k++)
                {
                    if(k%2==0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }System.out.println("");
            }

    }
}

public class PrintPattern {

    public static void main(String[] args) {
    Choices choice_object=new Choices();
    Scanner input=new Scanner(System.in);
        System.out.println("Enter choice 'A,B,C'");
        char choiceEntered=input.next().charAt(0);
        if(choiceEntered=='A')
            choice_object.choiceA();
        else if(choiceEntered=='B')
            choice_object.choiceB();
        else if(choiceEntered=='C')
            choice_object.choiceC();
    }
}
