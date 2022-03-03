package com.bezkoder.cv_management.Form;

import com.bezkoder.cv_management.Entity.DepEntity;
import com.bezkoder.cv_management.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFormForUpdate {

    private String password;

    private String fullName;

    private DepEntity depEntity;

    private Role role;

}
