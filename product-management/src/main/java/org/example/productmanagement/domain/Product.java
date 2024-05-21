package org.example.productmanagement.domain;

import org.example.sharedkernel.Money;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Embedded
    private Money price;
    private String size;
    private String color;

    public Product() {}

    public Product(String name, Money price, String size, String color) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
    }
}
