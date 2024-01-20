package com.example.moneyhoney.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private Long id;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String password;
    private Date createdDate;
    private boolean isActive;


}
