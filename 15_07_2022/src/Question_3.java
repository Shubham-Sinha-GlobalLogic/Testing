public class Question_3 {  
       String patientName;  
       double height, weight;  
       Question_3(String name, double height, double weight){  
            this.patientName = name;  
            this.height = height;  
            this.weight = weight;  
       }  
       double computeBMI() {  
             
            return ( weight / ( height * height ) ) * 703;  
       }  
       public static void main(String[] args) {  
            // TODO Auto-generated method stub  
            Question_3 patient = new Question_3("XYZ", 177/2.54, 59*2.2);  
            System.out.println("Name: " + patient.patientName + "\nBMI: " + patient.computeBMI());  
      }  
}