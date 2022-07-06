package example.sportyshoe.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import example.sportyshoe.entity.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Integer> {
}