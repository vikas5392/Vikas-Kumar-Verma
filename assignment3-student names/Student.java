
 public class Student{
    public static void main(String[] args) {
        Data student1=new Data();
        System.out.println(student1.studentName);

         Data student2=new Data("Vikas Kumar") ;
        System.out.println(student2.studentName);
    }
}
 class Data {

    String studentName;

    public Data(String name) {
        studentName = name;
    }

    public Data() {
        studentName = "unknown";
    }
}