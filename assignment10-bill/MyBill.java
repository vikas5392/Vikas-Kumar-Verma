
import java.util.Scanner;

class Data{
    String[][] billformat = new String[5][4];
    final int burgerprice = 80;
    final int pizzaprice = 100;
    final int cokeprice = 50;
    private int nb;
    private int np;
    private  int nc;
    public void setnumberofburger(int nb){
        this.nb=nb;
    }
    public int getnumberofbburgers(){
        return nb;
    }
    public void setnumberofpizza(int np){
        this.np=np;
    }
    public int getnumberofpizza(){
        return np;
    }
    public void setnumberofcoke(int nc){
        this.nc=nc;
    }
    public int getnumberofcoke(){
        return nc;
    }

    public void totalcalculator() {
        int total = nb * burgerprice + np * pizzaprice + nc * cokeprice;
        billformat[4][3] = "    "+Integer.toString(total);
    }

    public void printbill() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(billformat[i][j]);
            }
            System.out.println();

        }
    }
}


public class MyBill {

    public static void main(String[] args) {
        Data objectdata = new Data();
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.print("enter your order(1.Burger,2.pizza,3.coke,4.Print bill):");
            int o = input.nextInt();
            if(o==1){
                objectdata.billformat[i][0]=Integer.toString(i);
                System.out.println("enter number of burgers");
                int nb = input.nextInt();
                objectdata.setnumberofburger(nb);
                objectdata.billformat[i][1] = "    Burger ";
                objectdata.billformat[i][2] = "  " + Integer.toString(objectdata.getnumberofbburgers()) + "         ";
                objectdata.billformat[i][3] = Integer.toString(objectdata.burgerprice);
            }
            if(o==2){
                objectdata.billformat[i][0]=Integer.toString(i);
                System.out.println("enter number of pizzas");
                int np = input.nextInt();
                objectdata.setnumberofpizza(np);
                objectdata.billformat[i][1] = "    Pizza ";
                objectdata.billformat[i][2] = "   " + Integer.toString(objectdata.getnumberofpizza()) + "         ";
                objectdata.billformat[i][3] = Integer.toString(objectdata.pizzaprice);
            }
            if(o==3){
                objectdata.billformat[i][0]=Integer.toString(i);
                System.out.println("enter number of coke");
                int nc = input.nextInt();
                objectdata.setnumberofcoke(nc);
                objectdata.billformat[i][1] = "    Coke ";
                objectdata.billformat[i][2] = "    " + Integer.toString(objectdata.getnumberofcoke()) + "         ";
                objectdata.billformat[i][3] = Integer.toString(objectdata.cokeprice);
            }
            if (o == 4)
                break;
        }





        /*for (int i = 0; i < 3; i++) {

            System.out.print("enter your order(1.Burger,2.pizza,3.coke,4.Print bill):");
            int o = input.nextInt();
            if (o == 1) {
                 objectdata.billformat[1][0]=Integer.toString(i);
                System.out.println("enter number of burgers");
                int noofburgers = input.nextInt();
                objectdata.setnumberofburger(noofburgers);
                objectdata.billformat[1][1] = "    Burger ";
                objectdata.billformat[1][2] = "  " + Integer.toString(objectdata.getnumberofbburgers()) + "         ";
                objectdata.billformat[1][3] = Integer.toString(objectdata.burgerprice);
            }
            if (o == 2) {
            objectdata.billformat[2][0]=Integer.toString(i);
                System.out.println("Enter number of pizza");
                int noofpizza = input.nextInt();
                objectdata.setnumberofpizza(noofpizza);
                objectdata.billformat[2][1] = "    Pizza  ";
                objectdata.billformat[2][2] = "  " + Integer.toString(objectdata.getnumberofpizza()) + "         ";
                objectdata.billformat[2][3] = Integer.toString(objectdata.pizzaprice);
            }
            if (o == 3) {
                System.out.println("Enter number of coke");
                int noofcoke = input.nextInt();
                objectdata.setnumberofcoke(noofcoke);
                objectdata.billformat[2][1] = "    Coke   ";
                objectdata.billformat[3][2] = "  " + Integer.toString(objectdata.getnumberofcoke()) + "         ";
                objectdata.billformat[3][3] = Integer.toString(objectdata.cokeprice);
            }int count = 0;
            if (objectdata.billformat[i + 1][1] != " ") {
               // count++;
               // objectdata.billformat[i + 1][0] = Integer.toString(count);

                if (o == 4)
                    break;
            }
        }*/

            objectdata.billformat[0][0] = "S.No  ";
            objectdata.billformat[0][1] = "Item  ";
            objectdata.billformat[0][2] = "Quantity  ";
            objectdata.billformat[0][3] = "Price";

            objectdata.billformat[4][2] = "        Total(Rs) ";
            objectdata.billformat[4][0] = "-";
            objectdata.billformat[4][1] = "-";
            for (int i = 1; i < 4; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (objectdata.billformat[i][j] == null)
                        objectdata.billformat[i][j] = " ";
                }
            }

            objectdata.totalcalculator();
            objectdata.printbill();

        }


    }

