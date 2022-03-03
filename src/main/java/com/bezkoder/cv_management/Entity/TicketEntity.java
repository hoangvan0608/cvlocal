package com.bezkoder.cv_management.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ticket")
public class TicketEntity extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticketId;

    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "cv_url", length = 500, nullable = false)
    private String cvUrl;

    @Column(name = "`status`", length = 50, nullable = false)
    private String status;

    @Column(name = "priority", length = 50, nullable = false)
    private String priority;

    @Column(name = "`start`")
    private LocalDate start;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "description", length = 1000)
    private String description;

    @OneToMany(mappedBy = "ticketEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TicketDepRelationEntity>  listDeps;

    @OneToMany(mappedBy = "ticketEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TicketUserRelationEntity> PIC;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private JobEntity  jobEntity;

    @ManyToOne
    @JoinColumn(name = "level_id", nullable = false)
    private LevelEntity  levelEntity;

    public TicketEntity(String fullName, String cvUrl, String status, String priority, LocalDate start, LocalDate deadline, String description) {
        this.fullName = fullName;
        this.cvUrl = cvUrl;
        this.status = status;
        this.priority = priority;
        this.start = start;
        this.deadline = deadline;
        this.description = description;
    }

    public TicketEntity() {

    }
}
