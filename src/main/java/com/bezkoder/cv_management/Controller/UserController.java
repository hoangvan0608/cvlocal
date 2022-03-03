package com.bezkoder.cv_management.Controller;

import com.bezkoder.cv_management.DTO.UserDTO;
import com.bezkoder.cv_management.Form.UserFormForUpdate;
import com.bezkoder.cv_management.Entity.UserEntity;
import com.bezkoder.cv_management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/users")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<UserDTO> getAllUser(){
        List<UserEntity> userEntities = userService.getAllUserList();

        // convert to DTO
        List<UserDTO> dtos = new ArrayList<>();
        for (UserEntity entity : userEntities){
            UserDTO dto = new UserDTO(entity.getEmail(), entity.getFullName(), entity.getDepEntity().getDepName(),
                    entity.getRoles(), entity.getCreatedAt(), entity.getCreatedBy());
            dtos.add(dto);
        }
        return dtos;
    }

    @GetMapping("/{userId}")
    public UserDTO getUserById(@PathVariable(name = "userId") int userId){
        UserEntity entity = userService.getUserByID(userId);

        //convert to dto
        UserDTO dto = new UserDTO(entity.getEmail(), entity.getFullName(), entity.getDepEntity().getDepName(),
                entity.getRoles(), entity.getCreatedAt(), entity.getCreatedBy());
        return dto;
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUserById(@PathVariable(name = "userId") int userId, @RequestBody UserFormForUpdate form){
        userService.updateUser(userId, form);
        return new ResponseEntity<String>("Update Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable(name = "userId") int userId){
        userService.deleteUser(userId);
        return new ResponseEntity<String>("Delete Successfully", HttpStatus.OK);
    }

}
