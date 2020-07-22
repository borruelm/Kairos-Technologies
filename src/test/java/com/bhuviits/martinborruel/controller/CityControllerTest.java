package com.bhuviits.martinborruel.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestParam;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = CityController.class)
class CityControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    CityController cityController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void checkConnection() throws Exception {

        mockMvc.perform(get("/connected?"))
                .andExpect(status().isBadRequest());

        mockMvc.perform(get("/connected?origin=Trenton"))
                .andExpect(status().isBadRequest());

        mockMvc.perform(get("/connected?origin=Trenton&destination=Albany"))
                .andExpect(status().isOk());
    }
}