package com.rezahdrm.structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerFacadeTest {
    @Test
    void testComputerFacade(){
        Assertions.assertDoesNotThrow(()->{
            ComputerFacade computerFacade=new ComputerFacade();
            computerFacade.start();
        });
    }

}