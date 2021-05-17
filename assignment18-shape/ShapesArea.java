
import java.util.Scanner;

 abstract class Shape{
    int[] dimension;
abstract int area();
}

class Triangle extends Shape{
int base;
int height;

    int area(){
int a=this.base*this.height;
return a;
    }
 }

class Rectangle extends Shape{
     int length;
     int breadth;

int area(){
int a=this.length*this.breadth;
return a;
}
}

class Circle extends Shape{
     int radius;
int area(){
int a= (int) (3.14*Math.pow(this.radius,2));
return a;
    }
}

class Square extends Shape{
     int length;
int area(){
int a=(int)Math.pow(this.length,2);
  return a;  }
}


public class ShapesArea {

    public static void main(String[] args) {

      Triangle triangleobject=new Triangle();
      Rectangle rectangleobject=new Rectangle();
       Circle circleobject=new Circle();
       Square squareobject=new Square();

        System.out.println("Enter dimensions separated by single space(minimum number of dimension=3, maximum number of dimension=6)");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String[] check = x.split(" ");
        int len = check.length;
        int[] intarr = new int[len];
        for (int i = 0; i < len; i++) {
            intarr[i] = Integer.parseInt(check[i]);
        }
        if (len==3){
            System.out.println("This is a triangle.");
         triangleobject.base=intarr[0];
            triangleobject.height=intarr[1];
            System.out.println("Area="+ triangleobject.area());
        }
       else if (len==4){
            System.out.println("This is a rectangle.");
            rectangleobject.breadth=intarr[2];
            rectangleobject.length=intarr[3];
            System.out.println("Area="+ rectangleobject.area());
        }
       else if (len==5){
            System.out.println("This is a circle.");
            circleobject.radius=intarr[2];
            System.out.println("Area="+ circleobject.area());
        }
       else if (len==6){
            System.out.println("This is a square.");
           squareobject.length=intarr[5];
            System.out.println("Area="+ squareobject.area());
        }
        else
            System.out.println("You entered wrong number of dimensons!!!!");

    }
}
