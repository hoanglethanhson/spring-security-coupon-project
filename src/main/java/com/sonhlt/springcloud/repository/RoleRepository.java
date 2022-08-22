package com.sonhlt.springcloud.repository;

import com.sonhlt.springcloud.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
