package za.co.entelect.utility.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.entelect.utility.math.service.TaxService;

import static junit.framework.Assert.assertEquals;

public class TaxServiceTest {

    private TaxService taxService = new TaxService();

    @Test
    public void calculate1stBracketTaxTest(){
        double income = 60000;
        double result = taxService.calculateYearlyTotalTax(income);

        assertEquals(0.0,result);
    }

    @Test
    public void calculate2ndBracketTaxTest(){
        double income = 240000;
        double result = taxService.calculateYearlyTotalTax(income);

        assertEquals(25965.0,result);
    }

    @Test
    public void calculate1stBracketTaxWithStringTest(){
        String income = "60000";
        double result = taxService.calculateYearlyTotalTax("apple");

        assertEquals(0.0,result);
    }
}
