
import java.util.Scanner;

class Notes{
    private int noOf10RsNotes;
    private int noOf20RsNotes;
   private  int noOf50RsNotes;
    private int noOf100RsNotes;

    public void setNoOf10RsNotes(int noOf10RsNotes) {
        this.noOf10RsNotes = noOf10RsNotes;
    }
    public int getNoOf10RsNotes() {
        return noOf10RsNotes;
    }
    public void setNoOf20RsNotes(int noOf20RsNotes) {
        this.noOf20RsNotes = noOf20RsNotes;
    }
    public int getNoOf20RsNotes() {
        return noOf20RsNotes;
    }
    public void setNoOf50RsNotes(int noOf50RsNotes) {
        this.noOf50RsNotes = noOf50RsNotes;
    }
    public int getNoOf50RsNotes() {
        return noOf50RsNotes;
    }
    public void setNoOf100RsNotes(int noOf100RsNotes) {
        this.noOf100RsNotes = noOf100RsNotes;
    }
    public int getNoOf100RsNotes() {
        return noOf100RsNotes;
    }
    int moneyCalculator(int notes10, int notes20, int notes50, int notes100){
      int total=10*notes10+20*notes20+50*notes50+100*notes100;
      return total;
    }

}
public class TotalMoney {

    public static void main(String[] args) {
        Notes notesobject = new Notes();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of notes :number of 10 rs notes, number of 20 rs notes,number of 50 rs notes,number of 100 rs notes.");
       int n10 = input.nextInt();
       notesobject.setNoOf10RsNotes(n10);
        int n20 = input.nextInt();
        notesobject.setNoOf20RsNotes(n20);
        int n50 = input.nextInt();
        notesobject.setNoOf50RsNotes(n50);
        int n100 = input.nextInt();
        notesobject.setNoOf100RsNotes(n100);

        System.out.println("Number of 10 rs notes:" + notesobject.getNoOf10RsNotes());
        System.out.println("Number of 20 rs notes:" + notesobject.getNoOf20RsNotes());
        System.out.println("Number of 50 rs notes:" + notesobject.getNoOf50RsNotes());
        System.out.println("Number of 100 rs notes:" + notesobject.getNoOf100RsNotes());
        System.out.println();
        int t=notesobject.moneyCalculator(notesobject.getNoOf10RsNotes() ,notesobject.getNoOf20RsNotes(),notesobject.getNoOf50RsNotes(),notesobject.getNoOf100RsNotes());
        System.out.println("Total monetary value: Rs "+t);
    }
}