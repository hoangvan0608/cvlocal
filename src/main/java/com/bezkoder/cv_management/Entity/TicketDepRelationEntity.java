package com.bezkoder.cv_management.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
//@EntityListeners(AuditingEntityListener.class)
@IdClass(TicketDepartmentId.class)
@Table(name = "ticket_department")
public class TicketDepRelationEntity extends BaseModel{
    @Id
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private TicketEntity ticketEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "dep_id")
    private DepEntity depEntity;

}
