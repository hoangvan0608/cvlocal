package com.bezkoder.cv_management.Controller;


import com.bezkoder.cv_management.DTO.TicketDTO;
import com.bezkoder.cv_management.Entity.TicketEntity;
import com.bezkoder.cv_management.Form.TicketFormCreate;
import com.bezkoder.cv_management.Repository.TicketRepository;
import com.bezkoder.cv_management.Service.TicketService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/tickets")
public class TicketController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    TicketService ticketService;

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping()
    public List<TicketDTO> getTicketDTOList(){
        List<TicketEntity> entityList = ticketService.getAllTicket();

        List<TicketDTO> dtoList = modelMapper.map(entityList, new TypeToken<List<TicketDTO>>(){}.getType());
        return dtoList;
    }

    @GetMapping("/{id}")
    public TicketDTO getTicketDTOById(@PathVariable(name = "id") int ticketId){

        TicketDTO dto = modelMapper.map(ticketService.getTicketById(ticketId), new TypeToken<TicketDTO>(){}.getType());
        return dto;
    }

    @PostMapping("/new")
    public ResponseEntity<?> createdTicket(@RequestBody TicketFormCreate form){

        ticketService.createdTicket(form);
        return new ResponseEntity<String>("Update Successfully", HttpStatus.OK);
    }

}
