package com.bezkoder.cv_management.DTO;


import com.bezkoder.cv_management.Entity.JobLevelRelationEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class JobDTO implements Serializable {
    private int jobId;

    private String jobName;
}
