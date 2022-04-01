package lab.demand;

public class Order {

    private String country;
    private double countryTax;
    private Long quantity;
    
    public Order(String country, Long quantity) {
        this.country = country;
        if (country.equals("PE")) {
            countryTax = 0.18;
        } else if (country.equals("BR")) {
            countryTax = 0.12;
        } else {
            countryTax = 0.0;
        }
        this.quantity = quantity;
    }

    public String getCountry() {
        return country;
    }

    public Long getQuantity() {
        return quantity;
    }

    public double getCountryTax() {
        return countryTax;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountryTax(double countryTax) {
        this.countryTax = countryTax;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    
}
