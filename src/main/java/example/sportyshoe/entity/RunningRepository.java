package example.sportyshoe.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import example.sportyshoe.entity.Running;

public interface RunningRepository extends JpaRepository<Running,Integer>{

}