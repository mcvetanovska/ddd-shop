package org.example.ordermanagement.domain;

import lombok.Getter;
import org.example.sharedkernel.Money;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private Long productId;
    @Getter
    private int quantity;

    @Embedded
    private Money price;

    public OrderItem() {}

    public OrderItem(Long productId, int quantity, Money price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

}
