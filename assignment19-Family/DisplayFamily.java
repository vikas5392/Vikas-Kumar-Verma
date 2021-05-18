
abstract class Family{             

    private String name;           
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    abstract  void familyMemberDetail();    //overloading
}

class Father extends Family{                 
   private String profession;

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getProfession(){
        return profession;
    }
    Father(String n,int a,String p){
        setName(n);
        setAge(a);
        setProfession(p);
    }
    void familyMemberDetail(){
        System.out.println("||Father||");
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Profession:"+getProfession());
        System.out.println();
    }
}

class Mother extends Family{
private String occupation;
public void setOccupation(String occupation){
    this.occupation=occupation;
    }
    public String getOccupation(){
    return occupation;
    }
    Mother(String n,int a,String o){
        setName(n);
        setAge(a);
        setOccupation(o);
    }
    void familyMemberDetail(){
        System.out.println("||Mother||");
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Profession:"+getOccupation());
        System.out.println();
    }
}

class Sister extends Family{
    private String qualification;
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public String getQualification(){
        return this.qualification;
    }

Sister(String n,int a,String q){
        setName(n);
        setAge(a);
        setQualification(q);
    }
    void familyMemberDetail(){
        System.out.println("||Sister||");
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Qualification:"+getQualification());
        System.out.println();
    }
}

class GrandMother extends Family{
    private String ChronicIllness;

    public void setChronicIllness(String ChronicIllness){
        this.ChronicIllness=ChronicIllness;
    }
    public String getMedicinesTakenFor(){
        return this.ChronicIllness;
    }
    GrandMother(String n,int a,String i){
        setName(n);
        setAge(a);
        setChronicIllness(i);
    }
    void familyMemberDetail(){
        System.out.println("||GrandMother||");
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Taking medicines for:"+getMedicinesTakenFor());
        System.out.println();
    }
}
public class DisplayFamily {

    public static void main(String[] args) {
	Father fatherobject=new Father("Swapnil Rao",60,"BSNl employee");
	Mother motherobject=new Mother("Swati Rao",51,"Family Manager");
	Sister sisterobject=new Sister("Ananya Rao",26,"M.Tech");
	GrandMother grandmotherobject=new GrandMother("Sumitra Rao",82,"Diabetes");
	fatherobject.familyMemberDetail();
	motherobject.familyMemberDetail();
	sisterobject.familyMemberDetail();
	grandmotherobject.familyMemberDetail();
    }
}
