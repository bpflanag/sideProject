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
    public void GivenStartDate_WhenGetNearEarthObjectCountCalled_thenReturnOK() throws Exception {
        String startDate = "1999-01-01";

        mockMvc.perform(get("/getNearEarthObjectCount").param("startDate", startDate))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void GivenStartDate_WhenGetNearEarthObjectCount_thenReturn10() throws Exception {
        String startDate = "1999-01-01";

        MvcResult result = mockMvc.perform(get("/getNearEarthObjectCount").param("startDate", startDate))
                .andDo(print())
                .andReturn();
        String content = result.getResponse().getContentAsString();

        assertEquals(Integer.parseInt(content), 10);
    }
}
