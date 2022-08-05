public class Question_1 {  
       private double width;  
       private double height;  
	       private double depth;  
	       Question_1(int width, int height, int depth){  
	            this.width = width;  
                this.height = height;  
                this.depth = depth;  
	      }  
	       double getVolume() {  
	            return width * height * depth;  
	       }  
	       public static void main(String[] args) {  
	            // TODO Auto-generated method stub  
	            Question_1 box = new Question_1(10, 20, 30);  
	            System.out.print("The volume of Box is " + box.getVolume());  
	       }  
	 }