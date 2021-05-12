
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class TextFile{
    int choice;
    String textinput;
    void saveText(){
    try {
        if (choice == 1) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the text to be saved in file:");
            String tx = in.nextLine();
            textinput=tx;
            File newfileobject = new File("Myfile.txt");

            newfileobject.createNewFile();
            PrintWriter pw = new PrintWriter(newfileobject);
            pw.print(tx);
            pw.close();
        }
        if (choice == 2) {
            File fileobject = new File("Myfile.txt");

            if (!fileobject.exists()) {
                System.out.println("File doesn't exists!");
            } else {
                System.out.println("The file exists.");
                Scanner findtext=new Scanner(fileobject);
                System.out.println("File Contents:"+findtext.nextLine());}
        }
        }
      catch (IOException e){
        e.printStackTrace();
        }
}

}

public class TextSearch {

    public static void main(String[] args)  {
        Scanner input=new Scanner(System.in);
        TextFile textobject=new TextFile();
        System.out.println("Enter a choice: 1.Save Text 2.Read Text");
         textobject.choice=input.nextInt();
         textobject.saveText();
    }
}