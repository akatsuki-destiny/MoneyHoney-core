package com.example.moneyhoney.jpa.repository;

import com.example.moneyhoney.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<UserEntity,Long> {
}
