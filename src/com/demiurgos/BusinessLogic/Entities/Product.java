package com.demiurgos.BusinessLogic.Entities;

public class Product {
    private final int id;
    private String name;
    private int price;
    private int weight;
    private ProductType type;

    public Product(int id, String name, int price,ProductType type, int weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
    public ProductType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
