import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   InputStream originalIn = System.in;
   PrintStream originalOut = System.out;
   ByteArrayOutputStream bos = new ByteArrayOutputStream();
   

   
   @BeforeEach
   public void setUp() {
      System.setOut(new PrintStream(bos));
   }

   @AfterEach
   public void tearDown() {
      System.setOut(originalOut);
      System.setIn(originalIn);
   }

   
   
   @Test
   public void testQ1_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("In: Hello\n", bos.toString());
   }

   @Test
   public void testQ1_2()
   {
      
      InputStream originalIn = System.in;
      String data = String.format("Bye", System.lineSeparator());
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("In: Bye\n", bos.toString());      
   }

   @Test
   public void testQ2_1()
   {
      InputStream originalIn = System.in;
      String data = "9\n5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("In: In: 1\n4\n", bos.toString());

   }

   @Test
   public void testQ2_2()
   {
      InputStream originalIn = System.in;
      String data = "9\n3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("In: In: 3\n0\n", bos.toString());

   }

   @Test
   public void testQ3_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("In: Hello was the text you wrote\n", bos.toString());
   }

   @Test
   public void testQ3_2()
   {
      InputStream originalIn = System.in;
      String data = "Bye";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("In: Bye was the text you wrote\n", bos.toString());
   }
   
   @Test
   public void testQ4_1()
   {
      InputStream originalIn = System.in;
      String data = "5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: 25\n", bos.toString());
   }

   @Test
   public void testQ4_2()
   {
      InputStream originalIn = System.in;
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: 0\n", bos.toString());
   }

   @Test
   public void testQ5_1()
   {
      InputStream originalIn = System.in;
      String data = "false\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("In: false is a boolean\n", bos.toString());
   }

   @Test
   public void testQ5_2()
   {
      InputStream originalIn = System.in;
      String data = "true\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("In: true is a boolean\n", bos.toString());
   }
   
   @Test
   public void testQ6_1()
   {
      InputStream originalIn = System.in;
      String data = "3.5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: 0.2999999999999998\n", bos.toString());
   }

   @Test
   public void testQ6_2()
   {
      InputStream originalIn = System.in;
      String data = "9.0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: 5.8\n", bos.toString());
   }
}
