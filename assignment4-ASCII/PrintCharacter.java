
class FindCharacter {
    private int newcode;

    public void setcode(int n) {
        newcode = n;
    }

    public int getcode() {
        return newcode;
    }

    public char newCharacter(int a) {
        return (char) a;
    }
    }
   public class PrintCharacter{
    public static void main(String[] args) {

       FindCharacter object1=new FindCharacter();
       object1.setcode((int)'d'+3);
       System.out.println("The new character after adding 3 to ASCII code of 'd' is "+object1.newCharacter(object1.getcode()));

    }
    }
