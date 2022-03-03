package com.bezkoder.cv_management.Repository;

import com.bezkoder.cv_management.Entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRespository extends JpaRepository<JobEntity, Integer> {
}
