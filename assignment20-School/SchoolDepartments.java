
import java.util.ArrayList;
import java.util.List;

class Department{String employeeName;
    int employeeId;
    String departmentname;
    void addEmployee(String En,int Eid){
        System.out.println("Employee name:"+En);
        System.out.println("Employee ID:"+Eid);
    }
    void addEmployee(String En){
        System.out.println("Employee Name:"+En);
    }
    public String toString(){
        return "Department: "+departmentname+", Employee Name : "+employeeName+" , Employee ID: "+employeeId;
    }
}
class Employee{
String departmentcode;
String designation;
String departmentName;
int numberofemployee;
void addDepartmentDetail(String dn){
    System.out.println("Under the Department:"+dn);
}
    void addDepartmentDetail(String dn,String dc,int ne){
        System.out.println("Under the Department:"+dn);
        System.out.println("Department code:"+dc);
        System.out.println("Total numbers:"+ne);
    }
    public String toString(){
        return "Deesignation: "+designation+", Department : "+departmentName+" , Number of Employees: "+numberofemployee;
    }
}
class Academic extends Department{

Academic(String n,int id,String dn){
    this.employeeName=n;
    this.employeeId=id;
    this.departmentname=dn;
}
}
class Administration extends Department{
Administration(String n,int id,String dn){
    this.employeeName=n;
    this.employeeId=id;
    this.departmentname=dn;
}
}
class Teacher extends Employee{
    Teacher(String dn,int ne,String des ){

        this.departmentName=dn;
        this.numberofemployee=ne;
        this.designation=des;
    }

}
class LabAssistant extends Employee{
    LabAssistant(String dn,int ne,String des ){

        this.departmentName=dn;
        this.numberofemployee=ne;
        this.designation=des;
    }
}
    class Clerk extends Employee{
        Clerk(String dn,int ne ,String des){

            this.departmentName=dn;
            this.numberofemployee=ne;
            this.designation=des;
        }
    }


public class SchoolDepartments {

    public static void main(String[] args) {
	    Academic academicemployee1=new Academic("kartik",29,"Academic");
        Academic academicemployee2=new Academic("Seema",27,"Academic");

        Administration administrationemployee1=new Administration("sahil",39,"Administration");
        Administration administrationemployee2=new Administration("suraj",17,"Administration");


        List<Department> departmentarray=new ArrayList<Department>();
        departmentarray.add(academicemployee1);
        departmentarray.add(academicemployee2);

        departmentarray.add(administrationemployee1);
        departmentarray.add(administrationemployee2);
        for (Department i:departmentarray
             ) {
            System.out.println(i);
        }
        System.out.println();
            Teacher teacher=new Teacher("Academic",28,"Teacher");
            LabAssistant la=new LabAssistant("Academic",34,"Lab Assistant");
            Clerk ck=new Clerk("Administration",12,"Clerk");

            List<Employee> employeearray=new ArrayList<Employee>();
            employeearray.add(teacher);
            employeearray.add(la);
            employeearray.add(ck);
            for (Employee e:employeearray
                 ) {
                System.out.println(e);

            }

        }

    }

