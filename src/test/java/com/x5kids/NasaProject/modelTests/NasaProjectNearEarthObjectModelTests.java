package com.x5kids.NasaProject.modelTests;

import com.x5kids.NasaProject.models.NasaProjectNearEarthObjectModel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NasaProjectNearEarthObjectModelTests {

    @Test
    public void givenSetStartDateInStringFormat19990101_thenGetStartDateInStringFormat19990101() {
        NasaProjectNearEarthObjectModel n = new NasaProjectNearEarthObjectModel();
        n.setStartDate("1999-01-01");
        assertEquals(n.getStartDate(), "1999-01-01");
    }
}
