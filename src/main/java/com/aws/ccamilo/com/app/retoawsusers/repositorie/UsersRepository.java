package com.aws.ccamilo.com.app.retoawsusers.repositorie;

import com.aws.ccamilo.com.app.retoawsusers.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}