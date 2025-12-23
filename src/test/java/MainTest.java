import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Main - Student version
 * These tests help you verify your implementation
 */
public class MainTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    
    @Test
    public void testRegularUser() {
        String input = "20\n300\n";
        
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        Main.main(new String[]{});
        
        String expectedOutput = "Enter age: Enter Bill amount: Normal User\nFinal Bill amount: 300.00";
        
        String actualOutput = outContent.toString().trim();
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testSeniorCitizenWithCappedDiscount() {
        String input = "65\n5678\n";
        
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        Main.main(new String[]{});
        
        String expectedOutput = "Enter age: Enter Bill amount: Senior Citizen\nFinal Bill amount: 5378.00";
        
        String actualOutput = outContent.toString().trim();
        
        assertEquals(expectedOutput, actualOutput);
    }
}