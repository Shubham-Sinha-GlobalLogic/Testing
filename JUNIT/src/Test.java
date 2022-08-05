import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
 public static void main(String[] args) throws IOException { 
  String data="Confidential info";
  byte buffer[]=data.getBytes();
  FileOutputStream fos=new  FileOutputStream("d:/temp");
  for(byte d : buffer){
   fos.write(d);  } }}