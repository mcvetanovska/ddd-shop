package org.example.customermanagement.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    // In the Customer class
    @Getter
    @Email
    @Column(unique = true)
    private String email;

    @Embedded
    private Address address;
}
