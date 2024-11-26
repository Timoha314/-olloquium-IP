import org.example.FactorialGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import java.util.List;

public class FactorialGeneratorTest {

    @Test
    public void testGenerateFactorials() {
        List<BigInteger> expected = List.of(
                BigInteger.ONE,
                BigInteger.valueOf(2),
                BigInteger.valueOf(6),
                BigInteger.valueOf(24),
                BigInteger.valueOf(120),
                BigInteger.valueOf(720),
                BigInteger.valueOf(5040),
                BigInteger.valueOf(40320),
                BigInteger.valueOf(362880),
                BigInteger.valueOf(3628800)
        );

        List<BigInteger> actual = FactorialGenerator.generateFactorials(10);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateFactorialsWithInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialGenerator.generateFactorials(0);
        });

        String expectedMessage = "Input must be a natural number (n >= 1).";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}