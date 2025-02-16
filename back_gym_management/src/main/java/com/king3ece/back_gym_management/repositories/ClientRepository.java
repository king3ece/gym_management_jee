package com.king3ece.back_gym_management.repositories;

import com.king3ece.back_gym_management.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByLastNameContainingIgnoreCase(String lastName);   

}
