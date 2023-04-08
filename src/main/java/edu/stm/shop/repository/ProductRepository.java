package edu.stm.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.stm.shop.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
