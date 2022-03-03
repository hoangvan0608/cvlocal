package com.bezkoder.cv_management.Service.impl;

import com.bezkoder.cv_management.Entity.DepEntity;
import com.bezkoder.cv_management.Entity.TicketDepRelationEntity;
import com.bezkoder.cv_management.Entity.TicketDepartmentId;
import com.bezkoder.cv_management.Entity.TicketEntity;
import com.bezkoder.cv_management.Form.TicketFormCreate;
import com.bezkoder.cv_management.Repository.DepartmentRepository;
import com.bezkoder.cv_management.Repository.TicketDepartmentRepository;
import com.bezkoder.cv_management.Repository.TicketRepository;
import com.bezkoder.cv_management.Service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    private final DepartmentRepository departmentRepository;

    private final TicketDepartmentRepository ticketDepartmentRepository;
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

        TicketEntity newEntity = new TicketEntity();
        newEntity.setFullName(form.getFullName());
        newEntity.setCvUrl(form.getUrlCv());
        newEntity.setPriority(form.getPriority());
        newEntity.setStart(form.getStart());
        newEntity.setDeadline(form.getDeadline());
        newEntity.setDescription(form.getDescription());
        ticketRepository.save(newEntity);

        Optional<List<DepEntity>> listDepsOpt = departmentRepository.findByDepIdIn(form.getListDeps());
        if(listDepsOpt.isPresent()){
            List<DepEntity> lstDeps = listDepsOpt.get();
            if(lstDeps.size() != form.getListDeps().size() ){
                //throw exception
            } else{
                List<TicketDepRelationEntity> lstDepTicket = new ArrayList<>();
                for( DepEntity dep :lstDeps ){
                    TicketDepRelationEntity obj = new TicketDepRelationEntity();
                    obj.setDepEntity(dep);
                    obj.setTicketEntity(newEntity);
                    lstDepTicket.add(obj);
                }
                ticketDepartmentRepository.saveAll(lstDepTicket);
            }
        }
    }

    @Override
    public void updateTicket(Integer id) {

    }

}
