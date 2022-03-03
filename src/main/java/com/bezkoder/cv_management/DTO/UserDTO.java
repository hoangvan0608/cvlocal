package com.bezkoder.cv_management.DTO;

import com.bezkoder.cv_management.Entity.ERole;
import com.bezkoder.cv_management.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private String email;

    private String fullName;

    private String depName;

    private Set<Role> name;

    private LocalDateTime createdAt;

    private String createBy;

}
