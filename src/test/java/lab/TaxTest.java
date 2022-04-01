package lab;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lab.demand.Tax;

@Test
public class TaxTest {

    private Tax tax;
    @BeforeClass
    public void setup() {
        tax = new Tax();
    }

    public void test_PeruTax() {
        double peruTax = tax.calculateTax("PE");
        Assert.assertEquals(peruTax, 0.18);
    }

    public void test_brazilTax() {
        double brazilTax = tax.calculateTax("BR");
        Assert.assertEquals(brazilTax, 0.12);
    }
    
    public void test_colombiaTax() {
        double colombiaTax = tax.calculateTax("CO");
        Assert.assertEquals(colombiaTax, 0.0);
    }
}
