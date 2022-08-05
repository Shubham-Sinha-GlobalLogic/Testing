import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee e=new Employee(12341,"Rahul","Rahul@yahoo.in",15000f);
		Employee e1=new Employee(12342,"Soni","Soni@yahoo.in",25000f);
		Employee e2=new Employee(12343,"Monu","Monu@yahoo.in",35000f);
		Employee e3=new Employee(12344,"Sonu","Sonu@yahoo.in",25000f);
		Employee e4=new Employee(12345,"Golu","Golu@yahoo.in",35000f);
		Employee e5=new Employee(12346,"Raj","Raj@yahoo.in",16000f);
		e.GetEmployeeDetails();
		EmployeeDB ed=new EmployeeDB();
		ed.addEmployee(e);
		ed.addEmployee(e1);
		ed.addEmployee(e2);
		ed.addEmployee(e3);
		ed.addEmployee(e4);
		ed.addEmployee(e5);
		System.out.println("Enter Employee-Id to delete his details");
		int emp=scan.nextInt();
		System.out.println("Employee Details deleted:"+ ed.deleteEmployee(emp));
		System.out.println("Enter Employee-ID to show his PaySlip");
		emp=scan.nextInt();
		System.out.println("Employee Pay Slip Details");
		System.out.println(ed.showPaySlip(emp));


	}

}
