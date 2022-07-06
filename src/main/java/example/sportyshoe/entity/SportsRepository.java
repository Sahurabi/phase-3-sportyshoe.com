package example.sportyshoe.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import example.sportyshoe.entity.Sports;

public interface SportsRepository extends JpaRepository<Sports,Integer>{

}