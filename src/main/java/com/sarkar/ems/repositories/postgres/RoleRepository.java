package com.sarkar.ems.repositories.postgres;

import com.sarkar.ems.models.postgres.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
