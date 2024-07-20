package com.hoandhh.adminlte.services;

import com.hoandhh.adminlte.models.User;

public interface UserService {
    User findByUserName(String userName);

}
