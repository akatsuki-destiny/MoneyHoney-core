package com.example.moneyhoney.service;

import com.example.moneyhoney.jpa.entity.UserEntity;
import com.example.moneyhoney.jpa.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private RegisterRepository registerRepository;

    public UserEntity registerUser(UserEntity user) {
        System.out.println("kaydedilecek");
        return registerRepository.save(user);
    }

}
