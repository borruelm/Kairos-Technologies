package com.bhuviits.martinborruel.services;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;


class fileOperationsTest {
    FileOperations fileOp = new FileOperations();

    @Test
    public void test(){
        assertEquals(fileOp.checkCitiesConnection("Trenton", "Albany"), "yes");
        assertEquals(fileOp.checkCitiesConnection("Albany","Trenton"), "no");
        assertEquals(fileOp.checkCitiesConnection("china", "oslo"), "no");
    }

}