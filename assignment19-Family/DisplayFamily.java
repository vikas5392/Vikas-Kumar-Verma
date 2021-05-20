
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FamilyMember{
   String name;
    int age;
    String relation;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    public String toString(){
        return "Relation: "+relation+", Name: "+name+", Age: "+age;
    }
}

class Father extends FamilyMember{
    Father(String n,int a,String r){
        this.name=n;
        this.age=a;
        this.relation=r;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
class Mother extends FamilyMember{
    Mother(String n,int a,String r){
        this.name=n;
        this.age=a;
        this.relation=r;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
class Sister extends FamilyMember{
    Sister(String n,int a,String r){
        this.name=n;
        this.age=a;
        this.relation=r;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}

public class DisplayFamily {

    public static void main(String[] args) {

Father fatherobj=new Father("KK",62,"Father");
Mother motherobj=new Mother("rajeshwari",50,"Mother");
Sister sisterobj=new Sister("Ranjana",26,"Sister");
        List<FamilyMember> arr=new ArrayList<FamilyMember>();
       arr.add(fatherobj);
       arr.add(motherobj);
       arr.add(sisterobj);
        for (FamilyMember i:arr
             ) {
            System.out.println(i);

        }


    }
    }

