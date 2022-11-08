package com.codefresher.repositories;

import com.codefresher.entities.ProductQuantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductQuantityRepository extends JpaRepository<ProductQuantity, Long> {
    public ProductQuantity findProductQuantityByQuantityId(Long id);
}