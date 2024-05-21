package org.example.ordermanagement.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.sharedkernel.Address;
import org.example.sharedkernel.Money;

import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // getter and setter for customerId
    @Setter
    @Getter
    private Long customerId;

    @Getter
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    @Embedded
    private Address shippingAddress;

    @Embedded
    private Money total;

    public Order() {}

    public Order(List<OrderItem> items, Address shippingAddress, Money total) {
        this.items = items;
        this.shippingAddress = shippingAddress;
        this.total = total;
    }

}
