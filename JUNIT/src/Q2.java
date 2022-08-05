

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class Q2 {

 @Test

 void test() {

 ArrayList<String>h1=new ArrayList<>();

 h1.add("Shubham");

 h1.add("Sinha");

 h1.add("Hello");

 Employee e=new Employee();

 assertEquals("FOUND",e.findName(h1, "Shubham"));

 }

}

