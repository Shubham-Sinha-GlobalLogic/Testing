import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


					Scanner scan = new Scanner(System.in);
					char input=scan.next().charAt(0);

					if((input>='a'&&input<='z') || (input>='A'&&input<='Z')) {

					System.out.println("Alphabet");

					}
					
					else if(input>='0'&&input<='9') {

						System.out.println("Digit");
					
					}
					else 
						System.out.println("Special Symbol");
						
				}

			}

		
