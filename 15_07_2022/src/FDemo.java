 class A

{

  void disp()

 {

 System.out.println("display method");

 }

}

public class FDemo extends A

{

final double pi;

FDemo()

 {

 pi=3.144;

 }

 void disp()

 {

 //pi=3.22;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}















