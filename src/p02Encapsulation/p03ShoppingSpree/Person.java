package p02Encapsulation.p03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= money) {
            products.add(product);
            money -= product.getCost();
        } else {
            throw new IllegalArgumentException(name + " can't afford " + product.getName());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (products.size() == 0) {
            return name + " – Nothing bought";
        }
        return name + " - " + products.stream().map(Product::getName).collect(Collectors.joining(", "));
    }
}
