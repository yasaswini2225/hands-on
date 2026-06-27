import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AAASetupTeardownTest {

    private Calculator calculator;

    // Setup method - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    // Test using Arrange-Act-Assert (AAA) Pattern
    @Test
    public void testAddition() {

        // Arrange
        int a = 15;
        int b = 25;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(40, result);
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object destroyed");
    }
}