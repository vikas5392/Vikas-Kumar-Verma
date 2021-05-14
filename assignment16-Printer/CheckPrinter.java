
abstract class Message{
    abstract void showmessage() ;
}
class Printer {

    class PrintDetail{                   //(Printer/PrintDetail ): Member inner class

        class Features {                     //(Printer/PrintDetail/Features :Member inner class
            void checkPrintSpeed() {
                int monospeed = 20;
                int colorspeed = 15;
                class ColorBasedSpeed {             //CheckPrintSpeed()/ColorBasedSpeed  :local inner class
                    void printSpeed() {
                        System.out.println("Mono Print Speed=" + monospeed);
                        System.out.println("Color Print Speed=" + colorspeed);
                    }
                }
                ColorBasedSpeed CBS = new ColorBasedSpeed();
                CBS.printSpeed();
            }
        }
    }
    static class Brand{                              //Printer/Brand  :static inner class
        void showBrand(){
            System.out.println("Get brand Name");
        }
    }

    }
    public class CheckPrinter {  public static void main(String[] args) {

      Message m=new Message()
        { void showmessage(){                                   //Anonymous inner class inside main method
        System.out.println("Showing Printer Details");
    }
    };
	m.showmessage();
        Printer.PrintDetail.Features featuresobj=new Printer().new PrintDetail().new Features();

	    featuresobj.checkPrintSpeed();
            Printer.Brand brandobj=new Printer.Brand();
             brandobj.showBrand();
    }
}
