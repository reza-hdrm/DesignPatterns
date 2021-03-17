package com.rezahdrm.structural.adapter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDTOAdapterTest {
    @Test
    void userDAOTest() {
        Assertions.assertDoesNotThrow(() -> {
            UserDAO userDAO = new UserDAO();
            userDAO.save(new UserDTOAdapter(new UserDTO()));
        });
    }
}