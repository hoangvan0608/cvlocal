package com.bezkoder.cv_management.Repository;

import com.bezkoder.cv_management.Entity.DepEntity;
import com.bezkoder.cv_management.Entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<DepEntity, Integer> {
    Optional<List<DepEntity>> findByDepIdIn(List<Integer> lstDepId);
}
