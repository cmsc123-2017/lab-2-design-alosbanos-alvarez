import junit.framework.TestCase;

public class AuthorTest extends TestCase {
  
   public void testSame() {
     Author green = new Author("John Green","M");
     Author green1 = new Author("John Green","M");
     
     assertTrue(green.equals(green1));
  }
  public void testNotSame() {
    Author green = new Author("John Green","M");
    Author rowling = new Author("J.K. Rowling","F");
    
    assertFalse(green.equals(rowling));
  }
  
 
}