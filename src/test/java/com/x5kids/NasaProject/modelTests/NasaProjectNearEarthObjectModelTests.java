package com.x5kids.NasaProject.modelTests;

import com.x5kids.NasaProject.models.NasaProjectNearEarthObjectModel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NasaProjectNearEarthObjectModelTests {

    @Test
    public void givenSetNameHenry_thenGetNameHenry() {
        NasaProjectNearEarthObjectModel nasaProjectNearEarthObjectModel = new NasaProjectNearEarthObjectModel();
        nasaProjectNearEarthObjectModel.setName("henry");
        assertEquals(nasaProjectNearEarthObjectModel.getName(), "henry");
    }
}
