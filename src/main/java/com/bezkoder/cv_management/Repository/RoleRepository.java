package com.bezkoder.cv_management.Repository;



import com.bezkoder.cv_management.Entity.ERole;
import com.bezkoder.cv_management.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
