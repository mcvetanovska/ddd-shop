package org.example.productmanagement.repository;

import org.example.productmanagement.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
