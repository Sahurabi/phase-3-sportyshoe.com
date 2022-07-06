package example.sportyshoe.entity;


import org.springframework.data.jpa.repository.JpaRepository;

import example.sportyshoe.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{

}
