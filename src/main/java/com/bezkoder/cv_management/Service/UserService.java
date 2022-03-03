package com.bezkoder.cv_management.Service;


import com.bezkoder.cv_management.Form.UserFormForUpdate;
import com.bezkoder.cv_management.Entity.UserEntity;
import java.util.List;

public interface UserService {
    List<UserEntity> getAllUserList();

    UserEntity getUserByID(int userId);

    UserEntity getUserByEmail(String email);

    void updateUser(int userId, UserFormForUpdate form);

    void deleteUser(int userId);
}
