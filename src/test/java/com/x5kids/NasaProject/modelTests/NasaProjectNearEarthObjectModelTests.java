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

    @Test
    public void givenSetId123456_thenGetId123456() {
        NasaProjectNearEarthObjectModel nasaProjectNearEarthObjectModel = new NasaProjectNearEarthObjectModel();
        nasaProjectNearEarthObjectModel.setId(123456);
        assertEquals(nasaProjectNearEarthObjectModel.getId(), 123456);
    }

    @Test
    public void givenSetIsPotentiallyHazardousAsteroidFalse_thenGetIsPotentiallyHazardousAsteroidFalse() {
        NasaProjectNearEarthObjectModel nasaProjectNearEarthObjectModel = new NasaProjectNearEarthObjectModel();
        nasaProjectNearEarthObjectModel.setIsPotentiallyHazardousAsteroid(false);
        assertEquals(nasaProjectNearEarthObjectModel.getIsPotentiallyHazardousAsteroid(), false);
    }

    @Test
    public void givenSetCount10_thenGetCount10() {
        NasaProjectNearEarthObjectModel nasaProjectNearEarthObjectModel = new NasaProjectNearEarthObjectModel();
        nasaProjectNearEarthObjectModel.setCount(10);
        assertEquals(nasaProjectNearEarthObjectModel.getCount(), 10);
    }
}
