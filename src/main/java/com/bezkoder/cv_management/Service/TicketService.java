package com.bezkoder.cv_management.Service;

import com.bezkoder.cv_management.Entity.TicketEntity;
import com.bezkoder.cv_management.Form.TicketFormCreate;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<TicketEntity> getAllTicket();

    TicketEntity getTicketById(int ticketId);

    void createdTicket(TicketFormCreate ticketEntity);

    void updateTicket(Integer id);


}
