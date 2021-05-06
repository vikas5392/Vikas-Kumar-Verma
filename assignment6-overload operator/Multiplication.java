
import java.util.Scanner;

class Data{
   private int a;
  private  int b;

  public void setA(int a){
      this.a=a;
  }
  public int getA(){
      return a;
  }

    public void setB(int b){
        this.b=b;
    }
    public int getB(){
        return b;
    }

    void find(int x){
        System.out.print(a+"*"+b +"=");
        System.out.print(a*b);
    }


   void find(int p,int q){
       int answer=2*a*b;
       System.out.println(a+"*"+b +"=" +answer);
   }
}

public class Multiplication {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first operand:");
        int num1=input.nextInt();
        System.out.println("Enter second operand:");
        int num2=input.nextInt();
        Data object1=new Data();
        object1.setA(num1);
        object1.setB(num2);

        if(num1!=1&&num2!=1){
            object1.find(num1,num2);
        }else if(num1==1||num2==1){
            if(num1==1)
                object1.find(num2);
            else
                object1.find(num1);
        }

    }
}
