class Department{
    int deptId;
    String deptName;
        Department(int deptId,String deptName){
	this.deptId=deptId;
	this.deptName=deptName;
    }
}
class Employee{

    int id;
    String empName;
    Department dept;
    Employee(int empId,String empName,Department dept){
	this.id=id;
	this.empName=empName;
	this.dept=dept;
    }
}
public class ManyToOne{
    public static void main(String[] args){
	Department dept=new Department(101,"CSE");
	Employee e1=new Employee(1,"Ravi",dept);
	Employee e2=new Employee(2,"Nandu",dept);
	Employee e3=new Employee(3,"Navya",dept);
	System.out.println(e1.empName+" works in "+e1.dept.deptName);
	System.out.println(e2.empName+" works in "+e2.dept.deptName);
	System.out.println(e3.empName+" works in "+e3.dept.deptName);
    }
}
