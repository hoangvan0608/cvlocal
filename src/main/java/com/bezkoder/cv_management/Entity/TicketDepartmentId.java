package com.bezkoder.cv_management.Entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDepartmentId implements Serializable {

    private int ticketEntity;
    private int depEntity;

}
