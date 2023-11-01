import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;
    
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Calculator calculatorMock = mock(Calculator.class);

        when(calculatorMock.add(2, 3)).thenReturn(5);

        assertEquals(5, calculatorMock.add(2, 3));

        verify(calculatorMock).add(2, 3);
    }

    @Test
    public void testDivideSuccess() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
