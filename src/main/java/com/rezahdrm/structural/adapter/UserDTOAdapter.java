package com.rezahdrm.structural.adapter;

import java.util.Date;

public class UserDTOAdapter extends User {
    private final UserDTO userDTO;

    public UserDTOAdapter(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    @Override
    public Long getId() {
        return userDTO.getId();
    }

    @Override
    public String getFullName() {
        return userDTO.getFirstName() + " " + userDTO.getLastName();
    }

    @Override
    public String getPhoneNumber() {
        return userDTO.getPhoneNumber();
    }

    @Override
    public String getEmail() {
        return userDTO.getEmail();
    }

    @Override
    public String getUsername() {
        return userDTO.getEmail();
    }

    @Override
    public String getPassword() {
        return userDTO.getPassword();
    }

    @Override
    public String getNationalCode() {
        return userDTO.getNationalCode();
    }

    @Override
    public Date getBirthDay() {
        return userDTO.getBirthDay();
    }

    @Override
    public Date getCreatedAt() {
        return new Date();
    }
}
