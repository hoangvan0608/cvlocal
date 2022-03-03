package com.bezkoder.cv_management.Service.impl;

import com.bezkoder.cv_management.Entity.TicketEntity;
import com.bezkoder.cv_management.Form.TicketFormCreate;
import com.bezkoder.cv_management.Repository.TicketRepository;
import com.bezkoder.cv_management.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Override
    public List<TicketEntity> getAllTicket() {
        List<TicketEntity> ticketEntities = ticketRepository.findAll();
        return ticketEntities;
    }

    @Override
    public TicketEntity getTicketById(int ticketId) {
        TicketEntity ticketEntity = ticketRepository.findByTicketId(ticketId);
        return ticketEntity;
    }

    @Override
    public void createdTicket(TicketFormCreate form) {
        //Convert form -> Entity
        TicketEntity newEntity = new TicketEntity(form.getFullName(),form.getUrlCv(),
                form.getStatus(),form.getPriority(),
                form.getStart(),form.getDeadline(),
                form.getDescription());
        ticketRepository.save(newEntity);
    }

    @Override
    public void updateTicket(Integer id) {

    }

}
