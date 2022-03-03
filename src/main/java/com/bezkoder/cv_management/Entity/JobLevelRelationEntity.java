package com.bezkoder.cv_management.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@IdClass(JobLevelId.class)
@Table(name = "job_level")
public class JobLevelRelationEntity extends BaseModel{



    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private JobEntity jobEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "level_id")
    private LevelEntity levelEntity;

}
