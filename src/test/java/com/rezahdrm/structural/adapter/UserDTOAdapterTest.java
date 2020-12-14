package com.rezahdrm.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDTOAdapterTest {
    @Test
    public void userDAOTest(){
        UserDAO userDAO=new UserDAO();
        userDAO.save(new UserDTOAdapter(new UserDTO()));
    }
}