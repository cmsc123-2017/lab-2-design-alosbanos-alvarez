import junit.framework.TestCase;


public class ExamGradesTest extends TestCase {
  

  public void testCreateExamGrades() {
    double grades[] = new double[10];
    
    for(int i = 0; i < 10; i++){
      grades[i] = 100 - i;
    }
  
  ExamGrades g = new ExamGrades(grades);
  
  assertEquals(100.0, g.grades[0]);
  assertEquals(91.0, g.grades[9]);
  }
}
