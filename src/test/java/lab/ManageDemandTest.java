package lab;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.util.TestUtil;
import lab.demand.Order;

import java.util.List;

@Test
public class ManageDemandTest {

    private Tax tax;

    private ManageDemand demand;

    @BeforeClass
    public void setup() {
        tax = new Tax();
        demand =  new ManageDemand(tax);
    }
    
    public void test_AllOrdersFromPeru() {
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotal(ordersFromPeru);
        Assert.assertEquals(Math.round(result), 7.0);
    }

    public void test_emptyOrders() {
        List<Order> emptyOrders = TestUtil.buildEmptyOrders();
        double result = demand.calculateTotal(emptyOrders);
        Assert.assertEquals(Math.round(result), 0.0);
    }

    public void test_mixedOrdersWithAdditional() {
        List<Order> mixedOrders = TestUtil.buildMixedOrders();
        double result = demand.calculateTotalForWithAdditionalByCountry(mixedOrders, 0.1, 0.2, 0.3);
        Assert.assertEquals(Math.round(result), 45.0);
    }

}
