import junit.framework.TestCase;

public class BookTest extends TestCase {
  
  public void testSameAuth() {
    Author green = new Author("John Green","M");
    Author rowling = new Author("J.K. Rowling","F");
    
    Book tfios = new Book(green,"The Fault in our Stars",1998);
    Book chamber = new Book(rowling,"Chamber of Secrets",1988);
    
    assertEquals(false,tfios.sameAuth(chamber));
  }
  
  public void testNotSame() {
     Author rowling = new Author("J.K. Rowling","F");
     
      Book chamber = new Book(rowling,"Chamber of Secrets",1988);
      Book stone = new Book(rowling,"Sorcerer's Stone",1988);
      
       assertEquals(true,chamber.sameAuth(stone));
  }
}