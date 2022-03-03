package com.bezkoder.cv_management.Repository;

import com.bezkoder.cv_management.Entity.TicketEntity;
import com.bezkoder.cv_management.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
    TicketEntity findByTicketId(int ticketId);
}
