class Passport{
    int passportNo;
    String nationality;
    Passport(int passportNo,String nationality){
	this.passportNo=passportNo;
	this.nationality=nationality;
    }
}
class Person{
    int id;
    String name;
    Passport passport;
    Person(int id,String name,Passport passport){
	this.id=id;
	this.name=name;
	this.passport=passport;
   }
}
public class OneToOne{
    public static void main(String[] args){
	Passport p=new Passport(987456,"Indian");
	Person m=new Person(1,"Krishna",p);
	System.out.println("Person name:"+m.name);
	System.out.println("Passport No:"+m.passport.passportNo);
    }
}