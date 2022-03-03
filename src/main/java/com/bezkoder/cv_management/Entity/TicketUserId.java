package com.bezkoder.cv_management.Entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketUserId implements Serializable {

    private int ticketEntity;
    private int userEntity;
}
