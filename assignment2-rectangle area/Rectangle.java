public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int l,int b){
      length=l;
      breadth=b;
    };
    public int area(){int area1=length*breadth;
        return area1;
    };

    public static void main(String[] args) {
	Rectangle rectangle1=new Rectangle(4,5);
	Rectangle rectangle2=new Rectangle(5,8);

        System.out.println("Area of rectangle1="+rectangle1.area());
        System.out.println("Area of rectangle2="+rectangle2.area());
    }
}
