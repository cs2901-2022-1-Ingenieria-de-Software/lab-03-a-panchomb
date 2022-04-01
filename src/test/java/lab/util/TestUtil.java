package lab.util;

import java.util.List;
import java.util.ArrayList;

import lab.demand.Order;

public class TestUtil {

    public static List<Order> buildOrdersPeru() {
        List<Order> ordersPeru = new ArrayList<Order>();
        ordersPeru.add(new Order("PE", 10L));
        ordersPeru.add(new Order("PE", 10L));
        return ordersPeru;
    }

    public static List<Order> buildOrdersColombia() {
        List<Order> ordersPeru = new ArrayList<Order>();
        ordersPeru.add(new Order("CO", 10L));
        ordersPeru.add(new Order("CO", 10L));
        return ordersPeru;
    }

    public static List<Order> buildEmptyOrders() {
        List<Order> emptyOrders = new ArrayList<Order>();
        return emptyOrders;
    }

    public static List<Order> buildMixedOrders() {
        List<Order> mixedOrders = new ArrayList<Order>();
        mixedOrders.add(new Order("PE", 20L));
        mixedOrders.add(new Order("BR", 10L));
        mixedOrders.add(new Order("BR", 5L));
        mixedOrders.add(new Order("CO", 15L));
        return mixedOrders;
    }

}