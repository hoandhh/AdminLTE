package com.hoandhh.adminlte.repository;

import com.hoandhh.adminlte.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User  findByUserName(String userName);
}
