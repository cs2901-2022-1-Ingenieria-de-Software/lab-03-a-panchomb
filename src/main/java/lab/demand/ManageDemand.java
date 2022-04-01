package lab.demand;

import java.util.List;

public class ManageDemand {

    public ManageDemand() {}

    public double calculateTotal(List<Order> orders){
        // Calculate Taxes
        double taxes = 0.0;
        for (Order order : orders) {
            double tax = order.getCountryTax();
            taxes += tax;
        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.getQuantity();
            quantities += temp;
        }

        return quantities * taxes;
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, double defaultAdditionalColombia, double defaultAdditionalPeru, double defaultAdditionalBrazil){
        // Calculate additionals by country
        double taxes = 0.0;
        for (Order order : orders) {
            String currCountry = order.getCountry();
            if (currCountry.equals("PE")) {
                taxes += defaultAdditionalPeru;
            } else if (currCountry.equals("BR")) {
                taxes += defaultAdditionalBrazil;
            } else {
                taxes += defaultAdditionalColombia;
            }
        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            quantities += order.getQuantity();
        }

        return quantities * taxes;
    }

}
