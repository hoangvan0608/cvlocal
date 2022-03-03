package com.bezkoder.cv_management.Service.impl;


import com.bezkoder.cv_management.Form.UserFormForUpdate;
import com.bezkoder.cv_management.Entity.Role;
import com.bezkoder.cv_management.Entity.UserEntity;
import com.bezkoder.cv_management.Repository.UserRepository;
import com.bezkoder.cv_management.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUserList() {

        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserByID(int userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public UserEntity getUserByEmail(String email) {

        Optional<List<UserEntity>> acc = userRepository.findByEmail(email);
        return null;
    }

    @Override
    public void updateUser(int userId, UserFormForUpdate form) {
        UserEntity userEntity = userRepository.findById(userId).get();
        userEntity.setPassword(form.getPassword());
        userEntity.setFullName(form.getFullName());
        userEntity.setDepEntity(form.getDepEntity());
        userEntity.setRoles((Set<Role>) form.getRole());
        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }


}
