package com.bezkoder.cv_management.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "jobs")
public class JobEntity extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int jobId;

    @Column(name ="job_name", length = 100, nullable = false, unique = true)
    @NotNull
    private String jobName;

//    @OneToMany(mappedBy = "jobEntity")
//    private Set<TicketEntity>  ticketEntities;

    @OneToMany(mappedBy = "jobEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JobLevelRelationEntity> jobLevelRelationEntities;

    @OneToMany(mappedBy = "jobEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TicketEntity> ticketEntityList;
}
