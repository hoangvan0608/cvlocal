package com.bezkoder.cv_management.DTO;

import com.bezkoder.cv_management.Entity.TicketEntity;
import com.bezkoder.cv_management.Entity.UserEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TicketUserDTO implements Serializable {

    private UserDTO userEntity;
}
