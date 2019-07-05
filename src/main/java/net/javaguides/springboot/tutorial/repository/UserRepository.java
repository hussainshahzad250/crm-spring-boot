package net.javaguides.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.tutorial.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
