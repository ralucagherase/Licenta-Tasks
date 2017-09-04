import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathServiceTest {

    @Test
    public void leap_year_should_be_divisible_by_four()
    {
        assertTrue(MathService.isLeapYear(2016));
    }
}
