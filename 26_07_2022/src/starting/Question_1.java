package starting;

class Employee {



 int empId;
 float salary;  
 String empName, address, gender, email;  

  

  

 public int getEmp_id() {  

   return empId;  

 }  

 public void setEmp_id(int emp_id) {  

   this.empId = emp_id;  

 }  

 public float getSalary() {  

   return salary;  

 }  

 public void setSalary(int salary) {  

   this.salary = salary;  

 }  

 public String getName() {  

   return empName;  

 }  

 public void setName(String name) {  

   this.empName = name;  

 }  

 public String getAddress() {  

   return address;  

 } public void setAddress(String address) {  

   this.address = address;  

 }  

 public String gender() {  

   return gender;  

 }  

 public void setGender(String gender) {  

   this.gender = gender;  

 }  

 public String getEmail() {  

   return email;  

 }  

 public void setEmail(String email) {

 this.email=email;

 }

 @Override  

 public String toString() {  

   return "Employee [emp_id = " + empId + ", salary = " + salary + ", name = " + empName + 
       ", gender = " + gender + ", email = " + email + "]";  

   }  

    

 }  

	

 public class Question_1{  

   

   public static void main(String args[]) {  

      

     

	   Employee emp = new Employee();  

     

     emp.setEmp_id(2527012);  

     emp.setName("Shubham");  

     emp.setGender("Male");  

     emp.setSalary(15000);  

     emp.setAddress("New Delhi");  

     emp.setEmail("shubham@gmail.com");  

      

     

     System.out.println(emp);  

  



 }



}