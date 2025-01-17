package dev.io.stockprogram.services;

import dev.io.stockprogram.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
