
import java.util.Scanner;

class CircleData{
    private double radius;
   private  String color;
   CircleData(){
       radius=1;
       color="red";
   }

   CircleData(double radius){
      this.radius=radius;
   }
   public double getRadius(){
       double radius = this.radius;
       return radius;
   }

   public double getArea(){
       double area=Math.PI*Math.pow(getRadius(),2);
       return area;
   }
}

public class Circle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Radius.");
        double r=input.nextDouble();
	    CircleData c=new CircleData(r);

        System.out.println("The area of circle of radius "+c.getRadius()+" is "+c.getArea());
    }
}
