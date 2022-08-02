package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    protected static double COFFEE_MILLILITERS = 50;
    protected static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    protected double caffeine;

    public Coffee(String name, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
