

public class Employee {
	
	int empId;
	String empName;
	String email;
	float salary;
	Employee(int EmpId,String empName,String email,float salary)
	{
		this.empId=EmpId;
		this.email=email;
		this.empName=empName;
		this.salary=salary;
	}
	
	void GetEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Employee :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("E-mail :"+email);
		System.out.println("Salary :"+salary);
		System.out.println();
	}

}
