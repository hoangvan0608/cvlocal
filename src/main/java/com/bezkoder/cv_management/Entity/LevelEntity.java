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
@Table(name = "levels")
public class LevelEntity extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_id")
    private int levelId;

    @Column(name ="level_name", length = 100, unique = true)
    @NotNull
    private String levelName;

    @OneToMany(mappedBy = "levelEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JobLevelRelationEntity> jobLevelRelationEntities;

    @OneToMany(mappedBy = "levelEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TicketEntity> ticketEntityList;


}
