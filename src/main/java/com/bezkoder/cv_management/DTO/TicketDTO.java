package com.bezkoder.cv_management.DTO;

import com.bezkoder.cv_management.Entity.JobEntity;
import com.bezkoder.cv_management.Entity.JobLevelRelationEntity;
import com.bezkoder.cv_management.Entity.TicketDepRelationEntity;
import com.bezkoder.cv_management.Entity.TicketUserRelationEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class TicketDTO implements Serializable {

    private String fullName;

    private JobDTO jobEntity;

    private LevelDTO levelEntity;

    private String cvUrl;

    private String status;

    private String priority;

    private LocalDate start;

    private LocalDate deadline;

    private List<TicketUserDTO>  PIC;

    private List<TicketDepDTO>  listDeps;






}
