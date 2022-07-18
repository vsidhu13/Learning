From Me to Everyone 08:18 PM
hi
From Karuna Karnati to Everyone 08:18 PM
/**
 * 
 */
package variable;

/**
 * @author janu
 *
 */
public class StudentTest {
	
	public static void main(String args[])
	
	{
		
		
		Student stu= new Student();
		
		System.out.println(stu.studentId);
		System.out.println(stu.studentName);
		
		System.out.println(Student.school);
		
		stu.display();
	}}



class  Student
{
	
	
	
	//variable
	//static
	static String school="Brilliant";
	
	int studentId=123;//insatnce varibale
	
	String studentName="sam";//ins
	
	
	
	void display()
	{
    int i=10;//local variable  // method local variable
	System.out.println(i);	
	}
	
	//method
	
	
}
package variable;


class  Employee
{
	
	
	
	//variable
	//static
	static String company="Amazon";
	
	int employeeeId=123;//insatnce varibale
	
	String emploeeName="sam";//ins
	
	
	
	void display()
	{
    int i=10;//local variable  // method local variable
	System.out.println(i);	
	}
	
	//method
	
	
}


public class EmployeeTest {
	
	public static void main(String args[])
	
	{
		
		//comment
		Employee emp= new Employee();
		
		System.out.println(emp.employeeeId);
		System.out.println(emp.emploeeName);
		
		System.out.println(Employee.company);
		
		emp.display();
	}
	
	
	
	

}
