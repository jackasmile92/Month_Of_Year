package test;

import static org.junit.Assert.*;

import org.junit.Test;
import src.MonthOfYear;
public class MonthOfYearTest {
	@Test
    public void testGetAmountofDays() {
        assertEquals(31, MonthOfYear.DECEMBER.getAmountofDays(2000));
        assertEquals(28, MonthOfYear.FEBRUARY.getAmountofDays(1900));
        assertEquals(29, MonthOfYear.FEBRUARY.getAmountofDays(2000));
    }
    @Test
    public void testGetNextMonth(){
        assertEquals(MonthOfYear.FEBRUARY, MonthOfYear.JANUARY.getNextMonth());
        assertEquals(MonthOfYear.JANUARY, MonthOfYear.DECEMBER.getNextMonth());
    }
}
