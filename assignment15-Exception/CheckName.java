
import java.util.Scanner;

class NoSalutationException extends Exception{
    public NoSalutationException (String s)
    {
        super(s);
    }
}
class Data{
    String name;
    void checkName(){
       String substring=name.substring(0,2);
        String salutation=new String("Mr");
        if(!substring.equals("Mr")){
            try {
                throw new NoSalutationException("No salutation found");
            } catch (NoSalutationException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("No Exception!! , Entered name:"+name);
    }
}

public class CheckName {
    public static void main(String[] args)  {
      Data dataobject=new Data();
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your name");
           String myname = input.nextLine();
           dataobject.name=myname;
           dataobject.checkName();

         }
    }

