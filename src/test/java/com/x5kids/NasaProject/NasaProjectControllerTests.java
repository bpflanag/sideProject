package com.x5kids.NasaProject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NasaProjectControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void WhenHelloCalled_thenReturnOK() throws Exception {
        mockMvc.perform(get("/getNearEarthObjectCount")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void s() throws Exception {
        MvcResult result = mockMvc.perform(get("/getNearEarthObjectCount")).andDo(print()).andReturn();
        String content = result.getResponse().getContentAsString();

        assertEquals(Integer.parseInt(content), 10);

    }
}
