package com.aws.ccamilo.com.app.retoawsusers.repositories;

import com.aws.ccamilo.com.app.retoawsusers.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByIdentifier(String identifier);
}