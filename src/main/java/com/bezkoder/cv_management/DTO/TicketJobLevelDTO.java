package com.bezkoder.cv_management.DTO;

import com.bezkoder.cv_management.Entity.JobEntity;
import com.bezkoder.cv_management.Entity.LevelEntity;
import com.bezkoder.cv_management.Entity.TicketEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TicketJobLevelDTO implements Serializable {

//    private TicketEntity ticketEntity;
    private JobDTO jobName;
    private LevelDTO levelEntity;

}
