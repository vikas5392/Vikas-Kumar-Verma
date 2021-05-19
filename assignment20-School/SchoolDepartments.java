
import java.util.Arrays;

class School{
    final String director="dir";
     final String principal="princ";

    void staffMembers(){
        System.out.println("Director:"+this.director);
        System.out.println(("Principal:"+this.principal));
    }
}
class AcademicDepartment extends School {

    String[] HeadOfDepartment ={"Hod1","Hod2","Hod3","Hod4","Hod5"};
    String[] Teachers ={"Teacher1","Teacher2","Teacher3","Teacher4","Teacher5","Teacher6","Teacher7","Teacher8","Teacher9","Teacher10","Teacher11","Teacher12","Teacher13","Teacher14"};


    void staffMembers() {
        System.out.println();
        System.out.println("//Academic Department//");
        System.out.println("Director:"+super.director);
        System.out.println(("Principal:"+super.principal));
        System.out.println("Head of Departments"+ Arrays.toString(HeadOfDepartment));
        System.out.println("Teachers:"+Arrays.toString(Teachers));
        System.out.println();
    }
}
class SportsDepartment extends School{
    String[] coaches={"coach1","coach2","coach3","coach4","coach5"};
    String[] PEteachers={"PE1","PE1","PE1","PE1","PE1","PE1","PE1","PE1","PE1","PE1","PE1","PE1"};
    void staffMembers() {
        System.out.println();
        System.out.println("//Sports Department//");
        System.out.println("Director:"+super.director);
        System.out.println(("Principal:"+super.principal));
        System.out.println("Coaches:"+ Arrays.toString(coaches));
        System.out.println("P.E Teachers:"+Arrays.toString(PEteachers));
        System.out.println();
    }
}

class AdministractionDepartment extends School{
    String accountant;
    String registrar;
    AdministractionDepartment(String a,String r){
        this.accountant=a;
        this.registrar=r;
    }
    void staffMembers() {
        System.out.println();
        System.out.println("//Administration Department//");
        System.out.println("Director:"+super.director);
        System.out.println(("Principal:"+super.principal));
        System.out.println("Accountant:"+ accountant);
        System.out.println("Registrar:"+registrar);
        System.out.println();
    }

}
public class SchoolDepartments {

    public static void main(String[] args) {
AdministractionDepartment ad=new AdministractionDepartment("accnt1","regstrar1");
	AcademicDepartment a=new AcademicDepartment();
	SportsDepartment s=new SportsDepartment();
	a.staffMembers();
s.staffMembers();
ad.staffMembers();
    }
}
