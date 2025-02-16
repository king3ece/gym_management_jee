package com.king3ece.back_gym_management.repositories;

import com.king3ece.back_gym_management.models.Pack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackRepository extends JpaRepository<Pack, Long> {
}
