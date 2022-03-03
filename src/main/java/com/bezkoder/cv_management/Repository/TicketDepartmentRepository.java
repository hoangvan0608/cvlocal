package com.bezkoder.cv_management.Repository;

import com.bezkoder.cv_management.Entity.TicketDepRelationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TicketDepartmentRepository extends JpaRepository<TicketDepRelationEntity, Integer> {
}
