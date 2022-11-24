package com.example.gympower.repository;

import com.example.gympower.model.entity.products.supplements.Flavor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlavorRepository extends JpaRepository<Flavor, Long> {
}
