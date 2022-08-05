
public class Question_2 {

	public static void main(String[] args) {
		
		int num,even;
		for(num=23;num<=57;num++) {
			even=0;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					even=1;
					break;
				}
			}
			if (even==0)
				System.out.println(num);
				
		}

	}

}
