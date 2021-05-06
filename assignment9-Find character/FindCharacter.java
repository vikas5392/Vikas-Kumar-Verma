
import java.util.Scanner;

class Data{
    String inputCharacter;

  void whichCharacter(){
     char[] elements= new char[inputCharacter.length()]; //copied the elements of input string into char elements[]
     inputCharacter.getChars(0,inputCharacter.length(),elements,0);
      int count=0;
      for(int i=0;i<elements.length;i++) {          //checking every elements of elements[] if they are digits
          if (Character.isDigit(elements[i]))
              count++;
      }
      if(count==elements.length)
      System.out.println(inputCharacter+" is a number.");

//now as we are sure input is not digit we check if its string or character
      else{
          if(inputCharacter.length()==1)
          {
              if((int)(elements[0])>=0&&(int)(elements[0])<=127)                //character has ascii codes
                  System.out.println(inputCharacter+" is a character.");
              else
                  System.out.println(inputCharacter+" is a string.");
          }
          else
              System.out.println(inputCharacter+" is a string.");
      }
  }
}
public class FindCharacter  {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a character:");
        String character=input.next();

        Data objectData=new Data();
         objectData.inputCharacter=character;
         objectData.whichCharacter();

    }
}