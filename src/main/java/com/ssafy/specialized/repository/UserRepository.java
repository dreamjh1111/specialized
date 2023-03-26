package com.ssafy.specialized.repository;

import com.ssafy.specialized.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(String id);

    List<User> findAllByName(String name);

    boolean existsById(String Id);

    User findByName(String name);

}