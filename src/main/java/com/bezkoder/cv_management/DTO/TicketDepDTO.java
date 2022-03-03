package com.bezkoder.cv_management.DTO;

import com.bezkoder.cv_management.Entity.DepEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TicketDepDTO implements Serializable {
    private DepDTO depEntity;
}
