

import java.util.*;

public class Employee {

 public String findName(ArrayList<String> employee ,String name)

 {

 String result="";

  if(employee.contains(name)){

  result="FOUND";

  }else{

  result="NOT FOUND";

  }

  return result;

 }

}

