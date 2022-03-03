package com.bezkoder.cv_management.Form;


import com.bezkoder.cv_management.Entity.JobEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketFormCreate {

    private String fullName;

    private int jobId;

    private int levelId;

    private String urlCv;

    private String status;

    private String priority;

    private LocalDate start;

    private LocalDate deadline;

    private String description;

    private List<Integer> listDeps;

    private List<String> PIC;
}
