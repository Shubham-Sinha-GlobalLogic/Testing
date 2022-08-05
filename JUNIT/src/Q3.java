import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class Q3 {



 @Test

 void test() {

 Demo2 d= new Demo2();

 assertTrue(d.palindromeCheck("mom"));

 }

 @Test

 void test1() {

 Demo2 d= new Demo2();

 assertFalse(d.palindromeCheck("mome"));

 }

 @Test

 void test2() {

 Demo2 d= new Demo2();

 assertTrue(d.palindromeCheck("mom"));

 }

}