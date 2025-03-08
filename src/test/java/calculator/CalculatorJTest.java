package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorJTest {
    private final Calculator calculatorUT= new Calculator();

    @Test
    public void testSubtract()
    {
        assertThat(calculatorUT.subtract(-2,2))
                .isEqualTo(-4);
        assertThat(calculatorUT.subtract(2,-2)==4)
                .isTrue()
                .isInstanceOf(Boolean.class);
    }

    @Test
    public void testDivide()
    {
        assertThatThrownBy(() -> calculatorUT.divide(2,2))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Divide by zero");
    }

}
